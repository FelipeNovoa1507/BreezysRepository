package Modelo;

public class Empleado extends Persona{
    private int idCargo;
    private int idEspecialidad;
    private int sueldo;
    
    public Empleado(int id, int rut,String digito,String nombre,String apellido,int idComuna,boolean esCliente,boolean habilitado,int idCargo,int idEspecialidad,int sueldo){
        super(id,rut,digito,nombre,apellido,idComuna,esCliente,habilitado);
        this.idCargo=idCargo;
        this.idEspecialidad=idEspecialidad;
        this.sueldo=sueldo;
    }

    public int getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(int idCargo) {
        this.idCargo = idCargo;
    }

    public int getIdEspecialidad() {
        return idEspecialidad;
    }

    public void setIdEspecialidad(int idEspecialidad) {
        this.idEspecialidad = idEspecialidad;
    }


    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Empleado{" + "idCargo=" + idCargo + ", idEspecialidad=" + idEspecialidad + ", sueldo=" + sueldo + '}';
    }
    
    
        
}
