import java.util.Scanner; //Se utiliza para poder habilitar la entrada de datos

import javax.swing.JOptionPane;

public class JavaTutorial {
    public static void main(String[] args) {
        System.out.println("Hello World"); // asi se muestran datos
        System.out.println("wena cabros culiaos"); // asi se muestran datos
        System.out.println("me los paseo"); // asi se muestran datos

        // entrada de datos
        Scanner entrada = new Scanner(System.in);
        int numero;
        float decimal;
        String cadena;
        char letra;
        double raiz;
        double base, exponente, resultado;

        double numran = Math.random();
        System.out.println("El numero aleatorio es: " + numran);

        System.out.print("Digite la base de la potencia: ");
        base = entrada.nextDouble();
        System.out.print("Digite el exponente de la potencia: ");
        exponente = entrada.nextDouble();
        resultado = Math.pow(base, exponente);
        System.out.println("El resultado de la potencia es: " + resultado);

        System.out.print("Digite un numero para mostrar la raiz: ");
        raiz = entrada.nextDouble();
        raiz = Math.sqrt(raiz);
        System.out.println("La raiz es: " + raiz);

        System.out.println("Digite una cadena de texto: ");
        cadena = JOptionPane.showInputDialog("Digite una cadena de texto: ");
        System.out.println("La cadena es: " + cadena);

        System.out.print("Digite un numero entero: ");
        numero = entrada.nextInt();
        System.out.println("El numero entero es: " + numero);

        System.out.print("Digite un numero decimal: ");
        decimal = entrada.nextFloat();
        System.out.println("El numero decimal es: " + decimal);

        System.out.print("Digite una letra: ");
        letra = entrada.next().charAt(0);
        System.out.println("La letra es: " + letra);

        // tipos de variables y como definirlas

        // Variable constante
        final int constante = 15; // la variable constante es una variable que no puede ser cambiada
        System.out.println(constante);

        // variables de tipo numerico entero
        byte num1 = 100; // numeros entre -128 y 127
        short num2 = 5000; // numeros entre -32768 y 32767
        int num3 = 7; // numeros entre -2147483648 y 2147483647
        long num4 = 15000000000L; // numeros entre -9223372036854775808 y 9223372036854775807

        // variables de tipo numerico flotante
        float prom = 6.5f;
        double prom2 = 19.99d;

        // variables tipo booleano
        boolean que1 = true;
        boolean que2 = false;

        // variables de tipo caracter
        char resp = 'a'; // char siempre tiene que estar con ''
        String palabra1 = "Hello world"; // String siempre tiene que estar ""

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(prom);
        System.out.println(prom2);
        System.out.println(que1);
        System.out.println(que2);
        System.out.println(resp);
        System.out.println(palabra1);

        // usar la funcion length
        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("El largo del texto es: " + txt.length());

        // cambiar todo de un string a mayus o minus
        String txt2 = "Que Pasa Mami";
        System.out.println(txt2.toUpperCase());
        System.out.println(txt2.toLowerCase());

        // Buscar la posicion de una palabra en un texto
        String txt3 = "Que pasa los cabros";
        System.out.println(txt3.indexOf("pasa"));

        // concatenar dos cadenas de texto
        String firstName = "Felipe ";
        String lastName = "Novoa";
        System.out.println(firstName.concat(lastName));

        // Sentencia switch en java
        int day = 4;
        switch (day) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            // Default se usa si no hay coincidencia con ningun caso del switch
            default:
                System.out.println("Se acerca el fin de mes...");
        }

        // Sentencia IF ELSE IF ELSE
        int numif, dato1 = 5;
        numif = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        if (numif == dato1) {
            JOptionPane.showMessageDialog(null, "El numero es 5.");
        } else if (numif < dato1) {
            JOptionPane.showMessageDialog(null, "El numero es menor que 5.");
        } else {
            JOptionPane.showMessageDialog(null, "El numero es mayor que 5.");
        }

        // Sentencia while
        int f = 1, contador;
        System.out.print("Digite cuantos numeros quiere en pantalla: ");
        contador = entrada.nextInt();

        while (f <= contador) {
            System.out.println(f);
            f++;
        }

        // Sentencia DO WHILE
        int j = 11, contador2;
        System.out.print("Digite la cantidad de terminos: ");
        contador2 = entrada.nextInt();

        do {
            System.out.println(j);
            j++;
        } while (j <= contador2);

        // Sentencia FOR
        int contador3;
        System.out.print("Digite la cantidad de terminos: ");
        contador3 = entrada.nextInt();

        for (int i = 1; i <= contador3; i++) {
            System.out.println(i);
        }

        // arreglos manuales
        int[] numeros = new int[3];

        numeros[0] = 7;
        numeros[1] = 10;
        numeros[2] = 13;

        for (int i = 0; i < 3; i++) {
            System.out.println(numeros[i]);
        }

        // arreglos
        int nElementos;

        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de elementos del arreglo: "));

        char[] letras = new char[nElementos];

        for (int i = 0; i < nElementos; i++) {
            System.out.println((i + 1) + ". Digite un caracter: ");
            letras[i] = entrada.next().charAt(0);
        }

        System.out.println("\nLos caracteres del arreglo son: ");
        for (int i = 0; i < nElementos; i++) {
            System.out.println(letras[i]);
        }

        // Buble for each (Sirve para mostrar los elementos de un arreglo facilmente)
        String[] nombres = { "Alejandro", "Maria", "Luis", "Felipe", "Sebastian", "Rivaul", "Roberto", "Pedro" };

        for (String i : nombres) {
            System.out.println("Nombres: " + i);
        }
    }
}
