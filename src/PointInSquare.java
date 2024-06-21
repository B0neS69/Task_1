//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class PointInSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Введення довжини сторони квадрата
        System.out.print("Введіть довжину сторони квадрата: ");
        int length = scanner.nextInt();
        System.out.println("=========================================\n");

        // Введення координат верхнього лівого кута квадрата
        System.out.println("Введіть координату X1 верхньої лівої точки квадрата:");
        int x0 = scanner.nextInt();
        System.out.println("Введіть координату Y1 верхньої лівої точки квадрата:");
        int y0 = scanner.nextInt();
        System.out.println("=========================================\n");

        // Введення координат точки A
        System.out.println("Введіть координати точки A:");
        System.out.print("Координати A(x1) = ");
        int Ax = scanner.nextInt();
        System.out.print("Координати A(y1) = ");
        int Ay = scanner.nextInt();
        System.out.println("=========================================\n");

        // Перевірка, чи точка знаходиться всередині квадрата
        boolean isInside = isWithinTheSquare(x0, y0, length, Ax, Ay);

        if (isInside) {
            System.out.println("Точка знаходиться всередині квадрата.");
        } else {
            System.out.println("Точка НЕ знаходиться всередині квадрата.");
        }

        scanner.close();
    }

    public static boolean isWithinTheSquare(int x1, int y1, int length, int Ax, int Ay) {
        int x2 = x1 + length;
        int y2 = y1 + length;

        if (Ax >= x1 && Ax <= x2 && Ay >= y1 && Ay <= y2) {
            return true;
        } else {
            return false;
        }
    }
}
