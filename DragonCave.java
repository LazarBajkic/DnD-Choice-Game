import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DragonCave extends JFrame implements ActionListener{
    
    ImageIcon dragon=new ImageIcon("Dragon.png");
    JLabel icon=new JLabel(dragon);
    JPanel panel=new JPanel();
    JPanel info = new JPanel();
    JLabel text = new JLabel();
    JButton trap=new JButton("Trap");
    JButton fight=new JButton("Fight");
    ForestEncounter FE = new ForestEncounter();
    int strength=FE.StatStrength();
    int health=FE.StatHealth();
    int intell=FE.StatIntell();
    int goldAmnt=FE.GoldAmnt();
    String classChosen=FE.ClassChosen();

    DragonCave(){
        FE.dispose();
        this.setSize(670,800);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setVisible(true);

        trap.setSize(150,30);
        trap.setLocation(100,700);
        trap.addActionListener(this);
        trap.setFocusable(false);
        trap.setOpaque(false);
        trap.setContentAreaFilled(false);
        trap.setFont(new Font("Tahoma",Font.BOLD,15));
        trap.setForeground(Color.orange);

        fight.setSize(150,30);
        fight.setLocation(400,700);
        fight.addActionListener(this);
        fight.setFocusable(false);
        fight.setOpaque(false);
        fight.setContentAreaFilled(false);
        fight.setFont(new Font("Tahoma",Font.BOLD,15));
        fight.setForeground(Color.orange);

        text.setText("<html>You go into the forest and find a cave,housing treasure,and a dragon guarding it,<br>what will you do to slay the beast?<br>Your class and stats:<br>Class: "+classChosen+"<br>Str: "+strength+"<br>Intell: "+intell+"<br>Hp: "+health+"<br>Gold: "+goldAmnt+"</html>");
        text.setSize(200,150);
        text.setFont(new Font("Tahoma",Font.BOLD,15));
        text.setForeground(Color.orange);

        info.setSize(670,400);
        info.setLocation(0,400);
        info.add(text);
        info.setBackground(Color.black);

        panel.setSize(670,700);
        panel.setLocation(0,0);
        panel.add(icon);

        this.add(trap);
        this.add(fight);
        this.add(info);
        this.add(panel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }   
}