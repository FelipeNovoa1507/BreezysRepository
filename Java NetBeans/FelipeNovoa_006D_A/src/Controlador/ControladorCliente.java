package Controlador;

import Modelo.Cliente;
import Venta.AlmacenamientoTemporal;

public class ControladorCliente {

    public static boolean registrarCliente(String rut, String nombreCompleto, String correoElectronico, String telefono) {
        if (validarDatosCliente(rut, nombreCompleto, correoElectronico, telefono)) {
            Cliente cliente = new Cliente(rut, nombreCompleto, correoElectronico, telefono);
            AlmacenamientoTemporal.clientes.add(cliente);
            return true;
        } else {
            return false;
        }
    }

    private static boolean validarDatosCliente(String rut, String nombreCompleto, String correoElectronico, String telefono) {
        return !rut.isEmpty() && !nombreCompleto.isEmpty() && !correoElectronico.isEmpty() && !telefono.isEmpty();
    }
}
