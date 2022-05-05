public class Main {

    public static void main(String[] args){

        int[] n1 = new int[10];
        for (int i = 0; i < 10; i++)
            n1[i] = i + 1;
        System.out.println(average(n1));

        double[] n2 = new double[10];
        for (int i = 0; i < 10; i++)
            n2[i] = i + 1;
        System.out.println(average(n2));
    }

    public static int average(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        sum /= array.length;
        return sum;
    }

    public static double average(double[] array){
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        sum /= array.length;
        return sum;
    }
}
