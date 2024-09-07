package Controlador;

import Modelo.Especialidad;
import BD.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;

public class ControladorEspecialidad {

    public boolean agregar(Especialidad especialidad) {
        try {
            Conexion con = new Conexion();
            Connection cx = con.obtenerConexion();
            String sql = "INSERT INTO ESPECIALIDAD (NOMBRE,HABILITADO) VALUES (?, ?)";
            PreparedStatement st = cx.prepareStatement(sql);
            st.setString(1, especialidad.getNombre());
            st.setBoolean(2,especialidad.isHabilitado());
            st.executeUpdate();
            st.close();
            cx.close();
            return true;
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return false;
    }

    public boolean actualizar(Especialidad especialidad) {
        try {
            Conexion con = new Conexion();
            Connection cx = con.obtenerConexion();
            String sql = "UPDATE ESPECIALIDAD SET NOMBRE=?,HABILITADO=? WHERE IDESPECIALIDAD=?";
            PreparedStatement st = cx.prepareStatement(sql);
            st.setString(1, especialidad.getNombre());
            st.setBoolean(2,especialidad.isHabilitado());
            st.setInt(3,especialidad.getIdEspecialidad());
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
            String sql = "DELETE FROM ESPECIALIDAD WHERE IDESPECIALIDAD=?";
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

    public Especialidad buscarPorId(int id) {
        try {
            Conexion con = new Conexion();
            Connection cx = con.obtenerConexion();
            String sql = "SELECT * FROM ESPECIALIDAD WHERE IDESPECIALIDAD=?";
            PreparedStatement st = cx.prepareStatement(sql);
            st.setInt(1, id);
            ResultSet rs = st.executeQuery();

            if (rs.next()) {
                Especialidad especialidad = new Especialidad() {};
                especialidad.setIdEspecialidad(rs.getInt("IDESPECIALIDAD"));
                especialidad.setNombre(rs.getString("NOMBRE"));
                especialidad.setHabilitado(rs.getBoolean("HABILITADO"));
                return especialidad;
            }
            st.close();
            cx.close();
            return null;
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return null;
    }

    public ArrayList<Especialidad> listarTodos() {
    ArrayList<Especialidad> listado = new ArrayList<>();
    Connection cx = null;
    PreparedStatement st = null;
    ResultSet rs = null;

    try {
        Conexion con = new Conexion();
        cx = con.obtenerConexion();
        String sql = "SELECT IDESPECIALIDAD,NOMBRE,HABILITADO FROM ESPECIALIDAD";
        st = cx.prepareStatement(sql);
        rs = st.executeQuery();

        while (rs.next()) {
            Especialidad especialidad = new Especialidad() {};
            especialidad.setIdEspecialidad(rs.getInt("IDESPECIALIDAD"));
            especialidad.setNombre(rs.getString("NOMBRE"));
            especialidad.setHabilitado(rs.getBoolean("HABILITADO"));
            listado.add(especialidad);
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
            Vector<Especialidad> listado = new Vector<>();
            

            try {
                Conexion con = new Conexion();  
                Connection cx= con.obtenerConexion();
                String sql="SELECT IDESPECIALIDAD, NOMBRE, HABILITADO FROM ESPECIALIDAD ORDER BY IDESPECIALIDAD ASC";
                PreparedStatement st = cx.prepareStatement(sql);
                ResultSet rs = st.executeQuery();

                while (rs.next()) {
                    Especialidad especialidad = new Especialidad();
                    especialidad.setIdEspecialidad(rs.getInt("IDESPECIALIDAD"));
                    especialidad.setNombre(rs.getString("NOMBRE"));
                    especialidad.setHabilitado(rs.getBoolean("HABILITADO"));
                    listado.add(especialidad);
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
