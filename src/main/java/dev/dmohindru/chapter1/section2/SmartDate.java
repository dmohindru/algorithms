package dev.dmohindru.chapter1.section2;

public class SmartDate {
    private final int day;
    private final int month;
    private final int year;

    private int[] maxMonthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private String[] dayOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

    public SmartDate(int day, int month, int year) {
        if (!isValid(day, month, year)) {
            throw new IllegalArgumentException(
                    String.format("Illegal Argument for SmartDate (%d/%d/%d)", day, month, year));
        }
        this.day = day;
        this.month = month;
        this.year = year;
        if (year % 4 == 0) {
            maxMonthDays[1] = 29;
        }
    }

    private boolean isValid(int day, int month, int year) {

        return year >= 1 && month >= 1 && month <= 12 && day >= 1 && day <= maxMonthDays[month - 1];
    }

    public String dayOfTheWeek() {
        int dayOfYear = day;
        for (int i = 0; i < month - 1; i++) {
            dayOfYear += maxMonthDays[i];
        }
        int weekDay = (dayOfYear + getDoomsDay()) % 7;
        return dayOfWeek[weekDay];

    }

    private int getDoomsDay() {
        if (year < 2000 || year > 2099) {
            throw new IllegalArgumentException("Year must be of 21st Century");
        }
        int yearPart = year % 100;
        int doomsDay = 2 + yearPart + (yearPart / 4);

        if (year % 4 == 0) {
            return doomsDay + 3;
        } else
            return doomsDay + 4;
    }

    @Override
    public String toString() {
        return String.format("%d/%d/%d", day, month, year);
    }
}
