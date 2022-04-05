import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter year and day: ");
        int year = scanner.nextInt();
        int day = scanner.nextInt();

        String[] months = {"January ", "February ", "March ", "April ", "May ", "June ", "July ", "August ",
                "September ", "October ", "November ", "December "};
        String[] days = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};

        int count = day;
        int daysInMonth;

        for (int i = 0; i < 12; i++) {
            boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
            System.out.println("\n\n\t\t" + months[i] + year + "\t\t");
            System.out.println("---------------------------");

            //imprime los dias de la semana
            for (int j = 0; j < 7; j++) {
                System.out.print(days[j] + "\t");
            }
            System.out.println();

            //imprime el espacio al inicio del mes
            for (int j = 1; j <= day; j++) {
                System.out.print("\t");
            }

            //meses de 31 dias
            if (i == 0 || i == 2 || i == 4 || i == 6 || i == 7 || i == 9){
                daysInMonth = 31;
                day += 3;
            } else if (i == 1){ //Febrero año bisiesto
                if (isLeapYear) {
                    daysInMonth = 29;
                    day++;
                }else { //Febrero
                    daysInMonth = 28;
                }
            } else { //Meses de 30 dias
                daysInMonth = 30;
                day += 2;
            }

            //Imprime los días
            for (int j = 1; j <= daysInMonth; j++) {
                System.out.print(j + "\t");
                if (count == 7) {
                    System.out.println();
                    count = 0;
                }
                count++;
            }

//          vuelta a los dias de la semana
            if (day >= 7)
                day %= 7;
        }
    }
}

//for (int i = 0; i < 12; i++) {
//            boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
//            System.out.println("\n\n\t\t" + months[i] + year + "\t\t");
//            System.out.println("---------------------------");
//
//            //imprime los dias de la semana
//            for (int j = 0; j < 7; j++) {
//                System.out.print(days[j] + "\t");
//            }
//            System.out.println();
//
//            //imprime el espacio al inicio del mes
//            for (int j = 1; j <= day; j++) {
//                System.out.print("\t");
//            }
//
//            //meses de 31 dias
//            if (i == 0 || i == 2 || i == 4 || i == 6 || i == 7 || i == 9){
//                daysInMonth = 31;
//                day += 3;
//            } else if (i == 1){ //Febrero año bisiesto
//                if (isLeapYear) {
//                    daysInMonth = 29;
//                    day++;
//                }else { //Febrero
//                    daysInMonth = 28;
//                }
//            } else { //Meses de 30 dias
//                daysInMonth = 30;
//                day += 2;
//            }
//
//            //Imprime los días
//            for (int j = 1; j <= daysInMonth; j++) {
//                System.out.print(j + "\t");
//                if (count == 7) {
//                    System.out.println();
//                    count = 0;
//                }
//                count++;
//            }
//
////          vuelta a los dias de la semana
//            if (day >= 7)
//                day %= 7;
//        }