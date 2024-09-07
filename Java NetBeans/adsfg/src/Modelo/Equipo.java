package Modelo;

public class Equipo {
    private int idEquipo;
    private String descripcion;
    private String cpu;
    private int mbdiscoduro;
    private int gbram;
    private int precio;
    private int tipo;
    private String modelo;

    public Equipo(int idEquipo, String descripcion, String cpu, int mbdiscoduro, int gbram, int precio, int tipo,String modelo) {
        this.idEquipo = idEquipo;
        this.descripcion = descripcion;
        this.cpu = cpu;
        this.mbdiscoduro = mbdiscoduro;
        this.gbram = gbram;
        this.precio = precio;
        this.tipo = tipo;
        this.modelo=modelo;
    }

    public Equipo(){
        this.idEquipo = 0;
        this.descripcion = "";
        this.cpu = "";
        this.mbdiscoduro = 0;
        this.gbram = 0;
        this.precio = 0;
        this.tipo = 0;
        this.modelo="";
    }

    public int getIdEquipo() {
        return idEquipo;
    }

    public void setIdEquipo(int idEquipo) {
        this.idEquipo = idEquipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getMbdiscoduro() {
        return mbdiscoduro;
    }

    public void setMbdiscoduro(int mbdiscoduro) {
        this.mbdiscoduro = mbdiscoduro;
    }

    public int getGbram() {
        return gbram;
    }

    public void setGbram(int gbram) {
        this.gbram = gbram;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo=modelo;
    }
    
    
    @Override
    public String toString() {
        return modelo;
    }
    
}
