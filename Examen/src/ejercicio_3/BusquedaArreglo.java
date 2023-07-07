/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_3;

/**
 *
 * @author marti
 */
public class BusquedaArreglo {
    public static void main(String[] args) {
         int numeritos[]={-8,4,5,8,9,23,25,32,40,45,56,60,78};
         System.out.println("numeritos = " + numeritos.length);
        int posicion= buscarNumerito(numeritos,40);
        System.out.println("posicion = " + posicion);
         
    }
    
    public static int buscarNumerito(int numeros[], int numero) {

        int busqueda = numero;
        int inferior = 0;
        int superior = numeros.length-1 ;
        int centro, posicion = 0;

        while (inferior <= superior) {
            centro = ((superior + inferior) / 2);
            if (numeros[centro] == busqueda) {
                System.out.println("Lo encontre");
                for (int i = 0; i < numeros.length; i++) {
                    if (numeros[i] == busqueda) {
                        posicion = i;
                        return posicion;
                    }
                }
            } else if (busqueda < numeros[centro]) {
                System.out.println("Todavia no "+numeros[centro]);
                superior = centro - 1;

            } else {
                System.out.println("Todavia no "+numeros[centro]);
                inferior = centro + 1;
            }
        }
        return posicion;
    }
}
