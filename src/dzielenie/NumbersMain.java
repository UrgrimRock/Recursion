package dzielenie;

import java.util.Scanner;

public class NumbersMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int result;
        while(a!=b) {
            if (a > b) {
                a = a - b;
            } else
                b = b - a;
            System.out.println(a+" "+b);
        }
        result = a;
        System.out.println(result);
    }

}
