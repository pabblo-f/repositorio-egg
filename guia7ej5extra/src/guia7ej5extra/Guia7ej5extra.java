
package guia7ej5extra;

import guia7ej5extra.entidad.Empleado;


public class Guia7ej5extra {

    
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Pablo", 28, 20000);
        Empleado empleado2 = new Empleado("Nuria", 33, 20000);

        System.out.println("El sueldo del empleado 1 es: " + empleado1.getSalario());
        System.out.println("El sueldo del empleado 2 es: " + empleado2.getSalario());
        empleado1.calcular_aumento();
        empleado2.calcular_aumento();
        System.out.println("El sueldo del empleado 1 es: " + empleado1.getSalario());
        System.out.println("El sueldo del empleado 2 es: " + empleado2.getSalario());
    }
    
}
