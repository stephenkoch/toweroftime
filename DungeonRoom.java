import java.util.Random;


public class DungeonRoom {
	public boolean[] exits = new boolean[4]; //0:North 1:East 2:South 3:West
	public int minDistFromStart;
	private DungeonRoom north = null;
	private DungeonRoom east = null;
	private DungeonRoom south = null;
	private DungeonRoom west = null;
	private boolean discovered, treasure, bossRoom;
	private GridCoord location;
	private Encounter encounter;


	protected DungeonRoom (GridCoord a) {

		exits[0] = false;
		exits[1] = false;
		exits[2] = false;
		exits[3] = false;
		minDistFromStart=50;
		discovered = false;
		encounter = new Encounter();
		location = a;
	}

	public int getExits() {
		int e=0;
		for(int i=0;i<4;i++){
			if(exits[i])
				e++;
		}
		return e;
	}
	public boolean getExits(int i) { return exits[i]; }
	public boolean hasTreasure() { return treasure; }
	public boolean hasBoss() { return bossRoom; }
	public DungeonRoom getNorth() { return north; }
	public DungeonRoom getEast() { return east; }
	public DungeonRoom getSouth() { return south; }
	public DungeonRoom getWest() { return west; }
	public int getX() { return location.x; }
	public int getY() { return location.y; }
	public boolean getDiscovered() { return discovered; }
	public boolean getNearby(){
		boolean r = false;
		for(int i=0; i<4;i++){
			if(getExits(i)){
				switch(i){
				case 0: if(getNorth().getDiscovered())
					r=true;
				break;
				case 1:if(getEast().getDiscovered())
					r=true;
				break;
				case 2:if(getSouth().getDiscovered())
					r=true;
				break;
				case 3:if(getWest().getDiscovered())
					r=true;
				break;
				}
			}
		}
		return r;
	}

	public void isBoss() { bossRoom=true; }
	public void giveTreasure() { treasure=true; }
	public void setExits(int direction, boolean x) { this.exits[direction] = x; }
	public void setNorth(DungeonRoom room) { this.north = room; exits[0]=true; }
	public void setEast(DungeonRoom room) { this.east = room; exits[1]=true; }
	public void setSouth(DungeonRoom room) { this.south = room; exits[2]=true; }
	public void setWest(DungeonRoom room) { this.west = room; exits[3]=true; }
	public void setDiscoveredTrue() {this.discovered = true;}
	/*
	private void randomDoors() {
		Random gen = new Random();
		int door = gen.nextInt(4);
		exits[door] = true;
		for(int i = 0; i < exits.length; i++) {
			if(gen.nextInt(1000)%2 ==1) {
				exits[i] = true;
			}
		}
	}*/
	public void engage() {
		encounter.encounterIntro(Game.PLAYER);
	}

}