import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import static java.lang.System.out;




public class MapPanel extends JPanel implements MouseListener{
	
	protected Map m;
	JPanel left, right;
	ImageIcon northImage = new ImageIcon("src/north.png");
	ImageIcon eastImage = new ImageIcon("src/east.png");
	ImageIcon southImage = new ImageIcon("src/south.png");
	ImageIcon westImage = new ImageIcon("src/west.png");
	JButton north = new JButton(northImage);
	JButton west = new JButton(westImage);
	JButton east = new JButton(eastImage);
	JButton south = new JButton(southImage);
	
	public MapPanel(Map m) {
		this.m=m;
		
		setBounds(0, 560, 510, 400);
		setBackground(Color.green);
		JPanel left = makeMapLeft();
		JPanel right = makeRight();
		
		
		setLayout(null);
		left.setBounds(0,0,210,210);
		right.setBounds(210,0,300,200);
		add(left);
		add(right);
	    setVisible(true);
	    
	
	}
	public JPanel makeRight(){
		
		JPanel r = new JPanel();
		r.setLayout(null);
		
		//Direction Panel
		north.addMouseListener(this);
		west.addMouseListener(this);
		south.addMouseListener(this);
		east.addMouseListener(this);
		north.setBounds(100,20,60,80);
		north.setContentAreaFilled(false); north.setBorderPainted(false);
		west.setBounds(10,70,90,60);
		west.setContentAreaFilled(false); west.setBorderPainted(false);
		east.setBounds(160,70,90,60);
		east.setContentAreaFilled(false); east.setBorderPainted(false);
		south.setBounds(100,120,60,80);
		south.setContentAreaFilled(false); south.setBorderPainted(false);
		r.add(north);
		r.add(east);
		r.add(south);
		r.add(west);
		//end Direction Panel
		return r;
	}
	public JPanel makeMapLeft(){
		JPanel l = new JPanel();
		l.setLayout(null);
		
		MapSquare[][] pan = new MapSquare[7][7];
		
		//actual game with fog of war
				for(int i=0; i<7; i++){
					for(int j=0;j<7;j++){
						String imageName = "";
						DungeonRoom room  = m.get(j, i);
						if(m.playerLocation.x==j && m.playerLocation.y==i){
							imageName+="p";
						}
						if(room!=null){
							if(room.getDiscovered()){
								for(int k=0;k<4;k++){
									if(room.getExits(k))
										imageName+="t";
									else
										imageName+="f";
								}
							}else if(room.getNearby()){
								imageName+="gggg";
							}else
								imageName+="ffff";
						}else
								imageName+="ffff";
						imageName+=".png";
						pan[i][j] = new MapSquare(j,i, imageName);
						l.add(pan[i][j]);
					}
				}
				/*
				//for demonstration purposes, shows whole map
				for(int i=0; i<7; i++){
					for(int j=0;j<7;j++){
						String imageName = "";
						DungeonRoom room  = m.get(j, i);
						if(m.playerLocation.x==j && m.playerLocation.y==i){
							imageName+="p";
						}
						if(room!=null){
							for(int k=0;k<4;k++){
								if(room.getExits(k))
									imageName+="t";
								else
									imageName+="f";
							}
							if(room.hasBoss()){
								imageName+="b";
							}
						}else
								imageName+="ffff";
						
						imageName+=".png";
						pan[i][j] = new MapSquare(j,i, imageName);
						left.add(pan[i][j]);
					}
				}*/
				return l;
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		
	}
	

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==north){
			m.movePlayer(0);
		}else if(e.getSource()==east){
			m.movePlayer(1);
		}else if(e.getSource()==south){
			m.movePlayer(2);
		}else if(e.getSource()==west){
			m.movePlayer(3);
		}
		updateMap();
	}
	public void updateMap(){
		this.setVisible(false);
		this.removeAll();
		left = makeMapLeft();
		right = makeRight();
		left.setBounds(0,0,210,210);
		right.setBounds(210,0,300,200);
		add(left);
		add(right);
		this.setVisible(true);
	}
}
	
