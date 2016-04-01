package test.algorithm;
import algorithm.*;
import language.*;


/**
 * Class used for unit testing RemoveAfterFirstLetterRule class 
 * @author Brayan Melroni 
 */
public class RemoveAfterFirstLetterRuleTest {

    /**
     * Test of execute method, of class RemoveAfterFirstLetterRule.
     */
    public void testExecute() {
        System.out.println("execute");
        String word = "ABCDEFGHIJKLMNOPQRSTUVWXYZyA";
        Language language = new English();
        RemoveAfterFirstLetterRule instance = new RemoveAfterFirstLetterRule();
      
        String expResult = "ABCDFGJKLMNPQRSTVXZ";
        String result = instance.execute(word, language);
        assert result.equals(expResult);
        System.out.println("execute: Test Passed");
    }
}