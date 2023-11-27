/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_6_parametros;

/**
 *
 * @author invitado
 */
public class EVA3_6_PARAMETROS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x = 5;
        System.out.println("el valor de x en el main () es de"+ x);
        pasoPorValor(x);
        System.out.println("el valor de x en el main() es " + x);
    }
    // EN EL PASO POR VALOR DE ARGUMENTOS, SE ENVIA UNA COPIA AL MÉTODO
    public static void pasoPorValor(int valor){
        System.out.println("el valor que recibo en el metodo es de"+ valor);
    valor++;
        System.out.println("el valor modificado en el método es de" + valor);
    }
}
