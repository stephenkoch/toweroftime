import java.awt.Color;
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


public class GraphicPanel extends JPanel {
	JLabel piclabel;
	BufferedImage Room = ImageIO.read(new File("src/brick room.png"));
	   public GraphicPanel(Map m) throws IOException {
		   setBounds(400, 0, 800, 600);
		   setLayout(null);
		   piclabel = new JLabel(new ImageIcon(Room));
		   piclabel.setLocation(0,0);
		   piclabel.setVisible(true);
		   piclabel.setSize(800,600);
		   add(piclabel);
	   
	    
		   setVisible(true);
	}
	}
