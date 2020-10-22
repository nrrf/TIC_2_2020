/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesiones;

import java.util.Scanner;


/**
 *
 * @author inies
 */
public class Sesion1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("hola mundo");   
        int dia = Integer.MAX_VALUE;
        int DIA = Integer.MIN_VALUE;
        double num= 2e2; //2*10^2
        double num2 = 2e-2;
        double num3 = 2e20;
        double num4 = (5/2)*2;
        int num5 = (int)num4;
        char c =1;
        System.out.println(dia);
        System.out.println(DIA);
        
        System.out.println(num);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        Scanner sc = new Scanner(System.in); 
        
        int x = Integer.parseInt(sc.nextLine()); 
        double d = Double.parseDouble(sc.nextLine()); 
        boolean b = Boolean.parseBoolean(sc.nextLine()); 
        
        
    }
}
