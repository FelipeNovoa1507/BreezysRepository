public class VehiculoFurgoneta extends Vehiculo{
    //Atributos
    private int carga;

    //Constructor
    public VehiculoFurgoneta(int carga,String matricula,String marca,String modelo){
        super(matricula, marca, modelo);
        this.carga=carga;
    }

    //Getters
    public int getCarga(){
        return carga;
    }

    //Metodos
    @Override
    public String mostrarDatos(){
        return "Matricula: "+matricula+"\nMarca: "+marca+"\nModelo: "+modelo+"\nCarga: "+carga;
    }
}
