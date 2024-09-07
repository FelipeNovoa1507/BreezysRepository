public class PrincipalString {
    public static void main(String[] args) {
        String nombre1 ="Ana";
        String nombre2 ="Pedro";
        String aux="Ana";
        String texto="Hola Mundo ";
        
        System.out.println("Length: "+nombre1.length());

        if(nombre1==aux){
            System.out.println("Son iguales");
        }
        else{
            System.out.println("No son iguales");
        }

        System.out.println("TRIM: "+texto+".");
        System.out.println("TRIM: "+texto.trim()+".");
        
        System.out.println("Mayuscula: "+nombre1.toUpperCase());
        System.out.println("Minuscula: "+nombre1.toLowerCase());
        
        System.out.println("Replace: "+texto.replace("Hola","Chao"));

        System.out.println("Metodos encadenados: "+texto.replace("Hola","Chao").trim());

        System.out.println("Index of espacios: "+"abc de".indexOf(" "));
        System.out.println("Hola Ana".substring(0,4));
        System.out.println("Hola Ana".substring(5));
    }
}
