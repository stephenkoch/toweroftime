import java.util.Random;


public class DungeonRoom {
	private boolean[] exits;
	private DungeonRoom north = null;
	private DungeonRoom east = null;
	private DungeonRoom south = null;
	private DungeonRoom west = null;
	private boolean discovered;
	private Encounter encounter;
	
	DungeonRoom () {
		exits = new boolean[4]; //0:North 1:South 2:East 3:West
		exits[0] = false;
		exits[1] = false;
		exits[2] = false;
		exits[3] = false;
		randomDoors();
		discovered = false;
		encounter = new Encounter();
	}
	
	public boolean getExits(int i) { return exits[i]; }
	public DungeonRoom getNorth() { return north; }
	public DungeonRoom getEast() { return east; }
	public DungeonRoom getSouth() { return south; }
	public DungeonRoom getWest() { return west; }
	public boolean getDiscovered() { return discovered; }
	
	public void setExits(int direction, boolean x) { this.exits[direction] = x; }
	public void setNorth(DungeonRoom room) { this.north = room; }
	public void setEast(DungeonRoom room) { this.east = room; }
	public void setSouth(DungeonRoom room) { this.south = room; }
	public void setWest(DungeonRoom room) { this.west = room; }
	public void setDiscoveredTrue() {this.discovered = true;}
	
	private void randomDoors() {
		Random gen = new Random();
		int door = gen.nextInt(4);
		exits[door] = true;
		for(int i = 0; i < exits.length; i++) {
			if(gen.nextInt(1000)%2 ==1) {
				exits[i] = true;
			}
		}
	}
	public void engage() {
		encounter.encounterIntro(Game.PLAYER);
	}
	
}
