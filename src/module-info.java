module javaBasicProblems {
}
//11-21-2019
/*
Description:
 You will be given an vector of string(s). You must sort it alphabetically (case-sensitive!!) and then return the first value.

The returned value must be a string, and have "***" between each of its letters.

You should not remove or add elements from/to the array.

Solution:
public class SortAndStar {

    public static String twoSort(String[] s) {
        java.util.Arrays.sort(s);

        return String.join("***",s[0].split(""));
    }
}
*/
/*12-9-2019

Description:

Complete the solution so that it returns true if the first argument(string) passed in ends with the 2nd argument (also a string).

Examples:

solution('abc', 'bc') // returns true
solution('abc', 'd') // returns false

import java.lang.*;
public class Kata {
  public static boolean solution(String str, String ending) {
 //check for 2nd string bigger than 1st string
 if(str.length() < ending.length()){
 return false;
  }
  //return true if 1st string ends with 2nd string using endsWith()method
    return str.endsWith(ending);
  }
}

Notes: used endsWith() method which checks whether the string ends with a specified suffix.This method returns a boolean value true or false.

*/
/*
Description:
Simple, remove the spaces from the string, then return the resultant string.

class Kata {
    static String noSpace(final String x) {
        String y = x.replaceAll("\\s+","");
        return y;
    }
}

NOTES: used replaceAll() method returns a string replacing all the sequence of characters matching regex and replacement string.
REGEX HELP
. Any character.
\d A digit: [0-9]
\D A non-digit: [\^0-9]
\s A whitespace character: [ \t\n\x0B\f\r]
\S A non-whitespace character: [\^\s]
\w A word character: [a-zA-Z_0-9]
\W A non-word character: [\^\w]


*/