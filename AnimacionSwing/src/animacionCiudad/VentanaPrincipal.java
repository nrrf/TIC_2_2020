/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animacionCiudad;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author inies
 */

//1. Crear un proyecto vacio 
//2. Crear un paquete llamado animacionciudad 
//3. Crear clase AnimacionCiudad (Agregamos un Main)
//4. Crear clase Ventana Principal
public class VentanaPrincipal extends JFrame{
    public VentanaPrincipal(){
        // Constructor JFrmae: Toma como parametro el titulo de la ventana
         super("Animacion de una ciudad!");
         //termina la ejecucion cuando se cierra la ventana
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         // Funcion para inicializar componentes 
         initComponents();
         
         // Ajusta el tamaño de la ventna segun componentes
         pack();
         // tamaño de la ventana
         //setSize(500,300);
         // ventana visible
         setVisible(true);
    }
   

    private void initComponents() {
        /*
        setBackground(Color.YELLOW);
        //getContentPane().setBackground(Color.RED);
        setLayout(new BorderLayout());
        JPanel p1= new JPanel();
        p1.setBackground(Color.RED);
        p1.add(new JLabel("panel 1"));
        // como panel principal
        //setContentPane(p1);
        add(p1,BorderLayout.NORTH);
        
        
        JPanel p2= new JPanel();
        p2.add(new JLabel("panel 2"));
        p2.setBackground(Color.GREEN);
        // estamos agregando los demas
        add(p2,BorderLayout.CENTER);
        
        
        
        JPanel p3= new JPanel();
        p3.add(new JLabel("panel 3"));
        p3.setBackground(Color.YELLOW);
        add(p3, BorderLayout.EAST);
        
        JPanel p4= new JPanel();
        p4.add(new JLabel("panel 4"));
        p4.setBackground(Color.BLUE);
        add(p4, BorderLayout.WEST);
        
        JPanel p5= new JPanel();
        p5.add(new JLabel("panel 5"));
        p5.setBackground(Color.BLACK);
        add(p5, BorderLayout.SOUTH);
*/
        PanelCiudad panelCiudad= new PanelCiudad();
        setContentPane(panelCiudad);
        
        PanelControles panelControles= new PanelControles();
        add(panelControles);
    }
}
