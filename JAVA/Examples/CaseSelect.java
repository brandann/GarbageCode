public class CaseSelect
{
	public static void main(String[] args)
	{
		int var = 10;	//Variable to check
		String c = "";	//Variable to set
		
		switch (var)
		{
			case 0:
				c = "a";
				break;
			case 2:
				c = "A";
				break;
			case 4:
				c = "b";
				break;
			case 6:
				c = "B";
				break;
			case 8:
				c = "c";
				break;
			case 10:
				c = "d"
				break;
			//anything that doesnt fit in the above cases:
			default:		
				c = " ";
		}
	}
}