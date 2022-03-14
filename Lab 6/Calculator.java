import java.util.Scanner;

public class Calculator {
    private int num1;
    private int num2;
    private String operator;

    // Constructor to initialize the calculator
    public Calculator() {
        // Get user input
        Scanner scanCalc= new Scanner(System.in);
        /**
         * Continue code here to ask for the first number, the operator, and the second number, IN THAT ORDER
         */
		System.out.println("Input the first number: ");
		num1 = scanCalc.nextInt();
		
		System.out.println("Input the operator: ");
		scanCalc.nextLine();
		operator = scanCalc.nextLine();
		
		System.out.println("Input the second number: ");
		num2 = scanCalc.nextInt();
		
        // Decide on the operation to perform 
        /**
         * Insert code to decide on which function to call, based on the operator the user chose
         * Hint: Switch statement
         */
		switch(operator) {
		case "+":
			System.out.println(add(num1, num2));
			break;
		case "-":
			System.out.println(subtract(num1, num2));
			break;
		case "x":
			System.out.println(multiply(num1, num2));
			break;
		case "/":
			System.out.println(divide(num1, num2));
		}
    }

    public String add(int a, int b) {
        /**
         * Enter logic
         */
		return a + " + " + b + " = " + (a + b);
    }

    public String subtract(int a, int b) {
        /**
         * Enter logic
         */
		return a + " - " + b + " = " + (a - b); 
    }

    public String multiply(int a, int b) {
        /**
         * Enter logic
         */
		return a + " x " + b + " = " + (a * b);
    }

    public String divide(int a, int b) {
        /**
         * Enter logic
         */
		return a + " / " + b + " = " + (a / b);
    }
}