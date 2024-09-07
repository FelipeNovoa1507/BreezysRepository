public class PrincipalCiclo {
    public static void main(String[] args) {
        int numero=0;

        while (numero<10){
            System.out.println("While numero: "+(numero+1));
            numero++;
        }
        int x=0;
        System.out.println("Valor de x: "+ x++);
        System.out.println("Valor de x: "+ x);

        for(int i=0;i<10;i++){
            System.out.println("For valor i: "+ i);
        }

        System.out.println("Valor: "+numero);

        int xx=0;

        for (;xx++ < 10;){
            System.out.println("For valor 2: "+xx);
        }

        xx=0;
        for(;xx<10;){
            System.out.println("For valor 3: "+ ++xx);
        }
    }
}
