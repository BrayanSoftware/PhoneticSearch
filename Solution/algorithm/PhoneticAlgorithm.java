/**
 * Class to implement the Algorithm interface 
 * to search for phonetically equivalent words in a given list of 
 * words. 
 * 
 * @author Brayan Melroni
 */
package algorithm;
import language.*;
import java.util.*;
public class PhoneticAlgorithm implements Algorithm{
    private Language language; 
    private LinkedList<Rule> rules; 
    /**
     * Constructor 
     * 
     * @param language - given Language
     * @param rules - list of rules in the algorithm
     */
    public PhoneticAlgorithm(Language language,LinkedList<Rule> rules){
      this.language=language;
      this.rules=rules;
    } 

    /**
     * Method to search for phonetically equivalent words
     * from a given list of words. 
     * 
     * @param wordList - given list of words
     * @param word - word to search other phonetically equivalent words
     * @return searchedWords
     */
    @Override
    public LinkedList<String> getEquivalentWords(LinkedList<String> wordList, String word){

        LinkedList<String> words = new LinkedList<String>();
        
        //tone of a given word
        String tone = this.getPhoneticTone(word);

        //traverse each word in the list, get its phonetic tone, if
        //its equivalent it is added to the the list
        for(String w: wordList){
        	String t = this.getPhoneticTone(w);
        	
            if(t.equals(tone)){
            	words.add(w);
            }
        }
        
        return words;
    } 
    	  
    /**
     * Method to find the phonetic tone of a given word. 
     * 
     * The function will perform various actions on the word to get its 
     * phonetic equivalent tone that will be used to search phonetically 
     * equivalent words. 
     * 
     * @param word
     * @return tone
     */
    @Override
    public String getPhoneticTone(String word){
        //Apply various rules to the word according to algorithm
        for(Rule r: rules ){
	word=r.execute(word,language); 
        }
       
        //Calculate the phonetic tone
        String tone = "";
        for(int i=0; i<word.length(); i++) {
            tone += language.getGroup(word.charAt(i));
        } 
        return tone;
    } 
    
}
