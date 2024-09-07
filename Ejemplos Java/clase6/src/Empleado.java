public class Empleado{
    private String run;
    private String nombre;
    private String appaterno;
    private String apmaterno;
    private String genero;
    private String tiemposervicio;
    private int edad;
    private Puesto puesto;
    public char[] imprimirEmpleado;

    //Constructor
    public Empleado(String run, String nombre, String appaterno, String apmaterno, String genero, String tiemposervicio,
            int edad, Puesto puesto) {
        this.run = run;
        this.nombre = nombre;
        this.appaterno = appaterno;
        this.apmaterno = apmaterno;
        this.genero = genero;
        this.tiemposervicio = tiemposervicio;
        this.edad = edad;
        this.puesto = puesto;
    }
    
    public Empleado() {
        this.run = "";
        this.nombre = "";
        this.appaterno = "";
        this.apmaterno = "";
        this.genero = "";
        this.tiemposervicio = "";
        this.edad = 0;
        this.puesto = new Puesto();
    }
    
    //Getters & Setters
    public String getRun() {
        return run;
    }

    public void setRun(String run) {
        this.run = run;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAppaterno() {
        return appaterno;
    }

    public void setAppaterno(String appaterno) {
        this.appaterno = appaterno;
    }

    public String getApmaterno() {
        return apmaterno;
    }

    public void setApmaterno(String apmaterno) {
        this.apmaterno = apmaterno;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTiemposervicio() {
        return tiemposervicio;
    }

    public void setTiemposervicio(String tiemposervicio) {
        this.tiemposervicio = tiemposervicio;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Puesto getPuesto() {
        return puesto;
    }

    public void setPuesto(Puesto puesto) {
        this.puesto = puesto;
    }

    
    public String imprimirEmpleado() {
        return "\nRut Empleado: "+run+"\nNombre Empleado: "+nombre+" "+appaterno+" "+apmaterno+"\nGenero: "+genero+"\tAños de servicio: "+tiemposervicio+"\nEdad: "+edad+puesto.imprimirPuesto();
    }

    
    
    

    

}