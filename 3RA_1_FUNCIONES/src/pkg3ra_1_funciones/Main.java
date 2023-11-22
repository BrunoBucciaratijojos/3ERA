/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg3ra_1_funciones;

/**
 *
 * @author invitado
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // llamada funcion o procedimiento
     imprimirMensaje ("hola mundo", 5);   
                    
    }
    
    public static void imprimirMensaje (String mensaje, int cant){
        for (int i = 0; i < cant; i++) {
            
        
        System.out.println(mensaje);
        }
    }
    
}
