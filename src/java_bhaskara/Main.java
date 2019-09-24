package java_bhaskara;

import java.util.Scanner;

public class Main {

	
	 public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		System.out.print("Enter value A: ");
		int a = in.nextInt();
		
		System.out.print("Enter value B: ");
		int b = in.nextInt();
		
		System.out.print("Enter value C: ");
		int c = in.nextInt();
		
		System.out.println(Calculator.bhaskara(a,b,c));
		
	}
}
