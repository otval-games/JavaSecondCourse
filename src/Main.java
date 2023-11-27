import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int[] IntArr = {2,4,6,8,10};
        int[] IntArr2 = {1,4,5,8,9};

        System.out.println("Мин. число: " +Algorithms.ex1(IntArr));
        System.out.println("Сумма парных чисел: " +Algorithms.ex4(IntArr));
        System.out.println("Простое ли число? " +Algorithms.ex5(5));
        System.out.println("Всего гласных букв: "+Algorithms.ex6("babebibobuby"));
        System.out.println("Сред. арифмет. = "+ Algorithms.ex7(IntArr));
        System.out.println(Algorithms.ex12("mom"));
        System.out.println(Algorithms.ex15("add", "dad"));
        System.out.println("Разница между двумя рандом числами: "+Algorithms.ex19(IntArr));
        System.out.println("Макс. число: "+Algorithms.ex20(IntArr));
        System.out.println("Одинаковые числа: "+Algorithms.ex21(IntArr, IntArr2));
    }
}