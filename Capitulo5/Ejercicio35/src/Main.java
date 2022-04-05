public class Main {

    public static void main(String[] args){

        double n = 0;
        for (int i = 1; i < 1000; i++) {
            n += (1 / (Math.sqrt(i) + Math.sqrt(i + 1)));
        }
        System.out.println(n);
    }
}
