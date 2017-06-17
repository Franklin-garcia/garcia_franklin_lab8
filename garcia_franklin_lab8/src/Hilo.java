
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Franklin Garcia
 */
public class Hilo extends Thread {

    private JLabel hora;

    public Hilo(JLabel hora) {
        this.hora = hora;
    }

    @Override
    public void run() {
       int min=0;
       int seg=0;
        while (true) {
            while(seg<60){
                if (seg==59) {
                     min++;
                     seg=0;
                     hora.setText("MIN:"+seg+"SEG:"+min); 
                }
                seg++;
            }
                        
            try {
                Thread.sleep(999999999);
            } catch (InterruptedException e) {
            }
        }
    }
}
