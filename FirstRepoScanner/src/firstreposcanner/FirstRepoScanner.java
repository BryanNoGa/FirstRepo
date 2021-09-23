
package firstreposcanner;

import java.util.Scanner;

/**
 *
 * @author braya
 */
public class FirstRepoScanner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner en = new Scanner (System.in);
        
        //Entrada en cadena
        String name = en.nextLine();
        //Entrada de datos numericos 
        int age = en.nextInt();
        double altura = en.nextDouble();
        
        //Salida 
        System.out.println("Nombre: " +name);
        System.out.println("Edad: "+age);
        System.out.println("Altura: "+altura);
    }
    
}
