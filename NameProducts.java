package milestone;
import java.util.Scanner;
public class NameProducts extends Price{
protected static String s1 = "short sword";
protected static String s2 = "broad sword";
protected static String s3 = "bow";
protected static String s4 = "arrows and quiver";
protected static String hp = "full health potion";
protected static String hhp = "half health potion";
protected static String armor1 = "metal helmet";
protected static String armor2 = "leather gloves";
protected static String armor3 = "leather boots";
protected static String armor4 = "metal shield";
protected static String armor5 = "wooden shield";
protected static String armor6 = "metal body plate";
protected static String yes = "yes";
protected static String no = "no";

static Scanner scnr = new Scanner(System.in);



protected static void getNameProducts() {
	String input = scnr.next();
	if (input.equals(yes)) {
		System.out.println("Here is the full list of our products, let me know if you'd like more details on each item: ");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(hp);
		System.out.println(hhp);
		System.out.println(armor1);
		System.out.println(armor2);
		System.out.println(armor3);
		System.out.println(armor4);
		System.out.println(armor5);
		System.out.println(armor6);
	}
	else if (input.equals(no)) {
		System.out.println("Okay, try not to get eaten by a dragon then!");
	}
	else {
		System.out.println("I do not recognize that language. Your options are yes or no.");
	}
}}