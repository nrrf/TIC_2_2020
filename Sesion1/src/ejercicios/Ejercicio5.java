/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author inies
 */
public class Ejercicio5 {
    
    public static int [] precio_final (int total){
        int [] elprecio = new int [2];
        int tot =0; 
        int desc =0;
        if(total>700000){
            tot=(int)Math.ceil(total*0.8);
            desc = (int)Math.floor(total*0.2);
        }else if(total>300000){
            tot=(int)Math.ceil(total*0.85);
            desc = (int)Math.floor(total*0.15);
        }else if(total>150000){
            tot=(int)Math.ceil(total*0.9);
            desc = (int)Math.floor(total*0.1);
        }
        else{
            tot=total; 
            desc=0;
        }
        elprecio[0]=tot;
        elprecio[1]=desc;
        return elprecio;
    }
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean salida = false; 
        String [] x;

        ArrayList<String> productos = new ArrayList<String>();
        ArrayList<String> cantidad = new ArrayList<String>();
        ArrayList<Integer> precios = new ArrayList<Integer>();
        
        while(salida == false){
            String mientrada = entrada.nextLine();
            
            if (!(mientrada.equals("3"))){
                x = mientrada.split("\\&");
                /*
                for (String string : x) {
                    System.out.println(string);
                }
*/
         
                if(x[0].equals("1")){
                    productos.add(x[1]); 
                    cantidad.add(x[2]);
                    precios.add(Integer.parseInt(x[2])*Integer.parseInt(x[3]));

                }else{
                    int precio = precios.stream().mapToInt(Integer::intValue).sum();
                    // Information: https://stackoverflow.com/questions/5963847/is-there-possibility-of-sum-of-arraylist-without-looping 
                    int [] total=precio_final(precio);
                    System.out.println("Centro Comercial Unaleño");
                    System.out.println("Compra más y Gasta Menos");
                    System.out.println("NIT: 899.999.063");
                    System.out.println("Cliente: "+x[1]);
                    System.out.println("Art Cant Precio");
                    for(int i =0 ; i<cantidad.size() ; i++){
                        System.out.println(productos.get(i)+" x"+cantidad.get(i)+" $"+precios.get(i));
                    }
                    System.out.println("Total: $"+total[0]);
                    System.out.println("En esta compra tu descuento fue $"+total[1]);
                    System.out.println("Gracias por tu compra");
                    System.out.println("--");
                    
                    productos.clear();
                    cantidad.clear();
                    precios.clear();
                }
            }else{
                salida = true;
            }
        }
    }    
}
