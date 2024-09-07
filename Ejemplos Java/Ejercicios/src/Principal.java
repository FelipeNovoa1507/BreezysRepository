import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args) {
        int clave1;
        int monto1;
        Scanner entrada=new Scanner(System.in);
        Trabajador trabajador1=new Trabajador();
        trabajador1.setRun("12.189.443");
        trabajador1.setDv("5");
        trabajador1.setNombre("Juan Perez");
        Tarjeta tarjeta1=new Tarjeta(6018741302285000L,1218,35000,null,trabajador1);
        System.out.println(tarjeta1.imprimir());

        
        System.out.print("\nDigite su clave: ");
        clave1=entrada.nextInt();
        System.out.println(tarjeta1.validarClave(clave1));
               

        System.out.print("\nDigite el monto total a comprar: ");
        monto1=entrada.nextInt();
        System.out.println(tarjeta1.validarMonto(tarjeta1.getMonto(), monto1));
    }
}
