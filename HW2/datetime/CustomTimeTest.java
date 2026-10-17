package HW2.datetime;
import java.util.*;

public class CustomTimeTest {
    public static void main(String[] args) {

        CustomTime time1 = new CustomTime(12, 1, 27);
        CustomTime time2 = new CustomTime();
        CustomTime time3 = new CustomTime(15);
        CustomTime time4 = new CustomTime(3, 45);
        CustomTime time5 = new CustomTime(time3);

        System.out.println(time1.getHour() + "\n" + time1.getMinute() + "\n" + time1.getSecond());
        System.out.println(time4.toUniversalString());
        System.out.println(time3.toUniversalString());
        System.out.println(time2.toStandardString());
        System.out.println(time5.toStandardString());

    }
}
