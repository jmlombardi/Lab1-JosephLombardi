package hw;

public class FizzBuzz {

    public static String[] fizzBuzzArray(int choice){

        String[] joe = new String[choice];

        int arrIndx = 0;
        for(int x = 1; x <= choice; x++,arrIndx++){
            if (x % 3 == 0 && x % 5 == 0) {
                System.out.println("FizzBuzz");
                joe[arrIndx] = "FizzBuzz";
            }
            else if (x % 3 == 0) {
                System.out.println("Fizz");
                joe[arrIndx] = "Fizz";
            }
            else if (x % 5 == 0) {
                System.out.println("Buzz");
                joe[arrIndx] = "Buzz";
            }
            else {
                System.out.println(x);
                joe[arrIndx] = Integer.toString(x);
            }

        }//end for loop

        //for(String rslt : joe)
            //System.out.println(rslt);

        return joe;
    }
}
