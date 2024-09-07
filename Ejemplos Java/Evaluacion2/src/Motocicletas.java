public final class Motocicletas extends Vehiculos {
    private String estilo;
    private double medidaManillar;

    public Motocicletas(String patente, String marca, String color, double costoNetoDeServicios,int opcion, double valorPersonalizado, String estilo, double medidaManillar) {
    super(patente, marca, color, costoNetoDeServicios, 0.0, 0.0,opcion,valorPersonalizado);
    this.estilo = estilo;
    this.medidaManillar = medidaManillar;
    }


    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public double getMedidaManillar() {
        return medidaManillar;
    }

    public void setMedidaManillar(double medidaManillar) {
        this.medidaManillar = medidaManillar;
    }
    double descuento;
    @Override
    public void imprimirBoleta() {
        System.out.println("--- Motocicleta ---");
        System.out.println("Patente: " + getPatente());
        System.out.println("Marca: " + getMarca());
        System.out.println("Color: " + getColor());
        System.out.println("Estilo: " + estilo);
        System.out.println("Medida del Manillar: " + medidaManillar);
        System.out.println("Costo Neto de Servicios: " + getCostoNetoDeServicios());
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