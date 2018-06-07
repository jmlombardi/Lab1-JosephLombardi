package hw;

import java.util.ArrayList;

public class Main {

  public static void main(final String[] args) {

    int max = 0;
    if (args.length > 0) {
      try {
        max = Integer.parseInt(args[0]);
        if(max < 0){
          ArrayList<String> mainArray = new ArrayList<String>();
          mainArray = FizzBuzz.fizzBuzzArray(max);
          for(String rslt : mainArray)
            System.out.println(rslt);
        }
        else {
          ArrayList<String> mainArray = new ArrayList<String>();
          mainArray = FizzBuzz.fizzBuzzArray(max);
          for (String rslt : mainArray)
            System.out.println(rslt);
        }
      }
      catch(NumberFormatException e){
      System.err.println("The argument entered must be an integer ");
      System.exit(1);
      }
    }

  }//main

}//class
