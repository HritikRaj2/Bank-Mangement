import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class transactions extends JFrame implements ActionListener{
    transactions(){
        setTitle("Transactions");
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("atm.jpg"));
        Image i2=i1.getImage().getScaledInstance(850,800,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel imglabel=new JLabel(i3);
        imglabel.setBounds(0,0,850,800);
        imglabel.setForeground(Color.WHITE);
        add(imglabel);
        JLabel txt1=new JLabel("Please Select your Transaction");
        txt1.setBounds(200,270,300,15);
        txt1.setFont(new Font(getName(),Font.BOLD,15));
        txt1.setForeground(Color.WHITE);
        imglabel.add(txt1);
        JButton bt1=new JButton("Deposit");
        bt1.setBounds(150,373,100,20);
        imglabel.add(bt1);
        //add new bt2 here
        setLayout(null);
        setSize(850,800);
        setLocation(350,10);
        setUndecorated(true);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){

    }
    public static void main(String args[]){
        new transactions();
    }
}

