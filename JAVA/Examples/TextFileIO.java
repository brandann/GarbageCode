

import java.io.*;
import java.util.*;
/**
 * Demonstrates use of the class File with text files.
 * @author pbladek
 */
public class TextFileIO
{
    /**
     * @param args 
     */
    public static void main(String[] args)
    {
        String name = null;
        System.out.println("I will show you the first line");
        System.out.println("in a text file you name.");
        System.out.println("The file must contain one or more lines.");
        System.out.println("Enter file name:");
        Scanner keyboard = new Scanner(System.in);

        name = keyboard.next( );
        File fileObject = new File(name);

        while (( ! fileObject.exists( ))
                          || ( ! fileObject.canRead( )))
        {
           if ( ! fileObject.exists( ))
              System.out.println("No such file");
           else // ! fileObject.canRead( )
              System.out.println("That file is not readable.");
           System.out.println("Enter file name again:");
           name = keyboard.next( );
           fileObject = new File(name);
        }
        BufferedReader fileInput;
        PrintWriter fileOutput;
        char oneChar;
        try
        {
           fileInput =
                  new BufferedReader(new FileReader(name));
           fileOutput = new PrintWriter(new FileOutputStream("new" + name));
           fileOutput.println("The first line in the file is:");
           String firstLine = fileInput.readLine( );
           while((oneChar = (char)fileInput.read()) != (char)-1)
           {
               if (oneChar == '\n')
                   fileOutput.println();
               else
                   fileOutput.printf("%c", oneChar);
           }
           fileOutput.println(firstLine);
           fileInput.close( );
           fileOutput.close( );
       }
       catch(IOException e)
       {
          System.out.println("Problem reading from file.");
       }
    }
}