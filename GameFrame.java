import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class GameFrame extends JFrame implements ActionListener{
	private static int WIDTH = 1200;
	private static int HEIGHT = 800;
	
	StatEqItPanel PANELA = new StatEqItPanel();
	MapPanel PANELD = new MapPanel();
	
	public GameFrame() {
		JFrame fullGameFrame = new JFrame("Tower of Time");
		fullGameFrame.setLayout(null);
		fullGameFrame.setVisible(true);
		fullGameFrame.setTitle("Tower of Time");
		fullGameFrame.setSize(WIDTH,HEIGHT);
		fullGameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fullGameFrame.setResizable(false);
		PANELA.jtp.setBounds(0,160,400,400);
		fullGameFrame.add(PANELA.jtp);
		fullGameFrame.add(PANELD);
	}

	public void actionPerformed(ActionEvent e) {
			
	}
}
