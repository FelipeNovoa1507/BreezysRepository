public interface IParametros {
    //Porcentajes:
    double IVA = 0.19;
    double DESCUENTO_AUTOMOVIL = 0.05;
    double DESCUENTO_MOTOCICLETA = 0.10;
    //Métodos:
    double totalDeIVA();
    double obtenerDescuento();
    double obtenerDescuento(double valorPersonalizado);
}