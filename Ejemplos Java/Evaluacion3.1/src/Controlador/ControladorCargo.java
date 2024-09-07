package Controlador;

import Modelo.Cargo;
import BD.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;

public class ControladorCargo {

    public boolean agregar(Cargo cargo) {
        try {
            Conexion con = new Conexion();
            Connection cx = con.obtenerConexion();
            String sql = "INSERT INTO CARGO (NOMBRE) VALUES (?)";
            PreparedStatement st = cx.prepareStatement(sql);
            st.setString(1, cargo.getNombre());
            st.executeUpdate();
            st.close();
            cx.close();
            return true;
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return false;
    }

    public boolean actualizar(Cargo cargo) {
        try {
            Conexion con = new Conexion();
            Connection cx = con.obtenerConexion();
            String sql = "UPDATE CARGO SET NOMBRE=? WHERE IDCARGO=?";
            PreparedStatement st = cx.prepareStatement(sql);
            st.setString(1, cargo.getNombre());
            st.setInt(2,cargo.getIdCargo());
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
            String sql = "DELETE FROM CARGO WHERE IDCARGO=?";
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

    public Cargo buscarPorId(int id) {
        try {
            Conexion con = new Conexion();
            Connection cx = con.obtenerConexion();
            String sql = "SELECT * FROM CARGO WHERE IDCARGO=?";
            PreparedStatement st = cx.prepareStatement(sql);
            st.setInt(1, id);
            ResultSet rs = st.executeQuery();

            if (rs.next()) {
                Cargo cargo = new Cargo() {};
                cargo.setIdCargo(rs.getInt("IDCARGO"));
                cargo.setNombre(rs.getString("NOMBRE"));
                return cargo;
            }
            st.close();
            cx.close();
            return null;
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return null;
    }

    public ArrayList<Cargo> listarTodos() {
    ArrayList<Cargo> listado = new ArrayList<>();
    Connection cx = null;
    PreparedStatement st = null;
    ResultSet rs = null;

    try {
        Conexion con = new Conexion();
        cx = con.obtenerConexion();
        String sql = "SELECT IDCARGO,NOMBRE FROM CARGO";
        st = cx.prepareStatement(sql);
        rs = st.executeQuery();

        while (rs.next()) {
            Cargo cargo = new Cargo() {};
            cargo.setIdCargo(rs.getInt("IDCARGO"));
            cargo.setNombre(rs.getString("NOMBRE"));
            listado.add(cargo);
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
    
    public javax.swing.DefaultComboBoxModel llenarCombo(){
        Vector listado = new Vector();
        listado.add(new Cargo(0,"Seleccionar...",true));
        try{
            Conexion con = new Conexion();
            Connection cx = con.obtenerConexion();
            String sql = "SELECT IDCARGO,NOMBRE FROM CARGO ORDER BY IDCARGO ASC";
            PreparedStatement st = cx.prepareStatement(sql);
            
            ResultSet rs = st.executeQuery();
            
            while(rs.next()){
                Cargo cargo = new Cargo();
                cargo.setIdCargo(rs.getInt("IDCARGO"));
                cargo.setNombre(rs.getString("NOMBRE"));
                cargo.setHabilitado(true);
                listado.add(cargo);
            }
            st.close();
            cx.close();
        }catch(SQLException ex){
            System.out.println("Error: "+ex.getMessage());
        }
        return new javax.swing.DefaultComboBoxModel(listado) ;
    }
}