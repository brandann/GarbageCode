
package detail;

import java.util.regex.Pattern;

/**
 * Detail.java
 * Detail object - holds all information for a single Detail, including 
 * project information, file information, indexing, and tags.
 * 
 * @author brandan haertel
 * 02/05/2014
 */
public class Detail {
    
    /**
     * Constructor
     * sets all the values to ""
     */
    public Detail(){
        //reset all items
         for (int i = 0; i < LENGTH; i++)
            detailData[i] = "";
    }
    
    /**
     * copy constructor.
     * must be in the format of Detail.toString()
     * @param in string of Detail representation.
     */
    public Detail(String in){
        //copy
        detailData = in.split(Pattern.quote(c), LENGTH);
    }
    
    /**
     * sets the data item to the passed in value.
     * segregates the ENTRY value to setData(int, int), other wise sets the
     * data to the index of item if in range
     * @param item int if index
     * @param data string of data
     */
    public void setData(int item, String data) {
        //check for ENTRY index
        if(item == ENTRY){
            setData(ENTRY, Integer.parseInt(data));
            return;
        }
        
        //check for boundries
        if(item > ENTRY && item < SPLIT){
            detailData[item] = data;
        }
    }
    
    /**
     * sets the data item to the passed in value.
     * specifically deals with the entry data, as it it represented as an int.
     * @param item int of index
     * @param data int of entry number
     */
    public void setData(int item, int data) {
        //check for ENTRY index
        if(item == ENTRY)
            detailData[item] = String.valueOf(data);
    }
    
    /**
     * get the index of the passed in data item
     * @param item data item to retrieve
     * @return index of the passed in data item, "" if out of bounds
     */
    public String getData(int item){
        //check for boundries
        if(item >= ENTRY && item < SPLIT){
            return detailData[item];
        }
        
        //not in bounds
        return "";
    }
    
    public boolean tagged(String tag){
        if(detailData[TAGS].contains(tag))
            return true;
        return false;
    }
    
    /**
     * returns a string representation of the Detail, 
     * separated by the token c.
     * @return string
     */
    @Override
    public String toString(){
        String out = "";
        for (int i = 0; i < LENGTH; i++){
            out = out + detailData[i] + c;
        }
        return out;
    }

    //private memebers
    private final int LENGTH = 11;
    private String[] detailData = new String[LENGTH];
    private final String c = "$";
    
    //public index members, used for sets and gets
    public final int ENTRY = 0;
    public final int COMPANY = 1;
    public final int JOBNAME = 2;
    public final int JOBNUMBER = 3;
    public final int SEARCHABLE = 4;
    public final int ADDEDDATE = 5;
    public final int DESCRIPTION = 6;
    public final int PDF = 7;
    public final int DWG = 8;
    public final int JPG = 9;
    public final int TAGS = 10;
    public final int SPLIT = 11;
}
