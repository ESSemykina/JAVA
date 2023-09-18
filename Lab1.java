import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {
        //task1();
        //task2();
        //task3();
        //task4();
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
            } else {
                sum -= numbers[i];
            }

        }
        System.out.println("Знакочередующаяся сумма: " + sum);
    }

    public static void task3() {
        System.out.println("Задание 3");

        int x0 = 0;
        int y0 = 0;
        int final_count = 0;

        System.out.println("Введите координаты");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();

        String slovo = " "; //направление или стоп

        int count = 0;//считаем шаги

        int flag = 0;//while(true)

        while (true) {
            System.out.println("Введите направление или стоп:");
            slovo = in.next();

            if (slovo.equals("стоп")) {
                break;
            }

            System.out.println("Введите шаг:");
            int step = in.nextInt();

            if (slovo.equals("север")) {
                y0 += step;
                count += 1;
            } else if (slovo.equals("юг")) {
                x0 += step;
                count += 1;
            } else if (slovo.equals("восток")) {
                y0 -= step;
                count += 1;
            } else if (slovo.equals("запад")) {
                x0 -= step;
                count += 1;
            }

            if (x0 == x && y0 == y) {
                flag += 1;
                if (flag == 1) {
                    final_count = count;
                }

            }
        }
        System.out.println("Количество шагов = " + final_count);

    }

    public static void task4() {
        System.out.println("Задание 4");

        System.out.print("Введите количество дорог: ");
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(); //количество дорог

        int min = 100000;//для сравнения

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            System.out.print("Введите количество тунеллей: ");
            int tunnel = in.nextInt();
            for (int j = 0; j < tunnel; j++) {
                System.out.print("Введите высоту: ");
                int height = in.nextInt();
                if (height < min) {
                    min = height;
                }

            }
            arr[i] = min; //массив с минимальными высотами
            min = 100000;

        }
        int doroga = 0;//номер дороги
        int max = 0;//для сравнения

        for (int i = 0; i < N; i++) {
            if (arr[i] > max) {
                max = arr[i];
                doroga += 1;
            }
        }
        System.out.println("Номер дороги " + doroga);
        System.out.println("Наибольшая высота грузовика " + max);

    }

    public static void task5() {

        System.out.println("Задание 5");

        System.out.print("Введите целое трехзначное число: ");
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        int sum = 0;
        int proizv = 1;

        if (N >= 100 && N <= 999) {
            do {
                int number = N % 10; //последняя цифра числа
                sum += number;
                proizv *= number;
                N /= 10; // удалила последнюю цифру числа
            } while (N != 0);
        } else {
            System.out.println("Число не трехзначное");
            return;//прерываем выполнение
        }

        if (sum % 2 == 0 && proizv % 2 == 0) {
            System.out.println("Дважды четное");
        } else {
            System.out.println("Не дважды четное");
        }

    }

}













