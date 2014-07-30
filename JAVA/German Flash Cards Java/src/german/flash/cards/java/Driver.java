/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package german.flash.cards.java;

/**
 *
 * @author brandan
 */
public class Driver {
    String germanWord = "";
    String englishAnswer = "";
    String user = "";
    String[][] wordList;
    final int ROWS = 4500;
    final int COLUMNS = 2;
    
    public Driver(String name)
    {
        user = name;
        wordList = new String[ROWS][COLUMNS];
        populateWordListArray();
    }
    
    public String getNextGermanWord()
    {
        return germanWord;
    }
    
    public String getEnglishAnswer()
    {
        return englishAnswer;
    }
    
    public boolean makeGuess(String guess)
    {
        return true;
    }
    
    public void setCorrect(int guess)
    {
        
    }
    
    public void fixCorrect(boolean guess)
    {
        
    }
    
    private void populateWordListArray()
    {
        
    }
    
    public boolean equals(String german, String english)
    {
        return true;
    }

}

