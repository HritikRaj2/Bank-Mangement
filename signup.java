import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.*;
public class signup extends JFrame{
    signup(){
        setTitle("Signup");
        setLayout(null);
        JLabel logintext=new JLabel("Signup");
        logintext.setBounds(350,45,170,100);
        logintext.setFont(new Font(getName(),ABORT,50));
        add(logintext);
        JLabel appli=new JLabel("Application Form");
        appli.setBounds(350,95,250,100);
        appli.setFont(new Font(getName(),ABORT,25));
        add(appli);
        JLabel usernm=new JLabel("NAME:");
        usernm.setBounds(300,150,170,100);
        usernm.setFont(new Font(getName(),ABORT,15));
        add(usernm);
        JTextField usernamebox =new JTextField("Username");
        usernamebox.setBounds(450,190,300,30);
        add(usernamebox);
        JLabel fname=new JLabel("Father's Name:");
        fname.setBounds(300, 190, 170, 100);
        fname.setFont(new Font(getName(),ABORT,15));
        add(fname);
        JTextField fnametxt=new JTextField();
        fnametxt.setBounds(450,230,300,30);
        add(fnametxt); 
        JLabel dob=new JLabel("Date Of Birth:");
        dob.setBounds(300,230,170,100);
        dob.setFont(new Font(getName(),ABORT,15));
        add(dob);
        JLabel gender=new JLabel("Gender:");
        gender.setBounds(300,270,170,100);
        gender.setFont(new Font(getName(),ABORT,15));
        add(gender);
        JLabel emailnm=new JLabel("Email Address:");
        emailnm.setBounds(300,310,170,100);
        emailnm.setFont(new Font(getName(),ABORT,15));
        add(emailnm);
        JTextField emailtxt=new JTextField();
        emailtxt.setBounds(450,350,300,30);
        add(emailtxt);
        JLabel mrs=new JLabel("Marital Status:");
        mrs.setBounds(300,350,170,100);
        mrs.setFont(new Font(getName(),ABORT,15));
        add(mrs);
        JLabel addr=new JLabel("Address:");
        addr.setBounds(300,390,170,100);
        addr.setFont(new Font(getName(),ABORT,15));
        add(addr);
        JTextField addtxt=new JTextField();
        addtxt.setBounds(450, 430, 300, 30);
        add(addtxt);
        JLabel city=new JLabel("City:");
        city.setBounds(300,430,170,100);
        city.setFont(new Font(getName(),ABORT,15));
        add(city);
        JTextField citytxt=new JTextField();
        citytxt.setBounds(450,470,300,30);
        add(citytxt);
        JLabel sta=new JLabel("State:");
        sta.setBounds(300,470,170,100);
        sta.setFont(new Font(getName(),ABORT,15));
        add(sta);
        JTextField statxt=new JTextField();
        statxt.setBounds(450, 510, 300, 30);
        add(statxt);
        JLabel pinc=new JLabel("Pin:");
        pinc.setBounds(300,510,170,100);
        pinc.setFont(new Font(getName(),ABORT,15));
        add(pinc);
        JTextField pinctxt=new JTextField();
        pinctxt.setBounds(450, 550, 300, 30);
        add(pinctxt);
        JButton bnext=new JButton("Next");
        bnext.setBounds(500, 650, 150, 25);
        add(bnext);
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
    }
    public static void main(String args[]){
        new signup();
    }
}