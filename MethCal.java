package methods;

import java.util.Scanner;

public class MethCal {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("enter a number: ");
		int input  = s.nextInt();
		int x = 6; int y = 5;
		switch(input) {
		case 1:
			System.out.println( plusMethod(x,y) );
			break;
		case 2:
			System.out.println(subMethod(x,y));
			break;
		case 3:
			System.out.println(multMethod(x,y));
			break;
		case 4:
			System.out.println(divMethod(x,y));
			break;
		case 5:
			System.out.println("Вихід");
			System.exit(0);
		}
		
	}
	static int plusMethod (int x, int y) {
		return x + y;
	}
	static int subMethod (int x, int y) {
		return x - y ;
	}
	static int multMethod (int x, int y) {
		return x * y;
	}
	static int divMethod (int x, int y ) {
		return x/y ;
	}
}
