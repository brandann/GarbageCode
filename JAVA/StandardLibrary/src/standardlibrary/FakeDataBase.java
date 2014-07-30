/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package standardlibrary;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author brandan
 */
public class FakeDataBase {
    public FakeDataBase()
    {
        String[] info = new String[]{
            "pdfLocation", "dwgLocation", "picLocation", "job name", 
            "job Number","2013", "Coping", "Horizontal Joint", 
            "Vertical Joint"
        };
        LibraryItem[] items;
        ArrayList<LibraryItem> itemsList = new ArrayList<>();
        for(int i = 0; i < 100; i++)
        {
            LibraryItem item = new LibraryItem(i);
            item.setPdfLocation(info[0].toUpperCase());
            item.setDwgLocation(info[1].toUpperCase());
            item.setPicLocation(info[2].toUpperCase());
            item.setJobName(info[3].toUpperCase());
            item.setJobNumber(info[4]);
            item.setYear(Integer.parseInt(info[5]));
            item.setJobName(info[6].toUpperCase());
            item.setJobName(info[7].toUpperCase());
            item.setJobName(info[8].toUpperCase());
            itemsList.add(item);
        }
        items = new LibraryItem[itemsList.size() - 1];
        items = itemsList.toArray(items);
        
        ObjectOutputStream out;
        
        try
        {
            out = new ObjectOutputStream(new FileOutputStream("P:\\Northshore Time Sheet\\Tools\\LIBRARY\\DATABASE.dat"));
            out.writeObject(items);
            out.close();
        }
        catch(IOException e)
        {}
        
    }
    
}

