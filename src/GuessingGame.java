import java.util.Scanner;

public class GuessingGame extends NumbersRange {

    public static void main(String[] args) {

        System.out.println("Enter lowest number");
        Scanner sc = new Scanner(System.in);
        int min = sc.nextInt();
        System.out.println("Enter highest number");
        int max = sc.nextInt();
        int answer = numbersRange(min, max);
        int numberOfTries = 0;

        boolean win = false;

        while (win == false) {

            System.out.println("Enter your guess");
            int userInput = sc.nextInt();
            numberOfTries++;
            if (userInput == answer) {
                win = true;
            } else if (numberOfTries == 3) {
                System.out.println("You lost");   // Loop ends when number of tries exceeds given value, but still prints "You won!" as a result <HmmEmoji.png>
                System.out.println("Correct answer:" + answer);
                break;
            } else if (userInput > answer) {

                System.out.println("Your answer " + userInput + " is too high.");
            } else if (userInput < answer) {
                System.out.println("Your answer " + userInput + " is too low");
            }

        }
        System.out.println("You won!");
        System.out.println("Your number of tries: " + numberOfTries);
        System.out.println("Correct answer:" + answer);
    }
}
