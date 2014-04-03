import java.util.Scanner;

public class Player extends Character{
	private int currentFloor;
	protected ArmorWeaponEquip equipped;
	
	Player(String name) {
		super();
		super.setName(name);
		super.setRace(race);
		super.setRole("Player");
		super.setJob("Adventurer");
		super.setLevel(1);
		super.setExp(0);
		super.setHp(25);
		super.setMaxHp(25);
		super.setStrength(11);
		super.setDexterity(11);
		super.setStamina(11);
		super.setIntelligence(11);
		super.setDefense(11);
		super.backpack = new Pack();
		
	}
	
	public int getCurrentFloor() {return currentFloor;}
	public void setCurrentFloor(int floor) {this.currentFloor = floor;}
	
	public void itemOptions() {
		Scanner console = new Scanner(System.in);
		this.getPack().showItems();
		System.out.println("1: Use Item 2: Exit");
		int action = console.nextInt();
		switch(action) {
			case 1: {
				this.getPack().useItem(this);
				break;
			}
			case 2: {
				break;
			}
			default: {
				System.out.println("Incorrect Input");
				itemOptions();
				break;
			}
		}
	}
}
