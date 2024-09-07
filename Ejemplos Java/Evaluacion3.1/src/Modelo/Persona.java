package Modelo;

public abstract class Persona {
    private int id;
    private int rut;
    private String digito;
    private String nombre;
    private String apellido;
    private int idComuna;
    private Boolean esCliente;
    private Boolean habilitado;

    public Persona() {
        this.id= 0;
        this.rut = 0;
        this.digito = "";
        this.nombre = "";
        this.apellido = "";
        this.idComuna=0;
        this.esCliente = false;
        this.habilitado = false;
    }

    public Persona(int id, int rut, String digito,
                   String nombre, String apellido,int idComuna , Boolean esCliente, Boolean habilitado) {
        this.id = id;
        this.rut = rut;
        this.digito = digito;
        this.nombre = nombre;
        this.apellido = apellido;
        this.idComuna = idComuna;
        this.esCliente = esCliente;
        this.habilitado = habilitado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public String getDigito() {
        return digito;
    }

    public void setDigito(String digito) {
        this.digito = digito;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getIdComuna() {
        return idComuna;
    }

    public void setIdComuna(int idComuna) {
        this.idComuna = idComuna;
    }
    

    public Boolean getEsCliente() {
        return esCliente;
    }

    public void setEsCliente(Boolean esCliente) {
        this.esCliente = esCliente;
    }

    public Boolean getHabilitado() {
        return habilitado;
    }

    public void setHabilitado(Boolean habilitado) {
        this.habilitado = habilitado;
    }

    @Override
    public String toString() {
        return "Persona{" + "id=" + id + ", rut=" + rut + ", digito=" + digito + ", nombre=" + nombre + ", apellido=" + apellido + ", esCliente=" + esCliente + ", habilitado=" + habilitado + '}';
    }
    
    
}
