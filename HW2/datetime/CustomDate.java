package HW2.datetime;

public class CustomDate {

    private static final int[] dayLimit = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private static final int[] prefSumDays = {0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334};
    private static final String[] monthNames = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug",
    "Sep", "Oct", "Nov", "Dec"};
    private int month;
    private int day;
    private int year;

    public CustomDate(int month, int day, int year) {

        if (month > 12 || month < 1)
            throw new IllegalArgumentException("Month provided is out of range: " + month);

        this.month = month;
        this.year = year;

        if (month == 2 && (year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0))) {
            if (day > 29 || day < 1) {
                throw new IllegalArgumentException("Day provided is out of range for this month of the leap year: " + day);
            }
        }

        else {
            if (day > dayLimit[month - 1] || day < 1) {
                throw new IllegalArgumentException("Day provided is out of range for this month of a year: " + day);
            }
        }

        this.day = day;

    }

    public void setDay(int day) {

        if (this.month == 2 && (this.year % 4 == 0) && ((this.year % 100 != 0) || (this.year % 400 == 0))) {
            if (day > 29 || day < 1) {
                throw new IllegalArgumentException("Day provided is out of range for this month of the leap year: " + day);
            }
        }

        else {
            if (day > dayLimit[this.month - 1] || day < 1) {
                throw new IllegalArgumentException("Day provided is out of range for this month of a year: " + day);
            }
        }

        this.day = day;

    }

    public int getDay() {
        return day;
    }

    public void setMonth(int month) {
        if (month > 12 || month < 1)
            throw new IllegalArgumentException("Month provided is out of range: " + month);
        this.month = month;
    }

    public int getMonth() {
        return month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void displayDate() {
        System.out.print(month + "/" + day + "/" + year);
    }

    public int difference(CustomDate date) {
        return Math.abs((this.year - 1) * 365 + (prefSumDays[this.month - 1]) + this.day - (date.year - 1) * 365
                - (prefSumDays[date.month - 1]) - date.day);
    }

    public static int compare(CustomDate date1, CustomDate date2) {
        if (date1.year == date2.year) {
            if (date1.month == date2.month)
                return Integer.compare(date2.day, date1.day);
            return Integer.compare(date2.month, date1.month);
        }
        return Integer.compare(date2.year, date1.year);
    }

    public void displayFormatted() {
        System.out.print(this.day + " " + monthNames[this.month - 1] + " " + this.year);
    }

}


