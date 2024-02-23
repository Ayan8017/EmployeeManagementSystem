package employee.management.system;
import com.mysql.cj.protocol.Resultset;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.Statement;

public class Login extends JFrame implements ActionListener{
   JTextField tusersame;
   JPasswordField tpassword;

   JButton login,back;
    Login(){

        JLabel  username= new JLabel("Username");
        username.setBounds(40,20,100,30);
        add(username);
        //print text on frame

        tusersame=new JTextField();
        tusersame.setBounds(150,20,150,30);
        add(tusersame);

        JLabel  password= new JLabel("Password");
        password.setBounds(40,70,100,30);
        add(password);

        tpassword=new JPasswordField();
        tpassword.setBounds(150,70,150,30);
        add(tpassword);

        login=new JButton("LOGIN");
        login.setBounds(150,140,150,30);
        login.setBackground(Color.black);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);

        back=new JButton("Back");
        back.setBounds(150,180,150,30);
        back.setBackground(Color.black);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);



        ImageIcon I11=new ImageIcon(ClassLoader.getSystemResource("icon/second.jpg"));
        Image I22=I11.getImage().getScaledInstance(600,400,Image.SCALE_DEFAULT);
        ImageIcon I33=new ImageIcon(I22);
        JLabel imgg=new JLabel(I33);
        imgg.setBounds(350,10,600,400);
        add(imgg);

        ImageIcon I1=new ImageIcon(ClassLoader.getSystemResource("icon/LoginB.jpg"));
        Image I2=I1.getImage().getScaledInstance(600,300,Image.SCALE_DEFAULT);
        ImageIcon I3=new ImageIcon(I2);
        JLabel img=new JLabel(I3);
        img.setBounds(0,0,600,300);
        add(img);

        setSize(600,300);
        setLocation(450,200);
        setLayout(null);// Call setLayout on the instance, not on the class
        setVisible(true);


    }
@Override
public void actionPerformed(ActionEvent e){
    if (e.getSource()==login){

        try{
           String username= tusersame.getText();
           String password= tpassword.getText();
            conn conn;
            conn = new conn();
            String query = "SELECT * FROM login WHERE username = '"+ username +"' and password = '"+password+"'";
            ResultSet resultSet = conn.statement.executeQuery(query);

            if(resultSet.next()){
                setVisible(false);

                new Main_class();

            }

            else{
                JOptionPane.showMessageDialog(null,"Invalid username or password");
            }

        }
        catch(Exception E){
            E.printStackTrace();
        }

    } else if (e.getSource()==back) {
        System.exit(90);

    }

}
    public static void main(String[] args){
        new Login();
    }
}
