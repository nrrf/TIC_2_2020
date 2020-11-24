/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplillos_collections;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author inies
 */
public class EjemploArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List ejemplo = new ArrayList(); 
        
        ejemplo.add(5);
        ejemplo.add(7);
        ejemplo.add(9);
        ejemplo.add(0,2);
        ejemplo.add(1,15); 
        
        System.out.println("Lista: "+ejemplo);
        System.out.println("Lista tamaño: "+ejemplo.size());
        
        ejemplo.remove(3); 
        
        System.out.println("Lista por elemento: ");
        for (Object object : ejemplo) {
            System.out.println(object);
        }
        System.out.println("Primer elemento: "+ejemplo.get(0));
        
        
    }
    
}
