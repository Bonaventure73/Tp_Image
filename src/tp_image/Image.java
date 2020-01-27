/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_image;

import java.util.Scanner;

/**
 *
 * @author formation_gep
 */
public class Image {

    /**
     * @param args the command line arguments
     */
    
    // APPEL
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        //VARIABLES
        int S;
        
        System.out.print("Saisir une valeur de saturation : ");
        
        
        // APPEL        

        char[][] M = new char [][] {
            {25,28,100,100,100,100},
            {44,45,50,100,100,100},
            {65,65,50,20,100,100},
            {90,62,100,5,0,0},
            {60,87,100,0,100,100}  
        };
        
        // PROCEDURE
        // affichage d'une matrice
        for (int i = 0; i < S; i++){
            System.out.println();
            for (int j = 0; j < S; j++){
                System.out.print(M[i][j] + " ");
            }
        }
        
        

        
        
        



    }
}
    
