/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package northshorelibrary;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author brandan
 */
public class EntryItem {
    public EntryItem()
    {
        BackendDriver driver = new BackendDriver();
        entry = driver.getNextEntryNum();
        company = "";
        jobName = "";
        jobNumber = "";
        jobYear = "";
        addedDate = "";
        detailNum = "";
        pdf = "";
        dwg = "";
        jpg = "";
        tags = "";
    }
    
    public EntryItem(String in)
    {
        String[] inString = in.split("|");
        entry = Integer.parseInt(inString[0]);
        company = inString[1];
        jobName = inString[2];
        jobNumber = inString[3];
        jobYear = inString[4];
        addedDate = inString[5];
        detailNum = inString[6];
        pdf = inString[7];
        dwg = inString[8];
        jpg = inString[9];
        tags = inString[10];
    }
    
    @Override
    public String toString()
    {
        return  entry + "|" +
                company + "|" +
                jobName + "|" +
                jobNumber + "|" +
                jobYear + "|" +
                addedDate + "|" +
                detailNum + "|" +
                pdf + "|" +
                dwg + "|" +
                jpg + "|" +
                tags;
    }
    
    public void setCompany(String company){this.company = company;}
    public void setJobName(String jobName){this.jobName = jobName;}
    public void setJobNumber(String jobNumber){this.jobNumber = jobNumber;}
    public void setJobYear(String jobYear){this.jobYear = jobYear;}
    public void setAddedDate(String addedDate){this.addedDate = addedDate;}
    public void setDetailNum(String detailNum){this.detailNum = detailNum;}
    public void setPDF(String pdf){this.pdf = pdf;}
    public void setDWG(String dwg){this.dwg = dwg;}
    public void setJPG(String jpg){this.jpg = jpg;}
    public void setTags(String tags){this.tags = tags;}
    
    public int getEntry( ){return entry;}
    public String getCompany( ){return company;}
    public String getJobName( ){return jobName;}
    public String getJobNumber( ){return jobNumber;}
    public String getJobYear( ){return jobYear;}
    public String getAddedDate( ){return addedDate;}
    public String getDetailNum( ){return detailNum;}
    public String getPDF( ){return pdf;}
    public String getDWG( ){return dwg;}
    public String getJPG( ){return jpg;}
    public String getTags( ){return tags;}
    
    private int entry;
    private String company;
    private String jobName;
    private String jobNumber;
    private String jobYear;
    private String addedDate;
    private String detailNum;
    private String pdf;
    private String dwg;
    private String jpg;
    private String tags; 
}
