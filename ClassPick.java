import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ClassPick extends JFrame implements ActionListener{
    
    JButton rogueClass=new JButton("Rogue");
    JButton mageClass=new JButton("Mage");
    JButton bardClass=new JButton("Bard");
    JButton barbarianClass=new JButton("Barbarian");
    JButton warlockClass=new JButton("Warlock");
    JButton paladinClass=new JButton("Paladin");
    ImageIcon icon=new ImageIcon("Tavern.png");
    JPanel panel=new JPanel();
    JLabel info=new JLabel();
    JLabel stats=new JLabel();
    JLabel bckground=new JLabel(icon);

    Roles mage = new Roles(35,100,90,40);
    Roles paladin = new Roles(65,200,40,120);
    Roles rogue = new Roles(100,100,100,100);
    Roles warlock = new Roles(45,120,70,60);
    Roles bard = new Roles(40,100,80,40);
    Roles barbarian = new Roles(70,150,50,80);

    ClassPick(){
        
        this.setSize(500,300);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);

        panel.setSize(500,300);
        panel.setLocation(0,0);
        panel.add(bckground);

        rogueClass.setSize(100,20);
        rogueClass.setLocation(100, 40);
        rogueClass.addActionListener(this);
        rogueClass.setFocusable(false);
        
        mageClass.setSize(100,20);
        mageClass.setLocation(100, 80);
        mageClass.addActionListener(this);
        mageClass.setFocusable(false);

        bardClass.setSize(100,20);
        bardClass.setLocation(100, 120);
        bardClass.addActionListener(this);
        bardClass.setFocusable(false);
        
        barbarianClass.setSize(100,20);
        barbarianClass.setLocation(300, 40);
        barbarianClass.addActionListener(this);
        barbarianClass.setFocusable(false);

        warlockClass.setSize(100,20);
        warlockClass.setLocation(300, 80);
        warlockClass.addActionListener(this);
        warlockClass.setFocusable(false);
        
        paladinClass.setSize(100,20);
        paladinClass.setLocation(300, 120);
        paladinClass.addActionListener(this);
        paladinClass.setFocusable(false);

        stats.setText("Your stats: ");
        stats.setLocation(10,100);
        stats.setSize(200,200);
        stats.setFont(new Font("Tahoma",Font.BOLD,15));
        stats.setForeground(Color.ORANGE);
        
        this.add(rogueClass);
        this.add(mageClass);
        this.add(bardClass);
        this.add(barbarianClass);
        this.add(warlockClass);
        this.add(paladinClass);
        this.add(stats);
        this.add(panel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if(e.getSource()==rogueClass){
            stats.setText("<html>Your stats:Strength: "+rogue.strength+"<br>Health: "+rogue.health+"<br>Intelligence: "+rogue.intelligence+"<br>Armor: "+rogue.armor+"</html>");
        }
        else if(e.getSource()==mageClass){
            stats.setText("<html>Your stats:Strength: "+mage.strength+"<br>Health: "+mage.health+"<br>Intelligence: "+mage.intelligence+"<br>Armor: "+mage.armor+"</html>");
        }
        else if(e.getSource()==bardClass){
            stats.setText("<html>Your stats:Strength: "+bard.strength+"<br>Health: "+bard.health+"<br>Intelligence: "+bard.intelligence+"<br>Armor: "+bard.armor+"</html>");
        }
        else if(e.getSource()==barbarianClass){
            stats.setText("<html>Your stats:Strength: "+barbarian.strength+"<br>Health: "+barbarian.health+"<br>Intelligence: "+barbarian.intelligence+"<br>Armor: "+barbarian.armor+"</html>");
        }
        else if(e.getSource()==warlockClass){
            stats.setText("<html>Your stats:Strength: "+warlock.strength+"<br>Health: "+warlock.health+"<br>Intelligence: "+warlock.intelligence+"<br>Armor: "+warlock.armor+"</html>");
        }
        else if(e.getSource()==paladinClass){
            stats.setText("<html>Your stats:Strength: "+paladin.strength+"<br>Health: "+paladin.health+"<br>Intelligence: "+paladin.intelligence+"<br>Armor: "+paladin.armor+"</html>");
        }
    }

}

