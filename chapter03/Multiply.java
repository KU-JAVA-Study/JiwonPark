package chapter03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Multiply {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("두 수 입력:");

            try {
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                System.out.println(a + " x " + b + " = " + a * b);
                break;
            } catch (InputMismatchException ignored) {
                System.out.println("계산 불가");
                scanner.nextLine();
            }
        }
    }
}
