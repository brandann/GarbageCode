

import java.io.*;
import java.util.*;
/**
 * Demonstrates use of the class File with text files.
 * @author pbladek
 */
public class TextFileScanner
{
    /**
     * @param args 
     */
    public static void main(String[] args)
    {
        String name = null;
        System.out.println("I will copy a file for you");
        System.out.println("Enter the file name");
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
        Scanner fileInputScanner;
        PrintWriter fileOutput;
        String oneLine = "";
        try
        {
           fileInputScanner = new Scanner(fileObject);
           fileOutput = new PrintWriter(new FileOutputStream("new" + name));
           while(fileInputScanner.hasNextLine())
           {
               oneLine = fileInputScanner.nextLine();
               fileOutput.println(oneLine);
           }       
           fileOutput.close( );
       }
       catch(IOException e)
       {
          System.out.println("Problem reading from file.");
       }
    }
}