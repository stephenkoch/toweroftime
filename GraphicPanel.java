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
	
	   public GraphicPanel(Map m) throws IOException {
		   this.m=m;
		   setBounds(400, 0, 800, 600);
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
			   for (int j =0; j <4; j++) 
			   {
				   if( current.getExits(j))
				   {
					   switch(j)
					   {
					   case 0: 
						   ImageIcon fdoor = new ImageIcon("src/dooronly.png");
							fdoor.paintIcon(this, g, 200, 260);
						   break;
					   case 1:
						   ImageIcon rdoor = new ImageIcon("src/Rightdoor.png");
							rdoor.paintIcon(this, g, 620, 230);
						   break;
					   case 3:
						   ImageIcon ldoor = new ImageIcon("src/Leftdoor.png");
							ldoor.paintIcon(this, g, 10, 240);
						   break;
					   }
				   }
			   }
		}  
	}
