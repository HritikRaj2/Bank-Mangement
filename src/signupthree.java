import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Random;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class signupthree extends JFrame implements ActionListener {
    String formno;
    JButton bt1, bt2;
    JCheckBox ch1, ch2, ch3, ch4, ch5, ch6, chf;
    JRadioButton rb1, rb2, rb3, rb4;
    ButtonGroup allrb;

    signupthree(String formno) {
        this.formno = formno;
        setLayout(null);
        setTitle("Signup page:3");
        JLabel heading = new JLabel("Additional Details:3" + " Form no:" + formno);
        heading.setBounds(300, 45, 470, 100);
        heading.setFont(new Font(getName(), Font.BOLD, 30));
        add(heading);
        JLabel subh1 = new JLabel("ACCOUNT TYPE");
        subh1.setBounds(170, 100, 300, 100);
        subh1.setFont(new Font(getName(), ABORT, 25));
        add(subh1);
        JRadioButton rb1 = new JRadioButton("Saving Account");
        rb1.setBounds(180, 180, 300, 15);
        add(rb1);
        JRadioButton rb2 = new JRadioButton("Fixed Deposit Account");
        rb2.setBounds(500, 180, 300, 15);
        add(rb2);
        JRadioButton rb3 = new JRadioButton("Current Account");
        rb3.setBounds(180, 220, 300, 15);
        add(rb3);
        JRadioButton rb4 = new JRadioButton("Recurring Deposit Account");
        rb4.setBounds(500, 220, 300, 15);
        add(rb4);
        ButtonGroup allrb = new ButtonGroup();
        allrb.add(rb1);
        allrb.add(rb2);
        allrb.add(rb3);
        allrb.add(rb4);
        JLabel sub2 = new JLabel("CARD NUMBER");
        sub2.setBounds(170, 230, 300, 100);
        sub2.setFont(new Font(getName(), ABORT, 25));
        add(sub2);
        JLabel sub2sub = new JLabel("Your 16 Digit Card Number");
        sub2sub.setBounds(180, 250, 400, 100);
        sub2sub.setFont(new Font(getName(), ABORT, 10));
        add(sub2sub);
        JLabel subcard = new JLabel("XXXX-XXXX-2893");
        subcard.setBounds(500, 230, 400, 100);
        subcard.setFont(new Font(getName(), ABORT, 25));
        add(subcard);
        JLabel sub3 = new JLabel("PIN:");
        sub3.setBounds(170, 285, 400, 100);
        sub3.setFont(new Font(getName(), ABORT, 25));
        add(sub3);
        JLabel sub3sub = new JLabel("Your 4 Digit pin");
        sub3sub.setBounds(180, 310, 400, 100);
        sub3sub.setFont(new Font(getName(), ABORT, 10));
        add(sub3sub);
        JLabel subpin = new JLabel("XXXX");
        subpin.setBounds(500, 290, 400, 100);
        subpin.setFont(new Font(getName(), ABORT, 25));
        add(subpin);
        JLabel sub4 = new JLabel("Services Required:");
        sub4.setBounds(170, 340, 400, 100);
        sub4.setFont(new Font(getName(), ABORT, 25));
        add(sub4);
        JCheckBox ch1 = new JCheckBox("ATM CARD");
        ch1.setBounds(180, 420, 200, 50);
        add(ch1);
        JCheckBox ch2 = new JCheckBox("Internet Banking");
        ch2.setBounds(500, 420, 200, 50);
        add(ch2);
        JCheckBox ch3 = new JCheckBox("Mobile Banking");
        ch3.setBounds(180, 480, 200, 50);
        add(ch3);
        JCheckBox ch4 = new JCheckBox("EMAIL & SMS Alerts");
        ch4.setBounds(500, 480, 200, 50);
        add(ch4);
        JCheckBox ch5 = new JCheckBox("Cheque Book");
        ch5.setBounds(180, 540, 200, 50);
        add(ch5);
        JCheckBox ch6 = new JCheckBox("E-Statement");
        ch6.setBounds(500, 540, 200, 50);
        add(ch6);
        JCheckBox chf = new JCheckBox(
                "I hereby declares that the above entered details are correct to the best of my knowledge");
        chf.setBounds(160, 640, 600, 30);
        chf.setFont(new Font(getName(), ABORT, 10));
        add(chf);
        JButton bt1 = new JButton("Submit");
        bt1.setBounds(230, 680, 100, 20);
        add(bt1);
        bt1.addActionListener(this);
        JButton bt2 = new JButton("Cancel");
        bt2.setBounds(590, 680, 100, 20);
        add(bt2);
        bt2.addActionListener(this);
        setSize(850, 800);
        setLocation(350, 10);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {
        String saccounttype = null;
        if (rb1.isSelected()) {
            saccounttype = "Savings Account";
        } else if (rb2.isSelected()) {
            saccounttype = "Fixed Deposit Account";
        } else if (rb3.isSelected()) {
            saccounttype = "Current Account";
        } else if (rb4.isSelected()) {
            saccounttype = "Recurring Deposit Account";
        }

        Random ran = new Random();
        long firstran = Math.abs((ran.nextLong() % 900000L) + 100000L);
        String cardno = "" + firstran;
        long secondran = Math.abs((ran.nextLong() % 9000L) + 12300L);
        String pin = "" + secondran;

        String pref = "";
        String Atm = "No", internetbanking = "No", mobilebanking = "No", emailandsms = "No", chequebook = "No",
                estatement = "No";

        // Process checkboxes
        if (ch1.isSelected()) {
            pref += " ATM Card";
            Atm = "Yes";
        }
        if (ch2.isSelected()) {
            pref += " Internet Banking";
            internetbanking = "Yes";
        }
        if (ch3.isSelected()) {
            pref += " Mobile Banking";
            mobilebanking = "Yes";
        }
        if (ch4.isSelected()) {
            pref += " Email and SMS Alert";
            emailandsms = "Yes";
        }
        if (ch5.isSelected()) {
            pref += " Cheque Book";
            chequebook = "Yes";
        }
        if (ch6.isSelected()) {
            pref += " E-Statement";
            estatement = "Yes";
        }

        try {
            if (ae.getSource() == bt1) {
                if (saccounttype == null || saccounttype.isEmpty()) {
                    JOptionPane.showMessageDialog(rootPane, "Please fill all the details");
                } else {
                    conn c = new conn();
                    Connection con=c.getConnection();
                    String query = "INSERT INTO signupthree(Formno,Pref,Atm,InternetBanking,MobileBanking,Emails,chequeBook,EStatement) VALUES('"
                            + formno + "','" + pref + "','" + Atm + "','" + internetbanking + "','" + mobilebanking
                            + "','" + emailandsms + "','" + chequebook + "','" + estatement + "')";
                    String query2 = "INSERT INTO importantinfo(CardNo,Pin) VALUES('" + cardno + "','" + pin + "')";
                    try (PreparedStatement pstmt1 = con.prepareStatement(query);
                            PreparedStatement pstmt2 = con.prepareStatement(query2)) {

                        pstmt1.setString(1, formno);
                        pstmt1.setString(2, pref);
                        pstmt1.setString(3, Atm);
                        pstmt1.setString(4, internetbanking);
                        pstmt1.setString(5, mobilebanking);
                        pstmt1.setString(6, emailandsms);
                        pstmt1.setString(7, chequebook);
                        pstmt1.setString(8, estatement);

                        pstmt2.setString(1, cardno);
                        pstmt2.setString(2, pin);

                        pstmt1.executeUpdate();
                        pstmt2.executeUpdate();

                        JOptionPane.showMessageDialog(rootPane, "CardNo=" + cardno + "\nPin=" + pin);
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(rootPane, "Database Error: " + e.getMessage());
                    }
                    // c.s.executeUpdate(query);
                    // c.s.executeUpdate(query2);
                    // JOptionPane.showMessageDialog(rootPane, "CardNo=" + cardno + "\nPin=" + pin);
                }
            } else if (ae.getSource() == bt2) {
                System.exit(0);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(rootPane, "Database Error: " + e.getMessage());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "An unexpected error occurred: " + e.getMessage());
        }
    }

    public static void main(String args[]) {
        new signupthree(" ");
    }
}