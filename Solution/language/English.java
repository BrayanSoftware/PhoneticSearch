/**
 * Class to implement Language interface and provides alphabets for 
 * English language 
 * 
 * @author Brayan Melroni
 */
package language;
public class English implements Language {
    
    //Regular expressions for groups of equivalent alphabets
    private static final String GROUP_ONE = "[AEIOU]";
    private static final String GROUP_TWO = "[CGJKQSXYZ]";
    private static final String GROUP_THREE = "[BFPVW]";
    private static final String GROUP_FOUR = "[DT]";
    private static final String GROUP_FIVE = "[MN]";

    //Regualr expressions for miscellaneous groups of alphabets
    private static final String GROUP_NONEQUIVALENT= "[HLR]";
    private static final String GROUP_NONALPHABETIC="[^a-zA-Z]";
    private static final String GROUP_REMOVE_AFTER_FIRST="[AEIHOUWYaeihouwy]";
   
    /**
     * Method to return a classification/group number of a given 
     * alphabet in a given language. 
     * This idea of assigning a number to each group came into my mind after 
     * reading about soundex algorithm in wikipedia. 
     * @param letter
     * @return group number
     */
    @Override
    public int getGroup(char letter){

        String letterString = convertToUpperCase(String.valueOf(letter));
	
        if(letterString.matches(GROUP_ONE))
            return 1;
        else if(letterString.matches(GROUP_TWO))
            return 2;
        else if(letterString.matches(GROUP_THREE))
            return 3;
        else if(letterString.matches(GROUP_FOUR))
            return 4;
        else if(letterString.matches(GROUP_FIVE))
            return 5;
        else if(letterString.matches(GROUP_NONEQUIVALENT))
            return 6;
        else return -1;  //not in the alphabet
    }
    
    /**
     * Method to normalize a word in a way that it only 
     * contains  alphabet characters of the given language. 
     * 
     * @param word
     * @return normalized word
     */
    @Override
    public String normalize(String word){
        return word.replaceAll(GROUP_NONALPHABETIC, "");
    }

    /**
     * Method to convert all the alphabet characters of a word
     * to UpperCase. 
     * 
     * @param word
     * @return word with all UpperCase characters
     */
    @Override
    public String convertToUpperCase(String word){
        return word.toUpperCase();
    }
      /**
     * Method to check the equivalence of two 
     * alphabet letters in the language
     * @param character - alphabetic character
     * @param anothercharacter - another alphabetic character
     * @return boolean value representing the equivalence of two 
     *letters in the language
     */
    @Override
    public boolean isEquivalent(char character, char anotherCharacter){
       character=Character.toUpperCase(character);
       anotherCharacter=Character.toUpperCase(anotherCharacter);
       if((getGroup(character)==getGroup(anotherCharacter))&&(!String.valueOf(character).matches(GROUP_NONEQUIVALENT))){
           return true;
       }
       else{
           return false;
       }
    }

     /**
     * Method to select a specific set of 
     * alphabet letters in the language
     *
     * @return regular expression for set of letters 
     *  that should be discarded after first letter.
     */
    @Override
    public String getSelectedLetters(){
      return GROUP_REMOVE_AFTER_FIRST;
    }
}
