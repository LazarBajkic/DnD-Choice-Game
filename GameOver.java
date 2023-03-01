import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GameOver extends JFrame implements ActionListener{
    
    ImageIcon icon=new ImageIcon("GameOver.png");
    JLabel gameOver=new JLabel(icon);
    JButton titleScreen=new JButton("Play again");
    JButton quit=new JButton("Quit");
    DragonCave DC=new DragonCave();
    int score = DC.Score();
    JPanel panel=new JPanel();
    JLabel yourScore=new JLabel("Your score: "+score);

    GameOver(){
        DC.dispose();
        this.setSize(600,600);
        this.setVisible(true);
        this.setLayout(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        gameOver.setSize(400,400);
        gameOver.setLocation(100,50);

        panel.setLocation(0, 0);
        panel.setSize(600,600);
        panel.setBackground(Color.black);

        yourScore.setSize(200,100);
        yourScore.setLocation(235,50);
        yourScore.setForeground(Color.orange);
        yourScore.setFont(new Font("Tahoma",Font.BOLD,20));

        titleScreen.setSize(200,70);
        titleScreen.setLocation(200,370);
        titleScreen.setFocusable(false);
        titleScreen.setOpaque(false);
        titleScreen.setContentAreaFilled(false);
        titleScreen.setFont(new Font("Tahoma",Font.BOLD,20));
        titleScreen.setForeground(Color.orange);
        titleScreen.addActionListener(this);

        quit.setSize(200,70);
        quit.setLocation(200,450);
        quit.setFocusable(false);
        quit.setOpaque(false);
        quit.setContentAreaFilled(false);
        quit.setFont(new Font("Tahoma",Font.BOLD,20));
        quit.setForeground(Color.orange);
        quit.addActionListener(this);

        this.add(yourScore);
        this.add(quit);
        this.add(titleScreen);
        this.add(gameOver);
        this.add(panel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if(e.getSource()==quit){
            this.dispose();
        }
        else if(e.getSource()==titleScreen){
            this.dispose();
            StartScreen SC=new StartScreen();
        }
    }
}
