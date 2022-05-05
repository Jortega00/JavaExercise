public class Main {

    public static int sumDigits(long n){
        //cuenta los digitos que hay en n
        int len = 0;
        long temp = 1;
        while (temp <= n) {
            len++;
            temp *= 10;
        }
        //suma cada digito de n
        int r = 0;
        int n2;
        for (int i = len - 1; i >= 0; i--) {
            n2 = (int) (n / Math.pow(10, i));
            r += n2;
            n %= Math.pow(10, i);
        }
        return r;
    }

    public static void main(String[] args){
        System.out.println(sumDigits(234));
        System.out.println(sumDigits(12345));
        System.out.println(sumDigits(123456));
        System.out.println(sumDigits(9528));
    }
}
