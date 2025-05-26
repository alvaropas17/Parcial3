import java.util.ArrayList;

public class Empleados {
    private Empleado empleado;
    private ArrayList<Empleado> empleados;

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    public void verEmpleados() {
        if (empleados == null || empleados.isEmpty()) {
            System.out.println(Mensajes.NO_HAY_EMPLEADOS);
            return;
        }
        
        System.out.println(Mensajes.LISTA_EMPLEADOS);
        for (Empleado empleado : empleados) {
            System.out.println(empleado);
        }
    }
    
}
