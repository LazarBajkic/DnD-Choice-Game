import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PathChoice extends JFrame implements ActionListener{

    JButton villagePath=new JButton("Village");
    JButton deeperPath=new JButton("Deeper");
    JPanel panel=new JPanel();
    JPanel info = new JPanel();
    JLabel text = new JLabel();
    ImageIcon crossRoads=new ImageIcon("CrossRoads.png");
    JLabel icon=new JLabel(crossRoads);
    ForestEncounter FE = new ForestEncounter();
    int strength=FE.StatStrength();
    int health=FE.StatHealth();
    int intell=FE.StatIntell();
    int goldAmnt=FE.GoldAmnt();
    int score=FE.Score();
    String classChosen=FE.ClassChosen();

    PathChoice(){
        FE.dispose();
        this.setSize(670,800);
        this.setLayout(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        deeperPath.setSize(150,30);
        deeperPath.setLocation(100,700);
        deeperPath.addActionListener(this);
        deeperPath.setFocusable(false);
        deeperPath.setOpaque(false);
        deeperPath.setContentAreaFilled(false);
        deeperPath.setFont(new Font("Tahoma",Font.BOLD,15));
        deeperPath.setForeground(Color.orange);

        villagePath.setSize(150,30);
        villagePath.setLocation(400,700);
        villagePath.addActionListener(this);
        villagePath.setFocusable(false);
        villagePath.setOpaque(false);
        villagePath.setContentAreaFilled(false);
        villagePath.setFont(new Font("Tahoma",Font.BOLD,15));
        villagePath.setForeground(Color.orange);

        text.setText("<html>You arrive at a crossroads<br>one road leads to a village and the other deeper into the forest<br>Where will you go?<br>Your class and stats:<br>Class: "+classChosen+"<br>Str: "+strength+"<br>Intell: "+intell+"<br>Hp: "+health+"<br>Gold: "+goldAmnt+"<br>Score: "+score+"</html>");
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

        this.add(villagePath);
        this.add(deeperPath);
        this.add(info);
        this.add(panel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if(e.getSource()==villagePath){
            this.dispose();
            Village V=new Village();
        }

        else if(e.getSource()==deeperPath){
            DragonCave DC=new DragonCave();
            this.dispose();
        }
    }
}
