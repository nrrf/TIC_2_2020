/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author inies
 */
public class Comercial extends Vehiculo{
    private String cargaM;
    public Comercial(String velocidad, String pasajeros, String Placa, String tipo, String cargaM) {
        super(velocidad, pasajeros, Placa, tipo);
        this.cargaM = cargaM;
    }

    public String getCargaM() {
        return cargaM;
    }

    public void setCargaM(String cargaM) {
        this.cargaM = cargaM;
    }

    @Override
    public String toString() {
        return super.toString()+"\tCarga máxima: "+cargaM+"kg";
    }
    
}