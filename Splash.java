package employee.management.system;
import javax.swing.*;
import java.awt.*;
public class Splash extends JFrame {

    Splash(){

        ImageIcon I1=new ImageIcon(ClassLoader.getSystemResource("icon/front.gif"));
        Image I2=I1.getImage().getScaledInstance(1170,650, Image.SCALE_DEFAULT);
        ImageIcon I3= new ImageIcon(I2);
        JLabel image=new JLabel(I3);
        image.setBounds(0, 0, 1170,650);
        add(image);

        setSize(1170, 650);  // Call setSize on the instance, not on the class
        setLocation(200,50);
        setLayout(null);// Call setLayout on the instance, not on the class
        setVisible(true);

        try{
            Thread.sleep(5000);
            setVisible(false);
            new Login();

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Splash();
    }
}

