/*
*play roll dice
accumulate turn score
*display current roll and total score
*ask user’s input whether to roll again
*if (user’s choice == ‘yes’)
*Roll again
*check for score
*if (score > 100)
*exit do-while loop
*display “You have scored over 100
*Thank you for playing!”
*else
*accumulate turn score
*/
import java.util.Scanner;
import java.util.Random;

/**
 * This program simulates the rolling of dice.
 */
public class RollDice
{
    public static void main(String[] args)
    {
        String again = "y";  // To control the loop

        // Create a Scanner object to read keyboard input.
        Scanner keyboard = new Scanner(System.in);

        // Create a Random object to generate random numbers.
        Random rand = new Random();

        // Simulate rolling the dice.
        while (again.equalsIgnoreCase("y"))
        {
            System.out.println("Rolling the dice...");
            int die1 = rand.nextInt(6) + 1;
            int die2 = rand.nextInt(6) + 1;
            System.out.println("Their values are:");
            System.out.println(die1 + " " + die2);

            System.out.print("Roll them again (y = yes)? ");
            again = keyboard.nextLine();


            int sum, dice1, dice2, actual = 0;
            int[] Total = new int[13];
            int[] ways = { 0, 0, 1, 2, 3, 4, 5, 6, 5, 4, 3, 2, 1 };

            for (int i = 0; i < 36000; i++) {
                sum = 0;
                dice1 = new Random().nextInt(6) + 1;
                dice2 = new Random().nextInt(6) + 1;
                sum = dice1 + dice2;
                Total[sum]++;


        }
    }
}}