import java.util.ArrayList;

public class JavaColecciones {
    public static void main(String[] args){
        ArrayList<String>nombres;
        nombres=new ArrayList<String>();

        nombres.add("Lyffy");
        nombres.add("Zoro");
        nombres.add("Nami");

        System.out.println("Personajes de one piece");
        System.out.println("- "+nombres.get(0));
        System.out.println("- "+nombres.get(1));
        System.out.println("- "+nombres.get(2));

        System.out.println("Cantidad de elementos");
        System.out.println("Cantidad: "+nombres.size());

        ArrayList<Integer>numeros= new ArrayList<Integer>();
        System.out.print("Cantidad de elementos numeros: ");
        System.out.println(numeros.size());
        
        numeros.add(10);
        numeros.add(30);
        numeros.add(70);

        for(String nombre:nombres){
            System.out.println("Nombre: "+nombre);
        }

        for(Integer numero:numeros){
            System.out.println("Numeros: "+numero);
        }

        //metodos adicionales
        int indice =nombres.indexOf("Nami");

        if(indice>=0)
            System.out.println("Existe");
        else
            System.out.println("No existe");



        boolean existe=nombres.contains("Nami");

        if(existe)
            System.out.println("Está Nami");
        else    
            System.out.println("no está Nami");
    }
}
