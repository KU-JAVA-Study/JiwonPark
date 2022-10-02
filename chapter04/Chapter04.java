package chapter04;

import java.util.Scanner;

public class Chapter04 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        question01();
//        question02();
//        question03();
//        question04();
//        question05();
//        question06();
//        question08();
//        question09();
//        question10();
//        question11();
        question12();
    }

    private static void question12() {
        Reservation reserve = new Reservation();
        while (true) {
            System.out.print("예약 - 1, 조회 - 2, 취소 - 3, 끝내기 - 4\n입력: ");
            int select = scanner.nextInt();
            switch (select) {
                case 1 -> reserve.chooseSeat();
                case 2 -> reserve.printAll();
                case 3 -> reserve.deleteSeat();
                case 4 -> {
                    return;
                }
                default -> System.out.println("재입력");
            }
        }
    }

    private static void question11() {
        System.out.print("연산 입력: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        char c = scanner.next().charAt(0);

        int result = 0;
        switch (c) {
            case '+' -> {
                Add add = new Add();
                add.setValue(a, b);
                result = add.calculate();
            }
            case '-' -> {
                Sub sub = new Sub();
                sub.setValue(a, b);
                result = sub.calculate();
            }
            case '*' -> {
                Mul mul = new Mul();
                mul.setValue(a, b);
                result = mul.calculate();
            }
            case '/' -> {
                Div div = new Div();
                div.setValue(a, b);
                result = div.calculate();
            }
        }
        System.out.println(result);
    }

    private static void question10() {
        while (true) {
            System.out.print("한글: ");
            String search = scanner.next();
            if (search.equals("그만")) break;

            String eng = Dictionary.kor2Eng(search);
            if (eng.equals("false"))
                System.out.println(search + " 없음");
            else
                System.out.println(eng);
        }
    }

    private static void question09() {
        int[] array1 = {1, 5, 7, 9};
        int[] array2 = {3, 6, -1, 100, 77};
        int[] array3 = ArrayUtil.concat(array1, array2);
        ArrayUtil.print(array3);
    }

    private static void question08() {
        System.out.print("인원수: ");
        int num = scanner.nextInt();
        Phone[] phone = new Phone[num];

        int i;
        for (i = 0; i < phone.length; i++) {
            System.out.print("이름, 번호: ");
            String name = scanner.next();
            String tel = scanner.next();
            phone[i] = new Phone(name, tel);
        }
        System.out.println("저장완료");

        while (true) {
            System.out.print("이름: ");
            String name = scanner.next();
            for (i = 0; i < num; i++) {
                if (name.equals(phone[i].getName())) {
                    System.out.println(name + ": " + phone[i].getTel());
                    i--;
                    break;
                }
            }
            if (name.equals("그만")) break;
            if (i == num) System.out.println(name + "없음");
        }
    }

    private static void question06() {
        Circle[] circles = new Circle[3];
        int max = 0;
        for (int i = 0; i < circles.length; i++) {
            System.out.println("x, y, radius: ");
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();
            int radius = scanner.nextInt();

            if (max < radius) max = radius;
            circles[i] = new Circle(x, y, radius);
        }

        for (Circle circle : circles) {
            if (max == circle.getRadius()) {
                circle.show();
            }
        }
    }

    private static void question05() {
        Circle[] circles = new Circle[3];
        for (int i = 0; i < circles.length; i++) {
            System.out.println("x, y, radius: ");
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();
            int radius = scanner.nextInt();
            circles[i] = new Circle(x, y, radius);
        }
        for (Circle circle : circles) circle.show();
    }

    private static void question04() {
        Rectangle r = new Rectangle(2, 2, 8, 7);
        Rectangle s = new Rectangle(5, 5, 6, 6);
        Rectangle t = new Rectangle(1, 1, 10, 10);

        r.show();
        System.out.println(s.square());
        if (t.contains(r)) System.out.println("t, r 포함");
        if (t.contains(s)) System.out.println("t, s 포함");
    }

    private static void question03() {
        Song song = new Song("댄싱퀸", "ㅇㅇ", 1000, "스웨덴");
        song.show();
    }

    private static void question02() {
        System.out.println("수, 과, 영: ");
        int math = scanner.nextInt();
        int science = scanner.nextInt();
        int english = scanner.nextInt();
        Grade grade = new Grade(math, science, english);
        System.out.println(grade.average());
    }

    private static void question01() {
        TV tv = new TV("LG", 2017, 32);
        tv.show();
    }
}

