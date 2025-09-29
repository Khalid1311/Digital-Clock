package Digital_Clock;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Clock implements Runnable {
    
    JFrame frame;
    Container C;
    JPanel panel;
    JLabel lb1;
    
    Clock(){
        
        frame = new JFrame("DIgital Clock");
        frame.setSize(400,200);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        
        C = frame.getContentPane();
        C.setBackground(new Color(80, 80, 150));
        C.setLayout(null);
        
        panel = new JPanel();
        panel.setBounds(30,20, 330,120);
        panel.setBackground(null);
        panel.setBorder(BorderFactory.createLineBorder(Color.CYAN, 5));
        panel.setLayout(null);
        
        lb1 = new JLabel();
        lb1.setBounds(35,30,250,50);
        lb1.setFont(new Font("Verdana",Font.BOLD,30));
        lb1.setForeground(Color.CYAN);
        lb1.setHorizontalAlignment(SwingConstants.CENTER);        
        
        
        panel.add(lb1);
        C.add(panel);
        
        Thread thread = new Thread(this);
        thread.start();
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
    public void run(){        
        while(true){
            
            SimpleDateFormat format = new SimpleDateFormat("hh:mm:ss a");
            String Date = format.format(new Date());
            lb1.setText(Date);           

        }        
    }
    
    public static void main(String[] args) {
        new Clock();
    }
}
