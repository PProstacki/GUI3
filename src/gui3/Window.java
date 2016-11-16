package gui3;

import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Window extends JFrame{
    Random random = new Random();
    JButton bFugitive;
    
    Window() {
        setTitle("Wielka ucieczka guzika");
        setSize(500, 500);
        setLocation(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setResizable(false);
        
        bFugitive = new JButton("Kliknij mnie");
        bFugitive.setLocation(random.nextInt(getBounds().x - bFugitive.getWidth()), random.nextInt(getBounds().y - bFugitive.getHeight()));
        bFugitive.setSize(100, 25);
        bFugitive.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                bFugitive.setLocation(random.nextInt(getBounds().x - bFugitive.getWidth()), random.nextInt(getBounds().y - bFugitive.getHeight()));
            }
        });
        add(bFugitive);
                
    }
    
    
    
    
}
