/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_5_referencia;

/**
 *
 * @author invitado
 */
public class EVA3_5_REFERENCIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        PASO DE PARÁMETROS POR VALOR POR REFERENCIA
        LOS 
        REFEREMCOA -----> es una direccion de memoria 
        LOS ARREGLOS SON OBJETOS 
        */
        int[] arreglo = new int[2];
        
        System.out.println(arreglo);
        
        
        for (int i : arreglo) {
            System.out.println(i);
        }
        int i = 10;
        System.out.println(i );
        
   
    }
    
}
