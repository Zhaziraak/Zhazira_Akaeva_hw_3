import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        double[] numbers = {2.6, 96.03, -14.99, 1.6, -6.001, -10.9,
                5.1, 0.7, -9.3, 5.7, -6.77, -7.8, 11.8, -10.10, 44.4};
        double summ = 0;
        double count = 0;
        boolean foundLessNumber = false;

        for (double eachNumber : numbers) {
            if (foundLessNumber) {
                if (eachNumber > 0) {
                    summ += eachNumber;
                    count++;
                }
            }else if (eachNumber<0){
                foundLessNumber = true;
            }
        }
        System.out.println("Среднее арифметическое число всех " +
                "положительных чисел (после первого отрицательного) = " + summ / count);
        System.out.println();
      Scanner scanner = new Scanner(System.in);

        System.out.print("Введите слово");
        String word = scanner.next().replaceAll(" ", "").toLowerCase();

        if (isPalindrome(word)){
            System.out.println("Это полиндром");
        } else {
            System.out.println("Это не полиндром");
        }


    }

    private static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length()-1;

        while (left < right){
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }


}







