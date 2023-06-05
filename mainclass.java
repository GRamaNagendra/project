package project2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class mainclass {
	
public static void main(String[] args)
{
	try {
	Scanner sc =new Scanner(System.in);
	System.out.println("For signin Press 1");
	System.out.println("For Login Press 2");
	System.out.println("For Update Press 3");
	
	
	int n =sc.nextInt();
	mainpage mp = checker.getselected(n);
	dto ob =new dto();
	mp.display(ob);
	
}

catch (InputMismatchException e) {
	// TODO: handle exception
	 System.out.println("This Enter Keys are not acceptable please click according to the requirments");
main(null);
 }	
}
}
