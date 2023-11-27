import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Algorithms {
    public static int ex1(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
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

    public static int ex4(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sum += arr[i];
            }
        }
        return sum;
    }

    public static boolean ex5(int num) {
        if (num <= 1) {
            System.out.println("Число != 1 или < 0");
        } else {
            double sqrt = Math.sqrt(num);
            for (int i = 2; i <= sqrt; i++) {
                if (num % i == 0) {
                    return false;
                } else {
                    return true;
                }
            }
        }
        return true;
    }

    public static int ex6(String str){
        int num = 0;
        str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'||str.charAt(i)=='y'){
                num++;
            }
        }
        return num;
    }

    public static int ex7(int[] arr) {
            double sum = 0;
            for (int i = 0; i < arr.length; i++) {sum += arr[i];}
    return (int) (sum/arr.length);
    }

    public static int ex9(int a, int b){
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static boolean ex12(String str){
        int left = str.charAt(0);
        int right = str.length()-1;
        while (left<right){
            if (str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static boolean ex15(String str1, String str2){
        if (str1.length()!=str2.length()){
            return false;
        }
        char[] str1Ar = str1.toCharArray(); // превращаем первую и вторую строки в массивы с символами
        char[] str2Ar = str2.toCharArray(); //
        Arrays.sort(str1Ar); // сортируем первый и второй массив с символами с последовательностью букв в альфавите
        Arrays.sort(str2Ar); //
        return Arrays.equals(str1Ar, str2Ar);
    }

    public static int ex19(int[] arr){
        int a = new Random().nextInt(arr.length);
        int b = new Random().nextInt(arr.length);
        int diff = 0;
        if (a>=b){
            diff=a-b;
        }else {
            diff=b-a;
        }
        return diff;
    }

    public static int ex20(int[] arr){
        int max = 0;
        for (int i = 1; i < arr.length-1; i++) {
            if (arr[i] > arr[i-1] && arr[i] > arr[i+1]) {
                return arr[i];
            }
        }
        return -1;
    }

    public static ArrayList<Integer> ex21(int[] arr1, int[] arr2){
        ArrayList<Integer> nums = new ArrayList<Integer>();
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i]==arr2[j]){
                    nums.add(arr1[i]);
                }
            }
            
        }
        return nums;
    }
}