package Controlador;

import BD.Conexion;
import Modelo.Cliente;
import Modelo.Ventas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ControladorVentas {
    public boolean agregarVenta(Ventas ventas){
        try{
            Conexion con=new Conexion();
            Connection cx=con.obtenerConexion();
            String sql="SELECT CONCAT(RUT,'-',DV) AS RUTCOMPLETO,CONCAT(PNOMBRE,' ',APATERNO,' ',AMATERNO) AS NOMBRECOMPLETO FROM CLIENTE WHERE IDCLIENTE=?";
            PreparedStatement st=cx.prepareStatement(sql);
            st.setInt(1,ventas.getIdCliente());
            ResultSet rs=st.executeQuery();
            
            if(rs.next()){
                String rut=rs.getString("RUTCOMPLETO");
                String nombre=rs.getString("NOMBRECOMPLETO");


                String sql1="INSERT INTO VENTAS (RUTCLIENTE,NOMBRE,FECHA,IDEQUIPO,IDCLIENTE) VALUES (?,?,CURRENT_TIMESTAMP,?,?)";
                PreparedStatement st3=cx.prepareStatement(sql1);
                st3.setString(1,rut);
                st3.setString(2,nombre);
                st3.setInt(3,ventas.getIdEquipo());
                st3.setInt(4,ventas.getIdCliente());
                st3.executeUpdate();
                st.close();
                st3.close();
                cx.close();
                return true;
            }
        }catch (SQLException ex){
            System.out.println("Error: "+ex.getMessage());
        }
        return false;
    }
    
    public String buscarIdPorRut(int rut,String digito){
        try{
            Conexion con=new Conexion();
            Connection cx = con.obtenerConexion();
            String sql="SELECT IDCLIENTE FROM CLIENTE WHERE RUT=? AND DV=?";
            PreparedStatement st = cx.prepareStatement(sql);
            st.setInt(1,rut);
            st.setString(2,digito);
            ResultSet rs=st.executeQuery();
            if(rs.next()){
                String id=rs.getString("IDCLIENTE");
                return id;
            }
            
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return null;
    }
}
                


