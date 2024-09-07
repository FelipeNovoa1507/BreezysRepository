public class MainClass {
    //psvm + tab ara crear la clase de una
    public static void main(String[]args){
        JavaClasses p1=new JavaClasses("Felipe",0,"210808116");

        p1.setEdad(21);
        System.out.println("La edad es: "+p1.getEdad());

        p1.correr();
    }
}