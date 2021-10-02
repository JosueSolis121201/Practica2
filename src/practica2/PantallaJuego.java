
package practica2;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class PantallaJuego {
    
    
        public JFrame menu;
        public JPanel panelPrincipal;
        public JPanel vertical1;
        public JPanel vertical2;
        public JPanel vertical3;
        
        public JPanel horizontal1;
        public JPanel horizontal2;
        public JPanel horizontal3;
        
        
        
        
        
        
        
        public PantallaJuego(){
        
        this.menu = new JFrame("Torres de Hanoi");
        this.menu.setVisible(true);
        this.menu.setBounds(0, 0, 800, 500);
        this.menu.setLayout(null);
        
        this.panelPrincipal = new JPanel();
        this.panelPrincipal.setBounds(0, 0, 800, 500);
        this.panelPrincipal.setBackground(Color.white);
        this.panelPrincipal.setLayout(null);
        
        JLabel label = new JLabel("Tiempo");
        label.setBounds(20, 15, 100, 50);
        
        JLabel labe2 = new JLabel("Movimientos");
        labe2.setBounds(100, 15, 100, 50);
        
        JLabel labe3 = new JLabel("<00>");
        labe3.setBounds(20, 30, 100, 50);
        
        JLabel labe4 = new JLabel("<000>");
        labe4.setBounds(100, 30, 100, 50);
        
        
        this.vertical1 = new JPanel();
        this.vertical1.setBounds(225, 100, 10, 200);
        this.vertical1.setBackground(Color.LIGHT_GRAY);
        this.vertical1.setLayout(null);
        
        this.horizontal1 = new JPanel();
        this.horizontal1.setBounds(150, 300, 160, 10);
        this.horizontal1.setBackground(Color.DARK_GRAY);
        this.horizontal1.setLayout(null);
        
        this.vertical2 = new JPanel();
        this.vertical2.setBounds(425, 100, 10, 200);
        this.vertical2.setBackground(Color.LIGHT_GRAY);
        this.vertical2.setLayout(null);
        
        this.horizontal2 = new JPanel();
        this.horizontal2.setBounds(350, 300, 160, 10);
        this.horizontal2.setBackground(Color.DARK_GRAY);
        this.horizontal2.setLayout(null);
        
        this.vertical3 = new JPanel();
        this.vertical3.setBounds(625, 100, 10, 200);
        this.vertical3.setBackground(Color.LIGHT_GRAY);
        this.vertical3.setLayout(null);
        
        this.horizontal3 = new JPanel();
        this.horizontal3.setBounds(550, 300, 160, 10);
        this.horizontal3.setBackground(Color.DARK_GRAY);
        this.horizontal3.setLayout(null);
        
        this.menu.add(panelPrincipal);
        this.panelPrincipal.add(label);
        this.panelPrincipal.add(labe2);
        this.panelPrincipal.add(labe3);
        this.panelPrincipal.add(labe4);
        this.panelPrincipal.add(vertical1);
        this.panelPrincipal.add(horizontal1);
        this.panelPrincipal.add(vertical2);
        this.panelPrincipal.add(horizontal2);
        this.panelPrincipal.add(vertical3);
        this.panelPrincipal.add(horizontal3);
        
        this.PantallaJuego();
        
        }
        
         public void PantallaJuego(){
        
            JButton btnMovIzquierda1 = new JButton("<");
            //logica.filtrarClientes(texto1.getText(), texto3.getText(), texto2.getText(), texto4.getText(), comboFiltroUno);

            btnMovIzquierda1.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    // logica.filtrarClientes(texto1.getText(), texto3.getText(), texto2.getText(), texto4.getText(), comboFiltroUno);
                }
            }
            );

            btnMovIzquierda1.setBounds(175, 325, 50, 25);
            this.panelPrincipal.add(btnMovIzquierda1);

            JButton btnMovDerecha1 = new JButton(">");
            //logica.filtrarClientes(texto1.getText(), texto3.getText(), texto2.getText(), texto4.getText(), comboFiltroUno);

            btnMovDerecha1.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    // logica.filtrarClientes(texto1.getText(), texto3.getText(), texto2.getText(), texto4.getText(), comboFiltroUno);
                }
            }
            );

            btnMovDerecha1.setBounds(230, 325, 50, 25);
            this.panelPrincipal.add(btnMovDerecha1);
            
           JButton btnMovIzquierda2 = new JButton("<");
            //logica.filtrarClientes(texto1.getText(), texto3.getText(), texto2.getText(), texto4.getText(), comboFiltroUno);

            btnMovIzquierda2.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    // logica.filtrarClientes(texto1.getText(), texto3.getText(), texto2.getText(), texto4.getText(), comboFiltroUno);
                }
            }
            );

            btnMovIzquierda2.setBounds(375, 325, 50, 25);
            this.panelPrincipal.add(btnMovIzquierda2);

            JButton btnMovDerecha2 = new JButton(">");
            //logica.filtrarClientes(texto1.getText(), texto3.getText(), texto2.getText(), texto4.getText(), comboFiltroUno);

            btnMovDerecha2.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    // logica.filtrarClientes(texto1.getText(), texto3.getText(), texto2.getText(), texto4.getText(), comboFiltroUno);
                }
            }
            );

            btnMovDerecha2.setBounds(430, 325, 50, 25);
            this.panelPrincipal.add(btnMovDerecha2);
            
            
            
            
            
            
            JButton btnMovIzquierda3 = new JButton("<");
            //logica.filtrarClientes(texto1.getText(), texto3.getText(), texto2.getText(), texto4.getText(), comboFiltroUno);

            btnMovIzquierda3.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    // logica.filtrarClientes(texto1.getText(), texto3.getText(), texto2.getText(), texto4.getText(), comboFiltroUno);
                }
            }
            );

            btnMovIzquierda3.setBounds(575, 325, 50, 25);
            this.panelPrincipal.add(btnMovIzquierda3);

            JButton btnMovDerecha3 = new JButton(">");
            //logica.filtrarClientes(texto1.getText(), texto3.getText(), texto2.getText(), texto4.getText(), comboFiltroUno);

            btnMovDerecha3.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    // logica.filtrarClientes(texto1.getText(), texto3.getText(), texto2.getText(), texto4.getText(), comboFiltroUno);
                }
            }
            );

            btnMovDerecha3.setBounds(630, 325, 50, 25);
            this.panelPrincipal.add(btnMovDerecha3);
            
            
            
            JButton btnSalir = new JButton("Salir");
            //logica.filtrarClientes(texto1.getText(), texto3.getText(), texto2.getText(), texto4.getText(), comboFiltroUno);

            btnSalir.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    // logica.filtrarClientes(texto1.getText(), texto3.getText(), texto2.getText(), texto4.getText(), comboFiltroUno);
                }
            }
            );

            btnSalir.setBounds(650, 400, 75, 25);
            this.panelPrincipal.add(btnSalir);
            
           
        }
        
       
}