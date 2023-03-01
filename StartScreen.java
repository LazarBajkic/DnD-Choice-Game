import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class StartScreen extends JFrame implements ActionListener{
    
    ImageIcon logo=new ImageIcon("logo.png");
    ImageIcon titleIcon=new ImageIcon("Title.png");
    ImageIcon background=new ImageIcon("Background.png");
    
    JButton start=new JButton("Start");
    
    JLabel icon=new JLabel(background);
    JLabel title=new JLabel(titleIcon);
    
    JPanel panel=new JPanel();

    StartScreen(){
        this.setIconImage(logo.getImage());
        this.setSize(600,340);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setLayout(null);
        this.setResizable(false);
        
        panel.setSize(600,400);
        panel.setLocation(0,0);
        panel.add(icon);

        title.setSize(400,100);
        title.setLocation(100,50);

        start.setSize(100,30);
        start.setLocation(250,200);
        start.addActionListener(this);
        start.setFocusable(false);
        start.setOpaque(false);
        start.setContentAreaFilled(false);
        start.setBorderPainted(false);
        start.setFont(new Font("Tahoma",Font.BOLD,25));
        start.setForeground(Color.getHSBColor(33, 100, 100));

        this.add(title);
        this.add(start);
        this.add(panel);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if(e.getSource()==start){
            ClassPick CG=new ClassPick();
            this.dispose();
        }
    }
}
