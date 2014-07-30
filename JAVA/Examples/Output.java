/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BrandanTools;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author brandan
 */
public class Output {
    
    public Output(String myFileName, String[] myArray)
    {
        myFile = new File(myFileName);
        myOutputArray = myArray; 
        print();
    }
    private void print()
    {
        try
        {
            fileOutput = new PrintWriter(new FileOutputStream(myFile));
            for(int i = 0; i < myOutputArray.length; i++)
            {
                fileOutput.println(myOutputArray[i]);
            }
            
            fileOutput.println("Thank you!");
            fileOutput.close( );
        }
        catch(IOException e)
       {
          System.out.println("Problem reading from file.");
       }
        
    }
    private PrintWriter fileOutput;
    private File myFile;
    private String[] myOutputArray;
}
