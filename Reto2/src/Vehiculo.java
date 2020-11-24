/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author inies
 */
public class Vehiculo {
    private String velocidad; 
    private String pasajeros; 
    private String placa; 
    private String tipo;

    public Vehiculo(String velocidad, String pasajeros, String placa, String tipo) {
        this.velocidad = velocidad;
        this.pasajeros = pasajeros;
        this.placa = placa;
        this.tipo = tipo;
    }

    public String getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(String velocidad) {
        this.velocidad = velocidad;
    }

    public String getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(String pasajeros) {
        this.pasajeros = pasajeros;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String Placa) {
        this.placa = placa;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "\tVehículo "+tipo+" - Placa: "+placa+"\n\tvelocidad: "+velocidad+" km/h\n\tpasajeros: "+pasajeros+"\n";
    }
    
}
