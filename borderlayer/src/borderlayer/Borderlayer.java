package borderlayer;
import java.awt.*;
import javax.swing.*;
public class Borderlayer {
JFrame f;
Borderlayer(){
f = new JFrame();
//Creating Buttons.
JButton  b1= new JButton ("North");
JButton b2 = new JButton ("South");
JButton b3 = new JButton ("EAST");
JButton b4 = new JButton ("WEST");
JButton b5 = new JButton ("CENTER");
f.add(b1, BorderLayout.NORTH);
f.add(b2,BorderLayout.SOUTH);
f.add(b3,BorderLayout.EAST);
f.add(b4,BorderLayout.WEST);
f.add(b5,BorderLayout.CENTER);

f.setSize(300,300);
f.setVisible(true);
}
    public static void main(String[] args) {
        // TODO code application logic here
        new Borderlayer();
    }
    
}
