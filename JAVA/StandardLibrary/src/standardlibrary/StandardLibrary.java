/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package standardlibrary;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author brandan
 */
public class StandardLibrary {
    public static void main(String[] args) throws ClassNotFoundException, IOException
    {
        

        boolean clean = true;
        if(clean)
        {
            ObjectOutputStream out;
            EntryNumber entry = new EntryNumber();
            LibraryItem item = new LibraryItem(1);
            LibraryItem[] items = new LibraryItem[1];
            items[0] = item;
            
            try
            {
                out = new ObjectOutputStream(new FileOutputStream("P:\\Northshore Time Sheet\\Tools\\LIBRARY\\ENTRY.dat"));
                out.writeObject(entry);
                out.close();
            }
            catch(IOException e)
            {
            }
            
            try
            {
                out = new ObjectOutputStream(new FileOutputStream("P:\\Northshore Time Sheet\\Tools\\LIBRARY\\DATABASE.dat"));
                out.writeObject(items);
                out.close();
            }
            catch(IOException e)
            {
            }
        }
        
        
        
        
        String prog = "";
        if(args.length > 0)
        {
            if(args[0].equalsIgnoreCase("cmd"))
            {
                CMD_Builder cmd = new CMD_Builder();
            }
            else
            {
                prog = "gui";
            }
        }
        else
        {
            prog = "gui";
        }
        if(prog == "gui")
        {
            GUI gui = new GUI();
        }
        
    }
}
