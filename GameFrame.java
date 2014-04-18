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
		PANELA = new StatEqItPanel(g);
		fullGameFrame.add(PANELA);
		PANELB = new HealthManaPanel(g);
		fullGameFrame.add(PANELB);
		PANELC = new GraphicPanel(g.LEVEL, g);
		fullGameFrame.add(PANELC);
		PANELD = new MapPanel(g.LEVEL, g);
		fullGameFrame.add(PANELD);
		PANELE = new ActionPanel(g);
		fullGameFrame.add(PANELE);		
		update();
	}
	public void update() {
		PANELA.updatePanel();
		PANELB.updatePanel();
		//PANELC.update(g);
		PANELD.updateMap();
		PANELE.updatePanel();
		//PANELE.actionLogList.set
		TowerOfTime.GAME.PLAYER.updateCurrentStats();
		PANELE.updatePanel();
	}

	public void actionPerformed(ActionEvent e) {
			
	}
}
