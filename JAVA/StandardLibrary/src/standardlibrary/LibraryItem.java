/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package standardlibrary;

import java.io.Serializable;

/**
 *
 * @author brandan
 */
public class LibraryItem implements Serializable{
    public LibraryItem(int myEntryNumber)
    {
	entryNumber = myEntryNumber;
	jobName = "";
	jobNumber = "";
	year = 0;
	tags = new String[1];
	tags[0] = "";
	pdfLocation = "";
	dwgLocation = "";
        picLocation = "";
    }

    public int getEntryNumber()
    {
	return entryNumber;
    }

    public String getJobName()
    {
        return jobNumber;
    }
    public int getYear()
    {
        return year;
    }
    public String[] getTags()
    {
        return tags;
    }
    public String getTagAt(int idx)
    {
        if(idx < tags.length)
        {
            return tags[idx];
        }
        return "";
    }
    public String getPdfLocation()
    {
        return pdfLocation;
    }
    public String getDwgLocation()
    {
        return dwgLocation;
    }

    public void setEntryNumber(int myEntryNumber)
    {
        entryNumber = myEntryNumber;
    }
    public void setJobName(String myJobName)
    {
        jobName = myJobName;
    }
    public void setJobNumber(String myJobNumber)
    {
        jobNumber = myJobNumber;
    }
    public void setYear(int myYear)
    {
        year = myYear;
    }
    public void setTags(String[] myTags)
    {
        tags = myTags;
    }
    public void setTagAt(String myTag, int idx)
    {
        if(idx < tags.length)
        {
            tags[idx] = myTag;
        }
    }
    public void setPdfLocation(String myPdfLocation)
    {
        pdfLocation = myPdfLocation;
    }
    public void setDwgLocation(String myDwgLocation)
    {
        dwgLocation = myDwgLocation;
    }
    public void setPicLocation(String myPicLocation)
    {
        picLocation = myPicLocation;
    }
    
    @Override
    public String toString()
    {
        String temp = entryNumber + "`" + jobName + "`" + jobNumber + "`" 
                + year + "`" + pdfLocation + "`" + dwgLocation + "`";
        for(int i = 0; i < tags.length; i++)
        {
            temp = temp + tags[i] + "~";
        }
        return temp;
    }

int 	  entryNumber;
String    jobName;
String    jobNumber;
int 	  year;
String[]  tags;

String    pdfLocation;
String    dwgLocation;
String    picLocation;

}