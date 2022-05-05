import java.util.Arrays;

//No terminado


public class Main {

    public static void main(String[] args){

        String[] chess = new String[9];
        int[] num = new int[8];

        for (int i = 0; i < 8; i++) {
            Arrays.fill(chess, "|  ");          //llena la matriz con las lineas
            chess[numbers(num)[i]] = "|Q ";                  //Agrega Q a chess[r]

            for (int j = 0; j < 9; j++)
                System.out.print(chess[j]);         //Se imprime la primera fila
            System.out.println();                   //Se hace un salto de linea
        }
    }

    public static int[] numbers(int[] num){
        for (int i = 1; i < num.length; i++) {
            for (int j = 0; j < num.length; j++) {
                num[i] = j;
                if (num[i] == num[i-1] && (num[i-1] == j - 1 || num[i-1] == j + 1)){
                    numbers(num);
                } else
                    break;
            }
        }
        return num;
    }
}


//Random random = new Random();
//        String[] chess = new String[9];
//        int r;
//        int[] temp = new int[8];                    //Matriz para guardar los numeros generados
//        Arrays.fill(temp, 8);
//
//        for (int i = 0; i < 8; i++) {
//            Arrays.fill(chess, "|  ");          //llena la matriz con las lineas
//            r = random.nextInt(8);               //grenera un número aeatorio
//
//            random(r, temp);
//            chess[r] = "|Q ";                       //Agrega Q a chess[r]
//
//            for (int j = 0; j < 9; j++)
//                System.out.print(chess[j]);         //Se imprime la primera fila
//            System.out.println();                   //Se hace un salto de linea
//            temp[i] = r;                            //el numero aleatorio se guarda en una matriz nueva
//        }