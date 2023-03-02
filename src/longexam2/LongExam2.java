package longexam2;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JComboBox;

public class LongExam2 {

    public static void main(String[] args) {
        // TODO code application logic here
        JFrame f = new JFrame("Longexam2");
        JMenu menu;
        JMenuItem il, i2;

        JMenuBar mb = new JMenuBar();
        menu= new JMenu("File");

        il = new JMenuItem("Menu 1");

        i2 = new JMenuItem("Menu 2");
        menu.add(il);

        menu.add(i2);

        mb.add (menu);

        JMenu menu1;
        JMenuItem i3;
        menu1 = new JMenu("Edit");
        i3= new JMenuItem("Edit 1");
        menu1.add(i3);

        mb.add(menu1);
        
        JMenu menu2;
        menu2 = new JMenu("Delete");
        mb.add (menu2);

        f.setJMenuBar (mb);
// NAME LABEL

        JTextField user = new JTextField();
        user.setBounds (120, 75, 100, 30);
        JLabel label = new JLabel("Name: ");
        label.setBounds (20, 75, 100, 30);
        f.add(user);
        f.add(label);
        //GENDER LABEL
        JLabel lab = new JLabel ("Gender: "); 
        lab.setBounds (20, 100, 100, 30);
        f.add(lab);
        //GENDER BUTTON
        JRadioButton r1 = new JRadioButton("Male");
        JRadioButton r2 = new JRadioButton("Female");

        r1.setBounds (120, 100, 100, 30);
        r2.setBounds (120, 130, 100, 30);
        ButtonGroup bg = new ButtonGroup ();
        bg.add(r1);
        bg.add(r2);
        f.add(r1);
        f.add(r2);
        JLabel lab1 = new JLabel("code. po. :"); 
        lab1.setBounds (20, 150, 100, 50);
        f.add(lab1);



        String languages[] = {"C++", "C#", "Java", "Python"};
        final JComboBox cb = new JComboBox (languages);
        cb.setBounds (120, 170, 90, 20);
        JButton button = new JButton("Submit");
        button.setBounds (105, 210, 120, 20);
        f.add(cb);
        // f.add(label);
        f.add (button);
        f.setLayout (null);
        f.setSize (350, 380);
        f.setVisible (true);
    }
    
}
