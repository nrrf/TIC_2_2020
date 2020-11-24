/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animacionCiudad;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JTextField;

/**
 *
 * @author inies
 */
public class PanelControles extends JPanel{
    JButton jButton;
    JLabel jLabelFurgon;
    JTextField jTextField;
    JLabel jLabelDormir;
    JSpinner jSpinner;
    JCheckBox jCheckBox; 
    JRadioButton jRadioButton;
    public PanelControles(){
        setLayout(new GridLayout(10,1));
        jButton = new JButton("Iniciar Animacion");
        add(jButton);
        
        jLabelFurgon = new JLabel("Carga del furgon");
        add(jLabelFurgon);
        
        jTextField = new JTextField("UNAL");
        add(jTextField);
        
        jLabelDormir = new JLabel("Carga del furgon");
        add(jLabelDormir);
        
        jSpinner = new JSpinner();
        jSpinner.setValue(50); 
        add(jSpinner);
        
        jCheckBox = new JCheckBox("Carga");
        jCheckBox.setSelected(true); 
        add(jCheckBox);
        
        jRadioButton = new JRadioButton("Adelante");
        jRadioButton.setSelected(true); 
        add(jRadioButton);
    }
}
