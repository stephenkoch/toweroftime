import java.util.Random;
import java.util.Scanner;


public class Combat {
	private static Character enemy;
	
	Combat(Character opponent) {
		enemy = opponent;
	}
	

	public static void attack() {
		int attackerBaseAttackBonus = TowerOfTime.GAME.PLAYER.getCurrentDexterity()/3;
		int defenderArmorClass = enemy.getDefense()/3;
		String update;
		Random dice = new Random();
			if ((attackerBaseAttackBonus+(dice.nextInt(19)+1)) > (defenderArmorClass+(dice.nextInt(19)+1))) {
	
				int damage = (Game.PLAYER.getCurrentStrength()/3+(dice.nextInt(4)+1));
				enemy.setHp(enemy.getHp()-damage);
				
				update = (damage +" damage to the "+enemy.getRace());
				System.out.print(damage +" damage to the "+enemy.getRace()+"!\n");
				TowerOfTime.GAME.THEGAMEFRAME.PANELE.updateActionLog(update);

			}
			else {
				System.out.println("Miss!");
				TowerOfTime.GAME.THEGAMEFRAME.PANELE.updateActionLog("You missed!");
			}
			checkCombatWinnerPlayer();
	}

	private static void enemyAttack() {
		int attackerBaseAttackBonus = enemy.getDexterity()/3;
		int defenderArmorClass = TowerOfTime.GAME.PLAYER.getCurrentDefense()/3;
		String update;
		Random dice = new Random();
		if ((attackerBaseAttackBonus+(dice.nextInt(19)+1)) > (defenderArmorClass+(dice.nextInt(19)+1))) {

			int damage = (enemy.getStrength()/3+(dice.nextInt(4)+1));
			TowerOfTime.GAME.PLAYER.setHp(TowerOfTime.GAME.PLAYER.getHp()-damage);
			
			update = (damage +" damage to you!");
			
			System.out.print(damage +" damage to you!\n");
			TowerOfTime.GAME.THEGAMEFRAME.PANELE.actionLog.addElement(update);

		}
		else {
			System.out.println("Miss!");
			TowerOfTime.GAME.THEGAMEFRAME.PANELE.actionLog.addElement("Miss!");

		}
		checkCombatWinnerEnemy();
}
	
	private static void checkCombatWinnerPlayer() {
		if(Game.PLAYER.getHp() <= 0) {
			gameOver();
			TowerOfTime.GAME.THEGAMEFRAME.dispose();
		}
		else if(enemy.getHp() <= 0) {
			win();
			assignExp(enemy);
			TowerOfTime.GAME.inCombat = false;
			TowerOfTime.GAME.THEGAMEFRAME.update();
		}
		else {
			enemyAttack();
		}	
	}
	private static void checkCombatWinnerEnemy() {
		if(Game.PLAYER.getHp() <= 0) {
			gameOver();
		}
		else if(enemy.getHp() <= 0) {
			win();
			assignExp(enemy);
		}
	}
	
	public static void gameOver() {
		System.out.println("You have been slain.");
		System.exit(0);
	}
	
	public static void win() {
		System.out.println("You have slain the enemy."); //change to say "You have slain X!" where X is the enemy.
		TowerOfTime.GAME.THEGAMEFRAME.PANELE.actionLog.addElement("You have slain the enemy.");
	}
	
	public static void assignExp(Character enemy) {
		int exp = Game.PLAYER.getExp()+(enemy.getLevel()*10);
		Game.PLAYER.setExp(exp);
		TowerOfTime.GAME.THEGAMEFRAME.PANELE.actionLog.addElement("You have gained " + exp + " experience!");

	}
	public Character getEnemy() {return enemy;}
}
