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
public class Ejercicio4_1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int n = Integer.parseInt(entrada.nextLine());
        
        String opinion = entrada.nextLine(); 
        
        boolean dificil=false;
        for(int i=0 ; i<opinion.length() && dificil==false ; i++){
            if(opinion.charAt(i)=='1'){
                dificil=true;
            }
        }
        
        if(dificil){
            System.out.println("DIFICIL");
        }else{
            System.out.println("FACIL");
        }
    }
}
