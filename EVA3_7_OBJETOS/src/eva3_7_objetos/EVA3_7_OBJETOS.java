/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_7_objetos;

/**
 *
 * @author invitado
 */
public class EVA3_7_OBJETOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        persona perso1 = new persona();
        System.out.println(perso1);
        perso1.nombre = "juan";
        perso1.apellido = "sosa";
        perso1.edad = 20;
        imprimirPersona(perso1);
        
        persona perso2 = new persona();
        System.out.println(perso2);

        perso2.nombre = "angel";
        perso2.apellido = "morales";
        perso2.edad = 34;
        imprimirPersona(perso2);
    }

    public static void imprimirPersona(persona perso) {
        System.out.println("dirección" + perso);
        System.out.println("nombre completo" + perso.nombre +"" + perso.apellido);
       
        System.out.println("edad" + perso.edad);

    }

}
// definen una pantilla para crear objetos
// crean un nuevo tipo de datos

class persona {

    String nombre;
    String apellido;
    int edad;

}
