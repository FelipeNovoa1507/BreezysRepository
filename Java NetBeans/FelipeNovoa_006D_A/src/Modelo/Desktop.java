package Modelo;

public class Desktop extends Equipo {
    private String potenciaFuente;
    private String factorForma;

    public Desktop(String modelo, String cpu, int tamanoDisco, int cantidadRam, double precio,
                   String potenciaFuente, String factorForma, String descripcionEquipo) {
        super(modelo, cpu, tamanoDisco, cantidadRam, precio, descripcionEquipo);
        this.potenciaFuente = potenciaFuente;
        this.factorForma = factorForma;
    }


    public String getPotenciaFuente() {
        return potenciaFuente;
    }

    public void setPotenciaFuente(String potenciaFuente) {
        this.potenciaFuente = potenciaFuente;
    }

    public String getFactorForma() {
        return factorForma;
    }

    public void setFactorForma(String factorForma) {
        this.factorForma = factorForma;
    }
}
