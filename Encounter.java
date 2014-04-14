import java.util.Random;


public class Encounter {
	private int encountID;
	Game GAME;
	
	public Encounter(Game g) {
		Random encountGen = new Random();
		encountID = (encountGen.nextInt()%3+1);
		this.GAME = g;
	}
	
	public void encounterIntro(Player player) {
		if (encountID%2 == 1) {
			//COMBAT
			GAME.inCombat = true;
			toCombat(player);
			
		}
		if (GAME.LEVEL.grid[GAME.LEVEL.playerLocation.x][GAME.LEVEL.playerLocation.y].getTreasure()) {
			//TREASURE
			GAME.LEVEL.grid[GAME.LEVEL.playerLocation.x][GAME.LEVEL.playerLocation.y].setTreasure(false);
		}
		//EMPTY ROOM
		GAME.
		
	}
	
	private void toCombat(Player player) {
		Character opponent = enemyGen();
		if (opponent.getName() == null)
			System.out.println("You have encountered a(n) " + opponent.getRace() + "!");
		else
			System.out.println("You have encountered "+opponent.getName()+" the "+opponent.getRace()+"!");
		Combat.combatOneOpponent(opponent);
	}
	private void toTreasure(Character player) {
		System.out.println("Not yet implemented");
	}
	
	
	public static Character enemyGen() {
		Random enemyGenerator = new Random();
		int s = enemyGenerator.nextInt(1000);
		Character opp;
		switch(s) {
			case 1: {
				opp = new LegendaryEnemy("Thor", "Asgardian God", 15, 80, 40, 40, 35, 30, 35);
				break;
			}
			case 2: {
				opp = new LegendaryEnemy("Brodin", "Swohella God", 15, 80, 40, 40, 35, 30, 35);
				break;
			}
			default: {
				if(s > 500) {
					opp = new Enemy(null, "Goblin", 1, 5, 4, 2, 3, 3, 4);
				}
				else {
					opp = new Enemy(null, "Kobold", 1, 3, 2, 1, 2, 2, 2);
				}
			}
		}
		return opp;
	}
}
