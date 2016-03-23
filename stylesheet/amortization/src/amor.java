import java.util.Scanner;

public class amor {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		
		System.out.print("\tLoan Amount:\t\t");
		float amount = scan.nextFloat();
		
		System.out.print("\tNumber of years:\t");
		int years = scan.nextInt();    
		
		System.out.print("\tAnnual Interest Rate:\t");
		float yearInterest = scan.nextFloat();
			
		int months = years * 12;
		float monthInterest = (yearInterest / months) / 100;
			
		float monthlyPayment = (float) ((amount * monthInterest * Math.pow(1 + monthInterest, months)) / (Math.pow(1 + monthInterest, months) - 1));

		System.out.format("\n\tMonthly Payment:\t%.2f", monthlyPayment);
		System.out.format("\n\tTotalPaymrnt:\t\t%.2f", (monthlyPayment * months));
			
		System.out.format("\n\n%-15s%-20s%-20s%-20s%-20s", "Payment #\n", "Interest", "Principal", "Total", "Balance");
		System.out.println("\n----------------------------------------------------------------------------------");
			
		for (int x = 1; x <= months; x++){
			float interest = amount * monthInterest;
			float principal = monthlyPayment - interest;
			float total = interest + principal;
			float balance = amount - principal;
			amount = balance;
				
			System.out.format("\n%-15d%-20.2f%-20.2f%-20.2f%-20.2f", x, interest, principal, total, balance);
		
		}
				
	}

}
