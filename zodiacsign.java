/*
 * written by malaya coley-sturgis
 * 
 * lab 1
 */
import java.util.Scanner;

public class zodiacsign {

	public static void main(String[] args) {
		// 
	Scanner input = new Scanner(System.in);
	
	//enter the month and day 
	System.out.println("What is your zodiac sign? ");
	System.out.println("Enter your birthday -- Month followed by Day as numbers.");
	
	
	int month = input.nextInt();
	int day = input.nextInt();
	
	//month
	if(month < 1 || month > 12)// 13-5
	{
	System.out.print("invalid month!");	
	return; 
	}
	
	//day is correct
	boolean validDay = true;
	switch(month) {
	//months with 31 days
	case 1: case 3: case 5: case 7: case 8: case 10: case 12:
		if(day < 1 || day > 31)validDay = false;
		break;
		//months ending 30 days
	case 4: case 6: case 9: case 11:
		if(day < 1 || day > 30)validDay = false;
		break;
		//February 
	case 2: 
		if (day < 1 || day > 29)validDay = false;
		break;
	}
	
	if(!validDay)//if not correct
	{
		System.out.println("Invalid day!");
		return;
	}
		
	//===============================================
	//zodiacs signs, month and days where they cut off and start the next sign
	String zodiac = " ";
	
if((month == 3 && day >= 21) || (month == 4 && day <= 19)) zodiac = "Aries";
else if((month == 4 && day >= 20)|| (month == 5 && day <= 20)) zodiac = "Taurus";
else if((month == 5 && day >= 21)|| (month == 6 && day <= 20)) zodiac = "Gemini";
else if((month == 6 && day >= 21)|| (month == 7 && day <= 22)) zodiac = "Cancer";
else if((month == 7 && day >= 23)|| (month == 8 && day <= 22)) zodiac = "Leo";
else if((month == 8 && day >= 23)|| (month == 9 && day <= 22)) zodiac = "Virgo";
else if((month == 9 && day >= 23)|| (month == 10 && day <= 22)) zodiac = "Libra";
else if((month == 10 && day >= 23)|| (month == 11 && day <= 21)) zodiac = "Scorpio";
else if((month == 11 && day >= 22)|| (month == 12 && day <= 21)) zodiac = "Sagittarius";
else if((month == 12 && day >= 22)|| (month == 1 && day <= 19)) zodiac = "Capricorn";
else if((month == 1 && day >= 20)|| (month == 2 && day <= 18)) zodiac = "Aquarius";
else if((month == 2 && day >= 19)|| (month == 3 && day <= 20)) zodiac = "Pisces";
	

//===============================================================
//output
	System.out.println("You are a " + zodiac + "!");
		
	return;
		
		
		
	}
	

}
