/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package libraryview;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author brandan
 */
public class Data {

    public String GUITITLE;
    public int    BRANDANS_LUCKYNUMBER;
    public String DATABASE_PATH;

    public Data(){
        Scanner fileInputScanner;
        
        try{
            fileInputScanner = new Scanner(new File("data\\data.txt"));
            
            GUITITLE = breakData(fileInputScanner.nextLine());
            BRANDANS_LUCKYNUMBER = Integer.parseInt(breakData(fileInputScanner.nextLine()));
            DATABASE_PATH = breakData(fileInputScanner.nextLine());
            
            fileInputScanner.close();
        }
        catch(IOException e){
            System.out.println("Error: readTextFile");
        }
        
        System.out.println(GUITITLE);
        System.out.println(BRANDANS_LUCKYNUMBER);
    }
    
    private String breakData(String data){
        String[] d = data.split("=");
        return d[1];
    }
}
