public class VehiculoTurismo extends Vehiculo{
    //Atributos
    private int nPuertas;
    
    //Constructor
    public VehiculoTurismo(int nPuertas,String matricula,String marca,String modelo){
        super(matricula, marca, modelo);
        this.nPuertas=nPuertas;
    }

    //Getters
    public int getnPuertas(){
        return nPuertas;
    }

    //Metodos
    @Override
    public String mostrarDatos(){
        return "Matricula: "+matricula+"\nMarca: "+marca+"\nModelo: "+modelo+"\nNumero de puertas: "+nPuertas;
    }

}
