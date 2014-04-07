import java.util.Random;
import static java.lang.System.out;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Map {
	
	Random rand = new Random();
	protected DungeonRoom[][] grid = new DungeonRoom[7][7];
	protected DungeonRoom start;
	int totalRooms=0;
	
	//constructor which accepts minimum distance to boss (might change by level?)
	public Map(int len){
		int x,y;
		x = rand.nextInt(2);
		y = rand.nextInt(2);

		GridCoord where = new GridCoord();
		switch(x){
			case 0: where.x=0; break;
			case 1: where.x=6; break;
		}
		switch(y){
			case 0: where.y=0; break;
			case 1: where.y=6; break;
		}
		start = new DungeonRoom(where);
		totalRooms++;
		//test case
		
		//out.println("start room at "+where.x+" "+where.y);
		grid[where.x][where.y] = start; //add to grid
		branchRoom(start, len);
		
			
	}
	public void branchRoom(DungeonRoom prev, int len){
		if(len>0 && totalRooms<20){ //out.println(len);
			int x=prev.getX();
			int y=prev.getY();
		int num_doors = rand.nextInt(3)+1;
		for(int i=0; i<num_doors; i++){
			int door_loc = rand.nextInt(4);
			if (!prev.getExits(door_loc)){ //there is not already a door there
				switch(door_loc){
				case 0: /*NORTH*/ 
					if(y!=0){ // making sure we don't put a door to the map's edge  
						if(grid[x][y-1]==null){ //need to make new room
							prev.setExits(0, true);
							DungeonRoom north = new DungeonRoom(new GridCoord(x,y-1));
							totalRooms++;
							north.setSouth(prev);
							grid[x][y].setNorth(north);
							grid[x][y-1] = north;
							//out.println("new room created -north " + totalRooms);
							branchRoom(north,len-1);
						}
						else
							branchRoom(grid[x][y-1],len);
					}else
						num_doors++;
					break;
					
				case 1: /*EAST*/ 
					if(x!=6){
						if(grid[x+1][y]==null){
							prev.setExits(1, true);
							DungeonRoom east = new DungeonRoom(new GridCoord(x+1,y));
							totalRooms++;
							east.setWest(prev);
							prev.setEast(east);
							grid[x+1][y] = east;
							//out.println("new room created -east " + totalRooms);
							branchRoom(east,len-1);
						}
						else
							branchRoom(grid[x+1][y],len);
					}else
						num_doors++;
					break;
					
				case 2: /*SOUTH*/ 
					if(y!=6){
						if(grid[x][y+1]==null){
							prev.setExits(2, true);
							//TODO: create new room
							DungeonRoom south = new DungeonRoom(new GridCoord(x,y+1));
							totalRooms++;
							south.setExits(0, true);
							south.setNorth(prev);
							prev.setSouth(south);
							grid[x][y+1] = south;
							//out.println("new room created -south " + totalRooms);
							branchRoom(south,len-1);
						}else
							branchRoom(grid[x][y+1],len);
					}else
						num_doors++;
					break;
					
				case 3: /*WEST*/ 
				if(x!=0){
					if(grid[x-1][y]==null){
						prev.setExits(3, true);
						//TODO: create new room
						DungeonRoom west = new DungeonRoom(new GridCoord(x-1,y));
						totalRooms++;
						west.setEast(prev);
						prev.setWest(west);
						west.setExits(1, true);
						grid[x-1][y] = west;
						//out.println("new room created -west " + totalRooms);
						
						branchRoom(west,len-1);
					}else
						branchRoom(grid[x-1][y],len);
				}else
					num_doors++;
				break;
/*end switch*/	}
			}
 		}
		}else while(totalRooms<12){
 			branchRoom(prev,12-totalRooms);
 		}
		
		//TODO: map created. Now, decide boss ?and start? location
		
	}
	public DungeonRoom get(int x, int y){
		return grid[x][y];		
	}
	public int getRooms(){
		return totalRooms;
	}
public static void main(String [ ] args) throws IOException{ //testing
	Map m = new Map(9);
	if(m.getRooms()<12)
		m.branchRoom(m.getStart(),12);
	JFrame frame = new JFrame();
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
				if(room.getDiscovered())
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
	
	frame.setLayout(null);

	left.setBounds(0,0,400,400);
	right.setBounds(402,0,400,400);
	frame.add(left);
	frame.add(right);
	
	 frame.setPreferredSize(new Dimension(680,415));
	 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     frame.pack();
     frame.setVisible(true);
}

}