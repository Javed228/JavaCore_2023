package Core;
import java.util.*;

public class SwitchCase {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number :");
		int n1 = sc.nextInt();
		System.out.println("Enter the second number :");
		int n2 = sc.nextInt();
		
		sc.nextLine();
		System.out.println("Enter Operation (+ , - , * , / , %)");
		String op = sc.nextLine();
		
		char o = op.charAt(0);
		
		switch(o) {
			case '+' : System.out.println("Sum is :"+(n1+n2));
				break;
			case '-' : System.out.println("Substraction is :"+(n1-n2));
				break;
			case '*' : System.out.println("Multi is : "+n1*n2);
				break;
			case '/' : System.out.println("Div is :"+(n1/n2));
				break;
			case '%' : System.out.println("Mod is :"+(n1%n2));
				break;
			default : System.out.println("Enter valid Case");
		}
	}
}
