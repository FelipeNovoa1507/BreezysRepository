import java.util.ArrayList;

public class Empresa {
    private ArrayList<Empleado>listaEmpleados;

    public Empresa(){
        listaEmpleados= new ArrayList<Empleado>();
    }

    //Agregar
    public boolean agregar(Empleado emp){
        return listaEmpleados.add(emp);
    }
    
    //Buscar
    public boolean buscarEmpleado(String rut){
        for(Empleado emp:listaEmpleados){
            if(emp.getRun().equals(rut)){
                return true;
            }
        }
        return false;
    }

    //listar empleados
    public void listarEmpleados(){
        for(Empleado emp:listaEmpleados){
            System.out.println(emp.imprimirEmpleado());
        }
    }

    //eliminar empleado
    public boolean eliminarEmpleado(String rut){
        for (Empleado emp:listaEmpleados){
            if(emp.getRun().equals(rut)){
                listaEmpleados.remove(emp); 
                return true;
            }
        }
        return false;
    }
    
}
