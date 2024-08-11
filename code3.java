import java.util.Scanner;

public class perfectSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		System.out.println("enter no :");
		int n=s.nextInt();
		
		double squareRoot=Math.sqrt(n);
		double check=Math.floor(squareRoot); //Rounds up to the nearest integer of a decimal number
		
			if(squareRoot==check)
			{
				System.out.println("Square root "  +squareRoot);
				System.out.println("Perfect square");
			}else
				System.out.println("Not Perfect Square");
	}

}
