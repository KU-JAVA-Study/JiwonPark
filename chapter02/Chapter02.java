package chapter02;

import java.util.Scanner;

public class Chapter02 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        question01();
//        question02();
//        question03();
//        question04();
//        question05();
//        question06();
//        question07();
//        question08();
//        question09();
//        question10();
//        question11();
        question12();
    }

    private static void question12() {
        System.out.println("연산식: ");
        int a = scanner.nextInt();
        String symbol = scanner.next();
        int b = scanner.nextInt();

        // if-statement
        /*if (symbol.equals("+")) System.out.println(a + b);
        else if (symbol.equals("-")) System.out.println(a - b);
        else if (symbol.equals("*")) System.out.println(a * b);
        else if (symbol.equals("/")) {
            if (b != 0) System.out.println(a / b);
            else System.out.println("계산 불가");
        } else System.out.println("연산식 잘못됨");*/

        // switch-case
        switch (symbol) {
            case "+" -> System.out.println(a + b);
            case "-" -> System.out.println(a - b);
            case "*" -> System.out.println(a * b);
            case "/" -> {
                if (b != 0) System.out.println(a / b);
                else System.out.println("계산 불가");
            }
            default -> System.out.println("연산식 잘못됨");
        }
    }

    private static void question11() {
        System.out.println("달 입력: ");
        int month = scanner.nextInt();

        // if statement
        /*if (month >= 3 && month <= 5) System.out.println("봄");
        else if (month >= 6 && month <= 8) System.out.println("여름");
        else if (month >= 9 && month <= 11) System.out.println("가을");
        else if (month == 12 || month == 1 || month == 2) System.out.println("겨울");
        else System.out.println("없음");*/

        // switch-case
        switch (month) {
            case 3, 4, 5 -> System.out.println("봄");
            case 6, 7, 8 -> System.out.println("여름");
            case 9, 10, 11 -> System.out.println("가을");
            case 12, 1, 2 -> System.out.println("겨울");
            default -> System.out.println("없음");
        }
    }

    private static void question10() {
        System.out.println("좌표, 반지름 입력: ");
        int a1 = scanner.nextInt(), b1 = scanner.nextInt();
        int r1 = scanner.nextInt();

        System.out.println("좌표, 반지름 입력: ");
        int a2 = scanner.nextInt(), b2 = scanner.nextInt();
        int r2 = scanner.nextInt();

        double d = Math.sqrt((a1 - a2) * (a1 - a2) + (b1 - b2) * (b1 - b2));
        if (d < r1 + r2) System.out.println("겹침");
        else System.out.println("안겹침");
    }

    private static void question09() {
        System.out.println("좌표, 반지름 입력: ");
        int a = scanner.nextInt(), b = scanner.nextInt();
        int r = scanner.nextInt();
        System.out.println("점 입력:");
        int x = scanner.nextInt(), y = scanner.nextInt();

        if (Math.pow(a - x, 2) + Math.pow(b - y, 2) < Math.pow(r, 2)) System.out.println("내부에 있음");
        else System.out.println("없음");
    }

    private static void question08() {
        System.out.println("좌표 입력(x, y): ");
        int x1 = scanner.nextInt(), y1 = scanner.nextInt();
        System.out.println("좌표 입력(x, y): ");
        int x2 = scanner.nextInt(), y2 = scanner.nextInt();

        if ((x1 >= 100 && y1 >= 100 && x1 <= 200 && y1 <= 200 && (x2 < 100 || x2 > 200 || y2 < 100 || y2 > 200)) ||
                x2 >= 100 && y2 >= 100 && x2 <= 200 && y2 <= 200 && (x1 < 100 || x1 > 200 || y1 < 100 || y1 > 200))
            System.out.println("충돌");
        else System.out.println("충돌 안함");
    }

    private static void question07() {
        System.out.println("좌표 입력(x, y): ");
        int x = scanner.nextInt(), y = scanner.nextInt();
        if (x >= 100 && x <= 200 && y >= 100 && y <= 200) System.out.printf("(%d, %d)(은)는 사각형 안에 있음\n", x, y);
        else System.out.println("없음");
    }

    private static void question06() {
        System.out.println("정수 입력: ");
        int num = scanner.nextInt();
        System.out.print("박수");

        if ((num % 10) % 3 == 0) System.out.print("짝");
        if (num >= 10 && num / 10 % 3 == 0) System.out.print("짝");
        System.out.print("\n");
    }

    private static void question05() {
        System.out.println("정수 3개 입력: ");
        int[] arr = new int[3];
        arr[0] = scanner.nextInt();
        int max = arr[0];
        for (int i = 1; i < 3; i++) {
            arr[i] = scanner.nextInt();
            if (max < arr[i]) max = arr[i];
        }

        int sum = 0;
        for (int i = 0; i < 3; i++) {
            if (arr[i] != max) sum += arr[i];
        }

        if (sum > max) System.out.println("삼각형이 됨");
        else System.out.println("안됨");
    }

    private static void question04() {
        System.out.println("정수 3개 입력: ");
        int[] arr = new int[3];
        arr[0] = scanner.nextInt();
        int max = arr[0], min = arr[0];
        for (int i = 1; i < 3; i++) {
            arr[i] = scanner.nextInt();
            if (max < arr[i]) max = arr[i];
            if (min > arr[i]) min = arr[i];
        }

        for (int i = 0; i < 3; i++) {
            if (arr[i] != max && arr[i] != min) System.out.printf("중간 값은 %d\n", arr[i]);
        }
    }

    public static void question03() {
        System.out.println("금액 입력: ");
        int money = scanner.nextInt();
        int[] cur = {50000, 10000, 1000, 500, 100, 50, 10, 1};

        for (int c : cur) {
            if (money / c != 0) {
                System.out.printf("%d원: %d\n", c, money / c);
                money %= c;
            }
        }
    }

    private static void question02() {
        System.out.println("2자리수 정수 입력: ");
        int num = scanner.nextInt();
        if (num % 10 == num / 10 % 10) System.out.println("10의 자리와 1의 자리가 같습니다.");
        else System.out.println("다릅니다.");
    }

    private static void question01() {
        System.out.println("원화를 입력하세요: ");
        double money = scanner.nextInt();
        System.out.printf("%.0f원은 $%.3f 입니다.\n", money, money / 1100);
    }

}
