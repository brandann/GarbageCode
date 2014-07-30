public final class CommandShortcut
{
	public static final void main(String... aArgs)
	{
		String i = "Test String 2";
		
		log("Test String");		//Print String
		log(i);					//Print String Variable
	}

	//Create a shortcut for System.out.println()
	private static void log(String aMessage)
	{
		System.out.println(aMessage);
	}
}