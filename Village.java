import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Village extends JFrame implements ActionListener{
    
    JButton yes=new JButton("Yes");
    JButton no=new JButton("No");
    JPanel panel=new JPanel();
    JPanel info = new JPanel();
    JLabel text = new JLabel();
    ImageIcon burningVillage=new ImageIcon("BurningVillage.png");
    JLabel icon=new JLabel(burningVillage);
    static ForestEncounter FE = new ForestEncounter();
    int strength=FE.StatStrength();
    int health=FE.StatHealth();
    int intell=FE.StatIntell();
    int goldAmnt=FE.GoldAmnt();
    static int score=FE.Score();
    String classChosen=FE.ClassChosen();

    Village(){

        FE.dispose();
        this.setSize(670,800);
        this.setLayout(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        yes.setSize(150,30);
        yes.setLocation(100,730);
        yes.addActionListener(this);
        yes.setFocusable(false);
        yes.setOpaque(false);
        yes.setContentAreaFilled(false);
        yes.setFont(new Font("Tahoma",Font.BOLD,15));
        yes.setForeground(Color.orange);
        yes.setVisible(true);

        no.setSize(150,30);
        no.setLocation(400,730);
        no.addActionListener(this);
        no.setFocusable(false);
        no.setOpaque(false);
        no.setContentAreaFilled(false);
        no.setFont(new Font("Tahoma",Font.BOLD,15));
        no.setForeground(Color.orange);
        no.setVisible(true);

        text.setText("<html>You arrive at the village and realize it got burnt down and is in ruins<br>you see a man standing near a burning house you approach and ask what happened<br>'Oh traveler,our homes were destroyed by a dragon which lives not far from here<br>will you slay the<br>what do you say,Accept the quest?'<br>Your class and stats:<br>Class: "+classChosen+"<br>Str: "+strength+"<br>Intell: "+intell+"<br>Hp: "+health+"<br>Gold: "+goldAmnt+"<br>Score: "+score+"</html>");
        text.setSize(200,150);
        text.setFont(new Font("Tahoma",Font.BOLD,15));
        text.setForeground(Color.orange);

        info.add(yes);
        info.add(no);
        info.setSize(670,400);
        info.setLocation(0,400);
        info.add(text);
        info.setBackground(Color.BLACK);

        panel.setSize(670,700);
        panel.setLocation(0,0);
        panel.add(icon);

        this.add(info);
        this.add(panel);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if(e.getSource()==no){
            this.dispose();
            GameOver GO=new GameOver();
        }
        else if(e.getSource()==yes){
            this.dispose();
            score=score + 30;
                DragonCave DC=new DragonCave();
        }
    }
    
    public static int Score(){
        return score;
    }
    
}
