package Modelo;

public class Desktop extends Equipo{
    private int potfuente;
    private String formcase;

    public Desktop(int potfuente, String formcase, int idEquipo, String descripcion, String cpu, int mbdiscoduro, int gbram, int precio, int tipo,String modelo) {
        super(idEquipo, descripcion, cpu, mbdiscoduro, gbram, precio, tipo, modelo);
        this.potfuente = potfuente;
        this.formcase = formcase;
    }

    public int getPotfuente() {
        return potfuente;
    }

    public void setPotfuente(int potfuente) {
        this.potfuente = potfuente;
    }

    public String getFormcase() {
        return formcase;
    }

    public void setFormcase(String formcase) {
        this.formcase = formcase;
    }

    @Override
    public String toString() {
        return "Desktop{" + "potfuente=" + potfuente + ", formcase=" + formcase + '}';
    }
    
    
    
}
