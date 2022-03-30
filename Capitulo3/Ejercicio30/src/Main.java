import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the time zone offset to GMT: ");
        int offset = scanner.nextInt();

        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds / 1000;
        long currentSecond = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHour = (totalHours % 24) + offset;

        String time;
        if (currentHour > 12){
            currentHour -= 12;
            time = " PM";
        } else
            time = " AM";

        System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond + time);
    }
}
