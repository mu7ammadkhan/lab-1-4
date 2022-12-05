import java.util.*;

class Cpn {
	public static void main(String [] Cpn ) {

		int Matric_percentage,Inter_percentage,Test_score,Calculation;


		System.out.print("Enter Matric Percentage :  ");
		Scanner a = new Scanner(System.in);
		Matric_percentage = a.nextInt();
	
		System.out.print("Enter Matric Percentage :  ");
		Scanner b = new Scanner(System.in);
		Inter_percentage = b.nextInt();
		
		System.out.print("Test_Score Percentage   :  ");
		Scanner c = new Scanner(System.in);
		Test_score = c.nextInt();


		Calculation = ((Matric_percentage*10)/100)+((Inter_percentage*30)/100)+((Test_score*60)/100);
		System.out.print("Your Cpn is             :  " + Calculation );
	}
}