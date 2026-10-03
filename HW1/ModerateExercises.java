package HW1;
import java.util.*;

class Exercise10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double res = 0;
        int index = sc.nextInt();

        for (int i = 1; i <= index; i++) {
            res += 1.0 / i;
        }

        System.out.println(res);

    }
}

class Exercise11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double x = sc.nextDouble();
        int n = sc.nextInt();

        int sw = 1;
        double ans = 0;

        for (int i = 1; i <= 2 * n - 1; i += 2, sw *= -1) {

            double res = sw;

            for (int j = 1; j <= i; j++) {
                res *= x;
                res /= j;
            }

            ans += res;

        }

        System.out.println(ans);
        System.out.println(Math.sin(x));

    }
}

class Exercise12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        if (a < 0) a = -a;

        int sm = 0;
        int cnt = 0;
        int prod = 1;

        while (a != 0) {
            sm += (a % 10);
            cnt++;
            prod *= (a % 10);

            a /= 10;
        }

        double average = 1.0 * sm / cnt;

        System.out.println(sm);
        System.out.println(prod);
        System.out.println(average);

    }
}

class Exercise13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int heads, tails;
        heads = tails = 0;

        for (int i = 0; i < n; i++) {

            if (Math.random() < 0.5) {
                heads++;
                System.out.println("Head!");
            }

            else {
                tails++;
                System.out.println("Tail!");
            }

        }

        System.out.println("Probability of showing heads: " + (100.0 * heads / n) + "%");
        System.out.println("Probability of showing tails: " + (100.0 * tails / n) + "%");

    }
}

class Exercise14 {
    public static void main(String[] args) {

        double roll = Math.random();

        if (roll < 0.125) {
            System.out.println(1);
        }

        else if (roll < 0.25) {
            System.out.println(2);
        }

        else if (roll < 0.375) {
            System.out.println(3);
        }

        else if (roll < 0.5) {
            System.out.println(4);
        }

        else if (roll < 0.75) {
            System.out.println(5);
        }

        else {
            System.out.println(6);
        }

    }
}

class Exercise15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n / 2; i++) {

            for (int j = 0; j < n / 2; j++) {
                System.out.print("* ");
                System.out.print("# ");
            }
            if (n % 2 == 1) System.out.println("*");
            else System.out.println();

            for (int j = 0; j < n / 2; j++) {
                System.out.print("# ");
                System.out.print("* ");
            }
            if (n % 2 == 1) System.out.println("#");
            else System.out.println();

        }

        if (n % 2 == 1) {

            for (int j = 0; j < n / 2; j++) {
                System.out.print("* ");
                System.out.print("# ");
            }
            System.out.println("*");

        }

    }
}

class Exercise16 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            double randomAngle = Math.random() * 2 * Math.PI;
            double randomRadius = Math.random();

            System.out.println("(" + (Math.cos(randomAngle) * randomRadius) + ", " + (Math.sin(randomAngle) * randomRadius) + ")");

        }

    }
}

class Exercise17 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double cur;
        double mn;
        double mx;
        mn = mx = sc.nextDouble();

        while (sc.hasNextDouble()) {

            cur = sc.nextDouble();
            mn = Math.min(mn, cur);
            mx = Math.max(mx, cur);

        }

        System.out.println("Minimum: " + mn);
        System.out.println("Maximum: " + mx);

    }
}

class Exercise18 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean flag = false;
        int n = sc.nextInt();

        for (int i = 2; i * i <= n; i++)
            if (n % i == 0) {
                flag = true;
                break;
            }

        if (flag)
            System.out.println("This number is composite!");
        else
            System.out.println("This number is prime!");

    }
}