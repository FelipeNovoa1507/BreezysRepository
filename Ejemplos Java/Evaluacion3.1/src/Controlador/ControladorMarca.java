package Controlador;

import Modelo.Marca;
import BD.Conexion;
import Modelo.Comuna;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;

public class ControladorMarca {

    public boolean agregar(Marca marca) {
        try {
            Conexion con = new Conexion();
            Connection cx = con.obtenerConexion();
            String sql = "INSERT INTO MARCA (NOMBRE) VALUES (?)";
            PreparedStatement st = cx.prepareStatement(sql);
            st.setString(1, marca.getNombre());
            st.executeUpdate();
            st.close();
            cx.close();
            return true;
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return false;
    }

    public boolean actualizar(Marca marca) {
        try {
            Conexion con = new Conexion();
            Connection cx = con.obtenerConexion();
            String sql = "UPDATE MARCA SET NOMBRE=? WHERE IDMARCA=?";
            PreparedStatement st = cx.prepareStatement(sql);
            st.setString(1, marca.getNombre());
            st.setInt(2,marca.getIdMarca());
            st.executeUpdate();
            st.close();
            cx.close();
            return true;
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return false;
    }

    public boolean eliminar(int id) {
        try {
            Conexion con = new Conexion();
            Connection cx = con.obtenerConexion();
            String sql = "DELETE FROM MARCA WHERE IDMARCA=?";
            PreparedStatement st = cx.prepareStatement(sql);
            st.setInt(1, id);
            st.executeUpdate();
            st.close();
            cx.close();
            return true;
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return false;
    }

    public Marca buscarPorId(int id) {
        try {
            Conexion con = new Conexion();
            Connection cx = con.obtenerConexion();
            String sql = "SELECT * FROM MARCA WHERE IDMARCA=?";
            PreparedStatement st = cx.prepareStatement(sql);
            st.setInt(1, id);
            ResultSet rs = st.executeQuery();

            if (rs.next()) {
                Marca marca = new Marca() {};
                marca.setIdMarca(rs.getInt("IDMARCA"));
                marca.setNombre(rs.getString("NOMBRE"));
                return marca;
            }
            st.close();
            cx.close();
            return null;
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return null;
    }

    public ArrayList<Marca> listarTodos() {
    ArrayList<Marca> listado = new ArrayList<>();
    Connection cx = null;
    PreparedStatement st = null;
    ResultSet rs = null;

    try {
        Conexion con = new Conexion();
        cx = con.obtenerConexion();
        String sql = "SELECT IDMARCA,NOMBRE FROM MARCA";
        st = cx.prepareStatement(sql);
        rs = st.executeQuery();

        while (rs.next()) {
            Marca marca = new Marca() {};
            marca.setIdMarca(rs.getInt("IDMARCA"));
            marca.setNombre(rs.getString("NOMBRE"));
            listado.add(marca);
        }
    } catch (SQLException ex) {
        System.out.println("Error: " + ex.getMessage());
    } finally {
        try {
            if (rs != null) {
                rs.close();
            }
            if (st != null) {
                st.close();
            }
            if (cx != null) {
                cx.close();
            }
        } catch (SQLException e) {
            System.out.println("Error al cerrar la conexión: " + e.getMessage());
        }
    }
    return listado;
    }
    
    public DefaultComboBoxModel llenarCombo() {
            Vector<Marca> listado = new Vector<>();
            listado.add(new Marca(0,"Seleccionar..."));

            try {
                Conexion con = new Conexion();  
                Connection cx= con.obtenerConexion();
                String sql="SELECT IDMARCA, NOMBRE FROM MARCA ORDER BY IDMARCA ASC";
                PreparedStatement st = cx.prepareStatement(sql);
                ResultSet rs = st.executeQuery();

                while (rs.next()) {
                    Marca marca = new Marca();
                    marca.setIdMarca(rs.getInt("IDMARCA"));
                    marca.setNombre(rs.getString("NOMBRE"));
                    listado.add(marca);
                }
                st.close();
                cx.close();

            } catch (SQLException ex) {
                // Log the exception or handle it appropriately
                System.out.println("Error: " + ex.getMessage());
            }

            return new javax.swing.DefaultComboBoxModel(listado);
    }
}
