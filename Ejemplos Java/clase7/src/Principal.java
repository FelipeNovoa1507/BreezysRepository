public class Principal {
    public static void main(String[] args) {
        Saludable manzana=new Saludable();
    
        manzana.setCalorias(100);
        manzana.setCodigo(78000000);
        manzana.setEsOrigenVegetal(true);
        manzana.setNombre("Manzana");
        manzana.setSodio(50);

        System.out.println(manzana.imprimirS());

        System.out.println("======SobreEscritura======");
        System.out.println(manzana.tipoComida());

        String comoCocinar1="";
        String comoCocinar2="";
        String comoCocinar3="";

        comoCocinar1=manzana.cocinar();
        comoCocinar2=manzana.cocinar(41);
        comoCocinar3=manzana.cocinar(22,"Freir");

        System.out.println("======SobreCarga======");
        System.out.println(comoCocinar1);
        System.out.println(comoCocinar2);
        System.out.println(comoCocinar3);

    }
    
}
