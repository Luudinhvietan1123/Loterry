/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Thread;

import static java.time.Instant.now;
import java.util.Date;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;

/**
 *
 * @author Dell
 */
public class LotteryThread extends Thread{
    private JTextField textField;

    public LotteryThread(JTextField textField) {
        this.textField = textField;
    }
    
    
    public void run(){
        Date now = new Date();
        Random random = new Random(now.getTime());
        for(int i = 0; i < 1000; i++){
            int randomNumber = random.nextInt(10);
            
            textField.setText(randomNumber + "");
            
            try {
                Thread.sleep(20);
            } catch (InterruptedException ex) {}
        }
    }
}
