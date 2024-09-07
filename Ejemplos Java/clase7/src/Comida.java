public class Comida {
    private int codigo;
    private String nombre;
    private int calorias;
    private int sodio;

    //constructor
    public Comida(int codigo, String nombre, int calorias, int sodio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.calorias = calorias;
        this.sodio = sodio;
    }

    public Comida(){
        this.codigo=0;
        this.nombre="";
        this.calorias=0;
        this.sodio=0;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCalorias() {
        return calorias;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }

    public int getSodio() {
        return sodio;
    }

    public void setSodio(int sodio) {
        this.sodio = sodio;
    }

    
    public String imprimir() {
        return "\nCodigo: "+codigo+
               "\nNombre: "+nombre+
               "\nCalorias: "+calorias+
               "\nSodio: "+sodio;
    }
    
    //sobreescritura
    public String tipoComida(){
        return "Comida en general.";
    }
}
