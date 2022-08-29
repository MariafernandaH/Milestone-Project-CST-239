package milestone;
import java.util.Scanner;
public class DescriptionProducts {
	protected static String ds1 = "Short Sword meant for closer combat.";
	protected static String ds2 = "Broad Sword meant for honorable battle, design for cutting down enemies.";
	protected static String ds3 = "Wooden Bow made of the strongest and finest wood.";
	protected static String ds4 = "Arrows With Quiver Package. 20 arrows made of the strongest and finest wood, quiver made of "
			+ "the finest leather.";
	protected static String dhp = "Full Health Potion meant to fill up health bar up to 100%.";
	protected static String dhhp = "Half Health Potion meant to fill up health bar up to 50%.";
	protected static String darmor1 = "Helmet made of the strongest metal this side of the kingdom.";
	protected static String darmor2 = "Leather Gloves are still very breathable and have superior mobility.";
	protected static String darmor3 = "Leather Boots to protect toes from goblins and frostbite. Very heavy.";
	protected static String darmor4 = "Metal Shield made from the strongest metal this side of the kingdom.";
	protected static String darmor5 = "Wooden Shield made from strong wood, for those looking to spend less on the metal shield.";
	protected static String darmor6 = "Protect your insides with this Metal Body Plate, made from the strongest"
			+ "metal this side of the kingdom.";

	static Scanner scnr = new Scanner(System.in);
	
	protected static void getDescriptionProducts() {
		String input = scnr.next();
		if (input.equals("short sword")) {
			System.out.println("Excellent choice! That is the " + ds1);

		}
		else if (input.equals("broad sword")) {
			System.out.println("Excellent choice! That is the " + ds2);
		}
		else if (input.equals("wooden bow")) {
			System.out.println("Excellent choice! That is the " + ds3);
		}
		else if (input.equals("arrows and quiver")) {
			System.out.println("Excellent choice! That is the " + ds4);
		}
		else if (input.equals("full health potion")) {
			System.out.println("Excellent choice! That is the " + dhp);
		}
		else if (input.equals("half health potion")) {
			System.out.println("Excellent choice! That is the " + dhhp);
	}	
		else if (input.equals("metal helmet")) {
		System.out.println("Excellent choice! That is the " + darmor1);
	}	
		else if (input.equals("leather gloves")) {
		System.out.println("Excellent choice! Those are the " + darmor2);
		}	
		else if (input.equals("leather boots")) {
			System.out.println("Excellent choice! Those are the " + darmor3);
		}
		else if (input.equals("metal shield")) {
			System.out.println("Excellent choice! That is the " + darmor4);
		}
		else if (input.equals("wooden shield")) {
			System.out.println("Excellent choice! That is the " + darmor5);
		}
		else if (input.equals("metal body plate")) {
			System.out.println("Excellent choice! " + darmor6);
	}
		else {
			System.out.println("I'm not sure I understand, please try again. I can help you if you just say which item you"
					+ "are most interested in hearing about right now"); 
					}
		}
}
