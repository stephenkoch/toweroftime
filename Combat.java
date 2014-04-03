import java.util.Random;
import java.util.Scanner;


public class Combat {
		public Character p1;
		public Character p2;

	
	private static void attack(Character p1, Character p2) {
		int baseAttackBonus = p1.getDexterity()/3;
		int armorClass = p2.getDefense()/3;
		Random dice = new Random();
			if ((baseAttackBonus+(dice.nextInt(19)+1)) > (armorClass+(dice.nextInt(19)+1))) {
				System.out.print("Hit! ");
				int damage = (p1.getStrength()/3+(dice.nextInt(4)+1));
				p2.setHp(p2.getHp()-damage);
				
				System.out.print(damage +" damage to the "+p2.getRace()+"!\n");
			}
			else {
				System.out.println("Miss!");
			}
	}
	
	private static void flee(Character p1, Character p2) {
		int fleeAttempt = p1.getDexterity()/3+p1.getStamina()/3;
		int fleeStop = p2.getDexterity()/3+p2.getStamina()/3;
		Random dice = new Random();
			if((fleeAttempt+(dice.nextInt(19)+1)) > (fleeStop+(dice.nextInt(19)+1))) {
				if(p1.getRole().equalsIgnoreCase("Player")) {
					System.out.println("You have successfully fled from the battle");
				}
				else if(p1.getRole().equalsIgnoreCase("Legendary Enemy")){
					System.out.println(p1.getName()+" has successfully fled from the battle");
				}
				else {
					System.out.println("The "+p1.getRace()+" has successfully fled from the battle");
				}
			}
			else {
				if(p1.getRole().equalsIgnoreCase("Player")) {
					System.out.println("You couldn't flee from the battle");
				}
				else if(p1.getRole().equalsIgnoreCase("Legendary Enemy")){
					System.out.println(p1.getName()+" couldn't flee from the battle");
				}
				else {
					System.out.println("The "+p1.getRace()+" couldn't flee from the battle");
				}
			}
	}
	
	public static void combatOneOpponent(Player player, Character opponent) {

		if(player.getHp() <= 0) {
			gameOver();
		}
		else if(opponent.getHp() <= 0) {
			win();
			assignExp(player, opponent);
		}
		else {
			Scanner console = new Scanner(System.in);
			int action;
		
			System.out.println("What do you do? (1: Attack  2: Items 3: SpellBook 4: Flee)");
			action = console.nextInt();
			switch(action) {
				case 1: {
					attack(player, opponent);
					break;
				}
				case 2: {
					player.itemOptions();
					break;
				}
				case 3: {
					player.SpellOptions(opponent);
					break;
				}
				case 4:
					System.out.println("You attempt to flee!");
					flee(player, opponent);
					break;
				}
		
			if(player.getHp() <= 0) {
				gameOver();
			}
			else if(opponent.getHp() <= 0) {
				win();
				assignExp(player, opponent);
			}
			else {
		
				Random enemygen = new Random();

				System.out.println("The "+opponent.getRace()+"'s turn!");
				switch(enemygen.nextInt(1)) {
					case 0: {
						System.out.println("The "+opponent.getRace()+" is attacking!");
						attack(opponent, player);
						break;
					}
					case 1: {
						System.out.println("The "+opponent.getRace()+"'s is attempting to flee!");
						flee(opponent, player);
						break;
					}
				}
					if(player.getHp() <= 0) {
						gameOver();
				}
					else if(opponent.getHp() <= 0) {
						win();
						assignExp(player, opponent);
					}
					else {
						combatOneOpponent(player, opponent);
					}
			}
			}
		}
	
	public static void gameOver() {
		System.out.println("You have been slain.");
		System.exit(0);
	}
	
	public static void win() {
		System.out.println("You have slain the enemy."); //change to say "You have slain X!" where X is the enemy.
	}
	
	public static void assignExp(Character player, Character opponent) {
		player.setExp(player.getExp()+(opponent.getLevel()*10));
	}
	
}
