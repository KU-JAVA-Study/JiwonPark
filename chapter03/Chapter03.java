package chapter03;

import chapter02.Chapter02;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Chapter03 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        question02();
//        question03();
//        question04();
//        question05();
//        question06();
//        question07();
//        question08();
//        question09();
        question10();
    }

    private static void question10() {
        int[][] arr = new int[4][4];
        Random r = new Random();

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                arr[i][j] = r.nextInt(1, 11);
            }
        }

        int count = 1;
        while (count < 7) {
            int i = r.nextInt(4);
            int j = r.nextInt(4);
            if (arr[i][j] != 0) {
                arr[i][j] = 0;
                count++;
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("%d ", arr[i][j]);
            }
            System.out.println();
        }
    }

    private static void question09() {
        int[][] arr = new int[4][4];
        Random r = new Random();

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                arr[i][j] = r.nextInt(1, 11);
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("%d ", arr[i][j]);
            }
            System.out.println();
        }
    }

    private static void question08() {
        System.out.println("개수: ");
        int num = scanner.nextInt();
        Random r = new Random();
        int[] arr = new int[num];

        for (int i = 0; i < arr.length; i++) {
            int n = r.nextInt(1, 100);
            for (int k : arr) {
                while (k == n) n = r.nextInt(1, 100);
            }
            arr[i] = n;
        }

        for (int a : arr) System.out.printf("%d ", a);

    }

    private static void question07() {
        Random r = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = r.nextInt(1, 10);
        }

        int sum = 0;
        for (int a : arr) {
            System.out.printf("%d ", a);
            sum += a;
        }
        System.out.println("\n평균: " + sum / 10);
    }

    private static void question06() {
        Chapter02.question03();
    }

    private static void question05() {
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) arr[i] = scanner.nextInt();

        for (int i = 0; i < 10; i++) {
            if (arr[i] % 3 == 0) System.out.printf("%d ", arr[i]);
        }
    }

    private static void question04() {
        System.out.println("소문자 알파벳 입력:");
        char str = scanner.next().charAt(0);

        for (int i = 0; i <= str - 'a'; i++) {
            for (char j = 'a'; j <= str - i; j++) System.out.print(j);
            System.out.println();
        }
    }

    private static void question03() {
        System.out.println("정수 입력: ");
        int num = scanner.nextInt();
        for (int i = 5; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void question02() {
        int[][] n = {{1}, {1, 2, 3}, {1}, {1, 2, 3, 4}, {1, 2}};
        for (int[] arr : n) {
            for (int a : arr) {
                System.out.printf("%d ", a);
            }
            System.out.println();
        }
    }
}


