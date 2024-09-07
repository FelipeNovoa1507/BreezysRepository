public final class Automoviles extends Vehiculos {
    private int cantidadPuertas;
    private double capacidadMaleteroLitros;

    public Automoviles(String patente, String marca, String color, double costoNetoDeServicios, int opcion, double valorPersonalizado, int cantidadPuertas, double capacidadMaleteroLitros) {
    super(patente, marca, color, costoNetoDeServicios, 0.0, 0.0,opcion,valorPersonalizado);
    this.cantidadPuertas = cantidadPuertas;
    this.capacidadMaleteroLitros = capacidadMaleteroLitros;
    }


    public int getCantidadPuertas() {
        return cantidadPuertas;
    }

    public void setCantidadPuertas(int cantidadPuertas) {
        this.cantidadPuertas = cantidadPuertas;
    }

    public double getCapacidadMaleteroLitros() {
        return capacidadMaleteroLitros;
    }

    public void setCapacidadMaleteroLitros(double capacidadMaleteroLitros) {
        this.capacidadMaleteroLitros = capacidadMaleteroLitros;
    }


    double descuento;
    @Override
    public void imprimirBoleta() {
        System.out.println("--- Automóvil ---");
        System.out.println("Patente: " + getPatente());
        System.out.println("Marca: " + getMarca());
        System.out.println("Color: " + getColor());
        System.out.println("Cantidad de Puertas: " + cantidadPuertas);
        System.out.println("Capacidad del Maletero(lts): " + capacidadMaleteroLitros);
        System.out.println("Costo Neto del Servicio: " + getCostoNetoDeServicios());
        if(opcion==1){
            descuento = obtenerDescuento();
        }else{
            descuento = obtenerDescuento(valorPersonalizado);
        }
        double iva = totalDeIVA();
        double totalPagar = getCostoNetoDeServicios() - descuento + iva;
        System.out.println("Valor del Descuento: " + descuento);
        System.out.println("IVA a Pagar: " + iva);
        System.out.println("Total a Pagar: " + totalPagar);
    }
}