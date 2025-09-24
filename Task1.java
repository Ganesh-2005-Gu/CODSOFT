import java.util.*;
public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        boolean PlayAgain = true;
        int Won_Rounds = 0;
        
        System.out.println("Welcome to the number guessing game!");
        
        while (PlayAgain) {
            int Number_Guess = random.nextInt(100) + 1;  
            int Attempts = 0;
            int Total_Attempts = 6;
            boolean Guessed_Correctly = false;

            System.out.println(" Selected a number between 1 and 100");
            System.out.println("You have " + Total_Attempts + " attempts to guess it!");

            while (Attempts < Total_Attempts) {
                System.out.print("Enter your guess: ");
                int Person_Guess = sc.nextInt();
                Attempts++;

                if (Person_Guess == Number_Guess) {
                    System.out.println("  You guessed the number in " + Attempts + " attempts.");
                    Guessed_Correctly = true;
                    Won_Rounds++;
                    break;
                } else if (Person_Guess < Number_Guess) {
                    System.out.println(" Too low! Try again.");
                } else {
                    System.out.println(" Too high! Try again.");
                }

                System.out.println("Attempts left: " + (Total_Attempts - Attempts));
            }

            if (!Guessed_Correctly) {
                System.out.println(" Out of attempts! The number was: " + Number_Guess);
            }

            System.out.print("Do you want to play another round ? (yes/no): ");
            String response = sc.next().toLowerCase();
            PlayAgain = response.equals("yes");
        }
        
        System.out.println(" Game Over! You won " + Won_Rounds + " rounds.");
        sc.close();
    }
}

