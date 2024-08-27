import java.util.Scanner;
public class IT24100885Lab5Q2 {
	public static void main(String[] args) {
	Scanner input = new Scanner (System.in);
	
	System.out.print("Enter the number of new members introduced: ");
	int newmember = input.nextInt();
	
	System.out.println("");
	
	if (newmember<0)
	{
		System.out.print("Input must be 0 or greater.");
	}
	else 
	{
	String price;
		switch(newmember)
		{
			case 0:
			price = "No price";
			break;
			
			case 1:
			price = "Pen";
			break;
			
			case 2:
			price = "Umbrella";
			break;
			
			case 3:
			price = "Bag";
			break;
			
			case 4:
			price = "Travelling Bag";
			break;
			
			default:
			price = "Headphone";
			break;
		}
		
	System.out.print("Prize is: "+ price);
	}
	
	}
}