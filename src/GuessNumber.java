import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        int min = 1;
        int max = 100;
        int difference = max - min;

        Random random = new Random();
        int randomNumber = random.nextInt(difference + 1) + min;

        int attemptsCount = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a number from 1 to 100:");
            int enteredNumber = scanner.nextInt();

            attemptsCount++;

            if (enteredNumber < randomNumber) {
                System.out.println("Wrong, the hidden number is greater than ");
            } else if (enteredNumber > randomNumber) {
                System.out.println("Wrong, the hidden number is less than ");
            } else {
                System.out.println("Correctly i = " + randomNumber);
                System.out.println("Attempts: " + attemptsCount);
                break;
            }
        }
    }
}
