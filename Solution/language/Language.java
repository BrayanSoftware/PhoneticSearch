/**
 * Interface to provide a language contract. The implementation class
 * will provide implementation based on particular language. 
 * 
 * The interface will provide a way to get the alphabet groups and their
 * classification number. 
 * 
 * @author Brayan Melroni
 */
package language;
public interface Language {

    /**
     * Method to return a classification/group number of a given 
     * alphabet in a given language. 
     * 
     * @param letter
     * @return group number
     */
    public int getGroup(char letter);
    
    /**
     * Method to normalize a word in a way that it only 
     * contains alphabet characters of the given language. 
     * 
     * @param word
     * @return normalized word
     */
    public String normalize(String word);

   /**
     * Method to convert all the characters of a word
     * to UpperCase 
     * 
     * @param word
     * @return word with all UpperCase characters
     */
    public String convertToUpperCase(String word);

      /**
     * Method to check the equivalence of two 
     * alphabet letters in the language
     * @param character
     * @param anothercharacter
     * @return boolean value representing the equivalence of two 
     * letters in the language
     */
    public boolean isEquivalent(char character, char anothercharacter);

    /**
     * Method to select a specific set of 
     * alphabet letters in the language
     *
     * @return regular expression for selected set of 
     * letters in the language
     */
    public String getSelectedLetters();
}
