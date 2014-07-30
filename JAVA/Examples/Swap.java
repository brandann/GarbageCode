/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BrandanTools;

import java.util.Random;

/**
 *
 * @author Brandan
 */
public class Swap {
    static void swap(Object[] array, int index1, int index2)
     {
          Object temp = array[index1];
          array[index1] = array[index2];
          array[index2] = temp;
     }
    static void swapScramble(Object[] array)
    {
        Random rand = new Random();
        int index1 = rand.nextInt(array.length);
        int index2 = rand.nextInt(array.length);
        int randomLength = rand.nextInt(500);
        for(int i = 0; i < randomLength; i ++)
        {
            Object temp = array[index1];
            array[index1] = array[index2];
            array[index2] = temp;
        }
    }
}
