package dateException;

public class MyDateException extends Exception {
    int day, month;

    public MyDateException(String message, int date, int month) {
        super(message);
        this.day = date;
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }
}
