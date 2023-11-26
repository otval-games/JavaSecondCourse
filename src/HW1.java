import java.util.ArrayList;

public class HW1 {
    public static void ex1(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Минимальное число: " + min);
    }

    public static void ex2(int[] arr) {
        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                }
            }
        }
    }

    public static void ex3(int num) {
        int res = 1;
        for (int i = 1; i <= num; i++) {
            res = res * i;
        }
        System.out.println("Факториал " + num + ": " + res);
    }

    public static void ex4(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sum += arr[i];
            }
        }
        System.out.println(sum);
    }

    public static void ex5(int num) {
            if (num <= 1) {
                    System.out.println("Невозможно посчитать");
                } else {
                    double sqrt = Math.sqrt(num);
                    for (int i = 2; i <= sqrt; i++) {
                            if (num % i == 0) {
                                System.out.println(num + " - простое число");
                            }
                else{
                     System.out.println(num+" - не простое число");
                     }
                 }
            }
        }
    public static void ex7(int[] arr) {
            double sum = 0;
            for (int i = 0; i < arr.length; i++) {
                    sum += arr[i];
            }
            System.out.println("Сред. арифмет. = "+ sum/arr.length);
    }
}