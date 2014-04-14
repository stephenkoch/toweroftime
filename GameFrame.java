import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.*;


public class GameFrame extends JFrame implements ActionListener{
	private static int WIDTH = 1220;
	private static int HEIGHT = 820;
	
	StatEqItPanel PANELA; 
	MapPanel PANELD;
	HealthManaPanel PANELB; 
	GraphicPanel PANELC;
	public ActionPanel PANELE;
	
	public GameFrame(Game g) throws IOException {
		JFrame fullGameFrame = new JFrame("Tower of Time");
		fullGameFrame.setLayout(null);
		fullGameFrame.setVisible(true);
		fullGameFrame.setTitle("Tower of Time");
		fullGameFrame.setSize(WIDTH,HEIGHT);
		fullGameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fullGameFrame.setResizable(false);
		
		//ADDING PANELS AND SHIZZZ
		PANELA = new StatEqItPanel();
		fullGameFrame.add(PANELA);
		PANELB = new HealthManaPanel();
		fullGameFrame.add(PANELB);
		PANELC = new GraphicPanel(g.LEVEL);
		fullGameFrame.add(PANELC);
		PANELD = new MapPanel(g.LEVEL);
		fullGameFrame.add(PANELD);
		PANELE = new ActionPanel(g);
		fullGameFrame.add(PANELE);		
	}

	public void actionPerformed(ActionEvent e) {
			
	}
}
