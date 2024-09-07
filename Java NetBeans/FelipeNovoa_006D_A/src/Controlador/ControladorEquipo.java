package Controlador;

import Modelo.Laptop;
import Modelo.Desktop;
import Modelo.Equipo;
import Venta.AlmacenamientoTemporal;

public class ControladorEquipo {

    public static String registrarEquipo(String tipoEquipo, String modelo, int discoDuro, int ramEquipo, double precio,
                                       String pregunta1, String pregunta2, String descripcionEquipo) {
        Equipo equipo;
        String mensajeExito = "";

        if (tipoEquipo.equals("Laptop")) {
            int tamanoPantalla = Integer.parseInt(pregunta1);
            int cantidadPuertosUSB = Integer.parseInt(pregunta2);
            equipo = new Laptop(modelo, "", discoDuro, ramEquipo, precio, tamanoPantalla, cantidadPuertosUSB, descripcionEquipo);
        } else {
            String potenciaFuente = pregunta1;
            String factorForma = pregunta2;
            equipo = new Desktop(modelo, "", discoDuro, ramEquipo, precio, potenciaFuente, factorForma, descripcionEquipo);
        }

        AlmacenamientoTemporal.equipos.add(equipo);

        mensajeExito = tipoEquipo + " registrado con éxito.";

        return mensajeExito;
    }
}
