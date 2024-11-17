import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class signuptwo extends JFrame implements ActionListener {
    JComboBox<String> relcombo, category, income, education, occupation;
    JTextField panno, aadharno;
    JRadioButton Yes, no;
    JButton next;
    String formno;

    signuptwo(String formno) {
        this.formno = formno;
        setTitle("Additional Details");
        setLayout(null);

        JLabel text1 = new JLabel("Page 2 : Additional details");
        text1.setBounds(350, 45, 470, 100);
        text1.setFont(new Font("Serif", Font.BOLD, 30));
        add(text1);

        JLabel reltxt2 = new JLabel("Religion:");
        reltxt2.setBounds(300, 150, 170, 100);
        reltxt2.setFont(new Font("Serif", Font.PLAIN, 15));
        add(reltxt2);

        String[] rl = { "Hindu", "Muslim", "Sikh", "Others" };
        relcombo = new JComboBox<>(rl);
        relcombo.setBounds(450, 190, 300, 30);
        add(relcombo);

        JLabel cattxt = new JLabel("Category:");
        cattxt.setBounds(300, 190, 170, 100);
        cattxt.setFont(new Font("Serif", Font.PLAIN, 15));
        add(cattxt);

        String[] cat = { "General", "OBC", "SC", "ST", "Other" };
        category = new JComboBox<>(cat);
        category.setBounds(450, 230, 300, 30);
        add(category);

        JLabel inctxt = new JLabel("Income:");
        inctxt.setBounds(300, 230, 170, 100);
        inctxt.setFont(new Font("Serif", Font.PLAIN, 15));
        add(inctxt);

        String[] inc = { "<50000", "50000<100000", "100000<500000", "500000<1000000", "10000000<" };
        income = new JComboBox<>(inc);
        income.setBounds(450, 270, 300, 30);
        add(income);

        JLabel edutxt = new JLabel("<html>Educational<br>Qualification</html>");
        edutxt.setBounds(300, 270, 170, 100);
        edutxt.setFont(new Font("Serif", Font.PLAIN, 15));
        add(edutxt);

        String[] edu = { "Senior Secondary", "Graduated", "Masters", "PhD" };
        education = new JComboBox<>(edu);
        education.setBounds(450, 310, 300, 30);
        add(education);

        JLabel octxt = new JLabel("Occupation");
        octxt.setBounds(300, 310, 170, 100);
        octxt.setFont(new Font("Serif", Font.PLAIN, 15));
        add(octxt);

        String[] occ = { 
            "Engineer", "Doctor", "Teacher", "Lawyer", "Architect", "Software Developer", 
            "Data Scientist", "Mechanical Engineer", "Civil Engineer", "Graphic Designer", 
            "Content Writer", "Digital Marketer", "Accountant", "Financial Analyst", 
            "Nurse", "Pharmacist", "Electrician", "Plumber", "Pilot", "Chef", "Musician", 
            "Actor", "Journalist", "Photographer", "Entrepreneur", "Scientist", "Researcher", 
            "Social Worker", "Police Officer", "Firefighter" 
        };
        occupation = new JComboBox<>(occ);
        occupation.setBounds(450, 350, 300, 30);
        add(occupation);

        JLabel pntxt = new JLabel("PAN Number:");
        pntxt.setBounds(300, 350, 170, 100);
        pntxt.setFont(new Font("Serif", Font.PLAIN, 15));
        add(pntxt);

        panno = new JTextField();
        panno.setBounds(450, 390, 300, 30);
        add(panno);

        JLabel adhtxt = new JLabel("Aadhar Number:");
        adhtxt.setBounds(300, 390, 170, 100);
        adhtxt.setFont(new Font("Serif", Font.PLAIN, 15));
        add(adhtxt);

        aadharno = new JTextField();
        aadharno.setBounds(450, 430, 300, 30);
        add(aadharno);

        JLabel sitxt = new JLabel("Senior Citizen:");
        sitxt.setBounds(300, 430, 170, 100);
        sitxt.setFont(new Font("Serif", Font.PLAIN, 15));
        add(sitxt);

        Yes = new JRadioButton("Yes");
        Yes.setBounds(450, 470, 100, 30);
        add(Yes);

        no = new JRadioButton("No");
        no.setBounds(600, 470, 300, 30);
        add(no);

        ButtonGroup seniorcitizen = new ButtonGroup();
        seniorcitizen.add(Yes);
        seniorcitizen.add(no);

        next = new JButton("Next");
        next.setBounds(560, 610, 150, 25);
        add(next);
        next.addActionListener(this);

        setSize(850, 800);
        setLocation(350, 10);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        String sreligion = (String) relcombo.getSelectedItem();
        String scategory = (String) category.getSelectedItem();
        String sincome = (String) income.getSelectedItem();
        String seducation = (String) education.getSelectedItem();
        String soccupation = (String) occupation.getSelectedItem();
        String spanno = panno.getText();
        String saadharno = aadharno.getText();
        String ssenior = null;
        if (Yes.isSelected()) {
            ssenior = "Yes";
        } else if (no.isSelected()) {
            ssenior = "No";
        }

        try {
            if (sreligion.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please Fill Religion");
            } else if (scategory.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please Select Category");
            } else if (sincome.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please Fill Income");
            } else if (seducation.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Fill Qualification");
            } else if (soccupation.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Fill the Occupation");
            } else if (spanno.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Enter the PAN No");
            } else if (saadharno.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Fill Aadhar No");
            } else if (ssenior == null) {
                JOptionPane.showMessageDialog(null, "Select Yes or No for Senior Citizen");
            } else {
                conn c = new conn();
                String query = "INSERT INTO signuptwo(appno, Religion, Catagory, Income, Qualifiaction, Occupation, PanNo, AadharNo, SeniorCitizen) VALUES ('"
                        + formno + "', '" + sreligion + "', '" + scategory + "', '" + sincome + "', '" + seducation + "', '" + soccupation + "', '"
                        + spanno + "', '" + saadharno + "', '" + ssenior + "')";
                c.s.executeUpdate(query);
                setVisible(false);
                new signupthree(formno).setVisible(true);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String args[]) {
        new signuptwo("");
    }
}
