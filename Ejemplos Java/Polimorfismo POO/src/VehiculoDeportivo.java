public class VehiculoDeportivo extends Vehiculo{
    //Atributos
    private int cilindrada;

    //Constructor
    public VehiculoDeportivo(int cilindrada,String matricula,String marca,String modelo){
        super(matricula,marca,modelo);
        this.cilindrada=cilindrada;
    }

    //Getters
    public int getCilindrada(){
        return cilindrada;
    }

    //Metodos
    @Override
    public String mostrarDatos(){
        return "Matricula: "+matricula+"\nMarca: "+marca+"\nModelo: "+modelo+"\nCilindrada: "+cilindrada;
    }
}
