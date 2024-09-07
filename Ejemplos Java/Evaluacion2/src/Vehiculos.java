public abstract class Vehiculos implements IParametros {
    String patente;
    String marca;
    String color;
    double costoNetoDeServicios;
    double ivaPorPagar;
    double totalPorPagar;
    int opcion;
    double valorPersonalizado;

    public Vehiculos(String patente, String marca, String color, double costoNetoDeServicios, double ivaPorPagar, double totalPorPagar,int opcion,double valorPersonalizado) {
    this.patente = patente;
    this.marca = marca;
    this.color = color;
    this.costoNetoDeServicios = costoNetoDeServicios;
    this.ivaPorPagar = ivaPorPagar;
    this.totalPorPagar = totalPorPagar;
    this.opcion = opcion;
    this.valorPersonalizado = valorPersonalizado;
}


    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getCostoNetoDeServicios() {
        return costoNetoDeServicios;
    }

    public void setCostoNetoDeServicios(double costoNetoDeServicios) {
        this.costoNetoDeServicios = costoNetoDeServicios;
    }

    public double getIvaPorPagar() {
        return ivaPorPagar;
    }

    public void setIvaPorPagar(double ivaPorPagar) {
        this.ivaPorPagar = ivaPorPagar;
    }

    public double getTotalPorPagar() {
        return totalPorPagar;
    }

    public void setTotalPorPagar(double totalPorPagar) {
        this.totalPorPagar = totalPorPagar;
    }
    
    public int getOpcion() {
        return opcion;
    }

    public void setOpcion(int opcion) {
        this.opcion = opcion;
    }

    public double getValorPersonalizado(){
        return valorPersonalizado;
    }

    public void setValorPersonalizado(double valorPersonalizado){
        this.valorPersonalizado = valorPersonalizado;
    }
    
    
    public abstract void imprimirBoleta();
    

    public double totalDeIVA(){
        return costoNetoDeServicios*IVA;
    }
    public double obtenerDescuento() {
        return costoNetoDeServicios * DESCUENTO_AUTOMOVIL;
    }

    public double obtenerDescuento(double valorPersonalizado) {
        return costoNetoDeServicios * (valorPersonalizado*0.01);
    }
}