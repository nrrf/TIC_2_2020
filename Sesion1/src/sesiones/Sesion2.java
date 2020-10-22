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
public class Sesion2 {
    
    public static double f(double x){
        return x*x;
    }
    
    public static double areaRectangulo(double l, double a){
        return l*a;
    }
    
    public static double valorAbsoluto (double x){
    if(x>=0){
        return x;
    }else{
        return -x;
    }
    
    }
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); 
        /*
        double n = Double.parseDouble(entrada.nextLine());
        
        System.out.println(f(n));
        */
        
        /*
        double x = 4;
        double y = 2e2;  // 2*10^2
        System.out.println(y);
        System.out.println(x+y);
        */
        
        /*
        double largo = Double.parseDouble(entrada.nextLine());
        double ancho = Double.parseDouble(entrada.nextLine());
        
        double area = areaRectangulo(largo, ancho);
        String concatenacion = "Area: "+area;
        System.out.println(concatenacion);
*/
        double num = Double.parseDouble(entrada.nextLine());
        System.out.println("el valor absoluto es: "+valorAbsoluto(num));

    }
            
}
