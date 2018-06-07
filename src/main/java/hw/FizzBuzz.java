package hw;

public class FizzBuzz {

    public static String[] fizzBuzzArray(int choice){

        if(choice < 1){
            String[] joe = new String[1];
            joe[0] = "Please enter a positive integer!";
            return joe;
        }
        String[] joe = new String[choice];

        int arrIndx = 0;
        for(int x = 1; x <= choice; x++,arrIndx++){
            if (x % 3 == 0 && x % 5 == 0) {
                joe[arrIndx] = "FizzBuzz";
            }
            else if (x % 3 == 0) {
                joe[arrIndx] = "Fizz";
            }
            else if (x % 5 == 0) {
                joe[arrIndx] = "Buzz";
            }
            else {
                joe[arrIndx] = Integer.toString(x);
            }

        }//end for loop

        //for(String rslt : joe)
            //System.out.println(rslt);

        return joe;
    }
}
