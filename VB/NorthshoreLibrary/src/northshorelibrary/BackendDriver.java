/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package northshorelibrary;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author brandan
 */
public class BackendDriver {
    /**
     * reads in the database file and adds the new item to the list and saves
     * back out to the database file, this saves as a text file and will
     * need to be changed to a binary file.
     * @param item
     * @throws FileNotFoundException 
     */
    public void addItem(EntryItem item) throws FileNotFoundException{
        ArrayList<String> items = new ArrayList();
        Scanner fileInputScanner;
        PrintWriter fileOutput;

        try
        {
            fileInputScanner = new Scanner(new File(
                    BackendGUI.directory + BackendGUI.database));
            while(fileInputScanner.hasNextLine())
            {
                items.add(fileInputScanner.nextLine());
            }
            fileInputScanner.close();
        }
        catch(IOException e){System.out.println("Error: read");}
        
        String[] itemsArray = new String[items.size()];
        itemsArray = items.toArray(itemsArray);
        
        try
        {
            fileOutput = new PrintWriter(new FileOutputStream(
                    BackendGUI.directory + BackendGUI.database));
            for(int i = 0; i < itemsArray.length; i++)
            {
                fileOutput.println(itemsArray[i]);
            }
            fileOutput.println(item.toString());
            fileOutput.close();
        }
        catch(IOException e){System.out.println("Error: write");}
    }
    

    /**
     * reads in a file and passes back an array of Strings for each line in
     * file, this is ment to pass tags, but can do anything really.
     * @param file
     * @return 
     */
    public String[] readTextFile(String file)
    {
        Scanner fileInputScanner;
        ArrayList<String> list = new ArrayList();
        String[] array;
        try
        {
            fileInputScanner = new Scanner(new File(file));
            while(fileInputScanner.hasNextLine())
            {
                String a = fileInputScanner.nextLine();
                if(!a.contains("*"))
                {
                    list.add(a);
                }
            }
            fileInputScanner.close();
        }
        catch(IOException e){System.out.println("Error: read");}
        array = new String[list.size()];
        array = list.toArray(array);
        return array;
    }
    
    public void appendTextFile(String file, String[] array){
        PrintWriter fileOutput;
        String[] arrayIn = readTextFile(file);
        ArrayList<String> arrayOut = new ArrayList();
        for(String s : arrayIn){arrayOut.add(s);}
        for(String s : array){arrayOut.add(s);}
        try{
            fileOutput = new PrintWriter(new FileOutputStream(
                    new File(file)));
            for(String s : arrayOut){fileOutput.println(s);}
            fileOutput.close();
        }
        catch(IOException e){
            System.out.println("Error: getEntry/write");
        }
    }

    public int getNextEntryNum(){
        Scanner fileInputScanner;
        PrintWriter fileOutput;
        int entry= 0;
        try{
            fileInputScanner = new Scanner(new File(
                    BackendGUI.directory + BackendGUI.entry));
            entry = Integer.parseInt(fileInputScanner.nextLine());
            fileInputScanner.close();
        }
        catch(IOException e){
            System.out.println("Error: getEntry/read");
        }
        entry++;
        try{
            fileOutput = new PrintWriter(new FileOutputStream(
                    new File(BackendGUI.directory + BackendGUI.entry)));
            fileOutput.println(entry);
            fileOutput.close();
        }
        catch(IOException e){
            System.out.println("Error: getEntry/write");
        }
        return entry;
    }
    
    public String moveFile(String from, String to){
        File tempFile = new File(from);
        try
        {
            if(tempFile.renameTo(new File(to)))
            {
                return to;
            }
            else
            {
                return "";
            }
        }
        catch(Exception e){e.printStackTrace();}
        return "";
    }
    
}
