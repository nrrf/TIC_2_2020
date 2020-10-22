/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retos;
import java.util.Scanner;

/**
 *
 * @author inies
 */
public class reto1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        
        int a = Integer.parseInt(sc.nextLine());
        int b = Integer.parseInt(sc.nextLine());
        
        System.out.println(a-b);
    }
}
