/**
 * Interface to specify the logic 
 * behind any rule.
 * 
 * The interface will provide a high level of methods
 * that can be extended by any particular rule 
 * 
 * @author Brayan Melroni
 */
package algorithm;
import language.*;
public interface Rule{
    /**
     * Method to apply a set of logical operations for a word  
     * of the given language. 
     * 
     * @param word
     * @param language
     * @return word after the logic is applied
     */
    public String execute(String word, Language language);
}

