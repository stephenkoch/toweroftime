import javax.swing.*;
import java.awt.*;


public class MapSquare extends JPanel {

	public MapSquare(int x, int y, String source){
		ImageIcon icon = new ImageIcon("src/"+source);
		JLabel label = new JLabel(icon);
       
		setBounds(x*30+2, y*30, 26, 30);
		add(label);
		setVisible(true);
	}

}