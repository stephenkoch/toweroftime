import java.io.IOException;

import javax.swing.UIManager;


public class TowerOfTime {

	public static Game GAME;
	
	public static void main(String[] args) throws IOException {
		try{UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName() );
		} catch (Exception e) {
			e.printStackTrace();
		}
		//GAME is the global 
		GAME = new Game();

	}

}
