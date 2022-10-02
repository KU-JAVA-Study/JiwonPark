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
//        question10();
//        question13();
//        question14();
        question16();
    }

    private static void question16() {
        String[] str = {"가위", "바위", "보"};
        int i;
        do {
            System.out.print("가위 바위 보: ");
            String user = scanner.next();
            if (user.equals("그만")) break;
            int computer = new Random().nextInt(3);

            for (i = 0; i < str.length; i++) {
                if (str[i].equals(user)) break;
            }

            if (computer == i) System.out.println("무승부");
            else if (i == 0 && computer == 2) System.out.println("승리");
            else if (i == 2 && computer == 0) System.out.println("패배");
            else if (i > computer) System.out.println("승리");
            else System.out.println("패배");

        } while (true);
        System.out.println("게임을 종료합니다...");
    }

    private static void question14() {
        String[] course = {"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
        int[] score = {95, 88, 76, 62, 55};

        while (true) {
            System.out.print("과목 이름: ");
            String name = scanner.next();
            if (name.equals("그만")) break;

            int i;
            for (i = 0; i < course.length; i++) {
                if (course[i].equals(name)) {
                    System.out.printf("%s의 점수는 %d", course[i], score[i]);
                    break;
                }
            }

            if (i == course.length) System.out.println("없음");
        }
    }

    private static void question13() {
        for (int i = 1; i < 100; i++) {
            int a = i / 10; // 10의 자리
            int b = i % 10; // 1의 자리

            if ((a == 3 || a == 6 || a == 9) && (b == 3 || b == 6 || b == 9)) System.out.printf("%d 박수 짝짝\n", i);
            else if (a == 3 || a == 6 || a == 9 || b == 3 || b == 6 || b == 9) System.out.printf("%d 박수 짝\n", i);
        }
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


