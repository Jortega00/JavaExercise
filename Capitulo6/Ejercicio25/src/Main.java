public class Main {

    public static String convertMillis(long millis){
        long hours = millis / 3600000;
        millis %= 3600000;
        long minutes = millis / 60000;
        millis %= 60000;
        long seconds = millis / 1000;
        return hours + ":" + minutes + ":" + seconds;
    }

    public static void main(String[] args){

        System.out.println(convertMillis(5500));
        System.out.println(convertMillis(100000));
        System.out.println(convertMillis(555550000));
    }
}
