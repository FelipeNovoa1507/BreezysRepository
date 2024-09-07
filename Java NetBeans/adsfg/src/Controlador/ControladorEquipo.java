package Controlador;

import BD.Conexion;
import Modelo.Desktop;
import Modelo.Equipo;
import Modelo.Laptop;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;

public class ControladorEquipo {
    public boolean agregarLaptop(Laptop laptop){
        try{
            Conexion con=new Conexion();
            Connection cx=con.obtenerConexion();
            String sql="INSERT INTO EQUIPO(DESCRIPCION,CPU,MBDISCODURO,GBRAM,PRECIO,TIPO,TAMPANTALLA,PUERTOSUSB,MODELO) VALUES (?,?,?,?,?,?,?,?,?)";
            PreparedStatement st=cx.prepareStatement(sql);
            st.setString(1,laptop.getDescripcion());
            st.setString(2,laptop.getCpu());
            st.setInt(3,laptop.getMbdiscoduro());
            st.setInt(4,laptop.getGbram());
            st.setInt(5,laptop.getPrecio());
            st.setInt(6,laptop.getTipo());
            st.setInt(7,laptop.getTampantalla());
            st.setInt(8,laptop.getPuertosusb());
            st.setString(9,laptop.getModelo());
            st.executeUpdate();
            st.close();
            cx.close();
            return true;           
        }catch(SQLException ex){
            System.out.println("Error: "+ex.getMessage());
        }
        return false;
    }
    
    public boolean agregarDesktop(Desktop desktop){
        try{
            Conexion con=new Conexion();
            try (Connection cx = con.obtenerConexion()) {
                String sql="INSERT INTO EQUIPO(DESCRIPCION,CPU,MBDISCODURO,GBRAM,PRECIO,TIPO,POTFUENTE,FORMCASE,MODELO) VALUES (?,?,?,?,?,?,?,?,?)";
                PreparedStatement st=cx.prepareStatement(sql);
                st.setString(1,desktop.getDescripcion());
                st.setString(2,desktop.getCpu());
                st.setInt(3,desktop.getMbdiscoduro());
                st.setInt(4,desktop.getGbram());
                st.setInt(5,desktop.getPrecio());
                st.setInt(6,desktop.getTipo());
                st.setInt(7,desktop.getPotfuente());
                st.setString(8,desktop.getFormcase());
                st.setString(9,desktop.getModelo());
                st.executeUpdate();
                st.close();
            }
            return true;           
        }catch(SQLException ex){
            System.out.println("Error: "+ex.getMessage());
        }
        return false;
    }
    
    public ArrayList<Equipo> listarTodos() {
    ArrayList<Equipo> listado = new ArrayList<>();
    Connection cx = null;
    PreparedStatement st = null;
    ResultSet rs = null;

    try {
        Conexion con = new Conexion();
        cx = con.obtenerConexion();
        String sql = "SELECT IDQEQUIPO,DESCRIPCION,CPU,MBDISCODURO,GBRAM,PRECIO,TIPO,POTFUENTE,FORMCASE,TAMPANTALLA,PUERTOSUSB,MODELO FROM EQUIPO";
        st = cx.prepareStatement(sql);
        rs = st.executeQuery();
        Desktop desktop = null;
        Laptop laptop = null;
        int tipo=0;

        while (rs.next()) {
            
            int idequipo=rs.getInt("IDEQUIPO");
            String descripcion=rs.getString("DESCRIPCION");
            String cpu=rs.getString("CPU");
            int mbdiscoduro=rs.getInt("MBDISCODURO");
            int gbram=rs.getInt("GBRAM");
            int precio=rs.getInt("PRECIO");
            int tipopc=rs.getInt("TIPO");
            int potfuente=rs.getInt("POTFUENTE");
            String formcase=rs.getString("FORMCASE");
            int tampantalla= rs.getInt("TAMPANTALLA");
            int puertosusb=rs.getInt("PUERTOSUSB");
            String modelo=rs.getString("MODELO");
            tipo=rs.getInt("TIPO");
            desktop=new Desktop(potfuente,formcase,idequipo,descripcion,cpu,mbdiscoduro,gbram,precio,tipopc,modelo);
            laptop=new Laptop(tampantalla,puertosusb,idequipo,descripcion,cpu,mbdiscoduro,gbram,precio,tipopc,modelo);
            if(tipo==0){
                listado.add(laptop);
            }else{
                listado.add(desktop);
            }
            
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
            Vector<Equipo> listado = new Vector<>();
            Equipo equipo = new Equipo();
            equipo.setIdEquipo(0);
            equipo.setModelo("Seleccionar...");
            listado.add(equipo);

            try {
                Conexion con = new Conexion();  
                Connection cx= con.obtenerConexion();
                String sql="SELECT IDEQUIPO, MODELO FROM EQUIPO ORDER BY IDEQUIPO ASC";
                PreparedStatement st = cx.prepareStatement(sql);
                ResultSet rs = st.executeQuery();
                while (rs.next()) {
                    Equipo equipo1=new Equipo();
                    equipo1.setIdEquipo(rs.getInt("IDEQUIPO"));
                    equipo1.setModelo(rs.getString("MODELO"));
                    listado.add(equipo1);
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
