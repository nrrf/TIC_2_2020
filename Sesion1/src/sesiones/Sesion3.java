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
public class Sesion3 {
    
    public static double suma(Scanner sc){
        double num =0;
        double sum =0;
        do{
            num = Double.parseDouble(sc.nextLine());
            sum+=num;
        }while(num!=0);
        return sum;
    }
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); 
        
        System.out.println(suma(entrada));
    }
}
