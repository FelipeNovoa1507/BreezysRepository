package Modelo;

public class Cliente {
    private String nombre;
    private String apaterno;
    private String amaterno;
    private int rut;
    private String dv;
    private String correo;
    private String telefono;
    private int idCliente;
    
    public Cliente(){
        this.nombre="";
        this.apaterno="";
        this.amaterno="";
        this.rut=0;
        this.dv="";
        this.correo="";
        this.telefono="";
        this.idCliente=0;
    }
    
    public Cliente(String nombre,String apaterno,String amaterno,int rut,String dv,String correo,String telefono,int idCliente){
        this.nombre=nombre;
        this.apaterno=apaterno;
        this.amaterno=amaterno;
        this.rut=rut;
        this.dv=dv;
        this.correo=correo;
        this.telefono=telefono;
        this.idCliente=idCliente;
    }
    
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public String getApaterno(){
        return apaterno;
    }
    public void setApaterno(String apaterno){
        this.apaterno=apaterno;
    }
    
    public String getAmaterno(){
        return amaterno;
    }
    public void setAmaterno(String amaterno){
        this.amaterno=amaterno;
    }
    
    public int getRut(){
        return rut;
    }
    public void setRut(int rut){
        this.rut=rut;
    }
    
    public String getDv(){
        return dv;
    }
    public void setDv(String dv){
        this.dv=dv;
    }
    
    public String getCorreo(){
        return correo;
    }
    public void setCorreo(String correo){
        this.correo=correo;
    }
    
    public String getTelefono(){
        return telefono;
    }
    public void setTelefono(String telefono){
        this.telefono=telefono;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", apaterno=" + apaterno + ", amaterno=" + amaterno + ", rut=" + rut + ", dv=" + dv + ", correo=" + correo + ", telefono=" + telefono + ", idCliente=" + idCliente + '}';
    }
    
    
}
