import java.util.Scanner;

public class Trabajador {
    private String run;
    private String dv;
    private String nombre;

    public Trabajador(){
        this.run="";
        this.dv="";
        this.nombre="";
    }

    public Trabajador(String run,String dv,String nombre){
        this.run=run;
        this.dv=dv;
        this.nombre=nombre;
    }

    public String getRun(){
        return run;
    }

    public String getDv(){
        return dv;
    }

    public String getNombre(){
        return nombre;
    }

    public void setRun(String run){
        this.run=run;
    }

    public void setDv(String dv){
        this.dv=dv;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }


    public String imprimir(){
        return "Nombre: "+nombre+
               "\nRun: "+run+"-"+dv;

    }

}
