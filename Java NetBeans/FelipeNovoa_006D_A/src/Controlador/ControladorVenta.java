package Controlador;

import Modelo.Venta;
import Modelo.Cliente;
import Modelo.Equipo;
import Venta.AlmacenamientoTemporal;
import javax.swing.JOptionPane;

public class ControladorVenta {

    public static void realizarVenta(String rutCliente, String modeloEquipo) {
        try {
            Cliente cliente = buscarCliente(rutCliente);
            Equipo equipo = buscarEquipo(modeloEquipo);

            if (cliente != null && equipo != null) {
                Venta venta = new Venta(cliente, equipo);
                AlmacenamientoTemporal.ventas.add(venta);
                JOptionPane.showMessageDialog(null, "Venta realizada con éxito.");
            } else {
                JOptionPane.showMessageDialog(null, "Cliente o equipo no encontrado.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al realizar la venta. " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private static Cliente buscarCliente(String rutCliente) {
        try {
            for (Cliente cliente : AlmacenamientoTemporal.clientes) {
                if (cliente.getRut().equals(rutCliente)) {
                    return cliente;
                }
            }
            return null;
        } catch (Exception e) {
            throw new RuntimeException("Error al buscar cliente. " + e.getMessage());
        }
    }

    private static Equipo buscarEquipo(String modeloEquipo) {
        try {
            for (Equipo equipo : AlmacenamientoTemporal.equipos) {
                if (equipo.getModelo().equals(modeloEquipo)) {
                    return equipo;
                }
            }
            return null;
        } catch (Exception e) {
            throw new RuntimeException("Error al buscar equipo. " + e.getMessage());
        }
    }
}
