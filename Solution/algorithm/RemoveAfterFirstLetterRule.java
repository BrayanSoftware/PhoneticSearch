/**
* Class to implement the Rule interface 
* to specify the logic behind a rule
* 
* @author Brayan Melroni
*/
package algorithm;
import language.*;
public class RemoveAfterFirstLetterRule implements Rule{
 /**
     * method to remove given set of letters
     * after first letter
     * 
     * @param word
     * @param language
     * @return word without the given set of letters after first letter
     */ 
     @Override
     public String execute(String word, Language language){
        if(word.length()>1){
           char fLetter=word.charAt(0);
           word=word.substring(1);
           word=word.replaceAll(language.getSelectedLetters(), "");
           word=fLetter+word;
        }
        return word;
    }
}
