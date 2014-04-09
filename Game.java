import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import java.awt.*;

public class Game {
	public static boolean inCombat = false;
	public static Dungeon[] dungeon;
	public static Player PLAYER;
	public static StartGamePanel WINDOW;
	public Map LEVEL;
	
	public Game() throws IOException {
		LEVEL = new Map();
		while(LEVEL.getRooms()<15 || LEVEL.getRooms()>30)	
			LEVEL = new Map();
		PLAYER = createCharacter();
		WINDOW = new StartGamePanel(this);
	}
	
	public static Player createCharacter() {

        Player intplayer = new Player("Panda");
        intplayer.setRace(intplayer.selectRace());
        return intplayer;
	}
	
	public static Player loadCharacter() {
              Scanner console = new Scanner(System. in);
               System.out.println( "What is the name of your character?" );
              String input = console.nextLine();
              Player loadPlayer = new Player(input);
               try {
                     BufferedReader reader = new BufferedReader(new FileReader(input+".txt" ));
                     String line = null;
                      try {
                            while((line=reader.readLine()) != null) {
                                  String[] parts = line.split( "\\~");
/*                                for (String part: parts) {
                                         System.out.println(part);
                                  }*/
                                   int x = 0;    
                                  loadPlayer.setName(String. valueOf(parts[x])); x++;
                                  loadPlayer.setRace(String. valueOf(parts[x])); x++;
                                  loadPlayer.setRole(String. valueOf(parts[x])); x++;
                                  loadPlayer.setJob(String. valueOf(parts[x])); x++;
                                  loadPlayer.setLevel(Integer. valueOf(parts[x])); x++;
                                  loadPlayer.setExp(Integer. valueOf(parts[x])); x++;
                                  loadPlayer.setHp(Integer. valueOf(parts[x])); x++;
                                  loadPlayer.setMp(Integer. valueOf(parts[x])); x++;
                                  loadPlayer.setMaxHp(Integer. valueOf(parts[x])); x++;
                                  loadPlayer.setMaxMp(Integer. valueOf(parts[x])); x++;
                                  loadPlayer.setStrength(Integer. valueOf(parts[x])); x++;
                                  loadPlayer.setDexterity(Integer. valueOf(parts[x])); x++;
                                  loadPlayer.setStamina(Integer. valueOf(parts[x])); x++;
                                  loadPlayer.setIntelligence(Integer. valueOf(parts[x])); x++;
                                  loadPlayer.setMind(Integer. valueOf(parts[x])); x++;
                                  loadPlayer.setDefense(Integer. valueOf(parts[x])); x++;
                           }
                     } catch (IOException e) {
                            // TODO Auto-generated catch block
                           e.printStackTrace();
                     }
              } catch (FileNotFoundException e) {
                      // TODO Auto-generated catch block
                     e.printStackTrace();
              }
               return loadPlayer;
       }
       
	

	public static void saveCharacter(Player PLAYER) {
	PrintWriter writer = null;
				try { writer = new PrintWriter(PLAYER.getName()+".txt", "UTF-8"); }
               catch (FileNotFoundException e) { System. out.println("Error with txt doc"); }
               catch (UnsupportedEncodingException e) { System .out .println("Error with txt doc"); }
               writer.println(
                           PLAYER.getName()+ "~"+PLAYER.getRace()+"~" +
                            PLAYER.getRole()+ "~"+PLAYER.getJob()+"~" +PLAYER.getLevel()+"~"+
                            PLAYER.getExp()+ "~"+PLAYER.getHp()+"~" +PLAYER.getMp()+"~"+
                            PLAYER.getMaxHp()+ "~"+PLAYER.getMaxMp()+"~" +PLAYER.getStrength()+"~"+
                            PLAYER.getDexterity()+ "~"+PLAYER.getStamina()+"~" +PLAYER.getIntelligence()+"~"+
                           PLAYER.getMind()+ "~"+PLAYER.getDefense());
               writer.close();
   }
       
       
	
	public static void main(String args[]) throws IOException {	
		try{UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName() );
		} catch (Exception e) {
			e.printStackTrace();
		}
		Game GAME = new Game();
	}
}
