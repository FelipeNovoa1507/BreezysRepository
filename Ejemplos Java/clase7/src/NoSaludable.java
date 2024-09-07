public class NoSaludable extends Comida {
    private int grasasTrans;

    public NoSaludable(){
        this.grasasTrans=0;
    }

    public NoSaludable(int codigo, String nombre, int calorias, int sodio, int grasasTrans) {
        super(codigo, nombre, calorias, sodio);
        this.grasasTrans = grasasTrans;
    }

    public int getGrasasTrans() {
        return grasasTrans;
    }

    public void setGrasasTrans(int grasasTrans) {
        this.grasasTrans = grasasTrans;
    }


    public String imprimirN() {
        return "\nGrasas Trans"+grasasTrans;
    }
    
}
