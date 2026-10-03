package HW2.datetime;
import java.util.*;

public class CustomDateTest {
    public static void main(String[] args) {

        try {

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the year: ");
            int curYear = sc.nextInt();
            System.out.println("Enter the month of the year (numerically): ");
            int curMonth = sc.nextInt();
            System.out.println("Enter the day of the month: ");
            int curDay = sc.nextInt();

            CustomDate curDate = new CustomDate(curMonth, curDay, curYear);

            System.out.print("Date entered: ");
            curDate.displayDate();
            System.out.println(" ");

            CustomDate originDate = new CustomDate(10, 3, 2026);

            System.out.println("The difference between today and the date you wrote is "
            + curDate.difference(originDate) + " days.");

            int flag = CustomDate.compare(curDate, originDate);

            if (flag > 0)
                System.out.println("This date happened before this program was written...");
            else if (flag < 0)
                System.out.println("This date will happen after this program is written...");
            else
                System.out.println("That is the date this program was written!");

            System.out.print("The date this program was written in is ");
            originDate.displayFormatted();
            System.out.println(".");

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
