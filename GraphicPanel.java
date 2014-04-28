import java.awt.Graphics;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class GraphicPanel extends JPanel {

	Map m;
	Game GAME;

	public GraphicPanel(Map m, Game g) throws IOException {
		GAME = g;
		this.m = m;
		setBounds(410, 10, 800, 600);
		setLayout(null);
		setVisible(true);
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		ImageIcon room = new ImageIcon("src/brick room.png");
		room.paintIcon(this, g, 0, 0);

		int x, y;

		x = m.playerLocation.x;
		y = m.playerLocation.y;

		DungeonRoom current = m.grid[x][y];
		for (int j = 0; j < 4; j++) {
			if (current.getExits(j)) {
				ImageIcon fdoor = new ImageIcon("src/dooronly.png");
				ImageIcon rdoor = new ImageIcon("src/Rightdoor.png");
				ImageIcon ldoor = new ImageIcon("src/Leftdoor.png");
				repaint();
				switch (j) {
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

		if (GAME.inCombat == true) {
			ImageIcon monster = new ImageIcon("src/flying spider.png");
			repaint();
			monster.paintIcon(this, g, 200, 440);
		}
		repaint();
		if (m.noBoss() == true)
		{
			ImageIcon boss = new ImageIcon("src/Knight monster.png");
			repaint();
			boss.paintIcon(this, g, 200, 400);
			
		}
		repaint();
	}
}
