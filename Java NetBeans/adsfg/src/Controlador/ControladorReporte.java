package Controlador;

import BD.Conexion;
import Modelo.Reporte;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ControladorReporte {
    public ArrayList<Reporte> listarTodos() {
    ArrayList<Reporte> listado = new ArrayList<>();
    Connection cx = null;
    PreparedStatement st=null;
    ResultSet rs=null;
    try {
        Conexion con = new Conexion();
        cx = con.obtenerConexion();
        String sql = "SELECT VENTAS.NOMBRE AS NOMCLIENTE,CLIENTE.TELEFONO AS TELCLIENTE,CLIENTE.CORREO AS CORREOCLIENTE,EQUIPO.MODELO AS MODELOEQ,EQUIPO.PRECIO AS PRECIOEQ,EQUIPO.TIPO AS TIPOEQ FROM VENTAS INNER JOIN CLIENTE ON VENTAS.IDCLIENTE = CLIENTE.IDCLIENTE INNER JOIN EQUIPO ON VENTAS.IDEQUIPO = EQUIPO.IDEQUIPO";
        st = cx.prepareStatement(sql);
        rs = st.executeQuery();
        
        while (rs.next()) {
            String nomcliente=rs.getString("NOMCLIENTE");
            String telcliente=rs.getString("TELCLIENTE");
            String correocliente=rs.getString("CORREOCLIENTE");
            String modeloeq=rs.getString("MODELOEQ");
            int precioeq=rs.getInt("PRECIOEQ");
            int tipoeq=rs.getInt("TIPOEQ");
            String tipo;
            Reporte reporte = new Reporte(modeloeq,nomcliente,telcliente,correocliente,precioeq,"");
            if(tipoeq==1){
                reporte.setTipoeq("Laptop");
                listado.add(reporte);
            }else if(tipoeq==2){
                reporte.setTipoeq("Desktop");
                listado.add(reporte);
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
