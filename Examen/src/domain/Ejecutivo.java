/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author marti
 */
class Ejecutivo extends Empleado {

    public Ejecutivo(String nombre, int sueldo) {
        super(nombre, sueldo);
        super.toString();
    }

    @Override
    public String toString() {
        String s =  "Informacion Ejecutivo";        
        System.out.println(s);
        return s;
    }
}
