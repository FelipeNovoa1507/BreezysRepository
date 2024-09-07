import java.util.Scanner;

public class Main{
    static int opcion;
    static String rutel;
    static String rutbu;
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        Puesto puesto1=new Puesto(1,"Gerente");
        Puesto puesto2=new Puesto(2,"Ejecutivo");
        Empresa empresa=new Empresa();

        Empleado empleado1=new Empleado();
        System.out.println("------Menu------");
        System.out.println("1.- Agregar Empleado");
        System.out.println("2.- Eliminar Empleado");
        System.out.println("3.- Buscar Empleado");
        System.out.println("4.- Mostrar Empleados");
        System.out.print("Digite opcion: ");
        int opc=entrada.nextInt();
        switch(opc){
            case 1:
                System.out.print("\nNombre: ");
                empleado1.setNombre(entrada.nextLine());
                System.out.print("\nApellido Paterno: ");
                empleado1.setApmaterno(entrada.nextLine());
                System.out.print("\nApellido Materno: ");
                empleado1.setAppaterno(entrada.nextLine());
                System.out.print("\nGenero: ");
                empleado1.setGenero(entrada.nextLine());
                System.out.print("\nTiempo de servicio: ");
                empleado1.setTiemposervicio(entrada.nextLine());
                System.out.print("\nEdad: ");
                empleado1.setEdad(entrada.nextInt());
                System.out.print("\nPuesto (1.- Gerente / 2.- Ejecutivo: ");
                System.out.print("\nDigite un numero como opcion: ");
                opcion=entrada.nextInt();
                if (opcion==1)
                    empleado1.setPuesto(puesto1);
                else
                    empleado1.setPuesto(puesto2);
                
                if(empresa.agregar(empleado1)==true){
                    System.out.println("Empleado ingresado con exito.");
                }else{
                    System.out.println("Empleado no se ha podido ingresar.");
                }
                
                break;
            case 2:
                System.out.print("\nDigite el run del empleado a eliminar: ");
                rutel=entrada.nextLine();
                if(empresa.eliminarEmpleado(rutel)==true){
                    System.out.println("Empleado eliminado con exito.");
                }else{
                    System.out.println("Empleado no se ha podido eliminar.");
                }
            case 3:
                System.out.print("\nDigite el run del empleado a buscar: ");
                rutbu=entrada.nextLine();
                if(empresa.buscarEmpleado(rutbu)==true){
                    System.out.println("El empleado existe.");
                    empresa.listarEmpleados();
                }


                


        }
        entrada.close();

    }
}
