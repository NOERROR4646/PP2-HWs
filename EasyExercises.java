import java.util.*;

class Exercise1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println(num1 + num2);

    }
}

class Exercise2 {
    public static void main(String[] args) {

        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);

        System.out.println(num1 + num2);

    }
}

class Exercise3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int secs = sc.nextInt();
        double mins = secs / 60.0;
        double hours = secs / 3600.0;

        System.out.println("Hours: " + hours);
        System.out.println("Minutes: " + mins);
        System.out.println("Seconds: " + secs);

    }
}

class Exercise4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();

        if (num > 0)
            System.out.println("positive");

        else if (num < 0)
            System.out.println("negative");

        else
            System.out.println("neutral");

    }
}

class Exercise5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] months = {"Jan, 31", "Feb, 28", "March, 31", "April, 30", "May, 31", "June, 30", "July, 31",
        "August, 31", "September, 30", "October, 31", "November 30", "December 31"};

        int num = sc.nextInt();
        System.out.println(months[num - 1] + " days");

    }
}

class Exercise6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if (((num % 4 == 0) && (num % 100 != 0)) || (num % 400 == 0))
            System.out.println("This is a leap year!");

        else
            System.out.println("This is NOT a leap year.");

    }
}

class Exercise7 {
    public static void main(String[] args) {

        int num = Integer.parseInt(args[0]);

        if (num < 0) {

            System.out.println("ERROR: The input number is negative!");
            return;

        }

        int res = 1;

        for (int i = 2; i <= num; i++)
            res *= i;

        System.out.println(res);

    }
}

class Exercise8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int temp;
        int sm = 0;

        if (num1 > num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }

        if (num1 % 2 == 0) num1--;

        for (int i = num1 + 2; i < num2; i += 2) {
            sm += i;
        }

        System.out.println(sm);

    }
}

class Exercise9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int sm = 0;
        int cnt = 0;

        while (sc.hasNextInt()) {
            sm += sc.nextInt();
            cnt++;
        }

        double average = 1.0 * sm / cnt;

        System.out.println(average);

    }
}