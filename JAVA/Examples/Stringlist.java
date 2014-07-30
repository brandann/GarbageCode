//Makes a string list


public class Stringlist
{
	 
	public static void main(String[] args)
	{
		String[] str = {"a","b"};

		System.out.println(str[1]);		//prints a single item from the list

		for (String s: str)			//prints one by one on new lines
		{
			System.out.println(s);
		}
	}
	
}