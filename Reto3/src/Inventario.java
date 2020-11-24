
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
    protected int particular = 100; 
    protected int comercial = 100;

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
    
    public int getParticular() {
        return particular;
    }

    public int getComercial() {
        return comercial;
    }
    
    //Estas son casi externas, como esta planteado la voy a agregar aqui
    
    
    public long precioParticular(int particular){
        this.particular = this.particular-particular;
        return particular*30000000;
    }
    
    public long precioComercial(int comercial){
        this.comercial = this.comercial-comercial;
        return comercial*40000000;
    }
    
    public long[] calculoIva (int cantidadautos, long precioTotal){
        //System.out.println("cantidad de autos: "+cantidadautos);
        //System.out.println("precio total: "+precioTotal);
        long[] aretornar = new long[2]; 
        if(cantidadautos<=20){
            long iva = (long)Math.ceil((precioTotal/100)*(21-cantidadautos));
            long definitivo = precioTotal+iva;
            aretornar[0]= iva;
            aretornar[1]=definitivo;
            return aretornar;
        }
        else{
            aretornar[0]=0;
            aretornar[1]=precioTotal;
            return aretornar;
        }
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
            else if (comandos[0].equals("3")){
                if((inventario.getParticular()-Integer.parseInt(comandos[2]))<0 || (inventario.getComercial()-Integer.parseInt(comandos[4]))<0){
                    System.out.println("Lo sentimos no tenemos stock suficiente");
                    System.out.println("---");
                }
                else{
                System.out.println("CONCESIONARIO UNCAR");
                System.out.println("UNCAR - UNIVA");
                System.out.println("NIT: 899.999.063");
                System.out.println("Cliente: "+comandos[5]);
                System.out.println("Vehículo Cant Precio");
                
                long precioParticular = inventario.precioParticular(Integer.parseInt(comandos[2]));
                long precioComercial = inventario.precioComercial(Integer.parseInt(comandos[4]));
                int cantidad = Integer.parseInt(comandos[2])+Integer.parseInt(comandos[4]);
                long[] iva_definitivo =inventario.calculoIva(cantidad, precioParticular+precioComercial);
                System.out.println("Particular x"+comandos[2]+" $"+30000000);
                System.out.println("Comercial x"+comandos[4]+" $"+40000000);
                System.out.println("Iva: $"+iva_definitivo[0]);
                System.out.println("Total: $"+iva_definitivo[1]);
                System.out.println("---");
                }
            }
            else if(comandos[0].equals("4")){
                System.out.println("Particular: "+inventario.getParticular());
                System.out.println("Comercial: "+inventario.getComercial());
                System.out.println("---");
            }
            else if(comandos[0].equals("5")){
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

