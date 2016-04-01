package test.algorithm;
import language.*;
import algorithm.*;

/**
 * Class used for unit testing EquivalentLettersRule class 
 * @author Brayan Melroni
 */
public class EquivalentLettersRuleTest {
      
    /**
     * Test of execute method, of class EquivalentLettersRule.
     */
   
    public void testExecute() {
        System.out.println("execute");
        Language language = new English();
        EquivalentLettersRule instance = new EquivalentLettersRule();
        String word = "AABBCCDDEEFFGGHHIIJJKKLLMMNNOOPPQQRRSSTTUUVVWWXXYYZZ";
        String expResult = "ABCDEFGHHIKLLNOPQRRSTUWZ";
        String result = instance.execute(word, language);
        assert result.equals(expResult);
        
        word="AEIOUCGHHLR";
        expResult="UGHHLR";
        result = instance.execute(word, language);
        assert result.equals(expResult);
        
        word="AECGBFDTHLRMN";
        expResult="EGFTHLRN";
        result = instance.execute(word, language);
        assert result.equals(expResult);
       
        System.out.println("execute : Test passed");
       
        
    }
  
}