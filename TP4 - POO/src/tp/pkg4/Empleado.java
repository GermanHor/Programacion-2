/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.pkg4;

/**
 *
 * @author German
 */
public class Empleado {
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    
    //total empleados
    private static int totalEmpleados = 0;
    
    //Constructor
    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++;
    }
    // Segundo constructor
    public Empleado(String nombre, String puesto) {
        this.id = ++totalEmpleados;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 265000;
    }
    
    //Actualizar salario
    public void actualizarSalario(double porcentaje) {
        this.salario += this.salario * (porcentaje / 100);
    }
    //Actualizar salario sobrecargado
    public void actualizarSalario(int aumento) {
        this.salario += aumento;
    }

    @Override
    public String toString() {
        return "Empleado{" + "id=" + id + ", nombre=" + nombre + ", puesto=" + puesto + ", salario=" + salario + '}';
    }
    // mostrar total empleados
    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }
    //Getters
    public int getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    public String getPuesto() {
        return puesto;
    }
    public double getSalario() {
        return salario;
    }
    
    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    
   
}
