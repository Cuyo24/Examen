/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_6;

/**
 *
 * @author marti
 */
public class ExcepcionApp4 {

    public static void main(String[] args) {
        String str1 = "120";
        String str2 = "0";
        String respuesta = "";
        int cociente = 0;
        
        int cociente2=10 % 3;
        System.out.println("cociente2 = " + cociente2);
        try {
            cociente =calcular(str1,str2);
            respuesta = String.valueOf(cociente);
                   } catch (NumberFormatException ex) {
                       respuesta =  "Se han introducido caracteres no numéricos";
                   } catch (ExcepcionIntervalo ex) {
                       respuesta = ex.getMessage();
                   } catch (ArithmeticException ex) {
                       respuesta =  "División entre cero";
                   }
                   System.out.println(respuesta);
    }

    public static int calcular(String str1, String str2) throws ExcepcionIntervalo, NumberFormatException, ArithmeticException {
        int num = Integer.parseInt(str1);
        int den = Integer.parseInt(str2);
        if ((num > 100) || (den < -5)) {
            throw new ExcepcionIntervalo("Números fuera del intervalo"); 
        }
         return (num / den);
    }

    
}
