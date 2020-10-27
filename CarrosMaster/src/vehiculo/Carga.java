/**
 * <p>Copyright: Copyright (c) 2019</p>
 *
 * <h3>License</h3>
 *
 * Copyright (c) 2019 by Jonatan Gomez-Perdomo. <br>
 * All rights reserved. <br>
 *
 * <p>Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 * <ul>
 * <li> Redistributions of source code must retain the above copyright notice,
 * this list of conditions and the following disclaimer.
 * <li> Redistributions in binary form must reproduce the above copyright notice,
 * this list of conditions and the following disclaimer in the documentation
 * and/or other materials provided with the distribution.
 * <li> Neither the name of the copyright owners, their employers, nor the
 * names of its contributors may be used to endorse or promote products
 * derived from this software without specific prior written permission.
 * </ul>
 * <p>THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED.  IN NO EVENT SHALL THE COPYRIGHT OWNERS OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 *
 *
 *
 * @author <A HREF="http://disi.unal.edu.co/profesores/jgomezpe"> Jonatan Gomez-Perdomo </A>
 * (E-mail: <A HREF="mailto:jgomezpe@unal.edu.co">jgomezpe@unal.edu.co</A> )
 * @version 1.0
 */
package vehiculo;

/**
 * Class representing a cargo car 
 * @author jgomez
 *
 */
public class Carga extends Vehiculo{
    /**
     * Load capability
     */
    protected int capacidad;
    /**
     * Carrying object
     */
    protected Object carga;

    /**
     * Creates a carrying vehicle with the given number of passengers, speed and load capability
     * @param pasajeros Number of passengers
     * @param velocidad Speed of the Vehicle
     * @param peso Load capability
     */
   public Carga(int pasajeros, double velocidad, int peso) {
	super(pasajeros, velocidad);
	this.capacidad = peso>5?5:peso;
	this.carga = "___";
    }

   /**
    * Paints the vehicle at the given position
    * @param posicion Position used to print the vehicle
    */
    @Override
    public void pintar(int posicion) {}

    /**
     * Carries the given number, if possible
     * @param p Number to carry
     * @return <i>true</i> If the number can be carried, <i>false</i> otherwise
     */
    public boolean llevar( int p) {
	int k = 1;
	for( int i=0; i<this.capacidad; i++) {
	    k *=10;
	}
	if( p < k ) {
	    this.carga = p;
	    return true;
	}else {
	    return false;
	}
    }

    /**
     * Carries the given string, if possible
     * @param p Number to carry
     * @return <i>true</i> If the string can be carried, <i>false</i> otherwise
     */    
    public boolean llevar( String p) {
	if( p.length() <= this.capacidad ) {
	    this.carga = p;
	    return true;
	}else {
	    return false;
	}
    }
}