public class JavaMethods {
    //Diferentes maneras de escribir metodos
    //tODOS LOS METODOS PUEDEN TENER EXACTAMENTE EL MISMO NOMBRE, PERO TODOS CON DISTINTOS PARAMETROS
    static void metodo1(){ //los metodos o funciones se definen de esta manera
        System.out.println("Wena los cabtros");
    }

    static void metodo1(String fnom){
        System.out.println(fnom+" Refnes");
    }

    static void metodo1(String fname,int age){
        System.out.println("Hola, me llamo "+fname+" y tengo "+age+" anos.");
    }

    static double metodo1(int x){
        double fact=1;
        for(int i=1;i<=x;i++){
            fact*=i;
        }
        return fact;
    }

    static int metodo1(int x,int y){
        return x*y;
    }


    public static void main(String []args){
        metodo1();

        metodo1("Felipe");

        metodo1("Felipe", 21);

        System.out.println((int)metodo1(5));
        
        System.out.println(metodo1(5, 10));
        
    }
}
