import java.awt.Font;
import java.awt.event.ActionEvent;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class signupthree extends JFrame {
    String formno;
    signupthree(String formno){
        this.formno=formno;
        setLayout(null);
        setTitle("Signup page:3");
        JLabel heading=new JLabel("Additional Details:3"+" Form no:"+formno);
        heading.setBounds(300, 45, 470, 100);
        heading.setFont(new Font(getName(),Font.BOLD,30));
        add(heading);
        JLabel subh1=new JLabel("ACCOUNT TYPE");
        subh1.setBounds(170,100,300,100);
        subh1.setFont(new Font(getName(),ABORT,25));
        add(subh1);
        JRadioButton rb1=new JRadioButton("Saving Account");
        rb1.setBounds(180,180,300,15);
        add(rb1);
        JRadioButton rb2=new JRadioButton("Fixed Deposit Account");
        rb2.setBounds(500,180, 300,15);
        add(rb2);
        JRadioButton rb3=new JRadioButton("Current Account");
        rb3.setBounds(180,220,300,15);
        add(rb3);
        JRadioButton rb4=new JRadioButton("Recurring Deposit Account");
        rb4.setBounds(500,220,300,15);
        add(rb4);
        ButtonGroup allrb=new ButtonGroup();
        allrb.add(rb1);
        allrb.add(rb2);
        allrb.add(rb3);
        allrb.add(rb4);
        JLabel sub2=new JLabel("CARD NUMBER");
        sub2.setBounds(170,230,300,100);
        sub2.setFont(new Font(getName(),ABORT,25));
        add(sub2);
        JLabel sub2sub=new JLabel("Your 16 Digit Card Number");
        sub2sub.setBounds(180,250,400,100);
        sub2sub.setFont(new Font(getName(),ABORT,10));
        add(sub2sub);
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);

    }
    public void actionPerformed(ActionEvent ae){

    }
    public static void main(String args[]){
        new signupthree(" ");
    }
}