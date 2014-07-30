package regex;

import java.util.Scanner;

public class ContinuousLoop
{
    public static void main(String[] args)
    {
        Boolean again = true;
		String cont = "";
        Scanner keyboard = new Scanner(System.in);
		
		//Start continued Loop
        while (again)
		{

		
			//Check for Continue
			System.out.println("Continue?(Y/N)");
			cont = keyboard.nextLine().toUpperCase().trim();
			if(cont.substring(0,1).equals("Y"))
				again = true;
			else
				again = false;
        }
    }
}