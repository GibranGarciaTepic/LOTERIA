import static java.lang.Thread.sleep;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gg1br
 */
public class HiloP extends Thread {
    VentanaP puntero;
    HiloP(VentanaP p) {
        puntero = p;
        
    }
    private boolean mantieneCiclo = true;
    private boolean ejecutaCodigo = true;   
        public void run() {
            Icon icono;
            while(mantieneCiclo){

        if(ejecutaCodigo){
                
             
       
       for(int i = 1; i < 51; i++){
          puntero.jLabel1.setIcon(new ImageIcon ("src/iconos/"+(i)+".png"));
          
          
          try {
               Thread.sleep(5000);
           } catch (Exception e) {
           }
        
                   
       }
       
        }    
            
        }
         
        
       
        
    }

    

    
    } 
        
      
        
        
    
            
   

      
        