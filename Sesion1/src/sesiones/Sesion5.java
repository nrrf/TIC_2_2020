/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesiones;

/**
 *
 * @author inies
 */

public class Sesion5{
    public static void main(String[] args) {
        Perro miPerro = new Perro(5, "Toby", "Blue");
        System.out.println(miPerro.getEdad());
    }
}

class Perro {
    public int edad;
    public String nombre;
    public String colorOjos;
    

    public Perro(int edad, String nombre, String colorOjos) {
        this.edad = edad;
        this.nombre = nombre;
        this.colorOjos = colorOjos;

    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColorOjos() {
        return colorOjos;
    }

    public void setColorOjos(String colorOjos) {
        this.colorOjos = colorOjos;
    }
    
    public void ladrar() {
        System.out.println("Guau Guau");
    }
    public void saludar() {
        System.out.println
        ("Hola, mi nombre es " + nombre);
    }

}
