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
public class Vector implements OrientacionInterface{
     Scanner leer=new Scanner(System.in);
     int[]vector;
    public Vector(){
    }
    
        public void llenar( int tamaño){      
       
        vector=new int[tamaño];
        for(int i=0;i<tamaño;i++){
        System.out.println("ingrese valor");
        vector[i]=leer.nextInt();
        }
        }
        public void imprimir( int tamaño)
        {
        
           System.out.println("vector:");
           for(int i=0;i<tamaño;i++)
           {
              System.out.print(vector[i]+" ");
         
           }
        
        }
        
        public void ascendente()
        {       
           int aux;
            for (int i = 0; i < vector.length - 1; i++) {
                for (int x = i + 1; x < vector.length; x++) {
                    if (vector[x] < vector[i]) {
                        aux = vector[i];
                        vector[i] = vector[x];
                        vector[x] = aux;
                    }
                }
            }
           for(int i=0;i<vector.length;i++){
                System.out.print(vector[i]+" ");
           }
        }   
           
        public void descendente(){
            int aux;
            for (int i = 0; i < vector.length - 1; i++) {
                for (int x = i + 1; x < vector.length; x++) {
                    if (vector[x] > vector[i]) {
                        aux = vector[x];
                        vector[x] = vector[i];
                        vector[i] = aux;
                    }
                }
            }
           for(int i=0;i<vector.length;i++){
                System.out.print(vector[i]+" ");
           }
            
        }
}
