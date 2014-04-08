
import javax.imageio.ImageIO;
import javax.swing.*;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;


@SuppressWarnings("serial")
public class Graphics extends JPanel
{
	public void paintComponent(java.awt.Graphics g)
	{
		super.paintComponent(g);
		ImageIcon i = new ImageIcon("C:\\Users\\Samsung\\workspace\\Game\\src\\brick room.png");
		i.paintIcon(this, g, 600, 0);
		ImageIcon door = new ImageIcon("C:\\Users\\Samsung\\workspace\\Game\\src\\dooronly.png");
		door.paintIcon(this, g, 800, 260);
		
	}
	
	public static void main(String[] args)
	{
		Graphics g = new Graphics();
		JFrame f = new JFrame();
		f.setSize(800, 600);
		f.setVisible(true);
		f.add(g);
	}
	
}
	