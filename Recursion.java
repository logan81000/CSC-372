package Critical_Thinking;

import java.util.Scanner;

public class Recursion {
	
	Scanner input = new Scanner(System.in);
	double sum = 0;
	int i = 0;
	public double nums(double num) {	
		this.sum = sum + num;
		i++;
		if(i <= 5 ) {
			System.out.print("Enter a number: ");
			nums(input.nextDouble());
		}
		return sum;
	}
	
	
	
	public String run (String[] args) {
		System.out.println("The product of the five numbers is " + nums(0));
		input.close();
		return "";
	  }

	public static void main(String[] args) {
		Recursion runner = new Recursion();
		String out = runner.run(args);

	}

}
