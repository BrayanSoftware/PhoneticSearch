/**
 * Driver program
 * @author Brayan Melroni
 */
import io.*;
import language.*;
import algorithm.*;
import java.util.*;

public class Program {
    
    /**
     * main method
     * 
     * @param args - command line arguments
     */
    public static void main(String [] args) 
    {
   
        //Scanner object to read from console
        Scanner scanner = new Scanner(System.in);
        
        //Language Object
        Language language = new English();
        
        // Linked List containg rules
        LinkedList<Rule> ruleList=new LinkedList<Rule>();
        ruleList.add(new NonAlphabeticRule());
        ruleList.add(new UpperCaseRule());
        ruleList.add(new RemoveAfterFirstLetterRule());
        ruleList.add(new EquivalentLettersRule());
        
        // Algorithm Object
        Algorithm algorithm = new PhoneticAlgorithm(language,ruleList);
        
        //check for command line arguments
        if(args.length < 1)
        {
            System.out.println("ERROR: INVALID USAGE");
            System.out.println("WARNING: MISSING COMMAND LINE ARGUMENTS");
            System.out.println("USAGE: java Program jones winton < surnames.txt");
            System.exit(0); 
        }

        //load words from the console
        LinkedList<String> wordList =IOUtil.readWords(scanner);
        System.out.println("");
        
        //run for each command line argument
        for(String word : args)
        {
            LinkedList<String> list = algorithm.getEquivalentWords(wordList, word);
                    
            //display current search results
            System.out.print(word + ": ");
            
            if(list.size() > 0)
            	System.out.print(list.getFirst().toString());
            
            for(int i=1; i<list.size(); i++)
                System.out.print(", " + list.get(i));
            System.out.println("\n");
        }
    }
}
