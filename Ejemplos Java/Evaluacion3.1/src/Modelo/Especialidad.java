package Modelo;


public class Especialidad {
    private int idEspecialidad;
    private String nombre;
    private boolean habilitado;
    
    public Especialidad(){
        this.idEspecialidad=0;
        this.nombre="";
        this.habilitado=false;
    }
    
    public Especialidad(int idEspecialidad, String nombre, boolean habilitado) {
        this.idEspecialidad = idEspecialidad;
        this.nombre = nombre;
        this.habilitado = habilitado;
    }

    public int getIdEspecialidad() {
        return idEspecialidad;
    }

    public void setIdEspecialidad(int idEspecialidad) {
        this.idEspecialidad = idEspecialidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isHabilitado() {
        return habilitado;
    }

    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
    
}
