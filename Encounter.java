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
	
	
	private static Enemy enemyGen() {
		Random enemyGenerator = new Random();
		int s = enemyGenerator.nextInt(1000);
		Enemy opp = EnemyCatalog.FlyingSpider;
//		switch(s) {
//			case 1: {
//				opp = EnemyCatalog.KoboldDefender;
//				break;
//			}
//			case 2: {
//				opp = EnemyCatalog.GoblinAssassin;
//				break;
//			}
//			default: 
//			{
//				if(s > 500) {
//					//String name, String race,level,hp,str,dex,sta,inte,def
//					opp = EnemyCatalog.KoboldDefender;
//				}
//				else if (s > 250)
//				{
//					opp = EnemyCatalog.KoboldMarauder;
//				}
//				else if (s > 100)
//					opp = EnemyCatalog.Rat;
//				else
//					opp = EnemyCatalog.Spider;
//			}
//		}
		return opp;
	}
	public Combat getCombat() {return combat;}
}
