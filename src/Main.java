
public class Main {


    //-------------------------------------------A1-----------------------------------------------

    public static void signNumFinder(double i){
        // A1
        if (i >= 0) {
            System.out.println("A1 answer: " + i + " is positive.");
        } else {
            System.out.println("A1 answer: " + i + " is negative.");
        }
    }



    //--------------------------------------A2--------------------------------------------------

    public static void numCheck(double i){
        // A2
        if (i == 0) {
            System.out.println("A2 answer: " + "The number is zero.");
        } else if( i > 0){
            if( i < 1){
                System.out.println("A2 answer: " + i + " is a small positive number.");
            } else if(i > 1000000.0){
                System.out.println("A2 answer: " + i + " is a large positive number.");
            }else{
                System.out.println("A2 answer: " + i + " is a positive number.");
            }

        } else {
            System.out.println("A2 answer: " + i + " is a negative number.");
        }

    }



    //------------------------------------------A3 if----------------------------------------------

    public static void weekDaysIf(int i){
        // A3 if
        if (0 < i && i < 8) {
            if(i == 1){
                System.out.println("A3-a answer: " + "Today is Monday!");
            }else if(i == 2){
                System.out.println("A3-a answer: " + "Today is Tuesday!");
            }else if(i == 3){
                System.out.println("A3-a answer: " + "Today is Wednesday my dudes!");
            }else if(i == 4){
                System.out.println("A3-a answer: " + "Today is Thursday!");
            }else if(i == 5){
                System.out.println("A3-a answer: " + "Today is Friday, Mufasa!");
            }else if(i == 6){
                System.out.println("A3-a answer: " + "Today is Saturday");
            }else if(i == 7){
                System.out.println("A3-a answer: " + "Today is Sunday");
            }

        } else{
            System.out.println("A3-a answer: " + "Week has only 7 days!");
        }
    }


    //---------------------------------------A3 Switch------------------------------------------------

    public static void weekDaysSwitch(int i){
        //A3 Switch
        switch (i){
            case 1:
                System.out.println("A3-c answer: " + "Today is Monday!");
                break;
            case 2:
                System.out.println("A3-c answer: " + "Today is Tuesday!");
                break;
            case 3:
                System.out.println("A3-c answer: " + "Today is Wednesday my dudes!");
                break;
            case 4:
                System.out.println("A3-c answer: " + "Today is Thursday!");
                break;
            case 5:
                System.out.println("A3-c answer: " + "Today is Friday, Mufasa!");
                break;
            case 6:
                System.out.println("A3-c answer: " + "Today is Saturday!");
                break;
            case 7:
                System.out.println("A3-c answer: " + "Today is Sunday!");
                break;
            default:
                System.out.println("A3-c answer: " + "Week has only 7 days!");
        }
    }

    //----------------------------------------A4------------------------------------------------

    public static void findMax(double a, double b){
        if(a > b){
            System.out.println("A4 answer: " + "First input, "
                    + a + ", is bigger than second input, " + b +" .");

        } else if(b > a) {
            System.out.println("A4 answer: " + "Second input, "
                    + b + ", is bigger than first input, " + a +" .");
        }else{
            System.out.println("A4 answer: " + "They are equal!");
        }

    }


    //----------------------------------------A5------------------------------------------------

    public static void evenOddCheck(int i){
        if(i%2 == 0){
            System.out.println("A5 answer: " + i + " is an even number.");
        } else{
            System.out.println("A5 answer: " + i + " is an odd number.");
        }
    }



    //----------------------------------------A6------------------------------------------------

    public static void fizzBuzz(int i){
        if((i%3 == 0) && (i%5 == 0)){
            System.out.println("A6 answer: " + "FizzBuzz");
        } else if(i%3 == 0){
            System.out.println("A6 answer: " + "Fizz");
        } else if(i%5 == 0){
            System.out.println("A6 answer: " + "Buzz");
        } else{
            System.out.println("A6 answer: " + i + " isn't a multiplier of neither 3 nor 5!");
        }
    }


    //----------------------------------------A7------------------------------------------------

    public static void largestInThree(int a, int b, int c){
        if (a >= b){
            if (a >= c){
                System.out.println("A7 answer: " + a + " is the max.");
            } else{
                System.out.println("A7 answer: " + c + " is the max.");
            }
        } else{
            if (b >= c){
                System.out.println("A7 answer: " + b + " is the max.");
            } else{
                System.out.println("A7 answer: " + c + " is the max.");
            }
        }

    }

    //----------------------------------------main------------------------------------------------

    public static void main(String[] args) {

        // A1
        signNumFinder(-4);

        // A2
        numCheck(0.8);

        // A3-a
        weekDaysIf(3);

        // A3-c
        weekDaysSwitch(5);

        // A4
        findMax(2,2);

        // A5
        evenOddCheck(8);

        // A6
        fizzBuzz(15);

        // A7
        largestInThree(20, 12, 30);
    }
}
