import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //task1();
        //task2();
        //task3();
        task4();
        //task5();
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
            }
            else {
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
        int N = in.nextInt(); //количество дорог
        int min = 10000; //будем сравнивать
        int[] min_he = new int[N];
        for(int i = 0; i < N; i++){
            System.out.print("Введите количество туннелей: ");
            int tunnel = in.nextInt();
            System.out.print("Введите высоту каждого туннеля: ");
            for(int j = 0; j < tunnel; j++){
                int height = in.nextInt();
                if(height < min){
                    min = height;
                }
            }
            min_he[i] = min; //заполняем массив минимальными высотами
            min = 10000; //
        }
        int count = 0;
        for(int i = 0; i < N; i++){
            for(int j = 1; j < N; j++){
                if (min_he[i] < min_he[j]){
                    min_he[i] = min_he[j];
                            count = j + 1;
                }
            }
        }


        System.out.print(min);


    }

    public static void task5(){

        System.out.println("Задание 5");

        System.out.print("Введите целое трехзначное число: ");
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        int sum = 0;
        int proizv = 1;

        if(N >= 100 && N <= 999) {
            do {
                int number = N % 10; //последняя цифра числа
                sum += number;
                proizv *= number;
                N /= 10; // удалила последнюю цифру числа
            } while (N != 0);
        }else {
            System.out.println("Число не трехзначное");
            return;//прерываем выполнение
        }

        if(sum % 2 == 0 && proizv % 2 == 0){
            System.out.println("Дважды четное");
        }else{
            System.out.println("Не дважды четное");
        }



    }




}