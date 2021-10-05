
package practica2.logica;

import javax.swing.JLabel;



public class Cronometro extends Thread {
    private int segundos =120;
    private JLabel label;
    
    
    public Cronometro(JLabel label){
        
        this.label=label;
        
     
        
    
    
    
    }
    public void incrementar(){
        this.segundos= this.segundos + 10; 
    }
    
    
    public void Disminuir(){
        this.segundos= this.segundos - 10; 
    }
    
    @Override
    public void run (){
        while(segundos>=0){
                try{
                    this.label.setText(segundos+"");
                    Thread.sleep(1000);
                    segundos--;
                }catch(Exception e){}

                }
        
        }
}
