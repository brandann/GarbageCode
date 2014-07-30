import java.util.Scanner;

public class Scanner
{
	public static void main(String[] args)
	{
		int userinput;
		Scanner keyboardscanner = new Scanner(System.in);
		
		//Standard use
		userinput = keyboardscanner.nextInt();
		
		//verify information use
		if(keyboardscanner.hasNextFloat())
			{userinput = keyboardscanner.nextInt();}
        else
			{keyboardscanner.nextLine();}
	}
}