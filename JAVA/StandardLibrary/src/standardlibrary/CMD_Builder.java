/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package standardlibrary;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;

/**
 *
 * @author brandan
 */
public class CMD_Builder {
    public CMD_Builder() throws ClassNotFoundException, IOException
    {
        System.out.println("************************************");
        System.out.println("*           DATABASE BUILD         *");
        System.out.println("************************************");
        build();
    }

    private void build() throws ClassNotFoundException, IOException
    {
        info = new String[6];
        driver = new LibraryDriver();
        
        Scanner keybored = new Scanner(System.in);
        log("Enter PDF File location:");
        info[PFD] = keybored.nextLine();
        log("Enter DWG File location:");
        info[DWG] = keybored.nextLine();
        log("Enter PICTURE File location:");
        info[PIC] = keybored.nextLine();
        log("Enter JOB NAME:");
        info[JOB_NAME] = keybored.nextLine();
        log("Enter JOB NUMBER:");
        info[JOB_NUMBER] = keybored.nextLine();
        log("Enter YEAR:");
        info[YEAR] = keybored.nextLine();
        
        tags = tags();
        verifyTags();
        
        driver.setNewLibraryItem(info, tags);
        log("Thanks!");
    }
    
    public void overrideObjectArray(LibraryItem[] newObject, String filePath) throws ClassNotFoundException, IOException
    {
        ObjectOutputStream out;
        
        try
        {
            out = new ObjectOutputStream(new FileOutputStream(filePath));
            out.writeObject(newObject);
            out.close();
            database = (LibraryItem[]) newObject;
        }
        catch(IOException e)
        {}
        
    }
    
    private String[] tags()
    {
        ArrayList<String> list = new ArrayList<>();
        String[] array;
        Scanner keybored = new Scanner(System.in);
        String tagIn = "";
        boolean test = true;
        System.out.println("Enter Tags");
        while(test)
        {
            tagIn = keybored.nextLine();
            if(tagIn.isEmpty())
            {
                test = !test;
            }
            else
            {
                list.add(tagIn.toUpperCase());
            }
        }
        array = new String[list.size()];
        array = list.toArray(array);
        //printResults(array);
        return array;
    }
    
    private void verifyTags()
    {
        for(int i = 0; i < tags.length; i++)
        {
            if(driver.doesTagExist(tags[i]))
            {
                log(i + ". " + tags[i]);
            }
            else
            {
                log(i + ". " + tags[i] + "     <---- Tag not in library");
            }
        }
    }
    
        private void printResults(String[] array)
    {
        for(int i = 0; i < array.length; i++)
        {
            System.out.println(i + ". " + array[i]);
        }
    }
    
    private void log(String a)
    {
        System.out.println(a);
    }
    
    LibraryDriver driver;
    private String[] info;
    private String[] tags;
    private final int PFD = 0;
    private final int DWG = 1;
    private final int PIC = 2;
    private final int JOB_NAME = 3;
    private final int JOB_NUMBER = 4;
    private final int YEAR = 5;
}
