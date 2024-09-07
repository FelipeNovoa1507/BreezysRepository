package Modelo;

public class Laptop extends Equipo{
    private int tampantalla;
    private int puertosusb;

    public Laptop(int tampantalla, int puertosusb, int idEquipo, String descripcion, String cpu, int mbdiscoduro, int gbram, int precio, int tipo,String modelo) {
        super(idEquipo, descripcion, cpu, mbdiscoduro, gbram, precio, tipo, modelo);
        this.tampantalla = tampantalla;
        this.puertosusb = puertosusb;
    }

    public int getTampantalla() {
        return tampantalla;
    }

    public void setTampantalla(int tampantalla) {
        this.tampantalla = tampantalla;
    }

    public int getPuertosusb() {
        return puertosusb;
    }

    public void setPuertosusb(int puertosusb) {
        this.puertosusb = puertosusb;
    }

    @Override
    public String toString() {
        return "Laptop{" + "tampantalla=" + tampantalla + ", puertosusb=" + puertosusb + '}';
    }

   
    
    
    
}
