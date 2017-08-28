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
public class Matriz implements OrientacionInterface{
    Scanner leer=new Scanner(System.in);
     int[][]matriz;
    

    public Matriz(){
}
         public void llenar(int tamaño)
      {     
       
         matriz=new int[tamaño][tamaño];
        for(int i=0;i<tamaño;i++)
        {
          for(int j=0;j<tamaño;j++)
          {
             System.out.println("ingrese valor");
             matriz[i][j]=leer.nextInt();
          }
        }
      }
        public void imprimir(int tamaño)
        {
            System.out.println("Matriz:");
             for(int i=0;i<tamaño;i++)
            {
              for(int j=0;j<tamaño;j++)
                {
                  System.out.print(matriz[i][j]+" ");
                }
              System.out.println();
            }
        }
        
        public void ascendente(){
            for( int i=0; i < matriz.length; i++){//ordena la matriz de abajo hacia arriba
                for( int j=0;j< matriz.length; j++){
                    for(int x=0; x < matriz.length; x++){
                        for(int y=0; y <matriz.length; y++){
                            if(matriz[i][j] < matriz[x][y]){
                                int t = matriz[i][j];
                                matriz[i][j] = matriz[x][y];
                                matriz[x][y] = t;
                            }
                        }
                    }
                } 
            }
         for(int i=0;i<matriz.length;i++){
              for(int j=0;j<matriz.length;j++){
                  System.out.print(matriz[i][j]+" ");
              }
              System.out.println();
         }       
        }
    public void descendente(){
        for( int i=0; i < matriz.length; i++){//ordena la matriz de abajo hacia arriba
                for( int j=0;j< matriz.length; j++){
                    for(int x=0; x < matriz.length; x++){
                        for(int y=0; y <matriz.length; y++){
                            if(matriz[i][j] > matriz[x][y]){
                                int aux = matriz[x][y];
                                matriz[x][y] = matriz[i][j];
                                matriz[i][j] = aux;
                            }
                        }
                    }
                } 
            }
         for(int i=0;i<matriz.length;i++){
              for(int j=0;j<matriz.length;j++){
                  System.out.print(matriz[i][j]+" ");
              }
              System.out.println();
         } 
    
    }
        
}
