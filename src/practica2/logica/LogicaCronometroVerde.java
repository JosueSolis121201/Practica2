
package practica2.logica;
import javax.swing.*;
import java.awt.*;
import practica2.PantallaJuego;


public class LogicaCronometroVerde extends JLabel implements Runnable  {
    
    
    
    private int y;
    private Point location = new Point(0,0);
    private boolean verde;
    
    private ImageIcon iconoRojo;
    private ImageIcon iconoVerde;


    
    public LogicaCronometroVerde (Point location){
        
        
        this.iconoRojo = new ImageIcon("CronometroRojo.png");
        this.iconoVerde = new ImageIcon("CronometroVerde.png");
        
        
        this.setIcon(this.iconoVerde);
        this.setSize(50,50);
        this.location = location;
        this.verde = false;

        
        
        
       

    }
    @Override
    public void run() {
        boolean posicion = true;

        while (posicion) {

            if (PantallaJuego.cronometroVerde.getY() <= 500) {
                PantallaJuego.cronometroVerde.setLocation(PantallaJuego.cronometroVerde.getX(), PantallaJuego.cronometroVerde.getY() + 7);

                
                if (PantallaJuego.cronometroVerde.getY() >=100) {
                   this.setIcon(this.iconoVerde);
                }
                
                if (PantallaJuego.cronometroVerde.getY() >=200) {
                   this.setIcon(this.iconoRojo);
                }
                
                if (PantallaJuego.cronometroVerde.getY() >=300) {
                   this.setIcon(this.iconoVerde);
                }
                
                 if (PantallaJuego.cronometroVerde.getY() >=400) {
                   this.setIcon(this.iconoRojo);
                }
                
                if (PantallaJuego.cronometroVerde.getY() >=450) {
                   this.setIcon(this.iconoVerde);
                }
                
                if (PantallaJuego.cronometroVerde.getY() >=500) {
                   this.setIcon(this.iconoRojo);
                }
                
                if (PantallaJuego.cronometroVerde.getY() >= 500) {
                    y = -400;
                    PantallaJuego.cronometroVerde.setLocation(PantallaJuego.cronometroVerde.getX(), PantallaJuego.cronometroVerde.getY() + y);

                }

            }

            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }

}
    

