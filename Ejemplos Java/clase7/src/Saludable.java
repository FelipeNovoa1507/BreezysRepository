public class Saludable extends Comida {
    private boolean EsOrigenVegetal;

    public Saludable(){
        this.EsOrigenVegetal=false;
    }

    public Saludable(int codigo, String nombre, int calorias, int sodio, boolean esOrigenVegetal) {
        super(codigo, nombre, calorias, sodio);
        this.EsOrigenVegetal = esOrigenVegetal;
    }

    public boolean isEsOrigenVegetal() {
        return EsOrigenVegetal;
    }

    public void setEsOrigenVegetal(boolean esOrigenVegetal) {
        EsOrigenVegetal = esOrigenVegetal;
    }

    
    public String imprimirS() {
        return imprimir()+"\nOrigen Vegetal: "+(EsOrigenVegetal?"Si":"No");
    }

    @Override
    public String tipoComida(){
        return "Esta comida es saludable.";
    }


    //sobrecarga
    public String cocinar(){
        return "Cocinar por 15 minutos.";
    }
    
    public String cocinar(int minutos){
        return "Cocinar por "+minutos+" minutos.";
    }

    public String cocinar(int minutos,String tipoCoccion){
        return "Cocinar por "+minutos+" minutos."+"\nTipo de coccion: "+tipoCoccion;
    }
    

}
