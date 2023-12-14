import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double [] numbers = {12.36, 2.1, -8.6, 9.10, 71.66, -6.25, 14.14, 1.98,
                44.66, -9.11, 37.5, -7.96, 12.3, -79,2, 5.6, };
        double summa = 0;
        double count = 0;
        boolean ABC = false;

        for (double eachNumber: numbers) {
            if (ABC) {
                if (eachNumber > 0) {
                    summa = summa + eachNumber;
                    count = count + 1;
                }
            }else if (eachNumber < 0){
                ABC = true;
            }
        }
        System.out.println("Среднее арифметическое число всех " +
                "положительных чисел (после первого отрицательного) = "
                + (summa / count));

    }
}







