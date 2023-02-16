import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ForestEncounter extends JFrame implements ActionListener{

    JButton fight=new JButton("Fight");
    JButton comply=new JButton("Comply");
    JButton negotiate=new JButton("Negotiate");
    ImageIcon forest=new ImageIcon("Forest.png");
    JLabel icon=new JLabel(forest);
    JPanel panel=new JPanel();
    JPanel info = new JPanel();
    JLabel text = new JLabel();
    
    ForestEncounter(){
        
        ClassPick CP = new ClassPick();
        int strength=CP.StatStrength();
        int health=CP.StatHealth();
        int intell=CP.StatIntell();
        String classChosen=CP.ClassChosen();
        
        this.setSize(670,800);
        this.setLayout(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        fight.setSize(150,30);
        fight.setLocation(50,700);
        fight.addActionListener(this);
        fight.setFocusable(false);
        fight.setOpaque(false);
        fight.setContentAreaFilled(false);
        fight.setFont(new Font("Tahoma",Font.BOLD,15));
        fight.setForeground(Color.orange);

        comply.setSize(150,30);
        comply.setLocation(250,700);
        comply.addActionListener(this);
        comply.setFocusable(false);
        comply.setOpaque(false);
        comply.setContentAreaFilled(false);
        comply.setFont(new Font("Tahoma",Font.BOLD,15));
        comply.setForeground(Color.orange);

        negotiate.setSize(150,30);
        negotiate.setLocation(450,700);
        negotiate.addActionListener(this);
        negotiate.setFocusable(false);
        negotiate.setOpaque(false);
        negotiate.setContentAreaFilled(false);
        negotiate.setFont(new Font("Tahoma",Font.BOLD,15));
        negotiate.setForeground(Color.orange);

        text.setText("<html>You begin your journey in the forest,as you stroll along the path<br>suddenly,a bandit jumps you from the bushes demanding your valuable<br>'Hand over the gold!'<br>What shall you do?<br>Your class and stats:<br>Class: "+classChosen+"<br>Str: "+strength+"<br>Intell: "+intell+"<br>Hp: "+health+"</html>");
        text.setSize(200,150);
        text.setFont(new Font("Tahoma",Font.BOLD,15));
        text.setForeground(Color.ORANGE);

        info.setSize(670,400);
        info.setLocation(0,400);
        info.add(text);
        info.setBackground(Color.black);

        panel.setSize(670,700);
        panel.setLocation(0,0);
        panel.add(icon);

        this.add(fight);
        this.add(negotiate);
        this.add(comply);
        this.add(info);
        this.add(panel);
        CP.dispose();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        
    }
}
