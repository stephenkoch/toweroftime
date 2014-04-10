//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
//Coded by: Brandon Conover
//HealthManaPanel Menu (Stats, Equipment, Inventory(Back Pack)
//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

public class HealthManaPanel extends JPanel

{
    JLabel Health = new JLabel("HEALTH");
    JLabel Mana = new JLabel("MANA");
    JLabel Level = new JLabel("LEVEL");
    JLabel LevelD = new JLabel("9");
    JLabel Class = new JLabel("Warrior");
    JLabel Name = new JLabel("John Doe");
    JLabel Pic = new JLabel(new ImageIcon("src/panda2.jpg"));
    
    JProgressBar HealthBar;
    JProgressBar ManaBar;
    JButton You = new JButton(new ImageIcon(((new ImageIcon("Man.png")).getImage()).getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH)));  

public HealthManaPanel()

{
	setBounds(0, 0, 400, 160);
    setLayout(null);
    You.setBounds(10,30,90,90);
	You.setContentAreaFilled(false); You.setBorderPainted(false);
    HealthBar = new JProgressBar(0,100);
    ManaBar = new JProgressBar(0,100);
   
    Font newHealthFont = new Font(Health.getFont().getName(),Health.getFont().getStyle(),16);
    Font newManaFont = new Font(Mana.getFont().getName(),Mana.getFont().getStyle(),16);
    Font newLevelFont = new Font(Level.getFont().getName(),Level.getFont().getStyle(),16);
    Font newLevelDFont = new Font(LevelD.getFont().getName(),LevelD.getFont().getStyle(),28);
    Font newClassFont = new Font(Class.getFont().getName(),Class.getFont().getStyle(),16);
    Font newNameFont = new Font(Name.getFont().getName(),Name.getFont().getStyle(),20);
    
    Health.setFont(newHealthFont);
    Mana.setFont(newManaFont);
    Level.setFont(newLevelFont);
    LevelD.setFont(newLevelDFont);
    Class.setFont(newClassFont);
    Name.setFont(newNameFont);
    
  
    Name.setLocation(10,0);
    Name.setSize(100,40); 
    
    Pic.setLocation(35,35);
    Pic.setVisible(true);
    Pic.setSize(100,100);
	add(Pic);

    
    Class.setLocation(275,20);
    Class.setSize(100,40);
   
    Level.setLocation(275,0);
    Level.setSize(100,40);
    
    LevelD.setLocation(350,0);
    LevelD.setSize(100,40);
    
   

    

   
    // Set all Sizes
    Health.setSize(100,40);
    Health.setLocation(170,65);
    HealthBar.setSize(125,25);
    HealthBar.setLocation(250,65);
   
    HealthBar.setValue(50);
    HealthBar.setStringPainted(true);
    HealthBar.setForeground(Color.red);
   
    Mana.setSize(200,40);
    Mana.setLocation(185,90);
    ManaBar.setSize(125,25);
    ManaBar.setLocation(250,95);
  
    ManaBar.setValue(80);
    ManaBar.setStringPainted(true);
    ManaBar.setForeground(Color.blue);

    // Add all Items to Panel
    add(Level);
    add(LevelD);
    add(Class);
    add(Health);
    add(Mana);
    add(HealthBar);
    add(ManaBar);
    add(Name);
    add(You);
    
    setVisible(true);
    updatePanel();
}
public void updatePanel() {
	Name.setText(Game.PLAYER.getName());
	LevelD.setText(Integer.toString(Game.PLAYER.getLevel()));
	Class.setText(Game.PLAYER.getJob());
	HealthBar.setMaximum(Game.PLAYER.getMaxHp());
	ManaBar.setMaximum(Game.PLAYER.getMaxMp());
	HealthBar.setValue(Game.PLAYER.getHp());
	ManaBar.setValue(Game.PLAYER.getMp());
	
}
}
