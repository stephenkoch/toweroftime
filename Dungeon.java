
public class Dungeon {
	private int dungeonLevel;
	DungeonRoom[][] dungeon;
	Character player;
	
	Dungeon(Character player) {
		this.player = player;
		this.dungeonLevel = player.getLevel();
		dungeon = new DungeonRoom[10][10];
		player.setLocationX(0); //start point X
		player.setLocationY(0); //start point Y
	}
	
	public void moveNorth() {
		if(player.getLocationY() == 9) {
			System.out.println("This is the edge of the dungeon");
		}
		else {
			player.setLocationY(player.getLocationY()+1);
		}
	}
	public void moveEast() {
		if(player.getLocationX() == 9) {
			System.out.println("This is the edge of the dungeon");
		}
		else {
			player.setLocationX(player.getLocationX()+1);
		}
	}
	public void moveSouth() {
		if(player.getLocationY() == 0) {
			System.out.println("This is the edge of the dungeon");
		}
		else {
			player.setLocationY(player.getLocationY()-1);
		}
	}
	public void moveWest() {
		if(player.getLocationX() == 0) {
			System.out.println("This is the edge of the dungeon");
		}
		else {
			player.setLocationX(player.getLocationX()-1);
		}
	}
}
	

