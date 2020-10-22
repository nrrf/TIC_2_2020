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


public class Ejercicio1 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); 
        
        int n = Integer.parseInt(entrada.next()); 
        
        int años=n/365;
        n%=365;
        System.out.println(años+" año(s)");
        int meses=n/30;
        n%=30;
        System.out.println(meses+" mes(es)");
        
        System.out.println(n+" día(s)");
        
    }
}
