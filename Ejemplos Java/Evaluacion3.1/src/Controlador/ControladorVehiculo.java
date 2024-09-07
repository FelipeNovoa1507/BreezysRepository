package Controlador;

import Modelo.Vehiculo;
import Modelo.Automovil;
import Modelo.Motocicleta;
import BD.Conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ControladorVehiculo {
    public boolean agregarAuto(Automovil automovil) {
        try {
            Conexion con = new Conexion();
            Connection cx = con.obtenerConexion();
            String sql = "INSERT INTO VEHICULO (IDPERSONA,IDMARCA,PATENTE,MODELO,LITROSMALETERO,CANTIDADPUERTA) VALUES (?,?,?,?,?,?)";
            PreparedStatement st = cx.prepareStatement(sql);
            st.setInt(1, automovil.getIdPersona());
            st.setInt(2, automovil.getIdMarca());
            st.setString(3, automovil.getPatente());
            st.setString(4, automovil.getModelo());
            st.setInt(5,automovil.getLitrosMaletero());
            st.setInt(6,automovil.getCantidadPuerta());
            st.executeUpdate();
            st.close();
            cx.close();
            return true;
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return false;
    }
    
    public boolean agregarMoto(Motocicleta motocicleta) {
        try {
            Conexion con = new Conexion();
            try (Connection cx = con.obtenerConexion()) {
                String sql = "INSERT INTO VEHICULO (IDPERSONA,IDMARCA,PATENTE,MODELO,LARGOMANILLAR,ESTILO) VALUES (?,?,?,?,?,?)";
                try (PreparedStatement st = cx.prepareStatement(sql)) {
                    st.setInt(1, motocicleta.getIdPersona());
                    st.setInt(2, motocicleta.getIdMarca());
                    st.setString(3, motocicleta.getPatente());
                    st.setString(4, motocicleta.getModelo());
                    st.setInt(5,motocicleta.getLargoManillar());
                    st.setString(6,motocicleta.getEstilo());
                    st.executeUpdate();
                }
            }
            return true;
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return false;
    }

    public boolean actualizarAuto(Automovil automovil) {
        try {
            Conexion con = new Conexion();
            try (Connection cx = con.obtenerConexion()) {
                String sql = "UPDATE VEHICULO SET IDPERSONA=?, IDMARCA=?,PATENTE=?,MODELO=?,LITROSMALETERO=?,CANTIDADPUERTA=? WHERE IDVEHICULO=?";
                try (PreparedStatement st = cx.prepareStatement(sql)) {
                    st.setInt(1, automovil.getIdPersona());
                    st.setInt(2, automovil.getIdMarca());
                    st.setString(3, automovil.getPatente());
                    st.setString(4, automovil.getModelo());
                    st.setInt(5,automovil.getLitrosMaletero());
                    st.setInt(6,automovil.getCantidadPuerta());
                    st.setInt(7, automovil.getIdVehiculo());
                    st.executeUpdate();
                }
            }
            return true;
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return false;
    }
    
    public boolean actualizarMoto(Motocicleta motocicleta) {
        try {
            Conexion con = new Conexion();
            try (Connection cx = con.obtenerConexion()) {
                String sql = "UPDATE VEHICULO SET IDPERSONA=?, IDMARCA=?,PATENTE=?,MODELO=?,LARGOMANILLAR=?,ESTILO=? WHERE IDVEHICULO=?";
                try (PreparedStatement st = cx.prepareStatement(sql)) {
                    st.setInt(1, motocicleta.getIdPersona());
                    st.setInt(2, motocicleta.getIdMarca());
                    st.setString(3, motocicleta.getPatente());
                    st.setString(4, motocicleta.getModelo());
                    st.setInt(5,motocicleta.getLargoManillar());
                    st.setString(6,motocicleta.getEstilo());
                    st.setInt(7, motocicleta.getIdVehiculo());
                    st.executeUpdate();
                }
            }
            return true;
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return false;
    }

    public boolean eliminar(int idVehiculo) {
        try {
            Conexion con = new Conexion();
            Connection cx = con.obtenerConexion();
            String sql = "DELETE FROM VEHICULO WHERE IDVEHICULO=?";
            PreparedStatement st = cx.prepareStatement(sql);
            st.setInt(1, idVehiculo);
            st.executeUpdate();
            st.close();
            cx.close();
            return true;
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return false;
    }
    
    

    public Vehiculo buscarPorId(int idVehiculo) {
        try {
            Conexion con = new Conexion();
            try (Connection cx = con.obtenerConexion()) {
                String sql = "SELECT IDVEHICULO,IDPERSONA,IDMARCA,PATENTE,MODELO,LITROSMALETERO,CANTIDADPUERTA,LARGOMANILLAR,ESTILO FROM VEHICULO WHERE IDVEHICULO=?";
                try (PreparedStatement st = cx.prepareStatement(sql)) {
                    st.setInt(1, idVehiculo);
                    try (ResultSet rs = st.executeQuery()) {
                        if (rs.next()) {
                            Vehiculo vehiculo=new Vehiculo(){};
                            vehiculo.setIdVehiculo(rs.getInt("IDVEHICULO"));
                            vehiculo.setIdPersona(rs.getInt("IDPERSONA"));
                            vehiculo.setIdMarca(rs.getInt("IDMARCA"));
                            vehiculo.setPatente(rs.getString("PATENTE"));
                            vehiculo.setModelo(rs.getString("MODELO"));
                            ((Automovil) vehiculo).setLitrosMaletero(rs.getInt("LITROSMALETERO"));
                            ((Automovil) vehiculo).setCantidadPuerta(rs.getInt("CANTIDADPUERTA"));
                            ((Motocicleta) vehiculo).setLargoManillar(rs.getInt("LARGOMANILLAR"));
                            ((Motocicleta) vehiculo).setEstilo(rs.getString("ESTILO"));
                                                        
                            return vehiculo;
                        }
                    }
                }
            }
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return null;
    }

    public ArrayList<Vehiculo> listarTodos() {
        ArrayList<Vehiculo> listado = new ArrayList<>();
        Connection cx=null;
        PreparedStatement st=null;
        ResultSet rs=null;
        try {
            Conexion con = new Conexion();
            cx=con.obtenerConexion();
            String sql = "SELECT IDVEHICULO,IDPERSONA,IDMARCA,PATENTE,MODELO,LITROSMALETERO,CANTIDADPUERTA,LARGOMANILLAR,ESTILO FROM VEHICULO";
            st=cx.prepareStatement(sql);
            rs=st.executeQuery();
            Automovil automovil=null;
            Motocicleta motocicleta=null;
            int tipo=0;
            
            while (rs.next()) {
                int idVehiculo = rs.getInt("IDVEHICULO");
                int idPersona = rs.getInt("IDPERSONA");
                int idMarca = rs.getInt("IDMARCA");
                String patente = rs.getString("PATENTE");
                String modelo = rs.getString("MODELO");  
                int litrosmaletero = rs.getInt("LITROSMALETERO");
                int cantidadpuerta = rs.getInt("CANTIDADPUERTA");
                int largomanillar = rs.getInt("LARGOMANILLAR");
                String estilo = rs.getString("ESTILO");
                tipo=rs.getInt("LARGOMANILLAR");
                if (tipo==0){
                    automovil=new Automovil(idVehiculo,idPersona,idMarca,patente,modelo,litrosmaletero,cantidadpuerta);
                    listado.add(automovil);
                }else{
                    motocicleta=new Motocicleta(idVehiculo,idPersona,idMarca,patente,modelo,largomanillar,estilo); 
                    listado.add(motocicleta);
                }
            }
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        } finally{
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
    
    public Automovil buscarIdVehiculo(String a){
        try{
            Conexion con=new Conexion();
            Connection cx = con.obtenerConexion();
            String sql="SELECT IDVEHICULO FROM VEHICULO WHERE PATENTE=?";
            PreparedStatement st=cx.prepareStatement(sql);
            st.setString(1,a);
            ResultSet rs=st.executeQuery();
            
            
            if(rs.next()){
                Automovil automovil = new Automovil(0,0,0,"","",0,0);
                automovil.setIdVehiculo(rs.getInt("IDVEHICULO"));
                automovil.setPatente(rs.getString("PATENTE"));
                return automovil;
            }
            st.close();
            cx.close();
            return null;
        }catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return null;
    }
}
