/*
 * Class: CMSC203 
 * Instructor: Monshi
 * Description: The program will allow a user to guess the random number that is generater by RNG.rand();
 * it will keep track of attempts and adjust the range the user has to guess in. 
 * Due: 2/21/2022
 * Platform/compiler: eclipse
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Azariyas Tafesse
*/



import java.util.Scanner;

public class RandomNumberGuesser {

	public static void main(String[] args) {
		int randNum = RNG.rand();
		int nextGuess;
		int lowGuess=1;
		int highGuess=100;
		int answer= 1;
		Scanner input = new Scanner(System.in);
		
		do
		{
			System.out.println(randNum + " Enter your  guess");
			nextGuess = input.nextInt();
			RNG r1 = new RNG();
			System.out.println("Number of guesses is "+RNG.getCount());
			// if guess was too high
			if (nextGuess > randNum)
			{
				highGuess = staticVar(nextGuess);
				System.out.println("Your guess is too high.\nGuess between "+lowGuess+" and "+ highGuess);
			}
			// if guess was too low
			else if (nextGuess < randNum)
			{
				lowGuess=staticVar(nextGuess);
				System.out.println("Your guess is too low\nGuess between "+ lowGuess + " and "+ highGuess);
			}
			// if guess was correct
			else if (nextGuess==randNum) 
			{
				System.out.println("Congratulations, you guessed correctly");
				System.out.println("Do you want to play again? ( 1 for yes and 0 for no)");
				answer = input.nextInt();
				if (answer == 1) {
					// resets all variables create new number and reset bounds then goes back to top.
					RNG.resetCount();
					randNum = RNG.rand();
					lowGuess=1;
					highGuess=100;
					
				}
			}
		}while(answer== 1);

	System.out.println("Thanks for trying out program.\n"
			+ "Programer:Azariyas Tafesse");
	input.close();
	}

	// holds the previous lowest or highest guess for the next iteration
	 static int staticVar(int nextGuess) {
		int sub = nextGuess;
		 return sub;
	}

}
