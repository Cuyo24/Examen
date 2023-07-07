/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_14;

import java.util.Arrays;

/**
 *
 * @author marti
 */
public class MatrizSuma {
    public static void main(String[] args) {
        int[] numeros =  {2, 4, 7, 9, 11, 13, 15, 17};
       int objetivo = 32;

        
        
       sumaMatriz(numeros, objetivo);
        
    }
    
    
    public static void sumaMatriz(int numeros[], int suma) {
        
       for(int i=0;i<numeros.length;i++)
       {
           int n1=numeros[i];
           if((i+1) < numeros.length)
           {
               int n2 = numeros[i+1];
               if((n1+n2)==suma)
               {
                   System.out.println("["+i+","+(i+1)+"]");
               }
           }
               
       }

       
    }
    
    
}
