import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

import java.awt.Graphics;


public class GraphicPanel extends JPanel {

	Map m;
	Game GAME;
	DungeonRoom Dungeon;
	
	   public GraphicPanel(Map m, Game g) throws IOException 
	   {
		   GAME = g;
		   this.m=m;
		   
		   setBounds(410, 10, 800, 600);
		   setLayout(null);
		   setVisible(true);
	   }

	   public void paintComponent(Graphics g)
		{
			super.paintComponent(g);
			ImageIcon room = new ImageIcon("src/brick room.png");
			room.paintIcon(this, g, 0, 0);

			int x,y;

			   x = m.playerLocation.x;
			   y = m.playerLocation.y;

			   DungeonRoom current = m.grid[x][y];
			   for (int j = 0; j < 4; j++) 
			   {
				   if(current.getExits(j))
				   {
					   ImageIcon fdoor = new ImageIcon("src/dooronly.png");
					   ImageIcon rdoor = new ImageIcon("src/Rightdoor.png");
					   ImageIcon ldoor = new ImageIcon("src/Leftdoor.png");
					   repaint();
					   switch(j)
					   {
					   case 0: 
						   fdoor.paintIcon(this, g, 200, 260);
						   break;
					   case 1:
						   
							rdoor.paintIcon(this, g, 620, 230);
						   break;
					   case 3:
						   
							ldoor.paintIcon(this, g, 10, 240);
						   break;
					   }
				   }
			   }
			   
			   if (GAME.inCombat == true &&  current.hasBoss() == false) {
					ImageIcon monster = new ImageIcon("src/flying spider.png");
					monster.paintIcon(this, g, 120, 220);
					repaint();
				}
				
				if ( current.hasBoss() == true)
				{
					ImageIcon boss = new ImageIcon("src/Knight monster.png");
					boss.paintIcon(this, g, 120, 220);
					repaint();
					
				}
				
				if ( current.hasTreasure() == true)
				{
					ImageIcon treasure = new ImageIcon("src/treasure.png");
					treasure.paintIcon(this, g, 500, 400);
					repaint();
				}
			
			
		}  
	}
