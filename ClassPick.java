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
    JButton begin=new JButton("Begin your journey");
    
    ImageIcon logo=new ImageIcon("logo.png");
    ImageIcon icon=new ImageIcon("Tavern.png");
    
    JPanel panel=new JPanel();
    
    JLabel info=new JLabel();
    JLabel stats=new JLabel();
    JLabel bckground=new JLabel(icon);
    
    static int strength;
    static int intell;
    static int health;
    static String chosenClass;
    static int gold=25;
    static int score=0;
    
    Roles mage = new Roles(55,100,90,40);
    Roles paladin = new Roles(75,200,40,120);
    Roles rogue = new Roles(65,90,75,60);
    Roles warlock = new Roles(60,120,70,60);
    Roles bard = new Roles(50,100,80,40);
    Roles barbarian = new Roles(80,150,50,80);

    ClassPick(){
        
        this.setIconImage(logo.getImage());
        this.setSize(500,300);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setResizable(false);

        panel.setSize(500,300);
        panel.setLocation(0,0);
        panel.add(bckground);

        rogueClass.setSize(100,20);
        rogueClass.setLocation(100, 40);
        rogueClass.addActionListener(this);
        rogueClass.setFocusable(false);
        rogueClass.setOpaque(false);
        rogueClass.setContentAreaFilled(false);
        rogueClass.setBorderPainted(false);
        rogueClass.setFont(new Font("Tahoma",Font.BOLD,16));
        rogueClass.setForeground(Color.orange);
        
        mageClass.setSize(100,20);
        mageClass.setLocation(100, 80);
        mageClass.addActionListener(this);
        mageClass.setFocusable(false);
        mageClass.setOpaque(false);
        mageClass.setContentAreaFilled(false);
        mageClass.setBorderPainted(false);
        mageClass.setFont(new Font("Tahoma",Font.BOLD,16));
        mageClass.setForeground(Color.orange);

        bardClass.setSize(100,20);
        bardClass.setLocation(100, 120);
        bardClass.addActionListener(this);
        bardClass.setFocusable(false);
        bardClass.setOpaque(false);
        bardClass.setContentAreaFilled(false);
        bardClass.setBorderPainted(false);
        bardClass.setFont(new Font("Tahoma",Font.BOLD,16));
        bardClass.setForeground(Color.orange);
        
        barbarianClass.setSize(120,20);
        barbarianClass.setLocation(290, 40);
        barbarianClass.addActionListener(this);
        barbarianClass.setFocusable(false);
        barbarianClass.setOpaque(false);
        barbarianClass.setContentAreaFilled(false);
        barbarianClass.setBorderPainted(false);
        barbarianClass.setFont(new Font("Tahoma",Font.BOLD,16));
        barbarianClass.setForeground(Color.orange);

        warlockClass.setSize(100,20);
        warlockClass.setLocation(300, 80);
        warlockClass.addActionListener(this);
        warlockClass.setFocusable(false);
        warlockClass.setOpaque(false);
        warlockClass.setContentAreaFilled(false);
        warlockClass.setBorderPainted(false);
        warlockClass.setFont(new Font("Tahoma",Font.BOLD,16));
        warlockClass.setForeground(Color.orange);
        
        paladinClass.setSize(100,20);
        paladinClass.setLocation(300, 120);
        paladinClass.addActionListener(this);
        paladinClass.setFocusable(false);
        paladinClass.setOpaque(false);
        paladinClass.setContentAreaFilled(false);
        paladinClass.setBorderPainted(false);
        paladinClass.setFont(new Font("Tahoma",Font.BOLD,16));
        paladinClass.setForeground(Color.orange);

        stats.setText("Your stats: ");
        stats.setLocation(10,100);
        stats.setSize(200,200);
        stats.setFont(new Font("Tahoma",Font.BOLD,15));
        stats.setForeground(Color.ORANGE);

        begin.setSize(250,30);
        begin.setLocation(200,190);
        begin.addActionListener(this);
        begin.setFocusable(false);
        begin.setOpaque(false);
        begin.setContentAreaFilled(false);
        begin.setBorderPainted(false);
        begin.setFont(new Font("Tahoma",Font.BOLD,16));
        begin.setForeground(Color.orange);
        
        this.add(begin);
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
            stats.setText("<html>Your stats:Strength: "+rogue.strength+"<br>Health: "+rogue.health+"<br>Intelligence: "+rogue.intelligence+"<br>Armor: "+rogue.armor+"<br>Gold: "+gold+"<br>Score: "+score+"</html>");
            health=rogue.health;
            strength=rogue.strength;
            intell=rogue.intelligence;
            chosenClass="Rogue";
        }
        else if(e.getSource()==mageClass){
            stats.setText("<html>Your stats:Strength: "+mage.strength+"<br>Health: "+mage.health+"<br>Intelligence: "+mage.intelligence+"<br>Armor: "+mage.armor+"<br>Gold: "+gold+"<br>Score: "+score+"</html>");
            health=mage.health;
            strength=mage.strength;
            intell=mage.intelligence;
            chosenClass="Mage";
        }
        else if(e.getSource()==bardClass){
            stats.setText("<html>Your stats:Strength: "+bard.strength+"<br>Health: "+bard.health+"<br>Intelligence: "+bard.intelligence+"<br>Armor: "+bard.armor+"<br>Gold: "+gold+"<br>Score: "+score+"</html>");
            health=bard.health;
            strength=bard.strength;
            intell=bard.intelligence;
            chosenClass="Bard";
        }
        else if(e.getSource()==barbarianClass){
            stats.setText("<html>Your stats:Strength: "+barbarian.strength+"<br>Health: "+barbarian.health+"<br>Intelligence: "+barbarian.intelligence+"<br>Armor: "+barbarian.armor+"<br>Gold: "+gold+"<br>Score: "+score+"</html>");
            health=barbarian.health;
            strength=barbarian.strength;
            intell=barbarian.intelligence;
            chosenClass="Barbarian";
        }
        else if(e.getSource()==warlockClass){
            stats.setText("<html>Your stats:Strength: "+warlock.strength+"<br>Health: "+warlock.health+"<br>Intelligence: "+warlock.intelligence+"<br>Armor: "+warlock.armor+"<br>Gold: "+gold+"<br>Score: "+score+"</html>");
            health=warlock.health;
            strength=warlock.strength;
            intell=warlock.intelligence;
            chosenClass="Warlock";
        }
        else if(e.getSource()==paladinClass){
            stats.setText("<html>Your stats:Strength: "+paladin.strength+"<br>Health: "+paladin.health+"<br>Intelligence: "+paladin.intelligence+"<br>Armor: "+paladin.armor+"<br>Gold: "+gold+"<br>Score: "+score+"</html>");
            health=paladin.health;
            strength=paladin.strength;
            intell=paladin.intelligence;
            chosenClass="Paladin";
        }
        else if(e.getSource()==begin){
            ForestEncounter FE=new ForestEncounter();
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
        return gold;
    }

    public static int Score(){
        return score;
    }

    public static String ClassChosen(){
        return chosenClass;
    }


}

