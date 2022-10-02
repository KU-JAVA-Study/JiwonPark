package chapter04;

import java.util.Scanner;

public class MonthSchedule {
    private final Scanner scanner;
    private final Day[] days;

    MonthSchedule(int day) {
        this.days = new Day[day];
        for (int i = 0; i < days.length; i++) {
            days[i] = new Day();
        }
        scanner = new Scanner(System.in);
    }

    private void input() {
        System.out.print("날짜: ");
        int day = scanner.nextInt();
        System.out.print("할일: ");
        String work = scanner.next();
        day--;
        if (day < 0 || day > 30) {
            System.out.println("날짜 잘못 입력됨");
            return;
        }
        days[day].set(work);
    }

    private void view() {
        System.out.print("날짜: ");
        int day = scanner.nextInt();
        day--;
        if (day < 0 || day > 30) { // 0~29
            System.out.println("날짜 잘못 입력됨");
            return;
        }
        System.out.print((day + 1) + "일의 할 일은 ");
        days[day].show();
    }

    private void finish() {
        System.out.println("종료");
    }

    public void run() {
        while (true) {
            System.out.println();
            System.out.print("할일(입력:1, 보기:2, 끝내기:3): ");
            int select = scanner.nextInt();
            switch (select) {
                case 1 -> input();
                case 2 -> view();
                case 3 -> {
                    finish();
                    return;
                }
            }
        }
    }

    public static void main(String[] args) {
        MonthSchedule april = new MonthSchedule(30);
        april.run();
    }

}