/**
 * Class to provide IO Wrapper to read from a stream
 * using a Scanner
 * 
 * @author Brayan Melroni
 */
package io;
import java.util.*;

public class IOUtil {
    
    /**
     * Method to read a list of words from standard input one per line through 
     * a Scanner, create a Linked list and return the linked list with words 
     * 
     * @param scanner
     * @return list of words
     */
    public static LinkedList<String> readWords(Scanner scanner) {
        LinkedList<String> list = new LinkedList<String>();
 
        String word = "";
        
        //read all the words till the end of file or stream 
        while(scanner.hasNextLine()) {
            word = scanner.nextLine(); 
            list.add(word.trim());
        }
        
        //return the list
        return list;
    }
    
}
