package Controlador;

import Modelo.Comuna;
import BD.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;

public class ControladorComuna {

    public boolean agregar(Comuna comuna) {
        try {
            Conexion con = new Conexion();
            Connection cx = con.obtenerConexion();
            String sql = "INSERT INTO COMUNA (NOMBRE) VALUES (?)";
            PreparedStatement st = cx.prepareStatement(sql);
            st.setString(1, comuna.getNombre());
            st.executeUpdate();
            st.close();
            cx.close();
            return true;
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return false;
    }

    public boolean actualizar(Comuna comuna) {
        try {
            Conexion con = new Conexion();
            Connection cx = con.obtenerConexion();
            String sql = "UPDATE COMUNA SET NOMBRE=? WHERE IDCOMUNA=?";
            PreparedStatement st = cx.prepareStatement(sql);
            st.setString(1, comuna.getNombre());
            st.setInt(2, comuna.getIdComuna());
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
            String sql = "DELETE FROM COMUNA WHERE IDCOMUNA=?";
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

    public Comuna buscarPorId(int id) {
        try {
            Conexion con = new Conexion();
            Connection cx = con.obtenerConexion();
            String sql = "SELECT * FROM COMUNA WHERE IDCOMUNA=?";
            PreparedStatement st = cx.prepareStatement(sql);
            st.setInt(1, id);
            ResultSet rs = st.executeQuery();

            if (rs.next()) {
                Comuna comuna = new Comuna() {};
                comuna.setIdComuna(rs.getInt("IDCOMUNA"));
                comuna.setNombre(rs.getString("NOMBRE"));
                return comuna;
            }
            st.close();
            cx.close();
            return null;
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return null;
    }

    public ArrayList<Comuna> listarTodos() {
        ArrayList<Comuna> listado = new ArrayList<>();
        Connection cx = null;
        PreparedStatement st = null;
        ResultSet rs = null;

        try {
            Conexion con = new Conexion();
            cx = con.obtenerConexion();
            String sql = "SELECT IDCOMUNA,NOMBRE FROM COMUNA";
            st = cx.prepareStatement(sql);
            rs = st.executeQuery();

            while (rs.next()) {
                Comuna comuna = new Comuna() {};
                comuna.setIdComuna(rs.getInt("IDCOMUNA"));
                comuna.setNombre(rs.getString("NOMBRE"));
                listado.add(comuna);
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
            Vector<Comuna> listado = new Vector<>();
            listado.add(new Comuna(0,"Seleccionar..."));

            try {
                Conexion con = new Conexion();  
                Connection cx= con.obtenerConexion();
                String sql="SELECT IDCOMUNA, NOMBRE FROM COMUNA ORDER BY IDCOMUNA ASC";
                PreparedStatement st = cx.prepareStatement(sql);
                ResultSet rs = st.executeQuery();

                while (rs.next()) {
                    Comuna comuna = new Comuna();
                    comuna.setIdComuna(rs.getInt("IDCOMUNA"));
                    comuna.setNombre(rs.getString("NOMBRE"));
                    listado.add(comuna);
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