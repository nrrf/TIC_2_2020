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
        Perro miPerro1 = new Perro(5, "Toby", "Blue");
        Perro miPerro2 = new Perro(7, "Vainilla", "Negro");
        Perro miPerro3 = new Perro(5, "Bony", "Amarillo");
        System.out.println(miPerro1.getEdad());
        miPerro1.saludar();
        System.out.println(miPerro1.quienEsMayor(miPerro2));
        System.out.println(miPerro1.saludarOtroPerro(miPerro2));
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
    public String quienEsMayor(Perro otroPerro){
        if (this.edad > otroPerro.edad) {
            return ("Soy mayor que " + otroPerro.nombre);
        } else if (this.edad == otroPerro.edad) {
            return ("Tenemos la misma edad");
        } else {
            return(otroPerro.nombre + " es mayor que yo");
        }
    }
    
    public String saludarOtroPerro(Perro otroPerro) {
        return ("Hola " + otroPerro.nombre + ", yo soy "
         + this.nombre);
    }
}
