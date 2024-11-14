import java.awt.Font;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class signuptwo extends JFrame{
    signuptwo(){
        setTitle("Addition Details");
        setLayout(null);
        JLabel text1=new JLabel("Page 2 : Additional details");
        text1.setBounds(350, 45, 470, 100);
        text1.setFont(new Font(getName(),ABORT,30));
        add(text1);
        JLabel reltxt2=new JLabel("Religion:");
        reltxt2.setBounds(300, 150, 170, 100);
        reltxt2.setFont(new Font(getName(),ABORT,15));
        add(reltxt2);
        String rl[]={"Hindu","Muslim","Sikh","others"};
        JComboBox relcombo=new JComboBox<>(rl);
        relcombo.setBounds(450, 190, 300, 30);
        add(relcombo);
        JLabel cattxt=new JLabel("Category:");
        cattxt.setBounds(300, 190, 170, 100);
        cattxt.setFont(new Font(getName(),ABORT,15));
        add(cattxt);
        String cat[]={"General","OBC","SC","ST","Other"};
        JComboBox category=new JComboBox<>(cat);
        category.setBounds(450, 230, 300, 30);
        add(category);
        JLabel inctxt=new JLabel("Income:");
        inctxt.setBounds(300, 230, 170, 100);
        inctxt.setFont(new Font(getName(),ABORT,15));
        add(inctxt);
        String inc[]={"<50000","50000<100000","100000<500000","500000<1000000","10000000<"};
        JComboBox income=new JComboBox<>(inc);
        income.setBounds(450,270,300,30);
        add(income);

        setSize(850, 800);
        setLocation(350, 10);
        setVisible(true);

    }
    public static void main(String args[]){
        new signuptwo();
    }
}
