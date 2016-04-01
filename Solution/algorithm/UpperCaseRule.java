/**
 * Class to implement the Rule interface 
 * to specify the logic behind a rule
 * 
 * @author Brayan Melroni
 */
package algorithm;
import language.*;
public class UpperCaseRule implements Rule{
   /**
     * converts all the letters of a given language to Upper Case. 
     * 
     * @param language
     * @param word
     * @return word with all upper case charaters
     */
  @Override
  public String execute(String word, Language language){
     return language.convertToUpperCase(word);
  }
}
