import test.language.*;
import test.algorithm.*;
/**
 * Class used for unit testing 
 * English class 
 * @author Brayan Melroni
 */
public class TestExecution {
    
    public static void main(String args[]){
 
        // running the tests on English class.
        System.out.println("Testing English class."); 
        System.out.println("---------------------");
        EnglishTest englishTest =new EnglishTest();
        englishTest.testGetGroup();
        englishTest.testNormalize();
        englishTest.testConvertToUpperCase();
        englishTest.testIsEquivalent();
        englishTest.testGetSelectedLetters();
        System.out.println("End of testing English class.");
        System.out.println("---------------------");

        //running the tests on RemoveAfterFirstLetterRule class
        System.out.println("Testing RemoveAfterFirstLetterRule class.");   
        RemoveAfterFirstLetterRuleTest raftRuleTest=new RemoveAfterFirstLetterRuleTest();
        raftRuleTest.testExecute();
        System.out.println("End of testing RemoveAfterFirstLetterRule class.");
        System.out.println("---------------------");

        //running the tests on EquivalentLettersRule class
        System.out.println("Testing EquivalentLettersRule class.");   
        EquivalentLettersRuleTest elrTest =new EquivalentLettersRuleTest();
        elrTest.testExecute();
        System.out.println("End of testing EquivalentLettersRule  class.");
        System.out.println("---------------------");

        //running the tests on PhoneticAlgorithm class
        System.out.println("Testing PhoneticAlgorithm class.");  
        PhoneticAlgorithmTest pATest=new PhoneticAlgorithmTest();
        pATest.testGetEquivalentWords();
        //pATest.testGetPhoneticTone();
        System.out.println("End of testing PhoneticAlgorithm  class.");
        System.out.println("---------------------");
    }
}
