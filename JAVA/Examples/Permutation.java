/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BrandanTools;

import java.util.ArrayList;

/**
 *
 * @author Brandan
 */
public class Permutation {
    public Permutation(String myWord)
    {
        word = myWord;
    }
    public ArrayList<String> getPermutation()
    {
        ArrayList<String> arrayListPermutation = new ArrayList<String>();
        
        if (word.length() == 0)
        {
            arrayListPermutation.add(word);
            return arrayListPermutation;
        }
        
        for(int i = 0; i < word.length(); i++)
        {
            String shorterWord = word.substring(0,i) 
                    + word.substring(i + 1);
            
            Permutation shorterPermutaion 
                    = new Permutation(shorterWord);
            ArrayList<String> shorterWordPermutations
                    = shorterPermutaion.getPermutation();
            
            for(String s : shorterWordPermutations)
            {
                arrayListPermutation.add(word.charAt(i) + s);
            }
        }
        return arrayListPermutation;
    }
    private String word;
}
