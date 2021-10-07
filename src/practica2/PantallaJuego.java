
package practica2;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import practica2.logica.Cronometro;
import practica2.logica.LogicaBotones;
import practica2.logica.LogicaCronometroVerde;


public class PantallaJuego {
        
        public JLabel[] pilar1;
        public JLabel[] pilar2;
        public JLabel[] pilar3;
    

        
        public JFrame menu;
        public JPanel panelPrincipal;
        public JLabel vertical1;
        public JLabel vertical2;
        public JLabel vertical3;
        
        
        public LogicaBotones botones;
        
        public JLabel labe4;
        
        public JPanel horizontal1;
        public JPanel horizontal2;
        public JPanel horizontal3;
        
        //Cronometros
        JLabel CronometroLabel;
        public static Point location = new Point(0,0);
        public static LogicaCronometroVerde cronometroVerde;

        public static int x, y;
        
        //Temporizador
        
        public  Cronometro temporizador;
      
        public int movimientos;
        
        
        
        public PantallaJuego(){
        
            
        this.menu = new JFrame("Torres de Hanoi");
        this.menu.setVisible(true);
        this.menu.setBounds(0, 0, 800, 500);
        this.menu.setLayout(null);
        
        this.panelPrincipal = new JPanel();
        this.panelPrincipal.setBounds(0, 0, 800, 500);
        this.panelPrincipal.setBackground(Color.white);
        this.panelPrincipal.setLayout(null);
        
       
       this.movimientos=0;
        
        crearPilares();
        this.botones = new LogicaBotones(this.pilar1,this.pilar2,this.pilar3) ;
        
        
        JLabel label = new JLabel("Tiempo");
        label.setBounds(20, 15, 100, 50);
        
         JLabel labe3 = new JLabel("<00>");
        labe3.setBounds(20, 30, 100, 50);
        this.temporizador= new Cronometro(labe3);
        this.temporizador.start();
        
        
        JLabel labe2 = new JLabel("Movimientos");
        labe2.setBounds(100, 15, 100, 50);
       
        
        this.labe4 = new JLabel(Integer.toString(movimientos));
        labe4.setBounds(100, 30, 100, 50);
        
        
        
        this.vertical1 = new JLabel();
        this.vertical1.setBounds(225, 100, 10, 200);
        this.vertical1.setBackground(Color.LIGHT_GRAY);
        this.vertical1.setOpaque(true);
        this.vertical1.setLayout(null);
        
        
        this.horizontal1 = new JPanel();
        this.horizontal1.setBounds(150, 300, 160, 10);
        this.horizontal1.setBackground(Color.DARK_GRAY);
        this.horizontal1.setLayout(null);
        
        this.vertical2 = new JLabel();
        this.vertical2.setBounds(425, 100, 10, 200);
        this.vertical2.setBackground(Color.LIGHT_GRAY);
        this.vertical2.setOpaque(true);
        this.vertical2.setLayout(null);
        
        this.horizontal2 = new JPanel();
        this.horizontal2.setBounds(350, 300, 160, 10);
        this.horizontal2.setBackground(Color.DARK_GRAY);
        this.horizontal2.setLayout(null);
        
        this.vertical3 = new JLabel();
        this.vertical3.setBounds(625, 100, 10, 200);
        this.vertical3.setBackground(Color.LIGHT_GRAY);
        this.vertical3.setOpaque(true);
        
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
        
        
       
        

        this.Cronometros();
        this.PantallaJuego();
        
        this.menu.repaint();
        }
        
         public void PantallaJuego(){
        
            JButton btnMovIzquierda1 = new JButton("<");

            btnMovIzquierda1.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    
                   
                    
                       
                       
                       if(botones.BotonIzquierda3()==true){
                         movimientos++;
                         labe4.setText(movimientos+"");
                     }
                       

                    
                    
                    
                }
            }
            );

            btnMovIzquierda1.setBounds(175, 325, 50, 25);
            this.panelPrincipal.add(btnMovIzquierda1);

            JButton btnMovDerecha1 = new JButton(">");

            btnMovDerecha1.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    
                       
                       
                       if(botones.BotonDerecha()==true){
                         movimientos++;
                         labe4.setText(movimientos+"");
                     }
                       
                }
            }
            );

            btnMovDerecha1.setBounds(230, 325, 50, 25);
            this.panelPrincipal.add(btnMovDerecha1);
            
           JButton btnMovIzquierda2 = new JButton("<");

            btnMovIzquierda2.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    
                      
                       if(botones.BotonIzquierda()==true){
                         movimientos++;
                         labe4.setText(movimientos+"");
                     }
                }
            }
            );

            btnMovIzquierda2.setBounds(375, 325, 50, 25);
            this.panelPrincipal.add(btnMovIzquierda2);

            JButton btnMovDerecha2 = new JButton(">");

            btnMovDerecha2.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    
                   
                    
                    if(botones.BotonDerecha2()==true){
                         movimientos++;
                         labe4.setText(movimientos+"");
                     }
                }
            }
            );

            btnMovDerecha2.setBounds(430, 325, 50, 25);
            this.panelPrincipal.add(btnMovDerecha2);
            
            
            
            
            
            
            JButton btnMovIzquierda3 = new JButton("<");

            btnMovIzquierda3.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                     if(botones.BotonIzquierda2()==true){
                         movimientos++;
                         labe4.setText(movimientos+"");
                         
                          
                     }
                     
                     
                }
            }
            );

            btnMovIzquierda3.setBounds(575, 325, 50, 25);
            this.panelPrincipal.add(btnMovIzquierda3);

            JButton btnMovDerecha3 = new JButton(">");
            //logica.filtrarClientes(texto1.getText(), texto3.getText(), texto2.getText(), texto4.getText(), comboFiltroUno);

            btnMovDerecha3.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    
                    
                    
                    
                   
                    
                       
                       
                       if(botones.BotonDerecha3()==true){
                         movimientos++;
                         labe4.setText(movimientos+"");
                     }

                    
                    
                    
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
         
         public void Cronometros(){
         

            cronometroVerde = new LogicaCronometroVerde(location,temporizador);
            cronometroVerde.setLocation(50, 100);
            Thread t1 =new Thread(cronometroVerde);    
            t1.start();
            
            this.panelPrincipal.add(cronometroVerde);
         
         
         }
         
         public void crearPilares(){
            this.pilar1 = new JLabel[7];
            this.pilar2 = new JLabel[7];
            this.pilar3 = new JLabel[7];
            
            int dimX=160;
            int dimY=15;
            int posX=150;
            int posY=285;
            for(int i=0;i<this.pilar1.length;i++){
                this.pilar1[i] = new JLabel();
                this.pilar1[i].setBounds(posX, posY, dimX, dimY);
                
                posX=posX+10;
                posY=posY-15;
                
                dimX=dimX-20;
                
                        
                switch(i){
                    case 0:
                        this.pilar1[i].setBackground(Color.BLUE);

                        break;

                    case 1:
                        this.pilar1[i].setBackground(Color.CYAN);

                        break;
                    case 2:
                        this.pilar1[i].setBackground(Color.ORANGE);

                        break;  
                        
                     case 3:
                        this.pilar1[i].setBackground(Color.MAGENTA);

                        break;  
                        
                    case 4:
                        this.pilar1[i].setBackground(Color.YELLOW);

                        break;  
                    
                    case 5:
                        this.pilar1[i].setBackground(Color.RED);

                        break; 
                        
                    case 6:
                        this.pilar1[i].setBackground(Color.black);

                        break;      
                 }
                
                
                
                this.pilar1[i].setOpaque(true);
                this.panelPrincipal.add(this.pilar1[i]);
                
                
                
                

            }
            
          
            
            
            
        }
      
         
            
         
         
         
            
        }
         
