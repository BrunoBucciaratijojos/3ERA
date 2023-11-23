/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_2_valor_maximo;

/**
 *
 * @author invitado
 */
public class EVA3_2_VALOR_MAXIMO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic her
        // UTILIZA EL VALOR DIRECTAMENTA DE FUNCION
        System.out.println(buscarMaximo(100,200));
        //GUARDA EL VALOR Y USALO DESPUES
       int resu = buscarMaximo(100,200);
        System.out.println(resu);
        
        
    }
    public static int buscarMaximo(int val1, int val2){
        
        
    if (val1 > val2)
             return val1;
    else
    return val2;
    
    }
}
