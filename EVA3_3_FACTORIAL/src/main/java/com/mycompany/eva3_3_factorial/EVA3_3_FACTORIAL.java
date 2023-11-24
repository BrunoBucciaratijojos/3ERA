/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_3_factorial;

/**
 *
 * @author gaels
 */
public class EVA3_3_FACTORIAL {

    public static void main(String[] args) {
        System.out.println("Hello World!");
         int valor = 5;
        System.out.println("factorial de 5 ="+ calcularFactorial(valor));
        // CREAR MÉTODO calcular potencia (int base, int potencia) -----> regresa valor
          int base=3;
          
        System.out.println("resultado;" + calcularFactorial(base));
        
    }
    
    public static int calcularFactorial(int valor){
        
        int guardar = 1;
        
        for (int i = 1; i <= valor; i++) {
           guardar*= i; //guardar = guardar *i
        }
        
       
        
           return guardar;
           
          
           
          
    }
    
     public static int calcularPotencia(int base){
     int potencia = 1;
     
        for (int i = 1; i < base; i++) {
            
            potencia*= i;
        }
        
        return potencia;
     }
   
}
