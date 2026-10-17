package HW2.datetime;
import java.util.*;

public class CustomTime {

    private int hour;
    private int minute;
    private int second;

    public CustomTime(int hour, int minute, int second) {

        this.hour = hour;
        this.minute = minute;
        this.second = second;

    }

    public CustomTime() {

        this.hour = 0;
        this.minute = 0;
        this.second = 0;

    }

    public CustomTime(int hour) {

        this.hour = hour;
        this.minute = 0;
        this.second = 0;

    }

    public CustomTime(int hour, int minute) {

        this.hour = hour;
        this.minute = minute;
        this.second = 0;

    }

    public CustomTime(CustomTime customTime) {

        this.hour = customTime.hour;
        this.minute = customTime.minute;
        this.second = customTime.second;

    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public String toUniversalString() {
        return String.format("%02d", this.hour) + ":" + String.format("%02d", this.minute) + ":" + String.format("%02d", this.second);
    }

    public String toStandardString() {
        if (this.hour > 12) {
            return (this.hour - 12) + ":" + String.format("%02d", this.minute) + ":" + String.format("%02d", this.second) + " PM";
        }
        else {
            return this.hour + ":" + String.format("%02d", this.minute) + ":" + String.format("%02d", this.second) + " AM";
        }
    }

}
