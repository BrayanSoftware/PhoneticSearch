/**
 * Class to implement the Rule interface 
 * to specify the logic behind a rule
 * 
 * @author Brayan Melroni
 */
package algorithm;
import language.*;
public class NonAlphabeticRule implements Rule{
   /**
     * normalizes a word and remove all non-alphabet character.
     * method will ensure that the given word is modified and will contain
     * legal alphabets of a given language. 
     * 
     * @param language
     * @param word
     * @return normalized word
     */
  @Override
  public String execute(String word, Language language){
     return language.normalize(word);
  }
}
