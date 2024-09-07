import java.sql.Date;
import java.util.Scanner;

public class Tarjeta {
    private long codigo;
    private int clave;
    private int monto;
    private Date vigencia;
    private Trabajador trabajador;

    public Tarjeta(){
        this.codigo=0;
        this.clave=0;
        this.monto=0;
        this.vigencia=null;
        this.trabajador=null; //new Trabajador();

    }

    public Tarjeta(long codigo,int clave,int monto,Date vigencia,Trabajador trabajador){
        this.codigo=codigo;
        this.clave=clave;
        this.monto=monto;
        this.vigencia=vigencia;
        this.trabajador=trabajador;
    }

    public long getCodigo(){
        return codigo;
    }
    public void setCodigo(long codigo){
        this.codigo=codigo;
    }


    public int getClave(){
        return clave;
    }
    public void setClave(int clave){
        this.clave=clave;
    }


    public int getMonto(){
        return monto;
    }
    public void setMonto(int monto){
        this.monto=monto;
    }


    public Date getVigencia(){
        return vigencia;
    }
    public void setFecha(Date vigencia){
        this.vigencia=vigencia;
    }


    public Trabajador getTrabajador(){
        return trabajador;
    }
    public void setTrabajador(Trabajador trabajador){
        this.trabajador=trabajador;
    }


    public String imprimir(){
        return trabajador.imprimir()+
               "\nCodigo: "+codigo+
               "\nClave: "+clave+
               "\nMonto: $"+monto+
               "\nVigencia: "+vigencia;
    }

    
    public String validarClave(int x){
        int y=Integer.parseInt(trabajador.getRun().replace(".","").substring(0,4));
        if(x==y)
            return "Clave correcta";
        
        else
            return "Clave incorrecta";
        
    }

    public String validarMonto(int x,int y){
        if(x>=y)
            return "Si puede comprar";
        else
            return "No puede comprar";
    }

}
