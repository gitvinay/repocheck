/* This program was coded by Jerome Scott II aka codecaine 8/

/*Note when doing Collections the variable must be a Wrapper
 * Example:
 * Integer x;
 * String s;
 * Character c;
 * Double d;
 * Float f;
 */

import java.util.Arrays;
import java.util.Collections;

public class ArrayExamples {

    public static void main(String[] args) {

        //Array of strings
        String []myArray = {"Ace","King","Queen","Jack"};

        //print the array
        System.out.println("Orginal Array");
        printArray(myArray);

        //Sort the array using Arrays static class
        Arrays.sort(myArray);
        System.out.println("\nSorted Array");
        printArray(myArray);

        /*reverse the array using collections must cast the array as a list
         * because the Collections static class takes list for input*/
        Collections.reverse(Arrays.asList(myArray));
        System.out.println("\nReverse Array");
        printArray(myArray);

        /*shuffle the array once again using Arrays.asList() to cast the
         * array as a list*/
        Collections.shuffle(Arrays.asList(myArray));
        System.out.println("\nShuffled Array");
        printArray(myArray);

        /*binary search the array if the value return is 0 or greater the
         *that is the location of where it was found else is is not in the
         *array*/
        System.out.println("\nBinary Search for King");
        if( Arrays.binarySearch(myArray, "King") >= 0)
            System.out.println("King is in the Array!");

        
        
    }


    //loop through an String Array and print results
    public static void printArray(String []strArray){
        //loop to display each value of a array
        for(String x : strArray)
            System.out.println(x);
        }
     /*You can also to the old fashion loop for example

      for(int x = 0; x < myArray.length; x++){
           System.out.println(myArray[x]);
                                                       */

}
