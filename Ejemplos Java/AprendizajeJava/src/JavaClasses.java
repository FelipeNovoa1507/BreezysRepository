public class JavaClasses {
    //Atributos
    private int edad;
    String dni;
    private final String nombre; //Constantes: una vez se define un dato no puede cambiar a lo largo del programa (final )
    


    //Constructor
    public JavaClasses(String nombre, int edad, String dni){
        this.nombre=nombre;
        this.edad=edad;
        this.dni=dni;
    }
    

    
    //Metodos
    public void correr(){
        System.out.println("Soy "+nombre+", tengo "+edad+" anos y estoy corriendo una maraton");
    }

    public void correr(int km){
        System.out.println("He corrido "+km+" kilometros");
    }
    


    //Setters: Establecer un valor
    public void setDni(String dni){
        this.dni=dni;
    }

    public void setEdad(int edad){
        this.edad=edad;
    }
    


    //Getters: Mostrar un valor
    public String getDni(){
        return dni;
    }

    public int getEdad(){
        return edad;
    }
}
