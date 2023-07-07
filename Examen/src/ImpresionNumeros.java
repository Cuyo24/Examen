/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author marti
 */
public class ImpresionNumeros {
    public static void main(String[] args) {
        imprimeNumeros();
    }
    
    public static void imprimeNumeros(){
        int tam=4;
        
            for (int ren = 1; ren <=tam; ren++) {
                for (int col = 1; col <=tam; col++) {
                    
                    System.out.println((ren-col)+"");
                }
                
                System.out.println("");
        }
            
            
    }
}
