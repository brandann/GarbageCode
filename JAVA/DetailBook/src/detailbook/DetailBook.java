/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package detailbook;

import detail.Detail;
import java.io.File;

/**
 *
 * @author brandan
 */
public class DetailBook {
    
    /**
     * Constructor
     * sets book to null
     */
    public DetailBook(){
        book = null;
    }
    
    /**
     * sets this book to passed in Detail[]
     * @param d Detail[] tp copy
     */
    public DetailBook(Detail[] d){
        book = d;
    }
    
    /**
     * uses the default file path to load the database if loadFile
     * has no parameters
     * @return true if load was successful
     */
    public boolean loadFile(){
        //use default filepath
        return loadFile(filename);
    }
    
    /**
     * loads a database file into the book array
     * @param filein file to read database from
     * @return true if load was successful
     */
    public boolean loadFile(String filein){
        File file = new File(filein);
        if(file.exists() && file.canRead()){
            //set the default file to fileout
            filename = filein;
            //file outstream
            for(int i = 0; i < book.length; i++){
                //write detail.tostring to file
            }
            return true;
        }
        return false;
    }
    
    /**
     * uses the default file path to save the database if one saveFile 
     * has no parameters
     * @return true if save was successful
     */
    public boolean saveFile(){
        //use default filepath
        return saveFile(filename);
    }
    
    /**
     * save the book to a database file, puts each detail on a new line,
     * @param fileout string file to save to
     * @return true if save was successful
     */
    public boolean saveFile(String fileout){
        File file = new File(fileout);
        if(file.exists() && file.canWrite()){
            //set the default file to fileout
            filename = fileout;
            //file outstream
            for(int i = 0; i < book.length; i++){
                //write detail.tostring to file
            }
            return true;
        }
        return false;
    }
    
    /**
     * get the length of the book, this is the total number of details
     * @return int length of book
     */
    public int getLength(){
        return book.length;
    }
    
    //private members
    private Detail[] book;
    private String filename = "database.dat";
    
    //public members
}
