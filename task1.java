import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numberToGuess = 50; // fixed number to guess
        Scanner scanner = new Scanner(System.in);
        int attempts = 0;

        while (true) {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();
            attempts++;

            if (userGuess == numberToGuess) {
                System.out.println("Congratulations! You guessed the correct number.");
                break;
            } else if (userGuess > numberToGuess) {
                System.out.println("Your guess is too high. Try again!");
            } else {
                System.out.println("Your guess is too low. Try again!");
            }

            if (attempts >= 10) {
                System.out.println("You've reached the maximum number of attempts. The correct answer was " + numberToGuess);
                break;
            }
        }
    }
}