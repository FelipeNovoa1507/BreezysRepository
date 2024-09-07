package Reporte;

import Venta.AlmacenamientoTemporal;
import Modelo.Venta;
import Modelo.Equipo;
import Modelo.Cliente;
import Modelo.Laptop;
import Modelo.Desktop;

public class Reporte {

    public static void generarReporteEquiposVendidos(String tipoEquipo) {
        System.out.println("----- Reporte de Equipos Vendidos -----");
        for (Venta venta : AlmacenamientoTemporal.ventas) {
            Equipo equipo = venta.getEquipo();
            if (tipoEquipo.equalsIgnoreCase("laptop") && equipo instanceof Laptop) {
                mostrarDetalleVenta(venta);
            } else if (tipoEquipo.equalsIgnoreCase("desktop") && equipo instanceof Desktop) {
                mostrarDetalleVenta(venta);
            } else if (tipoEquipo.equalsIgnoreCase("todos")) {
                mostrarDetalleVenta(venta);
            }
        }
    }

    public static void generarReporteVentas() {
        System.out.println("----- Reporte de Ventas -----");
        System.out.println("Cantidad de ventas: " + AlmacenamientoTemporal.ventas.size());

        double montoTotalRecaudado = 0.0;
        for (Venta venta : AlmacenamientoTemporal.ventas) {
            montoTotalRecaudado += venta.getEquipo().getPrecio();
        }
        System.out.println("Monto total recaudado: $" + montoTotalRecaudado);
    }

    private static void mostrarDetalleVenta(Venta venta) {
        Cliente cliente = venta.getCliente();
        Equipo equipo = venta.getEquipo();

        System.out.println("Fecha y hora: " + venta.getFechaHora());
        System.out.println("Cliente: " + cliente.getNombreCompleto() + " (RUT: " + cliente.getRut() + ")");
        System.out.println("Equipo: " + equipo.getModelo());
        System.out.println("Precio: $" + equipo.getPrecio());
        System.out.println("-----------------------------");
    }
}
