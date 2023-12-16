import java.util.ArrayList;
import java.util.List;
public class QuizQuestion {
	int ID;
	String Question;
	String choice1;
	String choice2;
	String choice3;
	String choice4;
	int correctAnswer;
	
	QuizQuestion(int ID, String q, String c1, String c2, String c3, String c4, int a) {
		this.ID = ID;
		this.Question = q;
		this.choice1 = c1;
		this.choice2 = c2;
		this.choice3 = c3;
		this.choice4 = c4;
		this.correctAnswer = a;
	}
	
	public static List<QuizQuestion> QuizQuestions() {
    List<QuizQuestion> QuizQuestionList = new ArrayList<>();
	
    QuizQuestionList.add(new QuizQuestion(1, "What is the value of x that gets printed?\n   int x = 27;\n   x %= 7;\n   System.out.println(x);", "20", "34", "3", "6", 4)); 
	QuizQuestionList.add(new QuizQuestion(2, "Fill in the blank:\n Scanner userInput = \t\t;", "System.in", "Scanner(System.in)", "new Scanner(System.in)", "new System.in", 3)); 
	QuizQuestionList.add(new QuizQuestion(3, "Within System.out.printf(), how does one add a tab?", "\\t", "spaces", "&nbsp", "%s", 1)); 
	QuizQuestionList.add(new QuizQuestion(4, "What is the output if age is 20 and country is Canada?\n   public static boolean canDrink(int age, String country) {\n      if ((country.equals(\"Canada\") && age >= 18) || (country.equals(\"United States\") && age >= 21)) { return true; }\n   return false;\n   }", "false", "true", "yes", "no", 2)); 
	QuizQuestionList.add(new QuizQuestion(5, "What is the value of x that gets printed?\n   int x = 64;\n   x = Math.sqrt(x);\n   System.out.println(x);", "16", "2", "64", "8", 4)); 
	QuizQuestionList.add(new QuizQuestion(6, "What is the last index of this array?\n   int[] array = new int[5];", "5", "6", "4", "1", 3)); 
	QuizQuestionList.add(new QuizQuestion(7, "Within System.out.printf(), %d is for?", "Integer", "String", "Float", "Char", 1)); 
	QuizQuestionList.add(new QuizQuestion(8, "Within System.out.printf(), how does one add a new line?", "&nbsp", "\\n", "<br>", "CR+LF", 2)); 
	QuizQuestionList.add(new QuizQuestion(9, "What is the value of x that gets printed?\n   int x = 11;\n   //x++;\n   x /= 2;\n   System.out.println(x);", "6", "5", "11", "24", 2)); 
	QuizQuestionList.add(new QuizQuestion(10, "What gets printed?\n   String[] fruits = {\"Apple\", \"Banana\", \"Mango\", \"Watermelon\", \"Plum\"};\n   System.out.print(fruits[1]);", "Banana", "Apple", "Plum", "Orange", 1)); 
	QuizQuestionList.add(new QuizQuestion(11, "What is a literal?", "user input", "a hard-coded value", "a number", "scanner", 2)); 
	QuizQuestionList.add(new QuizQuestion(12, "What is the value of x that gets printed?\n   int x = 5;\n   x *= 2;\n   x--;\n   System.out.println(x);", "6", "9", "10", "11", 2)); 
	QuizQuestionList.add(new QuizQuestion(13, "What method is run first?", "main()", "first()", "start()", "beginning()", 1)); 
	QuizQuestionList.add(new QuizQuestion(14, "What gets printed?\n   System.out.printf(\"Pi equals %.2f\", 3.1415);", "Pi equals 3.1415", "Pi equals 3.1400", "Pi equals 03.1415", "Pi equals 3.14", 4)); 
	QuizQuestionList.add(new QuizQuestion(15, "To declare a constant, what must be added before the type declaration?", "final", "const", "fixed", "readOnly", 1)); 
	QuizQuestionList.add(new QuizQuestion(16, "What is used below?\n   int x = (int)(8 * 3.14);", "implicit typing", "type conversion", "casting", "type forcing", 3)); 
	QuizQuestionList.add(new QuizQuestion(17, "What is the value of x that gets printed?\n   int x = 10;\n   x--;\n   x /= 2;\n   System.out.println(x);", "10", "9", "5", "4", 4)); 
	QuizQuestionList.add(new QuizQuestion(18, "What is the error in this code:\n   public static int divide(int x, int y) {\n      int result = x / y;\n   }", "method should be void", "method needs more parameters", "missing return statement", "separate result's declaration and assignment", 3)); 
	QuizQuestionList.add(new QuizQuestion(19, "What loop should be used if you want the code to run at least once before the condition is checked?", "while", "for each", "do", "for", 3)); 
	QuizQuestionList.add(new QuizQuestion(20, "To print text to the console on its own line, what function is used?", "System.out.print()", "System.out.println()", "System.out.printf()", "Console.out.println()", 2)); 
	QuizQuestionList.add(new QuizQuestion(21, "This loop will run how many times?\n   for (int i = 0;  i <= 100; i+=5) {\n      System.out.println(i);\n   }", "101", "100", "20", "21", 4)); 
	QuizQuestionList.add(new QuizQuestion(22, "What is printed?\n   int x = 8 / 2;\n   switch (x) {\n      default:\n         System.out.print(\"Apple\");\n      case 1: case 2:\n         System.out.print(\" pie\"); break;\n      case 3: case 4:\n         System.out.print(\" crumble\"); break;\n   }", "Apple crumble", "Apple", "Apple pie", "null", 1)); 
	QuizQuestionList.add(new QuizQuestion(23, "Which of these are an Object data type?", "char", "String", "int", "double", 2)); 
	QuizQuestionList.add(new QuizQuestion(24, "What gets printed when i = 5?\n   for (int i = 0;  i <= 100; i+=5) {\n      if (i == 5) { continue; }\n      System.out.println(i);\n   }", "5", "nothing", "2", "10", 2)); 
	QuizQuestionList.add(new QuizQuestion(25, "To print text to the console, what function is used?", "Console.write()", "Console.print()", "System.out.print()", "System.in()", 3)); 
	QuizQuestionList.add(new QuizQuestion(26, "When getting an integer from Scanner userInput = new Scanner(System.in);, what is used?", "userInput.nextLine();", "userInput.nextInt();", "userInput.next();", "userInput.nextDouble();", 2)); 
	QuizQuestionList.add(new QuizQuestion(27, "Solve the error in this code:\n   String x = \"18\";\n   int y = (int)x;\n   y /= 2;\n   System.out.print(y); // should print 9", "Line 2: int y = Integer.parseInt(x);", "Line 3: y = y / 2;", "Line 4: System.out.println(y);", "Line 4: System.out.print(x);", 1)); 
	QuizQuestionList.add(new QuizQuestion(28, "What is the hexadecimal number 0xA8 in decimal?", "118", "108", "168", "8", 3)); 
	QuizQuestionList.add(new QuizQuestion(29, "What gets printed?\n   String x = \"Hello World\";\n   System.out.println(x.charAt(4));", "space", "l", "o", "W", 3)); 
	QuizQuestionList.add(new QuizQuestion(30, "What variable type can store the number 3.14?", "int", "char", "byte", "double", 4)); 
	QuizQuestionList.add(new QuizQuestion(31, "Which variable type cannot store numbers outside of -127 to 127?", "int", "long", "short", "byte", 4)); 
	QuizQuestionList.add(new QuizQuestion(32, "What gets printed?\n   String x = \"Hello World\";\n   System.out.println(x.indexOf(\"W\"));", "6", "7", "5", "8", 1)); 
	QuizQuestionList.add(new QuizQuestion(33, "Which is the AND operator?", "||", "+", "AND", "&&", 4)); 
	QuizQuestionList.add(new QuizQuestion(34, "What is the value of x that gets printed?\n   double y = 3.14;\n   int x = (int)y;\n   System.out.println(x);", "1", "0", "3", "4", 3)); 
	QuizQuestionList.add(new QuizQuestion(35, "What is the binary number 0b11110110 in decimal?", "-10", "-6", "246", "6", 1)); 
	QuizQuestionList.add(new QuizQuestion(36, "What is the binary number 0b01010110 in decimal?", "86", "21", "38", "85", 1)); 

	return QuizQuestionList;
	}
}

