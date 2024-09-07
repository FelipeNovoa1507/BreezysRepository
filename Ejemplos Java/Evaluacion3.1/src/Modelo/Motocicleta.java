package Modelo;

public class Motocicleta extends Vehiculo {
    private int largoManillar;
    private String estilo;
    
    public Motocicleta(int idVehiculo,int idPersona,int idMarca,String patente,String modelo,int largoManillar,String estilo){
        super(idVehiculo,idPersona,idMarca,patente,modelo);
        this.largoManillar=largoManillar;
        this.estilo=estilo;
    }

    public int getLargoManillar() {
        return largoManillar;
    }

    public void setLargoManillar(int largoManillar) {
        this.largoManillar = largoManillar;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    @Override
    public String toString() {
        return "Motocicleta{" + "largoManillar=" + largoManillar + ", estilo=" + estilo + '}';
    }

    
    
}
