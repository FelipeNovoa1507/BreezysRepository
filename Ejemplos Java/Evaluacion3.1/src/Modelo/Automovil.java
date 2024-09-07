package Modelo;

public class Automovil extends Vehiculo{
    private int litrosMaletero;
    private int cantidadPuerta;
    
    public Automovil(int idVehiculo,int idPersona,int idMarca,String patente,String modelo,int litrosMaletero,int cantidadPuerta){
        super(idVehiculo,idPersona,idMarca,patente,modelo);
        this.litrosMaletero=litrosMaletero;
        this.cantidadPuerta=cantidadPuerta;
    }
    
    public int getLitrosMaletero() {
        return litrosMaletero;
    }

    public void setLitrosMaletero(int litrosMaletero) {
        this.litrosMaletero = litrosMaletero;
    }

    public int getCantidadPuerta() {
        return cantidadPuerta;
    }

    public void setCantidadPuerta(int cantidadPuerta) {
        this.cantidadPuerta = cantidadPuerta;
    }

    @Override
    public String toString() {
        return "Automovil{" + "litrosMaletero=" + litrosMaletero + ", cantidadPuerta=" + cantidadPuerta + '}';
    }
    
    
}
