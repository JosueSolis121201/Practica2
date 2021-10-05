
package practica2.logica;



public class Cronometro extends Thread {
    private int segundos =0;
    
    public void run (){
    try{
        
        sleep(1000);
        segundos--;
       
    }catch(Exception e){}
    
    }
}
