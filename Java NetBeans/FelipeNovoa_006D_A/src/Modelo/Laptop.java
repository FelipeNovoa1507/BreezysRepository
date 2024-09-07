package Modelo;

public class Laptop extends Equipo {
    private int tamanoPantalla;
    private int cantidadPuertosUSB;

    public Laptop(String modelo, String cpu, int tamanoDisco, int cantidadRam, double precio,
                  int tamanoPantalla, int cantidadPuertosUSB, String descripcionEquipo) {
        super(modelo, cpu, tamanoDisco, cantidadRam, precio, descripcionEquipo);
        this.tamanoPantalla = tamanoPantalla;
        this.cantidadPuertosUSB = cantidadPuertosUSB;
    }

    public int getTamanoPantalla() {
        return tamanoPantalla;
    }

    public void setTamanoPantalla(int tamanoPantalla) {
        this.tamanoPantalla = tamanoPantalla;
    }

    public int getCantidadPuertosUSB() {
        return cantidadPuertosUSB;
    }

    public void setCantidadPuertosUSB(int cantidadPuertosUSB) {
        this.cantidadPuertosUSB = cantidadPuertosUSB;
    }
}
