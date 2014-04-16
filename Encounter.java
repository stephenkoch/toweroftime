import java.util.Random;


public class Encounter {
	private int encountID;
	Game GAME;
	private Combat combat;
	
	public Encounter() {
		Random encountGen = new Random();
		encountID = (encountGen.nextInt()%3+1);
	}
	
	public void encounterIntro() {
		if (encountID%2 == 1) {
			//COMBAT
			GAME.inCombat = true;
			startCombat();
			
		}
		//if (GAME.LEVEL.grid[GAME.LEVEL.playerLocation.x][GAME.LEVEL.playerLocation.y].getTreasure()) {
			//TREASURE
		//	GAME.LEVEL.grid[GAME.LEVEL.playerLocation.x][GAME.LEVEL.playerLocation.y].setTreasure(false);
		}
		//EMPTY ROOM
		
		
	
	
	private void startCombat() {
		combat = new Combat(enemyGen());
		//TODO:DISABLE ALL PANELS EXCEPT FOR ACTION PANEL
		if (combat.getEnemy().getName() == null){
			System.out.println("You have encountered a(n) " + combat.getEnemy().getRace() + "!");
			TowerOfTime.GAME.THEGAMEFRAME.PANELE.updateActionLog("You have encountered a(n) " + combat.getEnemy().getRace() + "!");
		}
		else{
			System.out.println("You have encountered "+combat.getEnemy().getName()+" the "+combat.getEnemy().getRace()+"!");
			TowerOfTime.GAME.THEGAMEFRAME.PANELE.updateActionLog("You have encountered "+combat.getEnemy().getName()+" the "+combat.getEnemy().getRace()+"!");
		}
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
			default: 
			{
				if(s > 500) {
					//String name, String race,level,hp,str,dex,sta,inte,def
					opp = new Enemy(null, "Goblin", 3, 2, 2, 2, 2, 1, 2);
				}
				else if (s > 250)
				{
					opp = new Enemy(null, "Kobold", 2, 2, 2, 1, 1, 1, 2);
				}
				else if (s > 100)
					opp = new Enemy(null, "Rat",1,1,1,1,0,0,0);
				else
					opp = new Enemy(null, "Spider",1,1,0,2,0,0,0);
			}
		}
		return opp;
	}
	public Combat getCombat() {return combat;}
}
