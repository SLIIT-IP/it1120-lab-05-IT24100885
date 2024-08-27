import java.util.Scanner;
public class IT24100885Lab5Q1 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		//variables
		int large=0;
		int small=0;
		
		//getting user inputs and add that values for the variables.
		System.out.print("Enter the first integer: ");
		int first= input.nextInt();
	
		System.out.print("Enter the second integer: ");
		int second= input.nextInt();
	
		System.out.print("Enter the third integer: ");
		int third= input.nextInt();
	
		System.out.println();
	
		//display the all user inputs
		System.out.println("User entered numbers are: "+first+" "+second+" "+third);
	
		//finding the largest number from user inputs
		if (first>second && first>third)
		{
			large=first;
		}
		else if (second>third)
		{
			large=second;
		}
		else 
		{
			large=third;
		}
		
		//finding the smallest number from user inputs
		if (first<second && first<third)
		{
			small=first;
		}
		else if (second<third)
		{
			small=second;
		}
		else
		{
			small=third;
		}
		
		//display of the smallest no. and the largest no.
		System.out.println("The smallest number is: "+small);
		System.out.print("The Largest number is: " +large );
	}
}