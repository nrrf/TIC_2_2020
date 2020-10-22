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
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a = Integer.parseInt(entrada.nextLine());
        int b = Integer.parseInt(entrada.nextLine());
        int count = 1;
        while(!(b>a)){
            a*=1.02;
            b*=1.03;
            count++;
        }
        System.out.println(count);
        System.out.println(36+28);
                
    }
}
