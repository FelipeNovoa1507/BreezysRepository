package Modelo;

public class Cargo {
    private int idCargo;
    private String nombre;
    private boolean habilitado;
    
    public Cargo(){
        this.idCargo=0;
        this.nombre="";
        this.habilitado=false;
    }

    public Cargo(int idCargo, String nombre, boolean habilitado) {
        this.idCargo = idCargo;
        this.nombre = nombre;
        this.habilitado = habilitado;
    }

    public int getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(int idCargo) {
        this.idCargo = idCargo;
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

