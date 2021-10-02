
package practica2;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Menu {
        public JFrame menu;
        public JPanel panelPrincipal;
        
        
        
        
        public Menu(){
        
        this.menu = new JFrame("Torres de Hanoi");
        this.menu.setVisible(true);
        this.menu.setBounds(0, 0, 800, 500);
        this.menu.setLayout(null);
        
        this.panelPrincipal = new JPanel();
        this.panelPrincipal.setBounds(0, 0, 800, 500);
        this.panelPrincipal.setBackground(Color.white);
        this.panelPrincipal.setLayout(null);
        
        JLabel label = new JLabel("Torres de Hanoi");
        label.setBounds(350, 30, 100, 50);
        
 
        
        this.Menu();
        
        
        
        this.menu.add(panelPrincipal);
        this.panelPrincipal.add(label);
        }
        
        
        public void Menu(){
        
            JButton btnNuevoJuego = new JButton("Nuevo Juego");
            //logica.filtrarClientes(texto1.getText(), texto3.getText(), texto2.getText(), texto4.getText(), comboFiltroUno);

            btnNuevoJuego.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    PantallaJuego pantallaJuego = new PantallaJuego();
                }
            }
            );

            btnNuevoJuego.setBounds(300, 100, 200, 50);
            this.panelPrincipal.add(btnNuevoJuego);

            
            
            JButton btnJuegoAutomatico = new JButton("Juego Automatico");
            //logica.filtrarClientes(texto1.getText(), texto3.getText(), texto2.getText(), texto4.getText(), comboFiltroUno);

            btnJuegoAutomatico.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    JuegoAutomatico juegoAutomatico = new JuegoAutomatico();
                    
                }
            }
            );

            btnJuegoAutomatico.setBounds(300, 160, 200, 50);
            this.panelPrincipal.add(btnJuegoAutomatico);
        
            
            
            JButton btnTop5 = new JButton("Top 5");
            //logica.filtrarClientes(texto1.getText(), texto3.getText(), texto2.getText(), texto4.getText(), comboFiltroUno);

            btnTop5.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    // logica.filtrarClientes(texto1.getText(), texto3.getText(), texto2.getText(), texto4.getText(), comboFiltroUno);
                }
            }
            );

            btnTop5.setBounds(300, 220, 200, 50);
            this.panelPrincipal.add(btnTop5);
            
            
            JButton btnConfiguracion = new JButton("Configuracion");
            //logica.filtrarClientes(texto1.getText(), texto3.getText(), texto2.getText(), texto4.getText(), comboFiltroUno);

            btnConfiguracion.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    Configuracion Configuracion = new Configuracion();
                }
            }
            );

            btnConfiguracion.setBounds(300, 280, 200, 50);
            this.panelPrincipal.add(btnConfiguracion);
            
            
            
            
            JButton btnSalir = new JButton("Salir");
            //logica.filtrarClientes(texto1.getText(), texto3.getText(), texto2.getText(), texto4.getText(), comboFiltroUno);

            btnSalir.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    // logica.filtrarClientes(texto1.getText(), texto3.getText(), texto2.getText(), texto4.getText(), comboFiltroUno);
                }
            }
            );

            btnSalir.setBounds(650, 350, 100, 25);
            this.panelPrincipal.add(btnSalir);
        }

    
    
    
}
