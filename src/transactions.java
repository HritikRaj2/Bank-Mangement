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
    JButton bt1,bt2,bt3,bt4,bt5,bt6,bt7;
    transactions(String pin){
        //this.pin=pin;
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
        bt1=new JButton("Deposit");
        bt1.setBounds(150,373,100,20);
        imglabel.add(bt1);
        bt2=new JButton("Fast Cash");
        bt2.setBounds(150,400,100,20);
        imglabel.add(bt2);
        bt3=new JButton("Pin Change");
        bt3.setBounds(150,427,100,20);
        imglabel.add(bt3);
        bt4=new JButton("Cash Withdrawl");
        bt4.setBounds(367,373,100,20);
        imglabel.add(bt4);
        bt5=new JButton("Mini Statement");
        bt5.setBounds(367,400,100,20);
        imglabel.add(bt5);
        bt6=new JButton("Balance Enquiry");
        bt6.setBounds(367,427,100,20);
        imglabel.add(bt6);
        bt7=new JButton("Exit");
        bt7.setBounds(367,454,100,20);
        imglabel.add(bt7);
        bt1.addActionListener(this);
        bt2.addActionListener(this);
        bt3.addActionListener(this);
        bt4.addActionListener(this);
        bt5.addActionListener(this);
        bt6.addActionListener(this);
        bt7.addActionListener(this);
        setLayout(null);
        setSize(850,800);
        setLocation(350,10);
        setUndecorated(true);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        try{
            if(ae.getSource()==bt1){
                setVisible(false);
                new deeposittt("").setVisible(true);
            }
            else if(ae.getSource()==bt2){

            }
        }catch(Exception e){

        }

    }
    public static void main(String args[]){
        new transactions("");
    }
}