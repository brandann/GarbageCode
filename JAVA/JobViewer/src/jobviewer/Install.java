/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jobviewer;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author brandan
 */
public class Install {
    public Install() {
        installdatafile();
        installtimefile();
        installpythonprogram();
    }
    
    private boolean installdatafile(){
        PrintWriter fileOutput;
        try{
            fileOutput = new PrintWriter(new FileOutputStream("C:\\Program Files\\JobViewer\\JobViewer.dat"));
            fileOutput.println("JobViewer.dat\n\n");
            fileOutput.close();
            return true;
        }
        catch(IOException e){
            System.out.println("Error: installdatafile");
            return false;
        }
    }
    
    private boolean installtimefile(){
        PrintWriter fileOutput;
        try{
            fileOutput = new PrintWriter(new FileOutputStream("C:\\Program Files\\JobViewer\\TimeSheetLog.csv"));
            fileOutput.println("TimeSheetLog.csv");
            fileOutput.close();
            return true;
        }
        catch(IOException e){
            System.out.println("Error: installtimefile");
            return false;
        }
    }
    
    private boolean installpythonprogram(){
        PrintWriter fileOutput;
        try{
            fileOutput = new PrintWriter(new FileOutputStream("JobViewer.py"));
            fileOutput.println("#(c) Brandan Haertel 2014\n" +
"import sys, datetime, os, time\n" +
"date_today = datetime.date.today()\n" +
"def main(job):\n" +
"  file = open(\"C:\\\\Program Files\\\\JobViewer\\\\TimeSheetLog.csv\", \"a\")\n" +
"  file.write(date_today.strftime(\"%m/%d/%Y,\"))\n" +
"  file.write(time.strftime(\"%H:%M %p,\"))\n" +
"  file.write(job)\n" +
"  file.write('\\n')\n" +
"  file.close()\n" +
"\n" +
"if __name__ == '__main__':\n" +
"  main(str(sys.argv[1]))");
            fileOutput.close();
            return true;
        }
        catch(IOException e){
            System.out.println("Error: installpythonprogram");
            return false;
        }
    }
}
