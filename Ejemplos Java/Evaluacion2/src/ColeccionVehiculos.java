import java.util.ArrayList;

public class ColeccionVehiculos {
    private ArrayList<Vehiculos> vehiculos;
    
    public ColeccionVehiculos() {
        vehiculos = new ArrayList<>();
    }
    
    public boolean agregarVehiculo(Vehiculos vehiculo) {
        if (!existeVehiculo(vehiculo.getPatente())) {
            vehiculos.add(vehiculo);
            return true;
        }
        return false;
    }

    private boolean existeVehiculo(String patente) {
        for (Vehiculos vehiculo : vehiculos) {
            if (vehiculo.getPatente().equals(patente)) {
                return true;
            }
        }
        return false;
    }

    public void mostrarVehiculos() {
        for (Vehiculos vehiculo : vehiculos) {
            vehiculo.imprimirBoleta();
            System.out.println();
        }
    }

    public int contarAutomoviles() {
        int contador = 0;
        for (Vehiculos vehiculo : vehiculos) {
            if (vehiculo instanceof Automoviles) {
                contador++;
            }
        }
        return contador;
    }

    public int contarMotocicletas() {
        int contador = 0;
        for (Vehiculos vehiculo : vehiculos) {
            if (vehiculo instanceof Motocicletas) {
                contador++;
            }
        }
        return contador;
    }

    public boolean eliminarVehiculo(String patente) {
        for (Vehiculos vehiculo : vehiculos) {
            if (vehiculo.getPatente().equals(patente)) {
                vehiculos.remove(vehiculo);
                return true;
            }
        }
        return false;
    }
    
    public ArrayList<Vehiculos> getVehiculos() {
        return vehiculos;
    }
}