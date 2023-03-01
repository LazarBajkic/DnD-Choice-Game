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
    JButton next=new JButton("Next");
    ForestEncounter FE = new ForestEncounter();
    static Village V=new Village();
    int strength=FE.StatStrength();
    int health=FE.StatHealth();
    int intell=FE.StatIntell();
    int goldAmnt=FE.GoldAmnt();
    static int score=V.Score();
    String classChosen=FE.ClassChosen();

    DragonCave(){
        V.dispose();
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

        next.setSize(150,30);
        next.setLocation(250,700);
        next.addActionListener(this);
        next.setFocusable(false);
        next.setOpaque(false);
        next.setContentAreaFilled(false);
        next.setFont(new Font("Tahoma",Font.BOLD,15));
        next.setForeground(Color.orange);
        next.setVisible(false);

        fight.setSize(150,30);
        fight.setLocation(400,700);
        fight.addActionListener(this);
        fight.setFocusable(false);
        fight.setOpaque(false);
        fight.setContentAreaFilled(false);
        fight.setFont(new Font("Tahoma",Font.BOLD,15));
        fight.setForeground(Color.orange);

        text.setText("<html>You go into the forest and find a cave,housing treasure,and a dragon guarding it,<br>what will you do to slay the beast?<br>Your class and stats:<br>Class: "+classChosen+"<br>Str: "+strength+"<br>Intell: "+intell+"<br>Hp: "+health+"<br>Gold: "+goldAmnt+"<br>Score: "+score+"</html>");
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

        this.add(next);
        this.add(trap);
        this.add(fight);
        this.add(info);
        this.add(panel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if(e.getSource()==trap&&intell>=60){
            text.setText("The trap was a success!,you killed the dragon in his sleep and the riches are yours!");
            next.setVisible(true);
            fight.setVisible(false);
            trap.setVisible(false);
        }else if(e.getSource()==trap&&intell<60){
            text.setText("Your trap failed and you were burnt to a crisp!");
            next.setVisible(true);
            fight.setVisible(false);
            trap.setVisible(false);
        }

        if(e.getSource()==fight&&strength>=70){
            text.setText("You overcome the dragon with force!,you killed the dragon and the riches are yours!");
            next.setVisible(true);
            fight.setVisible(false);
            trap.setVisible(false);
        }else if(e.getSource()==fight&&strength<70){
            text.setText("You weren't strong enough to kill the dragon and got burnt to a ashes!");
            next.setVisible(true);
            fight.setVisible(false);
            trap.setVisible(false);
        }

        if(e.getSource()==next){
            GameOver GO=new GameOver();
            this.dispose();
        }

    }  
    public static int Score(){
        return score;
    } 
}
