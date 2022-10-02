package chapter04;

import java.util.Scanner;

class Reservation {
    private final String[] S;
    private final String[] A;
    private final String[] B;
    private final Scanner scanner;

    public Reservation() {
        scanner = new Scanner(System.in);
        S = new String[10];
        A = new String[10];
        B = new String[10];

        for (int i = 0; i < S.length; i++) {
            S[i] = "___";
            A[i] = "___";
            B[i] = "___";
        }
    }

    public static void printSeat(String[] seat) {
        for (String s : seat) {
            System.out.printf("%s ", s);
        }
        System.out.println();
    }

    public void printAll() {
        System.out.print("S: ");
        Reservation.printSeat(S);
        System.out.print("A: ");
        Reservation.printSeat(A);
        System.out.print("B: ");
        Reservation.printSeat(B);
    }

    public void chooseSeat() {
        while (true) {
            System.out.print("좌석구분: ");
            int select = scanner.nextInt();
            switch (select) {
                case 1 -> {
                    System.out.print("S: ");
                    printSeat(S);
                    inputSeat(S);
                    return;
                }
                case 2 -> {
                    System.out.print("A: ");
                    printSeat(A);
                    inputSeat(A);
                    return;
                }
                case 3 -> {
                    System.out.print("B: ");
                    printSeat(B);
                    inputSeat(B);
                    return;
                }
                default -> System.out.println("재입력");
            }
        }
    }

    public void inputSeat(String[] seat) {
        System.out.print("이름: ");
        String name = scanner.next();

        while (true) {
            System.out.print("번호: ");
            int num = scanner.nextInt();
            num--;

            if (seat[num].equals("___")) {
                seat[num] = name;
                break;
            } else System.out.println("재입력");
        }
    }

    public void deleteSeat() {
        while (true) {
            System.out.print("좌석 S:1, A:2, B:3>>");
            int select = scanner.nextInt();
            switch (select) {
                case 1 -> {
                    System.out.print("S: ");
                    printSeat(S);
                    delete(S);
                    return;
                }
                case 2 -> {
                    System.out.print("A: ");
                    printSeat(A);
                    delete(A);
                    return;
                }
                case 3 -> {
                    System.out.print("B: ");
                    printSeat(B);
                    delete(B);
                    return;
                }
                default -> System.out.println("재입력");
            }
        }
    }

    public void delete(String[] seat) {
        System.out.print("이름: ");
        String name = scanner.next();

        for (int i = 0; i < seat.length; i++) {
            if (name.equals(seat[i])) {
                seat[i] = "___";
                break;
            }
        }
    }
}
