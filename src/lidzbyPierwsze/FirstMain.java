package lidzbyPierwsze;

import java.util.Scanner;

public class FirstMain {
    public static void main(String[] args) {
        FirstNumber firstNumber = new FirstNumber();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int upperRange = scanner.nextInt();

        System.out.println(firstNumber.isFirst(n));
        firstNumber.displayFirstNumbersInRange(upperRange);

    }
}
