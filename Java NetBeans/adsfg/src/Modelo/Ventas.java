package Modelo;


public class Ventas {
    private int idventa;
    private String rutCliente;
    private String nombreCliente;
    private int idEquipo;
    private int idCliente;
    

    public Ventas(int idventa, String rutCliente, String nombreCliente, int idEquipo,int idCliente) {
        this.idventa = idventa;
        this.rutCliente = rutCliente;
        this.nombreCliente = nombreCliente;
        this.idEquipo = idEquipo;
        this.idCliente = idCliente;
    }
    
    public Ventas(){
        this.idventa = 0;
        this.rutCliente = "";
        this.nombreCliente = "";
        this.idEquipo = 0;
        this.idCliente = 0;
    }

    public int getIdventa() {
        return idventa;
    }

    public void setIdventa(int idventa) {
        this.idventa = idventa;
    }

    public String getRutCliente() {
        return rutCliente;
    }

    public void setRutCliente(String rutCliente) {
        this.rutCliente = rutCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public int getIdEquipo() {
        return idEquipo;
    }

    public void setIdEquipo(int idEquipo) {
        this.idEquipo = idEquipo;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
    

    @Override
    public String toString() {
        return "Ventas{" + "idventa=" + idventa + ", rutCliente=" + rutCliente + ", nombreCliente=" + nombreCliente + ", idEquipo=" + idEquipo + '}';
    }
    
}
