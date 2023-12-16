import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Comp1010ExamPrep {
	
	public static List<QuizQuestion> quiz = QuizQuestion.QuizQuestions();
	public static Scanner input = new Scanner(System.in);
	public static int score = 0;
	
	//This subroutine outputs 
	public static void main(String []args) {
		for (QuizQuestion q : quiz) {
			askQuestion(q);
		}
		System.out.println("\nQuiz Completed!");
		System.out.println("-----------------------------------------");
		System.out.printf("Score: %d/%d\n\n", score, quiz.size());
		System.out.print("Press <Enter> to end...");
		input.nextLine();
	}
	public static void askQuestion(QuizQuestion q) {
		System.out.printf("\nQuestion %d out of %d\n", q.ID, quiz.size());
		System.out.println("-----------------------------------------");
		System.out.printf("%s\n", q.Question);
		System.out.println("-----------------------------------------");
		System.out.printf("1. %s\n", q.choice1);
		System.out.printf("2. %s\n", q.choice2);
		System.out.printf("3. %s\n", q.choice3);
		System.out.printf("4. %s\n", q.choice4);
		System.out.println("-----------------------------------------");
		// Get and Validate input
		boolean valid = false;
		int choice = 0;
		do {
			System.out.print("What is your answer? (1 to 4): ");
			String selection = input.nextLine();
			if ((selection.length() == 1) && (Character.isDigit(selection.charAt(0)))) {
				int option = Integer.parseInt(selection);
				if (option >= 1 && option <= 4) {
					valid = true;
					choice = option;
				}
			}				
			if (!valid) { System.out.println("Input must be between 1 and 4"); }
		} while (!valid);
		if (choice == q.correctAnswer) {
			System.out.println("Correct!");
			score++;
		} else {
			System.out.printf("Incorrect! Correct Answer is option #%d\n", q.correctAnswer);
		}
		System.out.print("Press <Enter> to continue...");
		input.nextLine();
	}
}