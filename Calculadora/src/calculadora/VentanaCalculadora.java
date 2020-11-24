/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;
import java.awt.Font;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.Color;
import java.awt.*;
import java.util.HashSet;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class VentanaCalculadora extends JFrame {
    JTextField pantalla;
    JPanel panelNumeros, panelOperaciones;
    double resultado=0;
    boolean bandera=true;
    String opUsuario;
    public VentanaCalculadora() {
        
        super();
        setSize(250,300);
        setTitle("Calculador MinTic");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        JPanel panel =(JPanel)this.getContentPane();
        pantalla = new JTextField("0",20);
        pantalla.setBorder(new EmptyBorder(4,4,4,4));
        pantalla.setFont(new Font("Arial",Font.BOLD,24));
        pantalla.setEditable(false);
        pantalla.setBackground(Color.WHITE);
        pantalla.setHorizontalAlignment(pantalla.RIGHT);
        panel.add("North",pantalla);
        panelNumeros = new JPanel();
        GridLayout g = new GridLayout(4,3);
        panelNumeros.setLayout(g);
        
        for (int i = 9; i >=0; i--) {
            BotonNumero(String.valueOf(i));
        }
        BotonNumero(".");
        BotonNumero("+/-");
        panel.add("Center", panelNumeros);
        panelOperaciones = new JPanel();
        GridLayout h = new GridLayout(6,1);
        panelOperaciones.setLayout(h);
        String[] op = {"+","-","*","/","=","CE"};
        for (int i = 0; i < op.length; i++) {
            BotonOperaciones(op[i]);
        }
        
        panel.add("East",panelOperaciones);
        
        
    }
    
    private void BotonNumero(String digito){
        JButton boton =new JButton();
        boton.setText(digito);
        
        boton.addMouseListener(new MouseAdapter(){ // captura las acciones del mouse
            public void mouseReleased(MouseEvent evento){
                JButton boton = (JButton) evento.getSource();
                numeroPulsado(boton.getText()); 
            }
            });
        panelNumeros.add(boton);
    }
    private void BotonOperaciones (String simbolo){
        JButton boton =new JButton();
        boton.setText(simbolo);
        boton.addMouseListener(new MouseAdapter(){ // captura las acciones del mouse
            public void mouseReleased(MouseEvent evento){
                JButton boton = (JButton) evento.getSource();
                operacionPulsada(boton.getText()); 
            }
            });
        panelOperaciones.add(boton);
        
    }
    private void numeroPulsado(String tecla){
               
        if (bandera || pantalla.getText().equals("0")) {
            pantalla.setText(tecla);
        }else{
            pantalla.setText(pantalla.getText()+tecla);
        }
        bandera=false;
    }
    
    private void calculos(){
        if (opUsuario.equals("+")) {
            resultado+=new Double(pantalla.getText());
        }
        pantalla.setText(""+resultado);
        opUsuario="";
    }
    
  
    private void operacionPulsada(String tecla){
        if (tecla.equals("=")) {
            calculos();
        }else if(tecla.equals("CE")){
            resultado = 0;
            pantalla.setText("0");
            bandera=true;
        }else{
            opUsuario=tecla;
            if (resultado>0 && bandera==false) {
                calculos();
            }else{
                resultado=Double.parseDouble(pantalla.getText());
            }
        }
        bandera=true;
    }
}   
