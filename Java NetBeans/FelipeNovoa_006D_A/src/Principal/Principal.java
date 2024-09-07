package Principal;

import Modelo.Cliente;
import Modelo.Desktop;
import Modelo.Laptop;
import Vista.FrmMenu;
import Venta.AlmacenamientoTemporal;

public class Principal {
    public static void main(String[] args) {
        Laptop laptopEjemplo = new Laptop("Asus Gamer", "CPU1", 512, 8, 999.99, 15, 4, "Descripción Laptop Ejemplo");
        Desktop desktopEjemplo = new Desktop("HP Escritorio", "CPU2", 1024, 16, 1499.99, "500W", "ATX", "Descripción Desktop Ejemplo");
        AlmacenamientoTemporal.equipos.add(laptopEjemplo);
        AlmacenamientoTemporal.equipos.add(desktopEjemplo);
        Cliente clienteEjemplo = new Cliente("12345678-9", "ClienteEjemplo", "cliente@example.com", "123456789");

        AlmacenamientoTemporal.clientes.add(clienteEjemplo);

        FrmMenu icomputec = new FrmMenu();
        icomputec.setVisible(true);
    }
}
