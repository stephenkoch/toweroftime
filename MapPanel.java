import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;


public class MapPanel extends JPanel{
	
	MapPanel(Map m) {

		setBounds(0, 560, 720, 400);
		
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
		up.setBounds(100,20,60,80);
		up.setContentAreaFilled(false); up.setBorderPainted(false);
		l.setBounds(10,70,90,60);
		l.setContentAreaFilled(false); l.setBorderPainted(false);
		r.setBounds(160,70,90,60);
		r.setContentAreaFilled(false); r.setBorderPainted(false);
		d.setBounds(100,120,60,80);
		d.setContentAreaFilled(false); d.setBorderPainted(false);
		right.add(up);
		right.add(l);
		right.add(r);
		right.add(d);

		setLayout(null);

		left.setBounds(0,0,210,210);
		right.setBounds(210,0,300,200);
		add(left);
		add(right);
	    setVisible(true);

		
		
		
	
	}
	
}
	
