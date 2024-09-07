package Venta;

import Modelo.Venta;
import Modelo.Cliente;
import Modelo.Equipo;
import java.util.ArrayList;
import java.util.List;

public class AlmacenamientoTemporal {
    public static List<Cliente> clientes = new ArrayList<>();
    public static List<Equipo> equipos = new ArrayList<>();
    public static List<Venta> ventas = new ArrayList<>();

    public static void agregarEquipo(Equipo equipo) {
        equipos.add(equipo);
    }

    public static void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }
}
