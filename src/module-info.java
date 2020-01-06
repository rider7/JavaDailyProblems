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
----------------------------------------------------------------------------------------
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
 ----------------------------------------------------------------------------------------
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
/*
 -----------------------------------------------------------------------------
Description:
In this kata you need to check the provided array (x) for good ideas 'good' and bad ideas 'bad'. 
If there are one or two good ideas, return 'Publish!', if there are more than 2 return 'I smell a series!'. 
If there are no good ideas, as is often the case, return 'Fail!'.

import java.util.*;
public class Kata {

  public static String well(String[] x) {
  System.out.println(Arrays.toString(x)); //To see what array was printing for testing purposes
    String good = "good";
    String bad = "bad";
    String fail = "Fail!";
    String publish = "Publish!";
    String series = "I smell a series!";
    int goodCounter = 0;
    //Loop through array of Strings named x
    for(int i=0; i < x.length; i++){
      if(x[i] == "good"){
      ++goodCounter;
      System.out.println("Good Counter " + goodCounter);
      } 
    }
    if(goodCounter <= 0){
    return fail;
    } else if (goodCounter <= 2){
    return publish;
    } else {
    return series;
   }
  }
}

Refactor:

int counter = 0;
for(int i = 0; i < x.length; i ++){
	if(x[i] == "good") counter++;
	}
if(counter == 0) return "Fail!";
else if(counter <= 2) return "Publish!";
return "I smell a series!";

Notes:
The java.util.Arrays.toString(int[]) method returns a string representation of the contents of the specified int array.
*/
/*
 --------------------------------------------------------------------------------------------------
 *Description:
 *Given an array of integers as strings and numbers, return the sum of the array values as if all were numbers. Return your answer as a number.
	

 import java.util.List;
import java.util.*;

Submitted with Errors...
public class MixedSum {
 /*
  Assume input will be only of Integer o String type
  
	public int sum(List<?> mixed) {	
  int total = 0;
  
  for( int i = 0; i < mixed.size(); i++){
    if (mixed.get(i) instanceof String ){
    total =  total + Integer.parseInt(mixed.get(i));
    }else if(mixed.get(i) instanceof Integer){
    total = total + mixed.get(i);
    }
    //total = total + mixed.get(i);
    System.out.println(mixed.get(i));
  }
		return total;
	}
}
 
 Refactor:
 import java.util.List;

public class MixedSum {
  
	public int sum(List<?> mixed) {	
  int total = 0;
  int number = 0;
  
  for( int i = 0; i < mixed.size(); i++){
    // take the value in mixed at the i index convert it to a string then convert to int and assign to number
    number = Integer.parseInt(mixed.get(i).toString());
    // add number to the total
    total += number;
    }
		return total;
	}
}
 
 Notes: We can convert String to an int in java using Integer.parseInt() method. 
 The Integer.toString() method converts int to String. The toString() is the static method of Integer class. 
 
 --------------------------------------------------------------------------------------------------
Description:
Implement String#digit? (in Java StringUtils.isDigit(String)), 
which should return true if given object is a digit (0-9), false otherwise.
 
My Solution:
import java.util.regex.*;

public class StringUtils {
  
  public static boolean isDigit(String s) {
  if(Pattern.matches("\\d",s)){
  return true;
   }else {
   return false;
	}
	}
}
 
 Refactor:
 public class StringUtils {
  public static boolean isDigit(String s) {
    return s.matches("[0-9]");
  }
}
 
 Notes: java.util.regex.* used to evaluate the string. matches() method It compiles the regular expression and matches the given input with the pattern.
 Regex Basics:
 . any charactor
 \d or [0-9] any digit
 \D or [^0-9] any non-digit
 \s or [\t\n\x0B\f\r] any whitespace character
 \S or [^\s] any non-whitespace character
 
 ----------------------------------------------------------------------------------
 Description:
Your task is to sum the differences between consecutive pairs in the array in descending order.

For example: sumOfDifferences([2, 1, 10]) Returns 9

Descending order: [10, 2, 1]

Sum: (10 - 2) + (2 - 1) = 8 + 1 = 9

If the array is empty or the array has only one element the result should be 0 (Nothing in Haskell).
 
import java.util.Arrays;

public class ZywOo {
  public static int sumOfDifferences(int[] arr) {
    Arrays.sort(arr); // sort arrays
    //if length of array is less than or equal to 1 return zero
    //else return the index of the array at array length -1 
    //and subtract the value in the first index of the array
    return arr.length <= 1 ? 0 : arr[arr.length-1] - arr[0];
  }
 
 Notes: sort() method is a java.util.Arrays class method.
 Ternary operator - variable x = (expression) ? value if true: value if false
 --------------------------------------------------------------------------------------
Description:
You will be given an vector of string(s). You must sort it alphabetically (case-sensitive!!) and then return the first value.

The returned value must be a string, and have "***" between each of its letters.

You should not remove or add elements from/to the array.
 
 
 public class SortAndStar {

    public static String twoSort(String[] s) {
        java.util.Arrays.sort(s);

        return String.join("***",s[0].split(""));
    }
}
 
Notes: The java.lang.string.join() method concatenates the given elements with the delimiter and returns the concatenated string.
The string split() method breaks a given string around matches of the given regular expression.
 
 ---------------------------------------------------------------------------------------------------
 Description:
 Complete the function, which calculates how much you need to tip based on the total amount of the bill and the service.

You need to consider the following ratings:

Terrible: tip 0%
Poor: tip 5%
Good: tip 10%
Great: tip 15%
Excellent: tip 20%
The rating is case insensitive (so "great" = "GREAT"). If an unrecognised rating is received, then you need to return:

"Rating not recognised" in Javascript, Python and Ruby...
...or null in Java
...or -1 in C#
Because you're a nice person, you always round up the tip, regardless of the service.
 
 Solution:
 public class TipCalculator {

  public static Integer calculateTip(double amount, String rating) {
   
    switch(rating.toLowerCase()) { // converts the given String rating to lowercase then compares it to the case statements, if it is equivalent then the block of code after : is executed.
      case "terrible": return 0;
      case "poor": return (int) Math.ceil(amount * 0.05);
      case "good": return (int) Math.ceil(amount * 0.1);
      case "great": return (int) Math.ceil(amount * 0.15);
      case "excellent": return (int) Math.ceil(amount * 0.2);
      default: return null;      
    }   
  }
}
 
 Notes: switch statement - switch expression is evaluated once and compared to the value of each case. If there is a match, the associated block of code is executed.
 Math.ceil.() - returns the double value that is greater than or equal to the argument and is equal to the nearest mathematical integer.
 .toLowerCase() - converts characters of a string into lower case characters.
 
 Description:
 Simple challenge - eliminate all bugs from the supplied code so that the code runs and outputs the expected value. Output should be the length of the longest word, as a number.
There will only be one 'longest' word.

Solution:
import java.util.*;

public class Kata {

  public static int findLongest(final String str) {
    String[] spl = str.split(" ");
    int longest = 0;
    for (int i=0; i < spl.length; i++) {
      if (spl[i].length() > longest) {
        longest = spl[i].length();
      }
      }
      return longest;
  }  
}
 
Notes: 
array.length : length is a final variable applicable for arrays. With the help of length variable, we can obtain the size of the array.
string.length() : length() method is a final variable which is applicable for string objects. length() method returns the number of characters presents in the string.
 
 
Best Practice:
import java.util.stream.Stream;
public class Kata {
  public static int findLongest(final String str) {
    return Stream.of(str.split(" ")).mapToInt(s -> s.length()).max().getAsInt();
  }
}
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 */
