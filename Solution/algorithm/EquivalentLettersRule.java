/**
 * Class to implement the Rule interface 
 * to specify the logic behind a rule
 * 
 * @author Brayan Melroni
 */
package algorithm;
import language.*;
public class EquivalentLettersRule implements Rule{
 /**
  * Method to discard consecutive occurances of equiavalent letters 
  * in a word
  * 
  * @param word
  * @param language
  * @return normalized word
  */
  @Override
  public String execute(String word, Language language){
       char letters [] = word.toCharArray();
       String newWord = "";
       for(int i=0; i<letters.length-1; i++){
            if(language.isEquivalent(letters[i],letters[i+1]))
                letters[i] = ' ';
        }
        for(int i=0; i<letters.length; i++){
            if(letters[i] != ' ')
                newWord += letters[i];
        }
       
        return newWord;
  }

}