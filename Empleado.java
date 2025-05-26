class Empleado {
    private String nombre;
    private String cargo;
    private double salario;
    

    public Empleado(String nombre, String cargo, double salario) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.setSalario(salario);
    }

    public double getSalario() {
        return salario;
        
    }

    public void setSalario(double salario) {
        this.salario = salario;
        
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", cargo='" + cargo + '\'' +
                ", salario=" + getSalario() +
                '}';
    }
}
