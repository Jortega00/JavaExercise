import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of balls to drop: ");
        int balls = scanner.nextInt();                                  //Numero de bolas
        System.out.print("Enter the number of slots in the bean machine: ");
        int nSlots = scanner.nextInt();                                 //Numero de slots

        int[] slots = new int[nSlots];                                  //Bolas en el slot
        String[] s = new String[nSlots + 1];                            //Diseño de slots
        Arrays.fill(s, "|  ");
//        String x;
        String[] x = new String[balls];                                 //Matriz de resultados


        for (int i = 0; i < balls; i++) {
            x[i] = fall(nSlots);                                        //Guarda el resultado en la matriz
            slots[countR(x[i])]++;                                      //Al slot en nR se agrega una bola
            System.out.println(x[i]);                                   //Imprime los resultados
        }

        int count = max(slots);                                         //Variable con el valor maximo de slots
        for (int i = 0; i < max(slots); i++) {
            System.out.println();
            for (int j = 0; j < s.length - 1; j++) {
                if (slots[j] == count)                                  //Si el slot es igual al valor maximo
                    s[j] = "|O ";                                       //agrega una bola
                System.out.print(s[j]);
            }
            count--;                                                    //Disminuye el valor maximo de bolas
        }
    }

    public static int countR(String str){                               //Cuenta las R que hay en cada resultado
        int count = 0;
        char[] c = str.toCharArray();
        for (char value : c) {
            if (value == 'R')
                count++;
        }
        return count - 1;
    }

    public static String fall(int n){                                   //Crea un resultado aleatorio
        Random random = new Random();
        String str = "";
        for (int i = 0; i < n - 1; i++) {
            int LoR = random.nextInt(2);
            if (LoR == 0)
                str += "L";
            else
                str += "R";
        }
        return str;
    }

    public static int max(int[] list){                                  //Regresa valor de mas bolas en los slots
        int max = list[0];
        for (int j : list) {
            if (j > max)
                max = j;
        }
        return max;
    }
}