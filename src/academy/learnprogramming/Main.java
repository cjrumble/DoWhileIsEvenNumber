package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
/*
        // WHILE LOOP
        System.out.println("While Loop ");
        int count = 1;
        while(count != 6) {
            System.out.println("Count value is " + count);
            count++;
        }
        System.out.println(" ");
        System.out.println("For Loop");
        // FOR LOOP
        count = 1;
        for (int i=1; i != 6; i++) {
            System.out.println("Count value is " + count);
            count++;
        }
        System.out.println(" ");
        System.out.println("Do While Loop");
        // DO WHILE LOOP
        count =  1;
        do {
            System.out.println("Count value is " + count);
            count++;
            if (count > 100) {
                break;
            }
        } while(count !=6);

*/
        int number = 4;
        int end = 200;

        while (number <= end) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }

            System.out.println("Even number " + number);
        }
    }

        public static boolean isEvenNumber (int number){
            // return true if the argument passed to the method is an even number
            if ((number % 2) == 0) {
                return true;
            } else {
                return false;
            }
    }
}
