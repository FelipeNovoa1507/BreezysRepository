
package Controlador;

import BD.Conexion;
import Modelo.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class ControladorCliente {
    public boolean agregarCliente(Cliente cliente){
        try{
            Conexion con= new Conexion();
            Connection cx = con.obtenerConexion();
            String sql = "INSERT INTO CLIENTE(PNOMBRE,APATERNO,AMATERNO,RUT,DV,CORREO,TELEFONO) VALUES (?,?,?,?,?,?,?)";
            PreparedStatement st=cx.prepareStatement(sql);
            st.setString(1, cliente.getNombre());
            st.setString(2,cliente.getApaterno());
            st.setString(3,cliente.getAmaterno());
            st.setInt(4,cliente.getRut());
            st.setString(5,cliente.getDv());
            st.setString(6,cliente.getCorreo());
            st.setString(7,cliente.getTelefono());
            st.executeUpdate();
            st.close();
            cx.close();
            return true;
        }catch(SQLException ex){
            System.out.println("Error: "+ex.getMessage());
        }
        return false;
    }
}
