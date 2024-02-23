package employee.management.system;


import javax.swing.*;
import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main_class extends JFrame {


    Main_class(){
        ImageIcon I1=new ImageIcon(ClassLoader.getSystemResource("icon/home.jpg"));
        Image I2=I1.getImage().getScaledInstance(1120,630, Image.SCALE_DEFAULT);
        ImageIcon I3=new ImageIcon(I2);
        JLabel img=new JLabel(I3);
        img.setBounds(0,0,1120,630);
        add(img);

        JLabel heading=new JLabel("Employee Management System");
        heading.setBounds(340,155,400,40);
        heading.setFont(new Font("Raleway",Font.BOLD,25));
        img.add(heading);

        JButton add= new JButton("ADD Employee");
        add.setBounds(335,270,150,40);
        add.setForeground(Color.WHITE);
        add.setBackground(Color.black);
        img.add(add);
        add.addActionListener(new ActionListener(){
            @Override
                    public void actionPerformed(ActionEvent e){
                new AddEmployee();
                setVisible(false);

            }
         });




        JButton view= new JButton("VIEW Employee");
        view.setBounds(565,270,150,40);
        view.setForeground(Color.WHITE);
        view.setBackground(Color.black);
        img.add(view);
        view.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                new View_Employee();
                setVisible(false);
            }
        });

        JButton rem= new JButton("REMOVE Employee");
        rem.setBounds(440,370,150,40);
        rem.setForeground(Color.WHITE);
        rem.setBackground(Color.black);
        img.add(rem);
        rem.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                new RemoveEmployee();
                setVisible(false);

            }
        });

        setSize(1120,630);
        setLocation(250,100);;
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args){
        new Main_class();
    }
}
