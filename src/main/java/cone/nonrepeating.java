package cone;

import java.util.HashMap;
import java.util.Map;

//Made to increment itself as letters are passed in. P and I in pizza can't be both i++
class CountIndex { 
    int count, index; 
  
    // count starts at 1 when it's made
    public CountIndex(int index) 
    { 
        this.count = 1; 
        this.index = index; 
    } 
  
    // Update count when called 
    public void incCount() 
    { 
        this.count++; 
    } 
} 



public class nonrepeating {
    
    //Number of characters in ASCII
    static final int NO_OF_CHARS = 256;
    
    //HashMap to hold characters and their appearance counts
    public static Map<Character, CountIndex> mappedNumber = new HashMap<>(NO_OF_CHARS);
    
    
    public static void norepeats(String someString) {

        /** Go through the string and map values
         * This is a for loop in order to use i for char.At()
         */
        
        for(int i = 0; i < someString.length(); i++){
          /** If the character is already in the map, invoke incCount() */
          if(mappedNumber.containsKey(someString.charAt(i))){
            mappedNumber.get(someString.charAt(i)).incCount();
          }
          /** Else put the string at this index into the map, and make a new CountIndex */
          else{
              mappedNumber.put(someString.charAt(i), new CountIndex(i));
          }
        }

        for(Map.Entry<Character, CountIndex> entry: mappedNumber.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue().count);
        }
    }



    public static void main(String[] args) {
        String someString = "hippopotamus";
        norepeats(someString);
    }
}