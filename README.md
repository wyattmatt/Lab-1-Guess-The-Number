# Guess The Number Game

A simple command-line game where you try to guess a randomly chosen number within a specified range. The game includes difficulty levels, score tracking, and a play-again feature.

## Features
- **Difficulty Levels**:
  - Easy: 1 - 50
  - Medium: 1 - 100
  - Hard: 1 - 200
- **Score Tracking**: Earn points based on difficulty and attempts taken.
- **Play Again Feature**: Choose to play multiple rounds.
- **Statistics**:
  - Average attempts per game
  - Total points earned

## Folder Structure
This project follows a structured workspace with the following folders:
- `src/` - Contains the source code files.
- `lib/` - Stores external dependencies.
- `bin/` - Stores compiled output files (generated automatically).

> To customize the folder structure, edit `.vscode/settings.json` and update the relevant settings.

## How to Play
1. Run the program.
2. Select a difficulty level.
3. Enter guesses until you find the correct number.
4. Earn points based on performance.
5. Choose to play again or exit.

## Scoring System
- Points are calculated as:
  
  ```
  (difficulty max range * 2) / attempts
  ```
- The fewer attempts, the higher the score!

## Example Output
```
==================================================
Welcome to Guess the Number!
==================================================
1. Easy (1-50)
2. Medium (1-100)
3. Hard (1-200)
Choose your difficulty: 2
I have randomly chosen a number between 1 and 100. Try to guess it!
Enter your guess: 45
Too low! Try again.
Enter your guess: 78
Too high! Try again.
Enter your guess: 62
Congratulations! You guessed it in 3 attempts.
Your average attempts: 3
You earned 66 points this round! Total points: 66
Play again? (yes/no): no
Thanks for playing! Your final average attempts: 3
Total points earned: 66
```

## Requirements
- Java Development Kit (JDK) installed

## How to Run
1. Compile the Java file:

   ```sh
   javac GuessTheNumber.java
   ```
2. Run the program:

   ```sh
   java GuessTheNumber
   ```

## Author
Created by [Wyatt Matthew](https://github.com/wyattmatt).

## License
This project is open-source and free to use. See the [LICENSE](https://github.com/wyattmatt/Lab-1-Guess-The-Number/blob/main/LICENSE) file for details.
