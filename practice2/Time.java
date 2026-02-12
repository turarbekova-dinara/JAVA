package practice2;

public class Time {

    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {

        if (hour < 0 || hour > 23 ||
            minute < 0 || minute > 59 ||
            second < 0 || second > 59) {

            System.out.println("Invalid time! Setting to 00:00:00");
            this.hour = 0;
            this.minute = 0;
            this.second = 0;
        } else {
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        }
    }

    public String toUniversal() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public String toStandard() {

        int standardHour = hour % 12;
        if (standardHour == 0) {
            standardHour = 12;
        }

        String period = (hour < 12) ? "AM" : "PM";

        return String.format("%02d:%02d:%02d %s",
                standardHour, minute, second, period);
    }

    public void add(Time other) {

        this.second += other.second;
        this.minute += other.minute + this.second / 60;
        this.second %= 60;

        this.hour += other.hour + this.minute / 60;
        this.minute %= 60;

        this.hour %= 24;
    }
}
