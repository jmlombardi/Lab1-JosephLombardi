package hw;

public class Main {

  public static void main(final String[] args) {

    int max = 0;
    if (args.length > 0) {
      try {
        max = Integer.parseInt(args[0]);
        if (max <= 0){
          System.out.println("Please enter a positive number.");
        }
        else{
          FizzBuzz.fizzBuzzArray(max);
        }
      }
      catch(NumberFormatException e){
      System.err.println("The argument entered must be an integer ");
      System.exit(1);
      }
    }

  }//main

}//class
