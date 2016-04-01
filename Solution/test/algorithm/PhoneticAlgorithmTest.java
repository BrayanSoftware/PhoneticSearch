package test.algorithm;

import language.*;
import algorithm.*;
import java.util.LinkedList;

/**
 * Class used for unit testing 
 * PhoneticAlgorithm class 
 * @author Brayan Melroni
 *  
 */
public class PhoneticAlgorithmTest {
   
    
    PhoneticAlgorithm instance;
    public PhoneticAlgorithmTest() {
        LinkedList<Rule> ruleList=new LinkedList<Rule>();
        ruleList.add(new NonAlphabeticRule());
        ruleList.add(new UpperCaseRule());
        ruleList.add(new RemoveAfterFirstLetterRule());
        ruleList.add(new EquivalentLettersRule());
        
        English language=new English();
        instance = new PhoneticAlgorithm(language,ruleList);
    }
    
       /**
     * Test of getEquivalentWords method, of class PhoneticAlgorithm.
     */
   
    public void testGetEquivalentWords() {
        System.out.println("getEquivalentWords");
        LinkedList<String> wordList = new LinkedList<String>();
        wordList.add("Smith");
        wordList.add("Smyth");
        wordList.add("Smythe");
        wordList.add("Smid");
        wordList.add("Schmidt");
        wordList.add("Smithers");
        wordList.add("Jonas");
        wordList.add("Johns");
        wordList.add("Johnson");
        wordList.add("Macdonald");
        wordList.add("Nest O'Malett");
        wordList.add("Ericsson");
        wordList.add("Erikson");
        wordList.add("Saunas");
        wordList.add("Van Damme");
        
        String word = "Jones";
        LinkedList result = instance.getEquivalentWords(wordList, word);
        assert result.size()==3 && result.contains("Jonas") && result.contains("Johns") && result.contains("Saunas");
        
        word = "Winton";
        result=null;
        result = instance.getEquivalentWords(wordList, word);
        assert result.size()==1 && result.contains("Van Damme");
        
        word = "Ericsson";
        result=null;
        result = instance.getEquivalentWords(wordList, word);
        assert result.size()==2 && result.contains("Ericsson") && result.contains("Erikson");
        
        word = "Nest O'Malett";
        result=null;
        result = instance.getEquivalentWords(wordList, word);
        assert result.size()==2 && result.contains("Nest O'Malett") && result.contains("Macdonald");
        
        word = "Smith";
        result=null;
        result = instance.getEquivalentWords(wordList, word);
        assert result.size()==5 && result.contains("Smith") && result.contains("Smyth") &&
        result.contains("Smythe") && result.contains("Smid") && result.contains("Schmidt");
        
        System.out.println("getEquivalentWords: Test successful");
      
    }
 
    /**
     * Test of getPhoneticTone method, of class PhoneticAlgorithm.
     */
   
    public void testGetPhoneticTone() {
        
        System.out.println("getPhoneticTone");
        String word = "Smith";
        String expResult = "254";
        String result = instance.getPhoneticTone(word);
        assert result.equals(expResult);
        
        word = "Smyth";
        expResult = "254";
        result = instance.getPhoneticTone(word);
        assert result.equals(expResult);
        
        word = "Smythe";
        expResult = "254";
        result = instance.getPhoneticTone(word);
        assert result.equals(expResult);
        
        word = "Smid";
        expResult = "254";
        result = instance.getPhoneticTone(word);
        assert result.equals(expResult);
        
        word = "Schmidt";
        expResult = "254";
        result = instance.getPhoneticTone(word);
        assert result.equals(expResult);
        
        word = "Smithers";
        expResult = "25462";
        result = instance.getPhoneticTone(word);
        assert result.equals(expResult);
        
        word = "Jonas";
        expResult = "252";
        result = instance.getPhoneticTone(word);
        assert result.equals(expResult);
        
        word = "Johns";
        expResult = "252";
        result = instance.getPhoneticTone(word);
        assert result.equals(expResult);
        
        word = "Johnson";
        expResult = "2525";
        result = instance.getPhoneticTone(word);
        assert result.equals(expResult);
        
        word = "Macdonald";
        expResult = "524564";
        result = instance.getPhoneticTone(word);
        assert result.equals(expResult);
        
        word = "Johnson";
        expResult = "2525";
        result = instance.getPhoneticTone(word);
        assert result.equals(expResult);
        
        word = "Nest O'Malett";
        expResult = "524564";
        result = instance.getPhoneticTone(word);
        assert result.equals(expResult);
        
        word = "Ericsson";
        expResult = "1625";
        result = instance.getPhoneticTone(word);
        assert result.equals(expResult);
        
        word = "Erikson";
        expResult = "1625";
        result = instance.getPhoneticTone(word);
        assert result.equals(expResult);
        
        word = "Saunas";
        expResult = "252";
        result = instance.getPhoneticTone(word);
        assert result.equals(expResult);
        
        word = "Van Damme";
        expResult = "3545";
        result = instance.getPhoneticTone(word);
        assert result.equals(expResult);
        
        System.out.println("getPhoneticTone: Test successful");
    }
}