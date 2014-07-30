/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package standardlibrary;

import java.io.*;

/**
 *
 * @author brandan
 */
public class EntryNumber implements Serializable{
    public EntryNumber()
    {
        entryNumber = 0;
        uses = 0;
    }
    public int getEntryNumber()
    {
        entryNumber++;
        return entryNumber;
    }
    
    public void setUses(int in)
    {
        uses = in;
    }
    
    public void setEntrys(int in)
    {
        entryNumber = in;
    }
    
    public void use()
    {
        uses++;
    }
    
    public int getUses()
    {
        return uses;
    }
    
    private int entryNumber;
    private static int uses;
}
