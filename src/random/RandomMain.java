package random;


import java.util.Random;
import java.util.Scanner;

public class RandomMain {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int randomNamber = random.nextInt(100);
        int chances = 7;
        for (int i = 0; i < 7; i++) {
            System.out.println("Podaj lidzbę:");
            int number = scanner.nextInt();
            chances = chances -1;
            if (number==randomNamber){
                System.out.println("Zgadłeś!!!!");
                return;
            }else if (number>randomNamber){
                System.out.println("Twoja lidzba jet za duża, zostało ci " + chances+" prób!");
            }
            else if (number<randomNamber){
                System.out.println("Twoja lidzba jest za mała, zostało ci " + chances+" prób!");

            }

        }System.out.println(randomNamber);

    }
}
