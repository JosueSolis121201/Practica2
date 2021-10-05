
package practica2.logica;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import practica2.PantallaJuego;


public class LogicaCronometroVerde extends JLabel implements Runnable  {
    
    
    
    private int y;
    private Point location = new Point(0,0);
    private boolean verde;
    
    private ImageIcon iconoRojo;
    private ImageIcon iconoVerde;
    private Cronometro cronometro;

    
    public LogicaCronometroVerde (Point location,Cronometro cronometro){
        
        
        this.iconoRojo = new ImageIcon("CronometroRojo.png");
        this.iconoVerde = new ImageIcon("CronometroVerde.png");
        this.cronometro = cronometro;
        
        this.setIcon(this.iconoVerde);
        this.setSize(50,50);
        this.location = location;
        this.verde = false;
        
        
        
        this.addMouseListener(new MouseAdapter()  
            {  
                public void mouseClicked(MouseEvent e)  
                {  
                    if(verde==true){
                        
                        cronometro.Disminuir();
                   }else{
                       cronometro.incrementar();
                      
                   }
                }  
            }); 
       

    }
    @Override
    public void run() {
        boolean posicion = true;

        while (posicion) {
            if(this.verde==true){
                 this.setIcon(this.iconoVerde);
                 this.verde = false;
                 
            }else{
                this.setIcon(this.iconoRojo);
                this.verde=true;
            }
            
            
            if (PantallaJuego.cronometroVerde.getY() <= 500) {
                PantallaJuego.cronometroVerde.setLocation(PantallaJuego.cronometroVerde.getX(), PantallaJuego.cronometroVerde.getY() + 7);
            }else{
                 y = -400;
                 PantallaJuego.cronometroVerde.setLocation(PantallaJuego.cronometroVerde.getX(), PantallaJuego.cronometroVerde.getY() + y);
            }

            try {
                    Thread.sleep(700);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }

}
    

