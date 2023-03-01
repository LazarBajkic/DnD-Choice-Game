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
    JButton nextEncounter=new JButton("Next");
    
    ImageIcon logo=new ImageIcon("logo.png");
    ImageIcon forest=new ImageIcon("Forest.png");
    
    JPanel panel=new JPanel();
    JPanel info = new JPanel();
    
    JLabel icon=new JLabel(forest);
    JLabel text = new JLabel();
    
    static ClassPick CP = new ClassPick();
    static int strength=CP.StatStrength();
    static int health=CP.StatHealth();
    static int intell=CP.StatIntell();
    static int goldAmnt=CP.GoldAmnt();
    static int score=CP.Score();
    static String classChosen=CP.ClassChosen();
    
    ForestEncounter(){


        this.setIconImage(logo.getImage());
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

        nextEncounter.setSize(150,30);
        nextEncounter.setLocation(250,700);
        nextEncounter.addActionListener(this);
        nextEncounter.setFocusable(false);
        nextEncounter.setOpaque(false);
        nextEncounter.setContentAreaFilled(false);
        nextEncounter.setFont(new Font("Tahoma",Font.BOLD,15));
        nextEncounter.setForeground(Color.orange);
        nextEncounter.setVisible(false);

        text.setText("<html>You begin your journey in the forest,as you stroll along the path<br>suddenly,a bandit jumps you from the bushes demanding your valuable<br>'Hand over the gold!'<br>What shall you do?<br>Your class and stats:<br>Class: "+classChosen+"<br>Str: "+strength+"<br>Intell: "+intell+"<br>Hp: "+health+"<br>Gold: "+goldAmnt+"<br>Score: "+score+"</html>");
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
        this.add(nextEncounter);
        this.add(info);
        this.add(panel);
        CP.dispose();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if(e.getSource()==fight&&strength>=50){
            score=score + 50;
            text.setText("You overpower the bandit and lose nothing,Score: "+score);
            nextEncounter.setVisible(true);
            comply.setVisible(false);
            negotiate.setVisible(false);
            fight.setVisible(false);
        }  else if(strength<50&&e.getSource()==fight){
            goldAmnt=goldAmnt-10;
            score=score + 50;
            text.setText("<html>You were overpowered and the bandit stole 10 gold coins from you!<br>Gold: "+goldAmnt+"<br>Score: "+score+"</html>");
            nextEncounter.setVisible(true);
            comply.setVisible(false);
            negotiate.setVisible(false);
            fight.setVisible(false);
        }

        if(e.getSource()==comply){
            goldAmnt=goldAmnt-15;
            score=score+30;
            text.setText("<html>You comply and hand over the gold<br>'Thats what i thought'<br>Gold: "+goldAmnt+"<br>Score: "+score+"</html>");
            nextEncounter.setVisible(true);
            comply.setVisible(false);
            negotiate.setVisible(false);
            fight.setVisible(false);
        } 

        if(e.getSource()==negotiate&&intell>=50){
            score=score + 100;
            text.setText("<html>You reason with the bandit and lose nothing<br>Score: "+score+"</html>");
            nextEncounter.setVisible(true);
            comply.setVisible(false);
            negotiate.setVisible(false);
            fight.setVisible(false);
        }else if(e.getSource()==negotiate&&intell<50){
            goldAmnt=goldAmnt-15;
            score=score+30;
            text.setText("<html>Your negotiations fail and you hand over the gold<br>'Sorry but im not buying it,now hand it over'<br>Gold: "+goldAmnt+"<br>Score: "+score+"</html>");
            nextEncounter.setVisible(true);
            comply.setVisible(false);
            negotiate.setVisible(false);
            fight.setVisible(false);
        }
        if(e.getSource()==nextEncounter){
            PathChoice PC=new PathChoice();
            this.dispose();
        }
    }
    public static int StatStrength(){
        return strength;
    }

    public static int StatHealth(){
        return health;
    }

    public static int StatIntell(){
        return intell;
    }

    public static int GoldAmnt(){
        return goldAmnt;
    }

    public static int Score(){
        return score;
    }

    public static String ClassChosen(){
        return classChosen;
    }
}