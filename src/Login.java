//package bank.management.system;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
public class Login extends JFrame implements ActionListener{
    JButton login,Signup,forget;
    JTextField cardnotext,pintext;
    Login(){
        
        setTitle("ATM");
        setLayout(null);
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("bank-icon-png_239804.jpg"));
        Image i2=i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel label=new JLabel(i3);
        label.setBounds(70, 10, 100, 100);
        add(label);
        JLabel text=new JLabel("Welcome to ATM");
        text.setBounds(200, -40, 400, 200);
        text.setFont(new Font(getName(), ABORT,50));
        add(text);
        JLabel cardno=new JLabel("Card NO:");
        cardno.setBounds(150, 70, 300, 150);
        cardno.setFont(new Font(getName(),ABORT,20));
        add(cardno);
        cardnotext=new JTextField();
        cardnotext.setBounds(300, 130, 300, 25);
        add(cardnotext);
        JLabel pin=new JLabel("PIN:");
        pin.setBounds(150, 100, 300, 150);
        pin.setFont(new Font(getName(), ABORT,20));
        add(pin);
        pintext=new JTextField();
        pintext.setBounds(300,165, 300, 25);
        add(pintext);
        login=new JButton("Login");
        login.setBounds(350,195,150,25);
        add(login);
        login.addActionListener(this);
        Signup=new JButton("SIGNUP");
        Signup.setBounds(250,225,150,25);
        add(Signup);
        Signup.addActionListener(this);
        forget=new JButton("FORGET");
        forget.setBounds(450,225,150,25);
        add(forget);
        forget.addActionListener(this);
        setSize(800,480);
        setVisible(true);
        setLocation(350,200);
    }
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource()==login){
            
        }
        else if( ae.getSource()==Signup){
            new signup();
        }
        else if(ae.getSource()==forget){

        }
    }
    public static void main(String args[]){
        new Login();
    }
}
