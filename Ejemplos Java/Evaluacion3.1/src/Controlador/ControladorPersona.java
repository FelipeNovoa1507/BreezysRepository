package Controlador;

import BD.Conexion;
import Modelo.Cliente;
import Modelo.Empleado;
import Modelo.Persona;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ControladorPersona {

    public boolean agregarCliente(Cliente cliente) {
        try {
            Conexion con = new Conexion();
            Connection cx = con.obtenerConexion();
            String sql = "INSERT INTO PERSONA (IDCOMUNA, RUT, DIGITO, NOMBRE, APELLIDO, ESCLIENTE, HABILITADO) VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement st = cx.prepareStatement(sql);
            st.setInt(1, cliente.getIdComuna());
            st.setInt(2, cliente.getRut());
            st.setString(3, cliente.getDigito());
            st.setString(4, cliente.getNombre());
            st.setString(5, cliente.getApellido());
            st.setBoolean(6, cliente.getEsCliente());
            st.setBoolean(7, cliente.getHabilitado());
            st.executeUpdate();
            st.close();
            cx.close();
            return true;
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return false;
    }
    
    public boolean agregarEmpleado(Empleado empleado) {
        try {
            Conexion con = new Conexion();
            Connection cx = con.obtenerConexion();
            String sql = "INSERT INTO PERSONA (IDCARGO, IDESPECIALIDAD, IDCOMUNA, RUT, DIGITO, NOMBRE, APELLIDO, SUELDO, ESCLIENTE, HABILITADO) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement st = cx.prepareStatement(sql);
            st.setInt(1, empleado.getIdCargo());
            st.setInt(2, empleado.getIdEspecialidad());
            st.setInt(3, empleado.getIdComuna());
            st.setInt(4, empleado.getRut());
            st.setString(5, empleado.getDigito());
            st.setString(6, empleado.getNombre());
            st.setString(7, empleado.getApellido());
            st.setInt(8, empleado.getSueldo());
            st.setBoolean(9, empleado.getEsCliente());
            st.setBoolean(10, empleado.getHabilitado());
            st.executeUpdate();
            st.close();
            cx.close();
            return true;
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return false;
    }
    
    public Cliente agregarRut(int a){
        try{
            Conexion con=new Conexion();
            Connection cx = con.obtenerConexion();
            String sql="SELECT RUT,DIGITO FROM PERSONA WHERE IDPERSONA=?";
            PreparedStatement st=cx.prepareStatement(sql);
            st.setInt(1,a);
            ResultSet rs=st.executeQuery();
            
            
            if(rs.next()){
                Cliente cliente=new Cliente(0,0,"","","",0,false,false);
                cliente.setRut(rs.getInt("RUT"));
                cliente.setDigito(rs.getString("DIGITO"));
                return cliente;
            }
            st.close();
            cx.close();
            return null;
        }catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return null;
    }

    public boolean actualizarCliente(Cliente cliente) {
        try {
            Conexion con = new Conexion();
            Connection cx = con.obtenerConexion();
            String sql = "UPDATE PERSONA SET IDCARGO=?, IDESPECIALIDAD=?, IDCOMUNA=?, RUT=?, DIGITO=?, NOMBRE=?, APELLIDO=?, SUELDO=?, ESCLIENTE=?, HABILITADO=? WHERE IDPERSONA=?";
            PreparedStatement st = cx.prepareStatement(sql);
            st.setNull(1,java.sql.Types.INTEGER);
            st.setNull(2,java.sql.Types.INTEGER);
            st.setInt(3, cliente.getIdComuna());
            st.setInt(4, cliente.getRut());
            st.setString(5, cliente.getDigito());
            st.setString(6, cliente.getNombre());
            st.setString(7, cliente.getApellido());
            st.setNull(8,java.sql.Types.INTEGER);
            st.setBoolean(9, cliente.getEsCliente());
            st.setBoolean(10, cliente.getHabilitado());
            st.setInt(11, cliente.getId());
            st.executeUpdate();
            st.close();
            cx.close();
            return true;
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return false;
    }
    
    public boolean actualizarEmpleado(Empleado empleado) {
        try {
            Conexion con = new Conexion();
            Connection cx = con.obtenerConexion();
            String sql = "UPDATE PERSONA SET IDCARGO=?,IDESPECIALIDAD=?,IDCOMUNA=?,RUT=?,DIGITO=?,NOMBRE=?,APELLIDO=?,SUELDO=?,ESCLIENTE=?,HABILITADO=? WHERE IDPERSONA=?";
            PreparedStatement st = cx.prepareStatement(sql);
            st.setInt(1, empleado.getIdCargo());
            st.setInt(2, empleado.getIdEspecialidad());
            st.setInt(3, empleado.getIdComuna());
            st.setInt(4, empleado.getRut());
            st.setString(5, empleado.getDigito());
            st.setString(6, empleado.getNombre());
            st.setString(7, empleado.getApellido());
            st.setInt(8, empleado.getSueldo());
            st.setBoolean(9, empleado.getEsCliente());
            st.setBoolean(10, empleado.getHabilitado());
            st.setInt(11, empleado.getId());
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
            String sql = "DELETE FROM PERSONA WHERE IDPERSONA=?";
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
    
    public Cliente buscarIdPorRut(int rut,String digito){
        try{
            Conexion con=new Conexion();
            Connection cx = con.obtenerConexion();
            String sql="SELECT IDPERSONA FROM PERSONA WHERE RUT=? AND DIGITO=?";
            PreparedStatement st = cx.prepareStatement(sql);
            st.setInt(1,rut);
            st.setString(2,digito);
            ResultSet rs=st.executeQuery();
            if(rs.next()){
                Cliente cliente=new Cliente(0,0,"","","",0,false,false);
                cliente.setId(rs.getInt("IDPERSONA"));
                
                return cliente;
            }
            
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return null;// Retorna un valor negativo si no se encuentra el ID
        
    
    }
    public Empleado buscarPorId(int id) {
        try {
            Conexion con = new Conexion();
            Connection cx = con.obtenerConexion();
            String sql = "SELECT * FROM PERSONA WHERE IDPERSONA=?";
            PreparedStatement st = cx.prepareStatement(sql);
            st.setInt(1, id);
            ResultSet rs = st.executeQuery();

            if (rs.next()) {
                Empleado empleado = null;
                empleado.setId(rs.getInt("IDPERSONA"));
                empleado.setIdCargo(rs.getInt("IDCARGO"));
                empleado.setIdEspecialidad(rs.getInt("IDESPECIALIDAD"));
                empleado.setIdComuna(rs.getInt("IDCOMUNA"));
                empleado.setRut(rs.getInt("RUT"));
                empleado.setDigito(rs.getString("DIGITO"));
                empleado.setNombre(rs.getString("NOMBRE"));
                empleado.setApellido(rs.getString("APELLIDO"));
                empleado.setSueldo(rs.getInt("SUELDO"));
                empleado.setEsCliente(rs.getBoolean("ESCLIENTE"));
                empleado.setHabilitado(rs.getBoolean("HABILITADO"));
                return empleado;
            }
            st.close();
            cx.close();
            return null;
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return null;
    }

    public ArrayList<Persona> listarTodos() {
    ArrayList<Persona> listado = new ArrayList<>();
    Connection cx = null;
    PreparedStatement st = null;
    ResultSet rs = null;

    try {
        Conexion con = new Conexion();
        cx = con.obtenerConexion();
        String sql = "SELECT IDPERSONA AS IDPER,IDCARGO AS IDCAR,IDESPECIALIDAD AS IDESP,IDCOMUNA AS IDCOM, CONCAT(RUT,'-',DIGITO)AS RUT, CONCAT(NOMBRE,' ',APELLIDO)AS NOMBRE, SUELDO,ESCLIENTE,HABILITADO,DIGITO,APELLIDO FROM PERSONA";
        st = cx.prepareStatement(sql);
        rs = st.executeQuery();
        Cliente cliente = null;
        Empleado empleado = null;
        int tipo=0;

        while (rs.next()) {
            
            int id=rs.getInt("IDPER");
            int idcar=rs.getInt("IDCAR");
            int idesp=rs.getInt("IDESP");
            int idcom=rs.getInt("IDCOM");
            int rut=rs.getInt("RUT");
            String dv=rs.getString("DIGITO");
            String nombre=rs.getString("NOMBRE");
            String apellido=rs.getString("APELLIDO");
            int sueldo=rs.getInt("SUELDO");
            boolean escliente= rs.getBoolean("ESCLIENTE");
            boolean habilitado=rs.getBoolean("HABILITADO");
            tipo=rs.getInt("IDCAR");
            cliente=new Cliente(id,rut,dv,nombre,apellido,idcom,escliente,habilitado);
            empleado=new Empleado(id,rut,dv,nombre,apellido,idcom,escliente,habilitado,idcar,idesp,sueldo);
            if(tipo==0){
                listado.add(cliente);
            }else{
                listado.add(empleado);
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
}

