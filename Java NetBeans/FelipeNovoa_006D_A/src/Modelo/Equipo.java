package Modelo;

public abstract class Equipo {
    private String modelo;
    private String cpu;
    private int tamanoDisco;
    private int cantidadRam;
    private double precio;
    private String descripcionEquipo;

    public Equipo(String modelo, String cpu, int tamanoDisco, int cantidadRam, double precio, String descripcionEquipo) {
        this.modelo = modelo;
        this.cpu = cpu;
        this.tamanoDisco = tamanoDisco;
        this.cantidadRam = cantidadRam;
        this.precio = precio;
        this.descripcionEquipo = descripcionEquipo;
    }


    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getTamanoDisco() {
        return tamanoDisco;
    }

    public void setTamanoDisco(int tamanoDisco) {
        this.tamanoDisco = tamanoDisco;
    }

    public int getCantidadRam() {
        return cantidadRam;
    }

    public void setCantidadRam(int cantidadRam) {
        this.cantidadRam = cantidadRam;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDescripcionEquipo() {
        return descripcionEquipo;
    }

    public void setDescripcionEquipo(String descripcionEquipo) {
        this.descripcionEquipo = descripcionEquipo;
    }
}
