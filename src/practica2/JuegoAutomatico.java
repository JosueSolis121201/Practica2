
package practica2;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class JuegoAutomatico {
    
    
    
        public JFrame menu;
        public JPanel panelPrincipal;
        
        
        public JuegoAutomatico(){
        
            
            
        
        this.menu = new JFrame("Torres de Hanoi");
        this.menu.setVisible(true);
        this.menu.setBounds(0, 0, 800, 500);
        this.menu.setLayout(null);
        
        this.panelPrincipal = new JPanel();
        this.panelPrincipal.setBounds(0, 0, 800, 500);
        this.panelPrincipal.setBackground(Color.white);
        this.panelPrincipal.setLayout(null);
        
        JLabel label = new JLabel("Discos   ");
        label.setBounds(20, 15, 100, 50);
        
        JLabel labe2 = new JLabel("Movimientos");
        labe2.setBounds(100, 15, 100, 50);
        
        JLabel labe3 = new JLabel("<00>");
        labe3.setBounds(20, 30, 100, 50);
        
        JLabel labe4 = new JLabel("<000>");
        labe4.setBounds(100, 30, 100, 50);
        
        JButton btnRegresar = new JButton("Regresar");

            btnRegresar.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                }
            }
            );

            btnRegresar.setBounds(625, 400, 100, 25);
            this.panelPrincipal.add(btnRegresar);
            
            
            
         JButton btnIncicar = new JButton("Iniciar");

            btnIncicar.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                }
            }
            );

            btnIncicar.setBounds(500, 400, 100, 25);
            this.panelPrincipal.add(btnIncicar);    

        
        this.menu.add(panelPrincipal);
        this.panelPrincipal.add(label);
        this.panelPrincipal.add(labe2);
        this.panelPrincipal.add(labe3);
        this.panelPrincipal.add(labe4);

        
        }
    
    
    
    
}
