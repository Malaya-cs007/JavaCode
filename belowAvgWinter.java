/*
 * written by malaya coley-sturgis
 * lab 03
 */
import java.util.Scanner;
public class belowAvgWinter {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		double[] temp = new double[10]; //stores 10 temperatures
		double sum = 0.0;
		
		System.out.println("Welcome to the below average temperature tester program.");

//inputing temperatures
for(int i = 0; i < temp.length; i++) {
		System.out.println("Please enter the temperature for day " + (i + 1) + ": ");
		temp[i] = input.nextDouble();
		sum += temp[i]; //adding the sum avg
		}
//calculate and showing the avg
		double average = sum / temp.length;
	
		//output
		System.out.println("\n the average temperature was " + average + "\n The days that were below average were: ");
		
		for(int i = 0; i < temp.length; i++) {
			if(temp[i] < average)
				System.out.println("Day " + (i+1) + " with " + temp[i]);
		}
		input.close();//end of program
	}
}
