package Modelo;

public abstract class Vehiculo {
    private int idVehiculo;
    private int idPersona;
    private int idMarca;
    private String patente;
    private String modelo;

    public Vehiculo() {
        this.idVehiculo = 0;
        this.idPersona = 0;
        this.idMarca = 0;
        this.patente = "";
        this.modelo = "";
    }

    public Vehiculo(int idVehiculo, int idPersona, int idMarca, String patente, String modelo) {
        this.idVehiculo = idVehiculo;
        this.idPersona = idPersona;
        this.idMarca = idMarca;
        this.patente = patente;
        this.modelo = modelo;
    }
    
    

    public int getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(int idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public int getIdMarca() {
        return idMarca;
    }

    public void setIdMarca(int idMarca) {
        this.idMarca = idMarca;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "idVehiculo=" + idVehiculo +
                ", idPersona=" + idPersona +
                ", idMarca=" + idMarca +
                ", patente='" + patente + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
