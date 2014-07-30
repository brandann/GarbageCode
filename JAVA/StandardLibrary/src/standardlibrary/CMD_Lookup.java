/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package standardlibrary;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author brandan
 */
public class CMD_Lookup {
    public CMD_Lookup()
    {
    Scanner keyboard = new Scanner(System.in);
        String lookupChoice = "";
        System.out.println("Welcome, would you like to");
        System.out.println("1. Lookup by Job Name");
        System.out.println("2. Lookup by Job Number");
        System.out.println("3. Lookup by Year");
        System.out.println("4. Lookup by Tags");
        lookupChoice = keyboard.nextLine();
        if(lookupChoice.equals("1"))
        {
            System.out.println("************************************");
            System.out.println("*              JOB NAME            *");
            System.out.println("************************************");
            name();
        }
        else if(lookupChoice.equals("2"))
        {
            System.out.println("************************************");
            System.out.println("*              JOB NUMBER          *");
            System.out.println("************************************");
            number();
        }
        else if(lookupChoice.equals("3"))
        {
            System.out.println("************************************");
            System.out.println("*                YEAR              *");
            System.out.println("************************************");
            year();
        }
        else if(lookupChoice.equals("4"))
        {
            System.out.println("************************************");
            System.out.println("*                TAGS              *");
            System.out.println("************************************");
            tags();
        }
        else
        {
            System.out.println("Sorry, that was not a valid choice");
        }
    }
    
        private void name()
    {
        
    }
    
    private void number()
    {
        
    }
    
    private void year()
    {
        
    }
    
    private String[] tags()
    {
        ArrayList<String> list = new ArrayList<>();
        String[] array;
        Scanner keybored = new Scanner(System.in);
        String tagIn = "";
        boolean test = true;
        System.out.println("Enter Tags");
        while(test)
        {
            tagIn = keybored.nextLine();
            if(tagIn.isEmpty())
            {
                test = !test;
            }
            else
            {
                list.add(tagIn.toUpperCase());
            }
            
        }
        array = new String[list.size()];
        array = list.toArray(array);
        //printResults(array);
        return array;
    }
}
