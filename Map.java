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
	int totalRooms, numTreas;

	//constructor which accepts minimum distance to boss (might change by level?)
	public Map() {
		totalRooms=0;
		numTreas=0;
		int x,y;
		x = rand.nextInt(7);
		y = rand.nextInt(2)+5;

		GridCoord where = new GridCoord(x,y);

		start = new DungeonRoom(where);


		grid[where.x][where.y] = start; //add to grid
		branchRoom(start, 0);

		for(int i=0;i<7;i++){
			for(int j=0; j<7; j++){
				if(grid[i][j]!=null){
					if(numTreas<6){
						totalRooms++;
						int g=grid[i][j].getExits();
						out.println(g);
						int t=rand.nextInt(100);
						switch(g){
						case 4: if(t<10){
								grid[i][j].giveTreasure();
								numTreas++;
							}break;
						case 1: if(t<60){
								grid[i][j].giveTreasure();
								numTreas++;
							}break;
						case 2: if(t<20){
								grid[i][j].giveTreasure();
								numTreas++;
							}break;
						case 3: if(t<10){
								grid[i][j].giveTreasure();
								numTreas++;
							}break;
						}
					}
				}
			}
		}
	}
	public void branchRoom(DungeonRoom prev, int rooms){
	  if(rooms<12){ //out.println(rooms);
		int x=prev.getX();
		int y=prev.getY();
		int num_doors = rand.nextInt(3);
		for(int i=0; i<num_doors; i++){
			int door_loc = rand.nextInt(4);
			if(!prev.getExits(door_loc)){ //there is not already a door there
				switch(door_loc){
				case 0: /*NORTH*/ 
					if(y!=0){ // making sure we don't put a door to the map's edge  
						if(grid[x][y-1]==null){ //need to make new room
							prev.setExits(0, true);
							DungeonRoom north = new DungeonRoom(new GridCoord(x,y-1));
							north.setSouth(prev);
							grid[x][y].setNorth(north);
							grid[x][y-1] = north;
							//out.println("new room created -north " + totalRooms);
							branchRoom(north,rooms+1);
						}
					}else
						num_doors++;
					break;

				case 1: /*EAST*/ 
					if(x!=6){
						if(grid[x+1][y]==null){
							prev.setExits(1, true);
							DungeonRoom east = new DungeonRoom(new GridCoord(x+1,y));
							east.setWest(prev);
							prev.setEast(east);
							grid[x+1][y] = east;
							//out.println("new room created -east " + totalRooms);
							branchRoom(east,rooms+1);
						}
					}else
						num_doors++;
					break;

				case 2: /*SOUTH*/ 
					if(y!=6){
						if(grid[x][y+1]==null){
							prev.setExits(2, true);
							//TODO: create new room
							DungeonRoom south = new DungeonRoom(new GridCoord(x,y+1));
							south.setExits(0, true);
							south.setNorth(prev);
							prev.setSouth(south);
							grid[x][y+1] = south;
							//out.println("new room created -south " + totalRooms);
							branchRoom(south,rooms+1);
						}
					}else
						num_doors++;
					break;

				case 3: /*WEST*/ 
				if(x!=0){
					if(grid[x-1][y]==null){
						prev.setExits(3, true);
						//TODO: create new room
						DungeonRoom west = new DungeonRoom(new GridCoord(x-1,y));
						west.setEast(prev);
						prev.setWest(west);
						west.setExits(1, true);
						grid[x-1][y] = west;
						//out.println("new room created -west " + totalRooms);

						branchRoom(west,rooms+1);
					}
				}else
					num_doors++;
				break;
/*end switch*/	}
			}
 		}
	  }

		//TODO: map created. Now, decide boss ?and start? location

	}
	public DungeonRoom get(int x, int y){
		return grid[x][y];		
	}
	public int getRooms(){
		return totalRooms;
	}

}