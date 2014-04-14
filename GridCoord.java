import java.util.Random;

public class GridCoord {
	public int x, y;
	public GridCoord(int x, int y){
		this.x = x;
		this.y = y;
	}
	public String toString(){
		return "("+x+","+y+")";
	}
}
