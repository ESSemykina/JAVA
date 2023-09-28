import java.util.Scanner;
import java.util.Arrays; // для task2!

public class Main {
    public static void main(String[] args) {
        //task1();
        //task2();
        //task3();
        //task4();
        //task5();
        //task6();
        task7();
        //task8();

    }

    public static void task1() {
        System.out.println("Задание 1");
        System.out.print("Введите строку: ");
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

        int n = s.length();
        int[] arr = new int[7000];//какие символы в строке неизвестно беру максимальный массив
        int max = 0, i = 0, j = 0;
        String maxSubstring = ""; // максимальная подстрока

        while (i < n) {
            arr[s.charAt(i)]++; // увеличиваем число использований символа
            while (arr[s.charAt(i)] > 1) { // если у нас более раза встрачается в строке символ
                arr[s.charAt(j)]--; // то двигаем левый указатель и уменьшаем значения до тех пор пока
                //символ, на который не будет указывать правый указатель не станет 1
                j++;
            }
            if (i - j + 1 > max) { // если найдена новая максимальная подстрока
                max = i - j + 1; // обновляем максимум
                maxSubstring = s.substring(j, i + 1); // заполняем найденную подстроку
            }
            i++; // сдвигаем правый указатель
        }
        System.out.println("Максимальная подстрока: " + maxSubstring);
        System.out.println("Длина максимальной подстроки: " + max);
    }

    public static void task2() {
        System.out.println("Задание 2");
        Scanner in = new Scanner(System.in);
        System.out.print("Введите длину первого массива: ");
        int n = in.nextInt();

        int[] first = new int[n];
        System.out.print("Введите элементы первого массива: ");
        for (int i = 0; i < n; i++) {
            first[i] = in.nextInt();
        }

        System.out.print("Введите длину второго массива: ");
        int m = in.nextInt();

        int[] second = new int[m];
        System.out.print("Введите элементы второго массива: ");
        for (int i = 0; i < m; i++) {
            second[i] = in.nextInt();
        }

        Arrays.sort(first);
        Arrays.sort(second);

        int[] sorted = new int[n + m];
        for(int i = 0; i < n; i++){
            sorted[i] = first[i];
        }
        for(int i = 0; i < m; i++){
            sorted[n + i] = second[i];
        }

        Arrays.sort(sorted);

        System.out.println(Arrays.toString(sorted));

    }

    public static void task3() {
        System.out.println("Задание 3");
        Scanner in = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        int n = in.nextInt();

        int[] arr = new int[n];
        System.out.print("Введите элементы массива: ");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        int maxSum = arr[0];
        int currentSum = arr[0]; //текущая сумма


        //(максимальное: либо текущий эл-т, либо сумма предыдущих эл-тов и текущего элемента)
        //если текущая сумма больше максимальной, то обновляем максимальную сумму
        for (int i = 1; i < n; i++) {
            currentSum = Math.max(arr[i], currentSum + arr[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        System.out.print("Максимальная сумма подмассива: " + maxSum);
    }

    public static void task4() {
        System.out.println("Задание 4");
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество строк: ");
        int n = in.nextInt();

        System.out.print("Введите количество столбцов: ");
        int m = in.nextInt();

        System.out.println("Введите двумерный массив: ");
        int[][] arr = new int[n][m];
        int[][] turn = new int [m][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                turn[j][n-i-1] = arr[i][j];
            }
        }
        System.out.println("Поворот на 90 градусов по часовой стрелке: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(turn[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void task5() {
        System.out.println("Задание 5");
        Scanner in = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        int n = in.nextInt();

        int[] arr = new int[n];
        System.out.print("Введите элементы массива: ");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.print("Введите число target: ");
        int target = in.nextInt();
        int count = 0;

        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++){
                if(arr[i] + arr[j] == target){
                    System.out.println(arr[i] + " " + arr[j]);
                    count ++;
                }
            }

        }
        if(count == 0){
            System.out.println("null");
        }

    }


    public static void task6() {
        System.out.println("Задание 6");
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество строк: ");
        int n = in.nextInt();

        System.out.print("Введите количество столбцов: ");
        int m = in.nextInt();

        System.out.println("Введите двумерный массив: ");
        int[][] arr = new int[n][m];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println("Сумма всех элементов = " + sum);
    }
    public static void task7() {
        System.out.println("Задание 7");
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество строк: ");
        int n = in.nextInt();

        System.out.print("Введите количество столбцов: ");
        int m = in.nextInt();

        System.out.println("Введите двумерный массив: ");
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        for(int i = 0; i < n; i++){
            int max = arr[i][0];//первый эл-т в текущей строке
            for(int j = 0; j < m; j++){
                if(arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
            System.out.println(max);
        }
    }

    public static void task8() {
        System.out.println("Задание 8");
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество строк: ");
        int n = in.nextInt();

        System.out.print("Введите количество столбцов: ");
        int m = in.nextInt();

        int[][] arr = new int[n][m];
        int[][] turn = new int [m][n];

        System.out.println("Введите двумерный массив: ");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                turn[m-j-1][i] = arr[i][j];
            }
        }

        System.out.println("Поворот на 90 градусов против часовой стрелки: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(turn[i][j] + " ");
            }
            System.out.println();
        }


    }

}



