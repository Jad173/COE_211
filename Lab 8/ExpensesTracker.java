import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;

public class ExpensesTracker
{
	public static void main(String[] args) throws IOException
	{
		Scanner scan = new Scanner(System.in);
		FileWriter fw = new FileWriter(new File("expenses.txt"));
		String yesNo = "y";
		
		while(yesNo == "y"){
			System.out.println("Input your name: ");
			String name = scan.nextLine();
		
			System.out.println("What did you purchase?");
			String product = scan.nextLine();
		
			System.out.println("How much did you pay?");
			double cost = scan.nextDouble();
			
			fw.write(name + " purchased " + product + " for " + cost + " US Dollars.");
			
			System.out.println("Would you liketo log another purchase? (y/n)");
			yesNo = scan.nextLine();
				
				if(yesNo == "y"){
					continue;
				}
				if(yesNo == "n"){
					break;
				}
			fw.close();
			scan.close();
		}
	}
}