import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;


public class MapPanel extends JPanel{
	Map m = new Map();
	
	MapPanel() {

		setBounds(0, 400, 400, 400);
		while(m.getRooms()<15 || m.getRooms()>30)
		{	//every once in a while it makes a really small map, and I can't 
			//figure out why so I added this. It only gets called maybe once
			// every 15 runs or so, so it shouldn't effect performance.
			m = new Map();
		}
		JPanel left = new JPanel();
		JPanel right = new JPanel();
		GridLayout a = new GridLayout(7,7,0,0);
		left.setLayout(null);
		right.setLayout(null);
		MapSquare[][] pan = new MapSquare[7][7];
		for(int i=0; i<7; i++){
			for(int j=0;j<7;j++){
				String imageName = "";
				DungeonRoom room  = m.get(j, i);
				if(room!=null){
					if(room.hasTreasure())
						imageName+="d";
					for(int k=0;k<4;k++){
						if(room.getExits(k))
							imageName+="t";
						else
							imageName+="f";
					}
				}else
						imageName+="null";
				imageName+=".png";
				pan[i][j] = new MapSquare(j,i, imageName);
				left.add(pan[i][j]);
			}
		}

		ImageIcon north = new ImageIcon("src/north.png");
		ImageIcon east = new ImageIcon("src/east.png");
		ImageIcon south = new ImageIcon("src/south.png");
		ImageIcon west = new ImageIcon("src/west.png");
		JButton up = new JButton(north);
		JButton l = new JButton(west);
		JButton r = new JButton(east);
		JButton d = new JButton(south);
		up.setBounds(100,50,60,80);
		up.setContentAreaFilled(false); 
		up.setFocusPainted(false);
		l.setBounds(0,160,90,60);
		l.setContentAreaFilled(false);
		l.setFocusPainted(false);
		r.setBounds(170,160,90,60);
		r.setContentAreaFilled(false);
		r.setFocusPainted(false);
		d.setBounds(100,250,60,80);
		d.setContentAreaFilled(false);
		d.setFocusPainted(false);
		right.add(up);
		right.add(l);
		right.add(r);
		right.add(d);

		setLayout(null);

		left.setBounds(0,0,400,400);
		right.setBounds(402,0,400,400);
		add(left);
		add(right);

		setPreferredSize(new Dimension(680,415));
	    setVisible(true);

		
		
		
	
	}
	
}
	
