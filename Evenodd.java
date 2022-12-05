import java.util.Scanner;

class Evenodd { 
	public static void main(String [] evenodd) {
		

		Scanner sc = new Scanner(System.in);
		System.out.print(" Enter any Number :  " );
		int a = sc.nextInt();

		if(a % 2 == 0)
			System.out.println( a + " is Even number ");
		else
			System.out.println( a + " is Odd number  ");

	}
}