/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_3_factorial;

/**
 *
 * @author invitado
 */
public class EVA3_3_FACTORIAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int valor = 5;
        System.out.println("factorial de 5 ="+ calcularFactorial(valor));
        // CREAR MÉTODO calcular potencia (int base, int potencia) -----> regresa valor
        System.out.println("2 elvado a la 3");   
        
    }
    public static int calcularFactorial(int valor){
        
        int guardar = 1;
        
        for (int i = 1; i <= valor; i++) {
           guardar*= i; //guardar = guardar *i
        }
           return guardar;
           
          
    }
    
  
    
   
}
