public class Puesto {
    private int codigops;
    private String nombre;
    
    //Constructor
    public Puesto(){
        codigops=0;
        nombre="";
    }

    public Puesto(int codigops,String nombre){
        codigops=this.codigops;
        nombre=this.nombre;
    }

    public int getCodigops() {
        return codigops;
    }

    public void setCodigops(int codigops) {
        this.codigops = codigops;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    public String imprimirPuesto() {
        return "\nCodigo Puesto: "+codigops+"\nNombre Puesto: "+nombre;
    }

    
    
}
