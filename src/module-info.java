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
 
--------------------------------------------------------------------------------------------------- 
 
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
 
 -------------------------------------------------------------------------------------------------------------------
 
 Description:
 Given three integers a ,b ,c, return the largest number obtained after inserting the following operators and brackets: +, *, ().
 
 My Solution:
 public class Kata
{
    public static int expressionsMatter(int a, int b, int c)
    {
        int maximum = 0;
        int firstEquation = a * (b + c);
        int secondEquation = a * b * c;
        int thirdEquation = a + b * c;
        int fourthEquation = (a + b) * c;
        int fifthEquation = a * b + c;
        int sixthEquation = a + b + c;
        
        
        if(firstEquation > maximum){
        maximum = firstEquation;}
        if(secondEquation > maximum) {
        maximum = secondEquation;}
        if(thirdEquation > maximum){
        maximum = thirdEquation;}
        if(fourthEquation > maximum){
        maximum = fourthEquation;}
        if(fifthEquation > maximum){
        maximum = fifthEquation;}
        if(sixthEquation > maximum){
        maximum = sixthEquation;}
        return maximum;
    }
}
 
 Best Practice:
 public class Kata
{
    public static int expressionsMatter(int a, int b, int c)
    {
      return  Math.max(Math.max(a + b + c, a * b * c),Math.max ((a + b) * c, a * (b + c)));
    }
}
 
 Notes: Math.max returns the greater of two int values. Best practice splits the equations up into two groups to compare the greater separately then compares the greater out of the two groups using Math.max twice.
 
 ------------------------------------------------------------------------------------------------------------------------
 
 Description:
 You were camping with your friends far away from home, but when it's time to go back, you realize that you fuel is running out and the nearest pump is 50 miles away! 
 You know that on average, your car runs on about 25 miles per gallon. There are 2 gallons left. Considering these factors, write a function that tells you if it is possible to get to the pump or not. 
 Function should return true if it is possible and false if not. The input values are always positive.
 
 My Solution:
 public class Kata {
  
  public static boolean zeroFuel(double distanceToPump, double mpg, double fuelLeft) {
    double possibleDistance = mpg * fuelLeft;
    if(possibleDistance >= distanceToPump){
    return true;
    }else {
    return false;
    }
  }
  
}
 
 Alternate Solutions:
 class Kata {
  static boolean zeroFuel(double distanceToPump, double mpg, double fuelLeft) {
    return distanceToPump <= mpg * fuelLeft;
  }
}
 
 Notes: More efficient to not use If/Else statements but might possibly want to use the value of possibleDistance later in the application.
 
 ------------------------------------------------------------------------------------------
 
 Description:
 Complete the function that calculates the area of the red square, when the length of the circular arc A is given as the input.
 Return the result rounded to two decimals.
 
 My Solution:
 public class Geometry{
  public static double squareArea(double A){
  double diameter = 0;
  double circum = 0;
  double area = 0;
  double total = 0;
  
  circum = A * 2.0;
  diameter = circum / Math.PI;
  area = Math.pow(diameter,2.0);
  total = area * 100; //Remove two decimal spaces
  total = Math.round(total);//Round up

    return total/100;//Add two decimal spaces
  }
}
 
Best Practice:
 public class Geometry{
  public static double squareArea(double A){
        double l = (2*A)/Math.PI;
        double x = l*l;
        double y = Math.round(x * 100) * 0.01d;
        return y;
    }
}

Notes: Math.pow() method s used to calculate a number raise to the power of some other number. 
This function accepts two parameters and returns the value of first parameter raised to the second parameter.

Math.PI used to express PI
 
Math.round() is a built-in math function which returns the closest long to the argument. 
The result is rounded to an integer by adding 1/2, taking the floor of the result after adding 1/2, and casting the result to type long.
 
------------------------------------------------------------------------------------------------------- 
 
 Description:
 Return a new array consisting of elements which are multiple of their own index in input array (length > 1).
 
 My Solution:
 public class ZywOo {
  public static int[] multipleOfIndex(int[] array) {
    int myArray[] = {0};
    for(int i = 0; i < array.length; i++){ 
      if(i != 0 && array[i] % i == 0){
        myArray[i] = array[i];
      }
    }
    return myArray;   
  }
}
 
Best Practice:
import java.util.stream.*;

public class ZywOo {
  public static int[] multipleOfIndex(int[] a) {
    return IntStream.range(1,a.length) //basically creates a stream that will loop through the first index to the last(length of the array)
    .filter(i->a[i]%i==0) //check each index based on the equation to see if there is a remainder to determine if it is divisible by value/index
    .map(i->a[i]) //assign the value of the index i to the array at index i
    .toArray(); //return the new array
  }
}

Notes:
IntStream - A sequence of primitive int-valued elements supporting sequential and parallel aggregate operations. Do the same operations on integers in a row.
.range() - IntStream range(int startInclusive, int endExclusive) basically works like a for loop.
returns a sequential ordered IntStream from startInclusive (inclusive) to endExclusive (exclusive) by an incremental step of 1. 
.filter() - returns a stream consisting of the elements of this stream that match the given predicate. 
.map() -  returns a stream consisting of the results of applying the given function to the elements of this stream.
.toArray() - return an array containing all the elements in the correct order.

-----------------------------------------------------------------------------------------------------

Description:
Fix the code

My Solution:
public class GhostCode{
  public static String helloName(final String name){
    if(name == null || name.equals("")){
      return "Hello world!";}
    else{
      return "Hello my name is " + name;}
  }
}

Notes:
final keyword - When a variable is declared with final keyword, its value can�t be modified, essentially, a constant. 

----------------------------------------------------------------------------------------------------------

Description:
Mr. Scrooge has a sum of money 'P' that wants to invest, and he wants to know how many years 'Y' this sum has to be kept in the bank in order for this sum of money to amount to 'D'.

The sum is kept for 'Y' years in the bank where interest 'I' is paid yearly, and the new sum is re-invested yearly after paying tax 'T'

Note that the principal is not taxed but only the year's accrued interest

My Solution:
public class Money {
  public static int calculateYears(double principal, double interest,  double tax, double desired) {
    //variables needed: integer of years, double taxes, double interestTotal
    int years = 0;
    double interestTotal = 0.0;
    double taxes = 0.0;
    //If statement to compare principal to desired - if D = P return 0 years
    if(principal == desired){
    years = 0;
    return years;
    } else {
      for(years = 0; principal < desired; years++){  //Loop for number of years, checking if principal is less than years   
    //Principal x Interest Rate  = Interest
    interestTotal = principal * interest;
    
    //Interest x Tax Rate = Taxes
    taxes = interestTotal * tax;
    
    //Principal = Principal + Interest - Taxes
      principal = principal + (interestTotal - taxes);
      } 
      return years;
    }
  }
}

Best Practice:
public class Money {
  public static int calculateYears(double principal, double interest, double tax, double desired) {
    int years = 0;
    while (principal < desired) {
      principal += principal * interest * (1 - tax);
      years++;
    }
    return years;
  }
}

Notes:
The while loop loops through a block of code as long as a specified condition is true
Simplify calculations when possible.

---------------------------------------------------------------------------------------------------------------------------

Description:
Count the number of divisors of a positive integer n.

Random tests go up to n = 500000.

My Solution:
public class FindDivisor {

  public long numberOfDivisors(int n) {
  System.out.println(n);
  int numLoops = 1;
  int numDivisor = 0;
  while(numLoops <= n){
    if(n % numLoops == 0){
    numDivisor++;
    System.out.println(numDivisor);
    }
  numLoops++;
  System.out.println(numLoops);
  }
      System.out.println("return " + numDivisor);
    return numDivisor;
  }
}

Best Practice:
public class FindDivisor {

  public long numberOfDivisors(int n) {
      long counter = 0;
      for(int i=1; i<=n; i++){
          if(n % i == 0){
          counter++;
          }
      }
      return counter;
  }
}

Notes:
Trouble with larger numbers and buffer because of println.

----------------------------------------------------------------------------------

My Solution:
public class Clock
{
  public static int Past(int h, int m, int s) 
  {
  //1 second is 1000 milliseconds. Convert each unit to millisecond then add together for total.
    return (h * 60 * 60 * 1000) + (m * 60 * 1000) + (s * 1000);
  }
}

Best Practice:
public class Clock
{
  public static int Past(int h, int m, int s) 
  {
    return h * 3600000 + m * 60000 + s * 1000;
  }
}

Notes:
Do less calculation by using totals ex. multiply by 3600000 instead of 60 x 60 x 1000.

------------------------------------------------------------------------------------------------

Description:
public class Sequence{

  public static int[] reverse(int n){
    //new array and counter
    int myArr[] = new int[n];
    int counter = 0;
    //loop to count down from n while adding i to array
    for(int i = n; i > 0; i--){
    myArr[counter] = i;
    counter++;
    }
    return myArr;
  }
}

Best Practice:
public class Sequence{

  public static int[] reverse(int n){
    //your code
    int[] res = new int[n];
    for (int i=0; i<n; i++) 
      res[i]=n-i;
    return res;
  }
}

Notes:
Make sure in loops the < or > sign is correctly used, stop and think about the counting. 
int[] myArray = new int[3] creates an array of integers with 3 slots allocated on memory

--------------------------------------------------------------------------------------------------

Description:
The cockroach is one of the fastest insects. 
Write a function which takes its speed in km per hour and returns it in cm per second, rounded down to the integer (= floored).
For example:
cockroachSpeed(1.08) == 30
Note! The input is a Real number (actual type is language dependent) and is >= 0. The result should be an Integer.

My Solution:
public class Cockroach{
  public int cockroachSpeed(double x){
    // Cast double to int, multiple by kmh to cms formula and Math.floor.
    return (int)Math.floor(x * 27.778);
    
  }
}

Best Practice: - used the type casting to integer to truncate the values after the decimal point and essentially floor the value.
public class Cockroach{
  public int cockroachSpeed(double x){
    // Good Luck!
    return(int)(x*250/9);
  }
}

Notes: Use type casting to floor values if type casting to integer. Ex. int a = (int) Math.round(6.14); down casts a double to an int a

--------------------------------------------------------------------------------------------------------------------------------

Description:
I'm new to coding and now I want to get the sum of two arrays...actually the sum of all their elements. I'll appreciate for your help.

P.S. Each array includes only integer numbers. Output is a number too.

My Solution:
public class Sum {

  public static int arrayPlusArray(int[] arr1, int[] arr2) {
  //variables: arr1Total, arr2Total, combinedArrTotal
  int arr1Total = 0;
  int arr2Total = 0;
  int combinedArrTotal = 0;
  
  for(int i = 0; i < arr1.length; i++){ //loop through 1st array adding up values
    arr1Total += arr1[i];
  }
  for(int x = 0; x < arr2.length; x++){ //loop through 2nd array adding up values
    arr2Total += arr2[x];
  }
  combinedArrTotal = arr1Total + arr2Total;   //add the two together
  System.out.println("out arr1" + arr1Total);   //return total
    return combinedArrTotal;
  }
}

Best Practice:
import java.util.stream.*;

public class Sum {

  public static int arrayPlusArray(int[] arr1, int[] arr2) {
    return IntStream.of(arr1).sum() + IntStream.of(arr2).sum();
  }

}

Notes: IntStream(). A sequence of primitive int-valued elements supporting sequential and parallel aggregate operations.

--------------------------------------------------------------------------------------------------------------------------------------












































 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 



 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 */
