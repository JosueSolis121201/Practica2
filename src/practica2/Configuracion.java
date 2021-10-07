
package practica2;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Configuracion {
    
    
    
    
    
        public JFrame menu;
        public JPanel panelPrincipal;
        
        
        public Configuracion(){
        
        this.menu = new JFrame("Torres de Hanoi");
        this.menu.setVisible(true);
        this.menu.setBounds(0, 0, 800, 300);
        this.menu.setLayout(null);
        
        this.panelPrincipal = new JPanel();
        this.panelPrincipal.setBounds(0, 0, 800, 300);
        this.panelPrincipal.setBackground(Color.white);
        this.panelPrincipal.setLayout(null);
        
        JLabel label = new JLabel("Configuracion");
        label.setBounds(350, 15, 500, 50);
        
        JLabel labe2 = new JLabel("Cantidad de discos");
        labe2.setBounds(100, 50, 500, 50);
        
        JLabel labe3 = new JLabel("Tiempo de partida");
        labe3.setBounds(550, 55, 500, 50);
        
        JTextField texto4 = new JTextField("120");
        texto4.setBounds(550, 100, 150, 20);
        this.panelPrincipal.add(texto4);
        
        
        
        JButton btnSalir = new JButton("Salir");

            btnSalir.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                }
            }
            );

            btnSalir.setBounds(625, 200, 75, 25);
            this.panelPrincipal.add(btnSalir);
            
            
            
         JButton btnGuardar = new JButton("Guardar");

           

            btnGuardar.setBounds(350, 200, 100, 25);
            this.panelPrincipal.add(btnGuardar);    
            
            
            String[] discos = { "3", "4", "5", "6", "7" };
            JComboBox cantidadDeDiscos = new JComboBox(discos);
             cantidadDeDiscos.setSelectedIndex(4);
            cantidadDeDiscos.setBounds(100, 100, 150, 20);
            
            
             btnGuardar.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    
                    texto4.getText();
                    cantidadDeDiscos.getSelectedItem();
                    
                }
            }
            );
        
        this.menu.add(panelPrincipal);
        this.panelPrincipal.add(label);
        this.panelPrincipal.add(labe2);
        this.panelPrincipal.add(labe3);
        
        
        this.panelPrincipal.add(cantidadDeDiscos);
        
        }
    
    
    
}
