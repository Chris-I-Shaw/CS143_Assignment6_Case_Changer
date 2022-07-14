/**
 * Chris Shaw
 * CS 143 Java
 * 8/20/2019
 * CaseChanger class to use Lambda Expressions to change capitalization of strings
 */

package asignment06;

import java.util.ArrayList;

public class CaseChanger {

    /**
     * Method to capitalize all Characters in the array passed as an argument
     * @param stringList ArrayList of strings passed as an argument
     * @return The new ArrayList with changed values
     */
    public static ArrayList<String> mangleToUpperCase(ArrayList<String> stringList) {
        ArrayList<String> newList = new ArrayList<>();
        
        int[] index = {0};

        stringList.forEach(s -> {
            s = s.toUpperCase();
            stringList.set(index[0], s);
            newList.add(stringList.get(index[0]));
            index[0]++;
        });
        
        return newList;
        
    }
    
    /**
     * Method to lower case all Characters in the array passed as an argument
     * @param stringList ArrayList of strings passed as an argument
     * @return The new ArrayList with changed values
     */
    public static ArrayList<String> mangleToLowerCase(ArrayList<String> stringList) {
        ArrayList<String> newList = new ArrayList<>();

        int[] index = {0};

        stringList.forEach(s -> {
            s = s.toLowerCase();
            stringList.set(index[0], s);
            newList.add(stringList.get(index[0]));
            index[0]++;
        });

        return newList;
    }
    /**
     * Method to capitalize all first letters of each string in the array passed as an argument
     * @param stringList ArrayList of strings passed as an argument
     * @return The new ArrayList with changed values
     */
    public static ArrayList<String> mangleCapitalize(ArrayList<String> stringList) {
        ArrayList<String> newList = new ArrayList<>();
        int[] index = {0};

        stringList.forEach(s -> {
            s = s.toLowerCase();
            char ch[] = s.toCharArray();
            ch[0] = Character.toUpperCase(ch[0]);
            stringList.set(index[0], String.valueOf(ch));
            newList.add(stringList.get(index[0]));
            index[0]++;
        });
        
        return newList;
    }
    /**
     * Method to alternate capitals in the array passed as an argument
     * @param stringList ArrayList of strings passed as an argument
     * @return The new ArrayList with changed values
     */
    public static ArrayList<String> mangleToUpperLowerCase(ArrayList<String> stringList) {
        ArrayList<String> newList = new ArrayList<>();

        int[] index = {0};

        stringList.forEach(s -> {
            char ch[] = s.toCharArray();
            for (int i = 0; i < ch.length; ++i) {

                if (i % 2 == 0) {

                    ch[i] = Character.toUpperCase(ch[i]);

                } else {

                    ch[i] = Character.toLowerCase(ch[i]);

                }

            }
            stringList.set(index[0], String.valueOf(ch));
            newList.add(stringList.get(index[0]));
            index[0]++;

        });

        return newList;
    }
}
