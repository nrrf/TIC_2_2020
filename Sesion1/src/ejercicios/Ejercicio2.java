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
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a = Integer.parseInt(entrada.nextLine());
        int b = Integer.parseInt(entrada.nextLine());
        int c = Integer.parseInt(entrada.nextLine());
        int d = Integer.parseInt(entrada.nextLine());
        
        if((b>c)&&(d>a)&&(c+d>a+b)&&(c>0)&&(d>0)&&(a%2==0)){
            System.out.println("Valores aceptados");
        }else{
            System.out.println("Valores no aceptados");
        }
    }
}
