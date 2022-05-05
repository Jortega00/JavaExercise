//Write a method with the following header to format the integer with the specified width.

public class Main {

    public static void main(String[] args){

        System.out.println(format(34, 4));
        System.out.println(format(34, 5));
        System.out.println(format(34, 1));
    }

    public static String format(int number, int width){
        String n = String.valueOf(number);
        for (int i = n.length(); i <= width; i++) {
            if (n.length() >= width)
                break;
            else
                n = "0" + n;
        }
        return n;
    }
}
