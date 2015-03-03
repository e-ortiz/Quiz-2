import java.util.Scanner;
import java.lang.Math;

public class Question16 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // Create a Scanner object

		System.out.print("What is your initial (first year) tuition?: ");
		double initialTuition = input.nextDouble();

		System.out.print("What is the yearly percentage increase of tution in decimal format?: ");
		double percantageIncrease = input.nextDouble();

		System.out.print("How many years will you attend college?: ");
		double years = input.nextInt();

		input.close();

		double currentTuition = initialTuition;
		
		double totalTuition = initialTuition;
		
		for (int i = 1; (i < years); i++) {
			currentTuition = (currentTuition + Math.pow(currentTuition, percantageIncrease));
			
			totalTuition += currentTuition;

		}

		System.out.println("Your total cost of tuition will be "
				+ (double) Math.round(totalTuition * 100.0) / 100.0  + ".");
		
	}
}
