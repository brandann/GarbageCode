/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication26;

import java.util.Arrays;


/**
 *
 * @author brandan
 */
public class JavaApplication26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] shows = new String[] {
            "Walking Dead",
            "Breaking Bad",
            "Firefly",
            "Stargate",
            "How I Met Your Mother",
            "Battlestar Galactica"
        };
        for(String s : shows)
        {
            System.out.print(s + "\n");
        }
        Arrays.sort(shows);
    }
}
