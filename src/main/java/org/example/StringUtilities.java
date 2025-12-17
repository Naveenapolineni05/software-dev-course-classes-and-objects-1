package org.example;

public class StringUtilities {
    // Refer to Java Basics 1 for common string methods

    // Add a static function called shortString that takes a String parameter and returns true if the string has fewer than 5
    // characters

    public static boolean shortString(String myString) {
       return (myString.length() < 5);
    }

    // Add a static function called firstLetter that takes a String parameter and returns the first character of the string

    public static char firstLetter(String myString){
        return (myString.charAt(0));
    }

    // Add a static function called censorAsparagus that takes a String parameter and returns the string with all instances of
    // "asparagus" (lowercase only) replaced with 4 stars: "****"

    public static String censorAsparagus(String myString){
        if(myString.contains("asparagus")){
            return myString.replaceAll("asparagus","****");
        }
      return myString;
    }
    // Add a static function called bigger that takes two String parameters and returns the longer of the two strings. If the
    // strings are the same length, return the first string.

    public static String bigger(String firstString, String secondString) {
        int firstStringLength = firstString.length();
        int secondStringLength = secondString.length();

        if (firstStringLength >= secondStringLength) {
            return firstString;
        } else {
            return secondString;
        }
    }
}
