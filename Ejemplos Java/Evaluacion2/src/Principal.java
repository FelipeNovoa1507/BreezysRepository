import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        ColeccionVehiculos coleccion = new ColeccionVehiculos();

        // Agregamos los vehículos previamente ingresados por código
        Automoviles auto1 = new Automoviles("AK123CD", "Mercedes-Benz", "Negro", 20000.0,1,0,4,500);
        Automoviles auto2 = new Automoviles("XY789ZW", "Ferrari", "Rojo", 30000.0,1,0,2, 200);
        Motocicletas moto1 = new Motocicletas("JK456GH", "Ducati", "Amarillo",10000.0,1,0,"Deportiva", 150);
        coleccion.agregarVehiculo(auto1);
        coleccion.agregarVehiculo(auto2);
        coleccion.agregarVehiculo(moto1);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menú:");
            System.out.println("1. Ingresar vehículo");
            System.out.println("2. Eliminar vehículo");
            System.out.println("3. Mostrar listado de vehículos");
            System.out.println("4. Mostrar cantidad de vehículos por categoría");
            System.out.println("5. Salir");
            System.out.print("Ingrese la opción deseada: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea

            switch (opcion) {
                case 1:
                    ingresarVehiculo(coleccion, scanner);
                    break;
                case 2:
                    eliminarVehiculo(coleccion, scanner);
                    break;
                case 3:
                    coleccion.mostrarVehiculos();
                    break;
                case 4:
                    mostrarCantidadPorCategoria(coleccion);
                    break;
                case 5:
                    System.out.println("Saliendo del programa.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }
        }
    }

    private static void ingresarVehiculo(ColeccionVehiculos coleccion, Scanner scanner) {
        System.out.println("Ingrese los datos del vehículo:");

        System.out.print("Patente: ");
        String patente = scanner.nextLine();

        System.out.print("Tipo (1 para Automóvil / 2 para Motocicleta): ");
        int tipo = scanner.nextInt();

        System.out.println("Usar el descuento por defecto (1) o ingresar un descuento peronalizado (2): ");
        int opcion = scanner.nextInt();
        
        if (tipo == 1) {
            int valor1;
            if (opcion==1){
                System.out.println("Se utilizarán valores por defecto.");
                valor1 = 0;
            }else{
                System.out.println("Ingrese el valor de descuento: ");
                valor1 = scanner.nextInt();
            }
            int valorPer1=valor1;
            System.out.print("Cantidad de Puertas: ");
            int cantidadPuertas = scanner.nextInt();

            System.out.print("Capacidad del Maletero (lts): ");
            double capacidadMaletero = scanner.nextDouble();

            System.out.print("Marca: ");
            String marca = scanner.next();

            System.out.print("Color: ");
            String color = scanner.next();

            System.out.print("Costo Neto de Servicios: ");
            double costoNeto = scanner.nextDouble();

            Automoviles automovil = new Automoviles(patente, marca, color, costoNeto, opcion, valorPer1, cantidadPuertas, capacidadMaletero);
            coleccion.agregarVehiculo(automovil);
        } else if (tipo == 2) {
            int valor2;
            if (opcion==1){
                System.out.println("Se utilizarán valores por defecto.");
                valor2 = 0;
            }else{
                System.out.println("Ingrese el valor de descuento: ");
                valor2 = scanner.nextInt();
            }
            int valorPer2=valor2;
            System.out.print("Estilo: ");
            String estilo = scanner.next();

            System.out.print("Medida del Manillar: ");
            double medidaManillar = scanner.nextDouble();

            System.out.print("Marca: ");
            String marca = scanner.next();

            System.out.print("Color: ");
            String color = scanner.next();

            System.out.print("Costo Neto de Servicios: ");
            double costoNeto = scanner.nextDouble();

            Motocicletas motocicleta = new Motocicletas(patente, marca, color, costoNeto,opcion,valorPer2,estilo, medidaManillar);
            coleccion.agregarVehiculo(motocicleta);
        } else {
            System.out.println("Tipo de vehículo no válido. No se ha ingresado el vehículo.");
        }
    }

    private static void eliminarVehiculo(ColeccionVehiculos coleccion, Scanner scanner) {
        System.out.print("Ingrese la patente del vehículo que desea eliminar: ");
        String patenteEliminar = scanner.nextLine();
        boolean eliminado = coleccion.eliminarVehiculo(patenteEliminar);
        if (eliminado) {
            System.out.println("Vehículo con patente " + patenteEliminar + " eliminado con éxito.");
        } else {
            System.out.println("Vehículo con patente " + patenteEliminar + " no encontrado.");
        }
    }

    private static void mostrarCantidadPorCategoria(ColeccionVehiculos coleccion) {
        int cantidadAutomoviles = coleccion.contarAutomoviles();
        int cantidadMotocicletas = coleccion.contarMotocicletas();
        System.out.println("Cantidad de Automóviles: " + cantidadAutomoviles);
        System.out.println("Cantidad de Motocicletas: " + cantidadMotocicletas);
    }
}