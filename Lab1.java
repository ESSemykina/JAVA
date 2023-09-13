import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
    }

    public static void task1() {
        System.out.println("Задание 1");
        System.out.print("Введите натуральное число: ");
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int count = 0;

        do {
            if (N % 2 == 0) {
                N = N / 2;
            } else {
                N = 3 * N + 1;
            }
            count++;
        } while (N != 1);

        System.out.println("Количество шагов: " + count);
    }

    public static void task2() {
        System.out.println("Задание 2");
        System.out.print("Введите количество чисел: ");
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        System.out.println("Введите числа: ");

        int[] numbers = new int[N];
        for (int i = 0; i < N; i++) {
            numbers[i] = in.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < N; i++) {
            if (i % 2 == 0) {
                sum += numbers[i];
            } else {
                sum -= numbers[i];
            }
        }
        System.out.println("Знакочередующаяся сумма: " + sum);
    }
    public static void task3(){
        System.out.println("Задание 3");
    }
    public static void task4(){
        System.out.println("Задание 4");
        System.out.print("Введите количество дорог: ");
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

    }
}




