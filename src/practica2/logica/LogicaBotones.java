
package practica2.logica;

import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class LogicaBotones {
    
    
    
     private JLabel[] pilar1;        
     private JLabel[] pilar2;
     private JLabel[] pilar3;
     public int movimientos;
     
    private int cntDisco;

     public LogicaBotones(JLabel[] pilar1,JLabel[] pilar2,JLabel[] pilar3){

        this.pilar1=pilar1;
        this.pilar2=pilar2;            
        this.pilar3=pilar3;
        
        this.cntDisco = this.pilar1.length -1;
        
        this.movimientos=0;
         
         
    
    }



public boolean BotonDerecha(){
    
         
         
    for (int i = pilar1.length-1; i >= 0; i--) {
        if (pilar1[i] != null) {

            for (int k = 0; k < pilar2.length; k++) {
                
                

                if (pilar2[k] == null) {
                    if(k!=0){
                        if(pilar2[k-1].getWidth()<pilar1[i].getWidth()){
                            JOptionPane.showMessageDialog(null, "No se puede realizar ese movimiento");
                            return false;
                        }
                    }
                    pilar1[i].setLocation(pilar1[i].getX() + 200, (pilar1[i].getY()*0)+180+15*(this.cntDisco+1 - k));
                    pilar2[k]=pilar1[i];
                    pilar1[i] = null;
                    this.movimientos++;

                     return true;
                    

                    }

                }

            }

        }
        return false;
    }





public boolean BotonDerecha2(){
    
         
         
    for (int i = pilar2.length-1; i >= 0; i--) {
        if (pilar2[i] != null) {

            for (int k = 0; k < pilar3.length; k++) {
                
                

                if (pilar3[k] == null) {
                    if(k!=0){
                        if(pilar3[k-1].getWidth()<pilar2[i].getWidth()){
                            JOptionPane.showMessageDialog(null, "No se puede realizar ese movimiento");
                            
                            return false;
                        }
                    }
                    pilar2[i].setLocation(pilar2[i].getX() + 200, (pilar2[i].getY()*0)+180+15*(this.cntDisco+1 - k));
                    pilar3[k]=pilar2[i];
                    pilar2[i] = null;
                     this.movimientos++;
                     return true;
                    

                    }

                }

            }

        }
    return false;
    }




public boolean BotonIzquierda(){
    
         
    for (int i = pilar2.length-1; i >= 0; i--) {
        if (pilar2[i] != null) {

            for (int k = 0; k < pilar1.length; k++) {
                
                

                if (pilar1[k] == null) {
                    if(cntDisco-k!=0){
                        if(pilar1[k-1].getWidth()<pilar2[i].getWidth()){
                             JOptionPane.showMessageDialog(null, "No se puede realizar ese movimiento");
                           
                            return false;
                        }
                    }
                    pilar2[i].setLocation(pilar2[i].getX() - 200,180+15*(this.cntDisco+1 - k));
                    pilar1[k]=pilar2[i];
                    pilar2[i] = null;
                     this.movimientos++;
                     return true;
                    

                    }

                }

            }

        }
        return false;    

    }



public boolean BotonIzquierda2(){
    
         
         
    for (int i = pilar3.length-1; i >= 0; i--) {
        if (pilar3[i] != null) {

            for (int k = 0; k < pilar1.length; k++) {
                
                

                if (pilar2[k] == null) {
                    if(k!=0){
                        if(pilar2[k-1].getWidth()<pilar3[i].getWidth()){
                            JOptionPane.showMessageDialog(null, "No se puede realizar ese movimiento");
                            
                            return false;
                        }
                    }
                    pilar3[i].setLocation(pilar3[i].getX() - 200,180+15*(this.cntDisco+1 - k));
                    pilar2[k]=pilar3[i];
                    pilar3[i] = null;
                     this.movimientos++;
                        return true;
                    

                    }

                }

            }
        
        }
    
       return false;

    }






public boolean BotonIzquierda3(){
    
         
         
    for (int i = pilar1.length-1; i >= 0; i--) {
        if (pilar1[i] != null) {

            for (int k = 0; k < pilar3.length; k++) {
                
                

                if (pilar3[k] == null) {
                    if(k!=0){
                        if(pilar3[k-1].getWidth()<pilar1[i].getWidth()){
                            JOptionPane.showMessageDialog(null, "No se puede realizar ese movimiento");
                            
                            return false;
                        }
                    }
                    pilar1[i].setLocation(pilar1[i].getX() + 400,180+15*(this.cntDisco+1 - k));
                    pilar3[k]=pilar1[i];
                    pilar1[i] = null;
                     this.movimientos++;
                        return true;
                    

                    }

                }

            }
        
        }
    
       return false;

    }



public boolean BotonDerecha3(){
    
         
         
    for (int i = pilar3.length-1; i >= 0; i--) {
        if (pilar3[i] != null) {

            for (int k = 0; k < pilar1.length; k++) {
                
                

                if (pilar1[k] == null) {
                    if(k!=0){
                        if(pilar1[k-1].getWidth()<pilar3[i].getWidth()){
                            JOptionPane.showMessageDialog(null, "No se puede realizar ese movimiento");
                            return false;
                        }
                    }
                    pilar3[i].setLocation(pilar3[i].getX() - 400, (pilar3[i].getY()*0)+180+15*(this.cntDisco+1 - k));
                    pilar1[k]=pilar3[i];
                    pilar3[i] = null;
                    this.movimientos++;

                     return true;
                    

                    }

                }

            }

        }
        return false;
    }


}
