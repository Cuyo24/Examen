/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_5;

/**
 *
 * @author marti
 */
public class Datos {
    public String cod;
    public String nombre;
    
    public Datos(String cod,String nombre){
    this.cod=cod;
    this.nombre=nombre;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Datos{" + "cod=" + cod + ", nombre=" + nombre + '}';
    }
    
    
    
    
}
