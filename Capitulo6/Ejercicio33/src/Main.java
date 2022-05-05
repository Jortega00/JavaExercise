public class Main {

    public static int currentYear(){
        long time = System.currentTimeMillis();
        return (int) (time / (3.154 * Math.pow(10, 10)) + 1970);
    }

    public static int currentMonth(){
        long time = System.currentTimeMillis();
        time %= 3.154 * Math.pow(10, 10);
        return (int) (time / (2.628 * Math.pow(10, 9)));
    }

    public static void currentDate(int offset){
        int year = currentYear();
        int month = currentMonth();

        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds / 1000;
        long currentSecond = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHour = (totalHours % 24) + offset;
        long day = ((totalHours / 24 - countLeapYears()) % daysInYear(year) + 1);

        if (month == 0 || month == 2 || month == 4 || month == 6 || month == 7 || month == 9 || month == 11)
            day %= 31;
        else if (month == 1){
            if (isLeapYear(year))
                day %= 29;
            else
                day %= 28;
        } else
            day %= 30;

        String[] months = {"January ", "February ", "March ", "April ", "May ", "June ", "July ", "August ",
                "September ", "October ", "November ", "December "};

        System.out.print(months[month] + day + ", " + year + " " + currentHour + ":" + currentMinute
                + ":" + currentSecond);
    }

    public static void currentTime(int offset){
//        long totalMilliseconds = System.currentTimeMillis();
//        long totalSeconds = totalMilliseconds / 1000;
//        long currentSecond = totalSeconds % 60;
//        long totalMinutes = totalSeconds / 60;
//        long currentMinute = totalMinutes % 60;
//        long totalHours = totalMinutes / 60;
//        long currentHour = (totalHours % 24) + offset;
//        System.out.print(" " + currentHour + ":" + currentMinute
//                + ":" + currentSecond);
    }

    public static boolean isLeapYear(int year){
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static int countLeapYears(){
        int count = 0;
        for (int i = 1970; i <= currentYear(); i++) {
            if (isLeapYear(i))
                count++;
        }
        return count;
    }

    public static int daysInYear(int year){
        if (isLeapYear(year))
            return 366;
        else
            return 365;
    }

    public static void main(String[] args){

        System.out.print("Current date and time is ");
        currentDate(-6);
    }
}
