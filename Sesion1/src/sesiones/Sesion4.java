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
public class Sesion4 {
    
    public static int[] leerArregloInt(Scanner sc , int[] x, int n){
        for(int i=0 ; i<n ; i++){
            x[i]=Integer.parseInt(sc.nextLine());
        }
        
        return x;
    }
    
    public static void escribirArregloInt(int[]x){
        for(int i =0 ; i<x.length ; i++){
            System.out.print(x[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in, "ISO-8859-1"); // para que sirvan las tildes a la hora de imprimir
        
        String mistring = entrada.nextLine();
        
        System.out.println(mistring+" ");
        
        int n=5;
        
        int [] x = new int[n];
        
        x = leerArregloInt(entrada,x,n);
        System.out.println();
        escribirArregloInt(x);
    }
}
