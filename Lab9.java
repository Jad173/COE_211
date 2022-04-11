import java.util.Scanner;

public class Lab9
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		int[] assignmentGrades = new int[5];
		int grade;
		int attendance;
		int midtermGrade;
		int assignmentTotal = 0;
		
		for(int i = 1; i < 6; i++){
			System.out.println("Input the grade for assignment" + i);
			assignmentGrades[i-1] = scan.nextInt();
		}
		
		for(int idx = 0; idx < 5; idx++){
			assignmentTotal += assignmentGrades[idx];
		}
		
		assignmentTotal /= 5;
		
		System.out.println("Input the number of attended labs");
		attendance = scan.nextInt();
		attendance = (100/7) * attendance;
		
		System.out.println("Input the midterm grade");
		midtermGrade = scan.nextInt();
		
		System.out.println("Assignments (30%): " + assignmentTotal + "/100");
		System.out.println("Attendance (5%): " + attendance + "/100");
		System.out.println("Midterm (30%): " + midtermGrade + "/100");
	}
}