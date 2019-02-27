import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Create a program that reads in a dollar amount for the cost of an item
		 * Read in a second amount for how much was paid
		 * Print out how to break it into change
		 * How many 100s,50s,20s,10s,5s,toonies,loonies,quarters,dimes,nickels.
		 * If it does not end in a 5 or 0, you must round the number appropriately.
		 * If the payment doesn't cover the cost, output the amount still owing.
		 */
		Scanner in=new Scanner(System.in);
		System.out.println("How much is the cost?");
		double cost=in.nextDouble();
		System.out.println("How much was paid?");
		double payment=in.nextDouble();
		//TODO: Here is where your code goes
double change = payment-cost;
System.out.println("change amount: " +change );
		


		int q=(int)(change/100);
		double r=(change%100);

		System.out.println("Amount of 100 bills exactly :  " +q);

		int q2=(int)(r/50);

		double r2=(r%50); 

		System.out.println("Amount of 50 bills exactly:  " +q2);

		int q3=(int)(r2/20);

		double r3=(r2%20); 

		System.out.println("Amount of 20 bills exactly:  " +q3);
	
		int q4=(int)(r3/10);

		double r4=(r3%10); 

		System.out.println("Amount of 10 bills exactly:  " +q4);

		int q5=(int)(r4/5);

		double r5=(r4%5);

		System.out.println("Amount of 5 bills exactly:  " +q5);

		int q6=(int)(r5/2); 

		double r6=(r5%2);

		System.out.println("Exact amount of toonies:  " +q6);

		int q7=(int)(r6/1); 

		double r7=(r6%1);

		System.out.println("Exact amount of loonies:  " +q7);

		int q9=(int)(r7/0.25); 

		double r9=(r7%0.25);

		System.out.println("Exact amount of quarters:  " +q9);

		int q10=(int)(r9/0.10); 

		double r10=(r9%0.10);

		System.out.println("Exact amount of dimes:  " +q10);

		int q11=(int)(r10/0.05); 

		double r11=(r10%0.05);

		System.out.println("Exact amount of nickels:  " +q11);

	}

}
