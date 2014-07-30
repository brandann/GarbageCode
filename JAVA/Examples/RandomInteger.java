import java.util.Random;

public class RandomInteger
{

public static void main(String[] args)
	{
	Random randomInteger = new Random();	//setup random object
	int i = randomInteger.nextInt(100);	//0-99
	System.out.println(i);			//prints random integer
	}
}

/*

*/