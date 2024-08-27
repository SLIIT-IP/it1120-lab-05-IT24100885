import java.util.Scanner;
public class IT24100885Lab5Q3 {
	public static final int chargeperday = 48000;
	public static final int discount3to4 = 10;
	public static final int discount5orMore = 20;
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);

		System.out.print("Enter start date (1-31): ");
		int startdate = input.nextInt();
		
		System.out.print("Enter end date (1-31): ");
		int enddate = input.nextInt();
		
		System.out.println("");
		
		if (startdate < 1 || startdate > 31 || enddate < 1 || enddate >31)
		{
			System.out.print("Error: Days must be between 1 and 31");
			return;
		}
		
		if (startdate >= enddate)
		{
			System.out.print("Error: Start date must be less than End Date");
			return;
		}
		
		int reserved = enddate - startdate;
		int discountrate = 0;
		
		if (reserved >= 3 && reserved < 5)
		{
			discountrate = discount3to4;
		}
		else if (reserved >= 5)
		{
			discountrate = discount5orMore;
		}
		
		double total = chargeperday * reserved;
		double discount = total * discountrate / 100.0;
		total -= discount;
		
		System.out.println("Room Charge per Day: " + chargeperday + "/=");
		System.out.println("Number of Days Reserved: " + reserved);
		System.out.println("Total Amount to be Paid:" + total);
	}
}