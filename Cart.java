package milestone;

import java.io.PrintWriter;
import java.io.Writer;
import java.util.Scanner;

public class Cart extends NameProducts {
protected static String yesPurchase = "Would you like to purchase this?";
protected static String cancel = "Ok, I'll put it back.";
private static final Writer customer = null;
static Scanner scnr = new Scanner(System.in);
PrintWriter output = new PrintWriter(customer);
static Object input = scnr.next();	


}
