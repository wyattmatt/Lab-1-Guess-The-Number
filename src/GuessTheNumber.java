import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalAttempts = 0, gamesPlayed = 0, totalPoints = 0;
        String playAgain;
        System.out.println("=".repeat(50));
        System.out.println("Welcome to Guess the Number!");
        System.out.println("=".repeat(50));
        
        do {
            System.out.println("1. Easy (1-50)\n2. Medium (1-100)\n3. Hard (1-200)");
            System.out.print("Choose your difficulty: ");
            int max = switch (scanner.nextInt()) { case 1 -> 50; case 3 -> 200; default -> 100; };
            int numberToGuess = (int) (Math.random() * max) + 1, attempts = 0, userGuess;
            System.out.println("I have randomly chosen a number between 1 and " + max + ". Try to guess it!");
            
            do {
                System.out.print("Enter your guess: ");
                userGuess = scanner.nextInt();
                attempts++;
                System.out.println(userGuess < numberToGuess ? "Too low! Try again." : userGuess > numberToGuess ? "Too high! Try again." : "Congratulations! You guessed it in " + attempts + " attempts.");
            } while (userGuess != numberToGuess);
            
            totalAttempts += attempts;
            gamesPlayed++;
            int points = (max * 2) / attempts; // Points calculation based on difficulty and attempts
            totalPoints += points;
            
            System.out.println("Your average attempts: " + (totalAttempts / gamesPlayed));
            System.out.println("You earned " + points + " points this round! Total points: " + totalPoints);
            
            System.out.print("Play again? (yes/no): ");
            playAgain = scanner.next();
        } while (playAgain.equalsIgnoreCase("yes"));
        
        System.out.println("Thanks for playing! Your final average attempts: " + (totalAttempts / Math.max(gamesPlayed, 1)));
        System.out.println("Total points earned: " + totalPoints);
        scanner.close();
    }
}