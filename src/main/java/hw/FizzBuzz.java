package hw;

import java.util.ArrayList;

public class FizzBuzz {

    public static ArrayList fizzBuzzArray(int choice){

        if(choice < 1){
            ArrayList<String> myArrLst= new ArrayList<String>();
            myArrLst.add("Please enter a positive integer!");
            return myArrLst;
        }
        //String[] joe = new String[choice];
        ArrayList<String> myArrLst= new ArrayList<String>();

        for(int x = 1; x <= choice; x++){
            if (x % 3 == 0 && x % 5 == 0) {
                myArrLst.add("FizzBuzz");
            }
            else if (x % 3 == 0) {
                myArrLst.add("Fizz");
            }
            else if (x % 5 == 0) {
                myArrLst.add("Buzz");
            }
            else {
                myArrLst.add(Integer.toString(x));
            }

        }//end for loop

        //for(String rslt : joe)
            //System.out.println(rslt);

        return myArrLst;
    }
}
