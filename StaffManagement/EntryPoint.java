import java.util.Scanner;
public class EntryPoint
{
	public static void main(String[] args)
	{
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please input the employee's first name: ");
		String firstName = scan.nextLine();
		
		System.out.println("Please input the employee's last name: ");
		String lastName = scan.nextLine();
		
		System.out.println("Please input the employee's age: ");
		int age = scan.nextInt();
		
		System.out.println("Please input the employee's monthly salary: ");
		double monthlySalary = scan.nextDouble();
		
		Employee emp = new Employee(firstName, lastName, age, monthlySalary);
		
		System.out.print("Employee information: " + emp.firstName + " " + emp.lastName + ", " + emp.age + ", " + emp.monthlySalary);
		
	}
}