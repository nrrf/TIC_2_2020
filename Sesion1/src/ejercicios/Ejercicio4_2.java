/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author inies
 */
public class Ejercicio4_2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int n = Integer.parseInt(entrada.nextLine());
        for(int i=0 ; i<n ; i++){
            String universidad = entrada.nextLine(); 
            String [] div;
            div=universidad.split("\\.");
            System.out.println(div[1]);
        }
        
    }
}
