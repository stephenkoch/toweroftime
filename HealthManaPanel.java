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
    JLabel Exp = new JLabel ("EXPERIENCE");
    
    JProgressBar HealthBar;
    JProgressBar ManaBar;
    JProgressBar ExpBar;
    JButton You = new JButton(new ImageIcon(((new ImageIcon("src/Man.png")).getImage()).getScaledInstance(125,125, java.awt.Image.SCALE_SMOOTH)));  
    Game GAME;
public HealthManaPanel(Game g) 
{
	
	GAME = g;
	setBackground(Color.gray);
	setBounds(0, 0, 400, 160);
    setLayout(null);
    You.setBounds(10,30,125,125);
	You.setContentAreaFilled(false); You.setBorderPainted(false);
    HealthBar = new JProgressBar();
    ManaBar = new JProgressBar();
    ExpBar = new JProgressBar();
   
    Font newHealthFont = new Font(Health.getFont().getName(),Health.getFont().getStyle(),16);
    Font newManaFont = new Font(Mana.getFont().getName(),Mana.getFont().getStyle(),16);
    Font newLevelFont = new Font(Level.getFont().getName(),Level.getFont().getStyle(),16);
    Font newLevelDFont = new Font(LevelD.getFont().getName(),LevelD.getFont().getStyle(),28);
    Font newClassFont = new Font(Class.getFont().getName(),Class.getFont().getStyle(),16);
    Font newNameFont = new Font(Name.getFont().getName(),Name.getFont().getStyle(),20);
    
    Health.setFont(newHealthFont);
    Exp.setFont(newHealthFont);
    Mana.setFont(newManaFont);
    Level.setFont(newLevelFont);
    LevelD.setFont(newLevelDFont);
    Class.setFont(newClassFont);
    Name.setFont(newNameFont);
  
    Name.setLocation(10,0);
    Name.setSize(300,40); 

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
    HealthBar.setStringPainted(true);
    HealthBar.setForeground(Color.red);
    
    Mana.setSize(100,40);
    Mana.setLocation(185,90);
    ManaBar.setSize(125,25);
    ManaBar.setLocation(250,95);
    ManaBar.setStringPainted(true);
    ManaBar.setForeground(Color.blue);
    
    Exp.setSize(160,20);
    Exp.setLocation(140,120);
    ExpBar.setSize(125,25);
    ExpBar.setLocation(250,120);
    ExpBar.setStringPainted(true);
    ExpBar.setForeground(Color.orange);
  
    // Add all Items to Panel
    add(Level);
    add(LevelD);
    add(Class);
    add(Health);
    add(Mana);
    add(Exp);
    add(HealthBar);
    add(ManaBar);
    add(ExpBar);
    add(Name);
    add(You);
    setVisible(true);
}
public void updatePanel() 
{
	Name.setText(TowerOfTime.GAME.PLAYER.getName());
	LevelD.setText(Integer.toString(TowerOfTime.GAME.PLAYER.getLevel()));
	Class.setText(TowerOfTime.GAME.PLAYER.getJob());
	HealthBar.setMaximum(TowerOfTime.GAME.PLAYER.getMaxHp());
	ManaBar.setMaximum(TowerOfTime.GAME.PLAYER.getMaxMp());
	HealthBar.setValue(TowerOfTime.GAME.PLAYER.getHp());
	ManaBar.setValue(TowerOfTime.GAME.PLAYER.getMp());
	ExpBar.setValue(TowerOfTime.GAME.PLAYER.getExp());
	ExpBar.setMaximum(TowerOfTime.GAME.PLAYER.getMaxExp());
	this.validate();
}
}
