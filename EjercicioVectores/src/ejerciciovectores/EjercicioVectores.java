/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciovectores;

import java.util.Scanner;

/**
 *
 * @author Jose
 */
public class EjercicioVectores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            Scanner leer=new Scanner(System.in);
            
            int tamañoVector;     
            int tamañoMatriz;
            System.out.println("digite el tamaño del vector");
            tamañoVector=leer.nextInt();
            Vector obj=new Vector();
            obj.llenar(tamañoVector);
            obj.imprimir(tamañoVector);
            System.out.println("\norden ascendente");
            obj.ascendente();
            System.out.println("\norden descendente");
            obj.descendente();
            
            System.out.println("\ndigite el tamaño de la Matriz");
            tamañoMatriz=leer.nextInt();
            Matriz obj1=new Matriz();
            obj1.llenar(tamañoMatriz);
            obj1.imprimir(tamañoMatriz);
            System.out.println("\norden ascendente");
            obj1.ascendente();
            System.out.println("\norden descendente");
            obj1.descendente();
    }
    
}
