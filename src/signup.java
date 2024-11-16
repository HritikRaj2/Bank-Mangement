import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class signup extends JFrame implements ActionListener {
    JTextField usernamebox, fnametxt, emailtxt, addtxt, citytxt, statxt, pinctxt;
    JRadioButton married, single, male, female;
    JButton bnext;
    Long random;

    signup() {
        setTitle("Signup");
        setLayout(null);
        JLabel logintext = new JLabel("Signup");
        logintext.setBounds(350, 45, 170, 100);
        logintext.setFont(new Font(getName(), ABORT, 50));
        add(logintext);
        Random ran=new Random();
        random=Math.abs((ran.nextLong()%9000L)+1000L);

        JLabel appli = new JLabel("Application Form no:"+ random);
        appli.setBounds(350, 95, 300, 100);
        appli.setFont(new Font(getName(), ABORT, 25));
        add(appli);
        JLabel usernm = new JLabel("NAME:");
        usernm.setBounds(300, 150, 170, 100);
        usernm.setFont(new Font(getName(), ABORT, 15));
        add(usernm);
        usernamebox = new JTextField("Username");
        usernamebox.setBounds(450, 190, 300, 30);
        add(usernamebox);
        JLabel fname = new JLabel("Father's Name:");
        fname.setBounds(300, 190, 170, 100);
        fname.setFont(new Font(getName(), ABORT, 15));
        add(fname);
        fnametxt = new JTextField();
        fnametxt.setBounds(450, 230, 300, 30);
        add(fnametxt);
        JLabel dob = new JLabel("Date Of Birth:");
        dob.setBounds(300, 230, 170, 100);
        dob.setFont(new Font(getName(), ABORT, 15));
        add(dob);
        // JDateChooser datech=new JDateChooser();
        JLabel gender = new JLabel("Gender:");
        gender.setBounds(300, 270, 170, 100);
        gender.setFont(new Font(getName(), ABORT, 15));
        add(gender);
        male = new JRadioButton("MALE");
        male.setBounds(450, 310, 100, 30);
        add(male);
        female = new JRadioButton("FEMALE");
        female.setBounds(600, 310, 100, 30);
        add(female);
        ButtonGroup gendergrp = new ButtonGroup();
        gendergrp.add(male);
        gendergrp.add(female);
        JLabel emailnm = new JLabel("Email Address:");
        emailnm.setBounds(300, 310, 170, 100);
        emailnm.setFont(new Font(getName(), ABORT, 15));
        add(emailnm);
        emailtxt = new JTextField();
        emailtxt.setBounds(450, 350, 300, 30);
        add(emailtxt);
        JLabel mrs = new JLabel("Marital Status:");
        mrs.setBounds(300, 350, 170, 100);
        mrs.setFont(new Font(getName(), ABORT, 15));
        add(mrs);
        single = new JRadioButton("SINGLE");
        single.setBounds(450, 390, 100, 30);
        add(single);
        married = new JRadioButton("Married");
        married.setBounds(600, 390, 100, 30);
        add(married);
        ButtonGroup mar = new ButtonGroup();
        mar.add(single);
        mar.add(married);
        JLabel addr = new JLabel("Address:");
        addr.setBounds(300, 390, 170, 100);
        addr.setFont(new Font(getName(), ABORT, 15));
        add(addr);
        addtxt = new JTextField();
        addtxt.setBounds(450, 430, 300, 30);
        add(addtxt);
        JLabel city = new JLabel("City:");
        city.setBounds(300, 430, 170, 100);
        city.setFont(new Font(getName(), ABORT, 15));
        add(city);
        citytxt = new JTextField();
        citytxt.setBounds(450, 470, 300, 30);
        add(citytxt);
        JLabel sta = new JLabel("State:");
        sta.setBounds(300, 470, 170, 100);
        sta.setFont(new Font(getName(), ABORT, 15));
        add(sta);
        statxt = new JTextField();
        statxt.setBounds(450, 510, 300, 30);
        add(statxt);
        JLabel pinc = new JLabel("Pin:");
        pinc.setBounds(300, 510, 170, 100);
        pinc.setFont(new Font(getName(), ABORT, 15));
        add(pinc);
        pinctxt = new JTextField();
        pinctxt.setBounds(450, 550, 300, 30);
        add(pinctxt);
        bnext = new JButton("Next");
        bnext.setBounds(500, 650, 150, 25);
        bnext.addActionListener(this);
        add(bnext);
        setSize(850, 800);
        setLocation(350, 10);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        String fathername = fnametxt.getText();
        String name = usernamebox.getText();
        String email = emailtxt.getText();
        String address = addtxt.getText();
        String city = citytxt.getText();
        String pin = pinctxt.getText();
        String randomStr = String.valueOf(random);
        String gender = null;
        if (male.isSelected()) {
            gender = "Male";
        } else if (female.isSelected()) {
            gender = "Female";
        }
        String marital = null;
        if (single.isSelected()) {
            marital = "Single";
        } else if (married.isSelected()) {
            marital = "Married";
        }
        bnext.addActionListener(this);
        try {
            if (name.equals("")) {
                JOptionPane.showMessageDialog(null, "Name is Required");
            } else {
                conn c = new conn();
                // String query="insert into signup
                // values('"+usernamebox+"','"+fnametxt+"','"+emailtxt+"','"+addtxt+"','"+pinctxt+"','"+statxt+"')";
                String query = "INSERT INTO login (appno,usernamebox, fnametxt, emailtxt, addtxt, citytxt, statxt, pinctxt, married, single) VALUES ('"
                        + randomStr +"','"
                        + name + "', '"
                        + fathername + "', '"
                        + email + "', '"
                        + address + "', '"
                        + city + "', '"
                        + statxt.getText() + "', '"
                        + pin + "', '"
                        + marital + "', '"
                        + gender + "')";
                c.s.executeUpdate(query);
                setVisible(false);
                new signuptwo(randomStr).setVisible(true);
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String args[]) {
        new signup();
    }
}
