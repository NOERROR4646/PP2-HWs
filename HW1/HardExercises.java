package HW1;
import java.util.*;

class Exercise19 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();

        if (sc.hasNextInt()) {

            int num2 = sc.nextInt();

            System.out.println("List of all Armstrong numbers:");
            for (int i = num1; i <= num2; i++) {

                int res = 0;
                int cur = i;
                int cnt = 1;
                int checker = 10;

                while (i / checker != 0) {
                    cnt++;
                    checker *= 10;
                }

                while (cur != 0) {
                    res = (int) (res + Math.pow(cur % 10, cnt));
                    cur /= 10;
                }

                if (i == res)
                    System.out.println(i);

            }

        }

        else {

            int res = 0;
            int cur = num1;
            int cnt = 1;
            int checker = 10;

            while (num1 / checker != 0) {
                cnt++;
                checker *= 10;
            }

            while (cur != 0) {
                res = (int) (res + Math.pow(cur % 10, cnt));
                cur /= 10;
            }

            if (num1 == res)
                System.out.println("This is an Armstrong number!");
            else
                System.out.println("This is NOT an Armstrong number!");

        }

    }
}

class Exercise20 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Let's play a DiceMan game! (Enter 0 if you want to finish)");

        while (true) {

            System.out.println("Guess the number:");
            int guess = sc.nextInt();

            if (guess == 0) return;

            if (guess < 2 || guess > 12)
                System.out.println("ERROR: It looks like you have entered an impossible value! Let's try again!");

            else {

                int roll1 = (int) (Math.random() * 6 + 1);
                int roll2 = (int) (Math.random() * 6 + 1);

                System.out.println("Roll on first dice: " + roll1);
                System.out.println("Roll on second dice: " + roll2);

                if (roll1 + roll2 == guess)
                    System.out.println("You win! Impressive! :D");

                else
                    System.out.println("I win! B)");

                System.out.println("Let's play again! (Enter 0 if you want to finish)");

            }
        }

    }
}

class Exercise21 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(
            """
            Let's play a GuessGame! 
            I will choose a number from 1 till any number (inclusive) you desire, and you have to guess it! 
            Each time you guess wrong, I will tell you if the number is HIGHER or LOWER than your guess
            Enter your range:
            """
        );

        int range = sc.nextInt();
        int target = (int) (Math.random() * range + 1);

        System.out.println("Great! I am all set, now guess the number!");

        int guess = sc.nextInt();

        if (guess == target)
            System.out.println("WOW! YOU GUESSED IT ON FIRST TRY! WELL DONE!");

        else {

            if (guess < target)
                System.out.println("HIGHER");

            else
                System.out.println("LOWER");

            int attempts = 2;

            while (sc.hasNextInt()) {

                guess = sc.nextInt();

                if (guess < target)
                    System.out.println("HIGHER");

                else if (guess > target)
                    System.out.println("LOWER");

                else {

                    System.out.println("Nice! You have got it! Congratulations!");
                    System.out.println("Number of attempts: " + attempts);
                    return;

                }

                attempts++;

            }

        }
    }
}
