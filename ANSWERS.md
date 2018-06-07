##Joseph Lombardi
###Lab1-Part5
[Click here for My GitHub Account](https://github.com/jmlombardi)
####Due 06/06/2018
####Discussion Questions



1. What would be a really simple solution if n were not an argument, i.e., if it were always 17?
	
	If you were writing a fizzBuzz method for the number 17 only you wouldn't have to do any checks for the argument. There are several options. You could return or print the fizz buzz results for 17 by assinging the string to a String variable and return it or you could just have your method print the string. It depends on how you want to call it. You can also just hard code a for loop using 17 as your termination. Examples below.

	

         public class Main {

         public static void main(String[] args) {
            fizzBuzz();
         }

         public static void fizzBuzz()
         {
            System.out.println("1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 FizzBuzz 16 17");
         }   
        }
		**********************************************************************************************
        package com.company;

        public class Main {

        public static void main(String[] args) {
          fizzBuzz();
        }

        public static void fizzBuzz() {
          for (int i = 1; i <= 17; i++)
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i% 3 == 0) {
                System.out.println("Fizz");
            } else if (i% 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
         }
        }

2. How could you have automatically tested your initial solution from part 2?
	
	We could have created a test function using the assertTrue() and passed it our std output and compared it to a string hard coded with the expected results.

3. What changes between parts 2, 3, and 4, and what stays the same? Does it matter what list implementation you choose? If so, in what way(s)?

	Part 2 we only had to print the results so our fizzBuzz method was type void. We didn't have to return anything. You also said we could create the method in the same class as main or put it in our FizzBuzz class. Part 3 our fizzBuzz method had to return a String array, so our return type had to be type String[]. Because we weren't printing in our fizzBuzz method we had assign our results to our String[] and for the integers we had to convert the int to type String and then return the String[] to main. We also had to implement our test suite TestFizzBuzz.java. Part 4 we only had to change our fizzBuzz method to return a ArrayList of type String instead of a String []. This means in our method we had to add values using the add method vs using and incrementing the subscript of an array. We also had to update our test suite and convert our array lists using the .toArray method. Though are method return types changed for parts 2, 3 and 4 what didn't change was the algorithm.