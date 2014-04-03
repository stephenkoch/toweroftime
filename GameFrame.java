import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class GameFrame extends JFrame implements ActionListener{
	private static int WIDTH = 1200;
	private static int HEIGHT = 1000;
	StatEqItPanel PANELA = new StatEqItPanel();
	
	public GameFrame() {
		JFrame fullGameFrame = new JFrame("Tower of Time");
		fullGameFrame.setVisible(true);
		fullGameFrame.setTitle("Tower of Time");
		fullGameFrame.setSize(WIDTH,HEIGHT);
		fullGameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fullGameFrame.add(PANELA.jtp);
	}

	public void actionPerformed(ActionEvent e) {
			
	}
}
