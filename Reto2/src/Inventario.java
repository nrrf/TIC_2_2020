
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author inies
 */
public class Inventario{
    ArrayList<Vehiculo> vehiculo = new ArrayList<Vehiculo>();
    String comando;
    public Inventario() {
        
    }   
    
    
    public ArrayList<Vehiculo> listarVehiculos() {
        return vehiculo;
    }
    
    public void limpiarInventario (){
        vehiculo.clear();
    }
            

    public void setVehiculo(ArrayList<Vehiculo> vehiculo) {
        this.vehiculo = vehiculo;
    }
    
    public void agregarVehiculo(Vehiculo vehiculo) {
        this.vehiculo.add(vehiculo);
    }
    

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String comando;
        String [] comandos;
        Vehiculo vehiculo;
        Inventario inventario = new Inventario();
        boolean salida = false;
        ArrayList<Vehiculo> losvehiculos = new ArrayList<Vehiculo>();
        do{
            comando = entrada.nextLine();
            comandos=comando.split("\\&");

            if(comandos[0].equals("2")){           
                losvehiculos = inventario.listarVehiculos();
                System.out.println("***Inventario de vehículos***");
                for (Vehiculo losvehiculo : losvehiculos) {
                    
                    System.out.println(losvehiculo.toString());
                }
                inventario.limpiarInventario();

            }
            else if(comandos[0].equals("3")){
                salida=true;
            }
            else if(comandos[1].equals("Particular")){
                vehiculo = new Particular(comandos[3], comandos[2],comandos[4],comandos[1],comandos[5]);
                inventario.agregarVehiculo(vehiculo);
            }else if (comandos[1].equals("Comercial")){
               vehiculo = new Comercial(comandos[3], comandos[2],comandos[4],comandos[1],comandos[5]);
                inventario.agregarVehiculo(vehiculo);
            }
        }while(!salida);
        
    }
}
