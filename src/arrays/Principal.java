/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;



/**
 *
 * @author UserPL022Pc07
 */


import java.util.Random; // Importar o Random;


public class Principal {
    
    public Principal() {
        
        
        // |_|_|_|_|_|_|_|_|
        
        
         int[] primos = new int [6]; // 6 numeros primos
         
         // 1º Programa ######################
         
        /*  
       int[] primos = new int [4];
      
        primos[0] = 1;        // da-te os 4 numero primos inseridos no programa
        primos[1] = 3;
        primos[2] = 5;
        primos[3] = 7;
        
        */
       
       
       
        // Declaração de arrays com valores pre-definidos 
        
        // 2º Programa #####################
        
        Random rand = new Random(); // Criar a variavel do tipo Randow (aleatorio);
        
        
       primos[0] = rand.nextInt(10); // da-te 5 numero primos aleatorios ate 10
       primos[1] = rand.nextInt(10);
       primos[2] = rand.nextInt(10);
       primos[3] = rand.nextInt(10);
       primos[4] = rand.nextInt(10);
       primos[5] = rand.nextInt(10);
       
       System.out.println(primos[0]);  // Imprime os numeros 
       System.out.println(primos[1]);
       System.out.println(primos[2]);
       System.out.println(primos[3]);
       System.out.println(primos[4]);
       System.out.println(primos[5]);
   
        
        // Arrays com 6 posições com números aleatorios ate 10
       
        
     
        
       
        
        
       
    }
}
    
