/**
 * Interface to search for phonetically equivalent words 
 * from a given set of words. 
 * 
 * The interface will provide a high level of methods
 * that can be extended by any particular algorithm. 
 * 
 * @author Brayan Melroni
 */
package algorithm;
import java.util.*;
public interface Algorithm {
    
    /**
     * Method to search for phonetically equivalent words
     * from a given list of words. 
     * 
     * @param wordList - list of words to search
     * @param word - word to search phonetically equivalent
     * @return searchedWords
     */
    public LinkedList<String> getEquivalentWords(LinkedList<String> wordList, String word);
    
    /**
     * function to find the phonetic tone of a given word. 
     * 
     * The function will perform various actions on the word to get its 
     * phonetic equivalent tone that will be used to search phonetically 
     * equivalent words. 
     * 
     * @param word
     * @return tone
     */
    public String getPhoneticTone(String word);
    
}
