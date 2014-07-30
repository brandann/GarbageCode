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
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author brandan
 */
public class LibraryDriver {
    public LibraryDriver() throws ClassNotFoundException, IOException
    {
        //database = (LibraryItem[]) getObjectArray(databaseFilePath);
        getObjectArray(databaseFilePath);
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
    
    public void appendObjectArray(LibraryItem[] array1, LibraryItem[] array2, String path) throws ClassNotFoundException, IOException
    {
        //array1 = (LibraryItem[]) getObjectArray(path);
        Object[] newObject = new Object[array1.length + array2.length];
        for(int i = 0; i < array1.length; i++)
        {
            newObject[i] = array1[i];
        }
        for(int i = 0; (i + array1.length) < (array1.length + array2.length); i++)
        {
            newObject[i] = array2[i];
        }
        
        overrideObjectArray((LibraryItem[]) newObject, path);
    }
    
    
    public void getObjectArray(String myPath) throws ClassNotFoundException, IOException
    {
        File dbFile = new File(path);
        LibraryItem[] libraryItemArray = null;
        ObjectInputStream dbInputStream;
        int reservationCount = 0;
        try
        {
            dbInputStream = new ObjectInputStream(new FileInputStream(dbFile.getPath()));
            try
            {
                reservationCount = 0;
                while(dbInputStream.readBoolean())
                {
                    dbInputStream.readObject();
                    reservationCount++;
                }
                if(reservationCount > 0)
                {
                    libraryItemArray = new LibraryItem[reservationCount];
                    reservationCount = 0;
                    while(dbInputStream.readBoolean())
                    {
                        libraryItemArray[reservationCount] = (LibraryItem) dbInputStream.readObject();
                        reservationCount++;
                    }
                }
                else
                {
                    //libraryItemArray = new LibraryItem[0];
                    database = new LibraryItem[0];
                }
                dbInputStream.close();
                
            }
            catch(IOException | ClassNotFoundException e)
            {
                dbInputStream.close();
                database = new LibraryItem[0];
                System.out.println("CMD//getDatabase -- Unable to load database file_a");
            }
        }
        catch(IOException e)
        {
            System.out.println("CMD//getDatabase -- Unable to load database file");
        }
        //return libraryItemArray;
        database = libraryItemArray;
        
        
        /*ObjectInputStream in;
        LibraryItem[] arrayIn;
        File inFile;
        LibraryItem[] blank = new LibraryItem[0];
        
        inFile = new File(myPath);
        
        if(inFile.exists() && inFile.canRead())
        {
            try
            {
                in = new ObjectInputStream(new FileInputStream(myPath));
                arrayIn = (LibraryItem[]) in.readObject();
                in.close();
                return arrayIn;
            }
            catch(IOException e)
            {
                return blank;
            }
        }
        return blank;*/
    }
    
    /*public LibraryItem[] searchLibrary(String[] tags) throws ClassNotFoundException, IOException
    {
        LibraryItem[] database = (LibraryItem[]) getObjectArray(databaseFilePath);
        LibraryItem[] databaseMatch;
        ArrayList<LibraryItem> matchList = new ArrayList<>();
        int matchCount = 0;
        
        //Search for matches
        for(int i = 0; i < database.length; i++)
        {
            for(int j = 0; j < tags.length; j++)
            {
                if(database[i].toString().contains(tags[j]))
                {
                    matchList.add(database[i]);
                    matchCount++;
                }
            }
        }
        
        //Search for !matches
        for(int i = 0; i < database.length; i++)
        {
            for(int j = 0; j < tags.length; j++)
            {
                LibraryItem temp = (LibraryItem) matchList.get(i);
                if(!(temp.toString().contains(tags[j])))
                {
                    matchList.remove(i);
                    matchCount--;
                }
            }
        }
        
        databaseMatch = new LibraryItem[matchCount];
        databaseMatch = matchList.toArray(databaseMatch);
        
        return databaseMatch;
    }
    */
    public String[] search(String[] mytags)
    {
        String[] database;
        String[] Matches;
        ArrayList<String> databaseL = new ArrayList<>();
        ArrayList<String> MatchesL = new ArrayList<>();
        
	File fileObject;
        Scanner fileInputScanner;

        fileObject = new File(path + "DATABASE.dat");

        try
        {
            fileInputScanner = new Scanner(fileObject); 
            while(fileInputScanner.hasNextLine()){
                databaseL.add(fileInputScanner.nextLine());
            }    
            fileInputScanner.close();
            
            database = new String[databaseL.size()];
            database = databaseL.toArray(database);

            for(int i = 0; i < database.length; i++)
            {
                for(int j = 0; j < mytags.length; j++)
                {
                    if(database[i].contains(mytags[j]))
                    {
                        MatchesL.add(database[i]);
                    }
                }
            }
            
            Matches = new String[MatchesL.size()];
            Matches = MatchesL.toArray(Matches);
            
            return Matches;
        
        }
        catch(IOException e)
       {
          System.out.println("Problem reading from file.\n" + e);
       }
        return Matches = new String[1];
    }
    
    public String[] getStringArray()
    {
        String[] itemsArray;
        ArrayList<String> list = new ArrayList<>();
        
        for(int i = 0; i < files.length; i++)
        {
            String[] itemsArrayTemp = getStringArray(files[i]);
            for(int j = 0; j < itemsArrayTemp.length; j++)
            {
                list.add(itemsArrayTemp[j]);
            }
        }
        itemsArray = new String[list.size() - 1];
        itemsArray = list.toArray(itemsArray);
        return itemsArray;
    }
    
    private String[] getStringArray(String myFilePath)
    {
        String[] temp;
        ArrayList<String> tempList = new ArrayList<>();
        
	File fileObject;
        Scanner fileInputScanner;

        fileObject = new File(myFilePath);

        //need to creat a text file here if one does not exist!
        if(!fileObject.exists())
        {
            try{fileObject.createNewFile();}
            catch(IOException e){
                //System.out.println(e);
            }
        }
        try
        {
 
            fileInputScanner = new Scanner(fileObject); 
            while(fileInputScanner.hasNextLine()){
                tempList.add(fileInputScanner.nextLine());
            }    
            fileInputScanner.close();
            
            temp = new String[tempList.size()];
            temp = tempList.toArray(temp);
            return temp;
        
        }
        catch(IOException e)
       {
          //System.out.println("Problem reading from file.\n" + e);
       }
       
        temp = new String[1];
        return temp;
    }
    
    public int getEntryNumber() throws ClassNotFoundException
    {
        EntryNumber entry = null;
        int entryNum = 0;
        ObjectInputStream in;
        ObjectOutputStream out;
        
        File inFile;
        inFile = new File(entryFilePath);
        
        
        try
        {
            in = new ObjectInputStream(new FileInputStream(entryFilePath));
            entry = (EntryNumber) in.readObject();
            in.close();
        }
        catch(IOException e)
        {
            entry = new EntryNumber();
        }
        entryNum = entry.getEntryNumber();
        try
        {
            out = new ObjectOutputStream(new FileOutputStream(entryFilePath));
            out.writeObject(entry);
            out.close();
        }
        catch(IOException e)
        {
            
        }
        
        return entryNum;
    }
    
    public void setNewLibraryItem(String[] info, String[] tags) throws ClassNotFoundException, IOException
    {
        LibraryItem item = new LibraryItem(getEntryNumber());
        LibraryItem[] items = new LibraryItem[0];
        item.setPdfLocation(info[0].toUpperCase());
        item.setDwgLocation(info[1].toUpperCase());
        item.setPicLocation(info[2].toUpperCase());
        item.setJobName(info[3].toUpperCase());
        item.setJobNumber(info[4]);
        item.setYear(Integer.parseInt(info[5]));
        item.setTags(tags);
        
        items[0] = item;
        
        //appendObjectArray(getObjectArray(databaseFilePath), items, databaseFilePath);
        appendObjectArray(database, items, databaseFilePath);
    }
    
    public boolean doesTagExist(String myString)
    {
        String[] tagCollection = getStringArray();
        for(int i = 0; i < tagCollection.length; i++)
        {
            if(tagCollection[i].equalsIgnoreCase(myString))
            {
                return true;
            }
        }
        return false;
    }
    
    private LibraryItem[] database;
    private final String path = "P:\\Northshore Time Sheet\\Tools\\LIBRARY\\";
    //public static final String path = "";
    public final String entryFilePath = path + "ENTRY.dat";
    public final String databaseFilePath = path + "DATABASE.dat";
    private final String[] files = new String[]
        {
            path + "SYSTEMS.txt", path + "PANELS.txt", path + "CONDITIONS.txt",
            path + "OTHERSSYSTEMS.txt", path + "MISCTAGS.txt"
        };
    
}
