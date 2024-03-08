package guessthenumber;
import java.util.*;
class Guess{
	public int number;
	public int inputNumber;
	public int noOfGuesses = 0;
	public int getnoOfGuesses() {
		return noOfGuesses;
	}
	public void setnoOfGuesses(int noOfGuesses ) {
		this.noOfGuesses = noOfGuesses;
	}
	Guess() {
		Random rand = new Random();
		this.number = rand.nextInt(100);
	}
	void takeUserInput() {
		System.out.println("Guess The Number Between 1 to 100");
		Scanner sc =new Scanner(System.in);
		inputNumber = sc.nextInt();
	}
	boolean isCorrectNumber() {
		noOfGuesses++;
		 if (inputNumber==number) {
			 System.out.format("Yes you guess it right, it was %d\nyou guessed it in %d attempts", number, noOfGuesses);
			 return true;
		 }
		 else if(inputNumber<number) {
			 System.out.println("Too Low...");
		 }
		 else if(inputNumber>number) {
			 System.out.println("Too High...");
		 }
		 return false;
	}
}
public class Game {
	public static void main (String[] args) {
		Guess g = new Guess();
		boolean b = false;
		while (!b) {
		g.takeUserInput();
		 b = g.isCorrectNumber();
		}
	}
}