import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class deeposittt extends JFrame implements ActionListener{
    JButton bt6,bt7;
    JTextField depa;
    deeposittt(String pin){
        //this.pin=pin;
        setTitle("Transactions");
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("atm.jpg"));
        Image i2=i1.getImage().getScaledInstance(850,800,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel imglabel=new JLabel(i3);
        imglabel.setBounds(0,0,850,800);
        imglabel.setForeground(Color.WHITE);
        add(imglabel);
        JLabel txt1=new JLabel("Enter Amount to Deposit");
        txt1.setBounds(200,270,300,15);
        txt1.setFont(new Font(getName(),Font.BOLD,15));
        txt1.setForeground(Color.WHITE);
        imglabel.add(txt1);
        depa=new JTextField();
        depa.setBounds(200,300,200,20);
        imglabel.add(depa);
        bt6=new JButton("Deposit");
        bt6.setBounds(367,427,100,20);
        imglabel.add(bt6);
        bt7=new JButton("Back");
        bt7.setBounds(367,454,100,20);
        imglabel.add(bt7);
        bt6.addActionListener(this);
        bt7.addActionListener(this);
        setLayout(null);
        setSize(850,800);
        setLocation(350,10);
        setUndecorated(true);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource()==bt6){
            try{
                Date date=new Date();
                conn C=new conn();
                String amount=depa.getText();
                C.s.executeUpdate("insert into deposit(Amount,Date) values('"+amount+"', '"+date+"')");
                JOptionPane.showMessageDialog(rootPane, "Rs="+amount+" Deposited");
                setVisible(false);
                new transactions("").setVisible(true);
            }catch(Exception e){
                e.printStackTrace();
            }
            
        }
        else if(ae.getSource()==bt7){
            setVisible(false);
            new transactions("").setVisible(true);
        }
    }
    public static void main(String args[]){
        new deeposittt("").setVisible(true);
    }
}