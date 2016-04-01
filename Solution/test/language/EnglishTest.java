package test.language;
import language.*;
/**
 * Class used for unit testing 
 * English class 
 * @author Brayan Melroni
 */
public class EnglishTest {
  
   /**
     * Test of getGroup method, of class English.
   */
   
    public void testGetGroup() {
       System.out.println("getGroup");
        char group1[]={'A','E','I','O','U'};
        char group2[]={'C','G','J','K','Q','S','X','Y','Z'};
        char group3[]={'B','F','P','V','W'};
        char group4[]={'D','T'};
        char group5[]={'M','N'};
        char group6[]={'H','L','R'};
        English instance = new English();
        int expResult = 1;
        for (char c:  group1){
            int result = instance.getGroup(c);
            assert result==expResult;
            
        }
        expResult = 2;
        for (char c:  group2){
            int result = instance.getGroup(c);
            assert result==expResult;
        }
        expResult = 3;
        for (char c:  group3){
            int result = instance.getGroup(c);
            assert result==expResult;
        }
        expResult = 4;
        for (char c:  group4){
            int result = instance.getGroup(c);
            assert result==expResult;
        }
        expResult = 5;
        for (char c:  group5){
            int result = instance.getGroup(c);
            assert result==expResult;
        }
        expResult = 6;
        for (char c:  group6){
            int result = instance.getGroup(c);
            assert result==expResult;
        }
        expResult=-1;
        int result=instance.getGroup('$');
        assert result==expResult;
        System.out.println("getGroup: Test Passed");
    }
    
    /**
    * Test of normalize method, of class English.
    */
    
    public void testNormalize() {
        System.out.println("normalize");
        String word = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890!@£$%^&*()`~,./<>?,;:-=_+§±";
        English instance = new English();
        String expResult = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        String result = instance.normalize(word);
        assert result.equals(expResult);
        System.out.println("normalize: Test Passed");
    }
    
    /**
    * Test of convertToUpperCase method, of class English.
    */
    
    public void testConvertToUpperCase() {
        System.out.println("convertToUpperCase");
        String word = "lowercaseUPPERCASE";
        English instance = new English();
        String expResult = "LOWERCASEUPPERCASE";
        String result = instance.convertToUpperCase(word);
        assert result.equals(expResult);
        System.out.println("convertToUpperCase: Test Passed");
    }
    
    /**
     * Test of isEquivalent method, of class English.
     */
    
    public void testIsEquivalent() {
        System.out.println("isEquivalent");
        English instance = new English();
        String equivalents[]={"AE","AI","AO","AU", "EI","EO","EU","IO","IU","OU"                ,"CG","CJ","CK","CQ","CS","CX","CY","CZ","GJ","GK","GQ","GS","GX","GY","GZ","JK","JQ","JS","JX","JY","JZ","KQ","KS","KX","KY","KZ","QS","QX","QY","QZ","SX","SY","SZ","XY"
        ,"XZ","YZ"
        ,"BF","BP","BV","BW","FP","FV","FW","PV","PW","VW"
        ,"DT"
        ,"MN"};
        boolean expResult = true;
        for(String eq: equivalents){ 
            boolean result = instance.isEquivalent(eq.charAt(0),eq.charAt(1));
            result = instance.isEquivalent('9','9');
            assert result==expResult;
        }
        
        expResult = false;
        String nonEquivalents[]={"HL","HR","LR","AH","AL","AR","CH","CL","CR","BH","BL","BR","DH","DL","DR","MH","ML","MR"};
        for(String nonEq: nonEquivalents){ 
            boolean result = instance.isEquivalent(nonEq.charAt(0),nonEq.charAt(1));
            assert result==expResult;
        }
        System.out.println("isEquivalent: Test Passed");
    }
    
    /**
     * Test of getSelectedLetters method, of class English.
     */
    
    public void testGetSelectedLetters() {
        System.out.println("getSelectedLetters");
        English instance = new English();
        String expResult = "[AEIHOUWYaeihouwy]";
        String result = instance.getSelectedLetters();
        assert result.equals(expResult);
        System.out.println("getSelectedLetters: Test Passed");
    }
    
    public static void main(String args[]){
        // running the tests.
        EnglishTest test =new EnglishTest();
        test.testGetGroup();
        test.testNormalize();
        test.testConvertToUpperCase();
        test.testIsEquivalent();
        test.testGetSelectedLetters();
    }
}
