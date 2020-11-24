/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author inies
 */
public class Particular extends Vehiculo{
    private String color;
    public Particular(String velocidad, String pasajeros, String Placa, String tipo, String color) {
        super(velocidad, pasajeros, Placa, tipo);
        this.color=color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        
        return super.toString()+"\tcolor: "+color;
    }
    
}