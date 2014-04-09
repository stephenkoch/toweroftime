import java.util.Random;
import java.util.Scanner;


public class Combat {
	
	private static void attack(Character enemy) {
		int baseAttackBonus = Game.PLAYER.getCurrentDexterity()/3;
		int armorClass = enemy.getDefense()/3;
		Random dice = new Random();
			if ((baseAttackBonus+(dice.nextInt(19)+1)) > (armorClass+(dice.nextInt(19)+1))) {
	
				int damage = (Game.PLAYER.getCurrentStrength()/3+(dice.nextInt(4)+1));
				enemy.setHp(enemy.getHp()-damage);
				
				System.out.print(damage +" damage to the "+enemy.getRace()+"!\n");
			}
			else {
				System.out.println("Miss!");
			}
	}
	
	
	
	public static void combatOneOpponent(Character enemy) {

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
	}
	
	public static void assignExp(Character enemy) {
		Game.PLAYER.setExp(Game.PLAYER.getExp()+(enemy.getLevel()*10));
	}
	
}
