/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author marti
 */
public class Empleado {

    String nombre;
    int numEmpleado, sueldo;

    public Empleado(String nombre, int sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        String s = "Num. empleado " + numEmpleado + " Nombre: " + nombre + " Sueldo: " + sueldo;
        System.out.println(s);
        return s;
    }
}
