package MiniProject;
import java.util.Scanner;

public class Quiz {
    static String ANSI_RESET = "\u001B[0m";
    static String ANSI_GREEN = "\u001B[32;1m";
    static String ANSI_RED = "\u001B[31;1m";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;
        System.out.print("Enter your name: ");
        String playerName = scanner.nextLine();

        System.out.print("Enter the quiz date: ");
        String quizDate = scanner.nextLine();

        System.out.println("\nWelcome🤝, " + playerName + "🌟! Let's Start The Quiz💥!\n");
        System.out.println(ANSI_RED + "Instructions📢: \n"+ANSI_RESET);
        System.out.println(ANSI_GREEN+"✨There are 3 questions, and each question carries 1 mark.\n✨Choose only one option for each question.\n✨To pass, you need to score at least 2 out of 3 marks.\n"+ANSI_RESET);

        // Question 1
        System.out.println("\nQuestion 1: Who invented Java Programming?");
        System.out.println("A) Guido van Rossum");
        System.out.println("B) James Gosling");
        System.out.println("C) Dennis Ritchie");
        System.out.println("D) Bjarne Stroustrup");

        char choice1;
        do {
            System.out.print(ANSI_GREEN+"Enter your Option: "+ANSI_RESET);
            choice1 = scanner.nextLine().toLowerCase().charAt(0);
            if (choice1 == 'b') {
                score++;
            } else if (choice1 != 'a' && choice1 != 'b' && choice1 != 'c' && choice1 != 'd') {
                System.out.println(ANSI_RED+"Invalid Option🚫‼ Please enter A, B, C or D."+ANSI_RESET);
            }
        } while (choice1 != 'a' && choice1 != 'b' && choice1 != 'c' && choice1 != 'd');

        // Question 2
        System.out.println("\nQuestion 2: Which of these cannot be used for a variable name in Java?");
        System.out.println("A) identifier&keyword");
        System.out.println("B) identifier");
        System.out.println("C) keyword");
        System.out.println("D) none of the mentioned");

        char choice2;
        do {
            System.out.print(ANSI_GREEN+"Enter your Option: "+ANSI_RESET);
            choice2 = scanner.nextLine().toLowerCase().charAt(0);
            if (choice2 == 'c') {
                score++;
            } else if (choice2 != 'a' && choice2 != 'b' && choice2 != 'c' && choice2 != 'd') {
                System.out.println(ANSI_RED+"Invalid Option🚫‼ Please enter A, B, C or D."+ANSI_RESET);
            }
        } while (choice2 != 'a' && choice2 != 'b' && choice2 != 'c' && choice2 != 'd');
        
        // Question 3
        System.out.println("\nQuestion 3: Which one of the following is not a Java feature?");
        System.out.println("A) Object-oriented");
        System.out.println("B) Use of pointers");
        System.out.println("C) Portable");
        System.out.println("D) Dynamic and Extensible");

        char choice3;
        do {
            System.out.print(ANSI_GREEN+"Enter your Option: "+ANSI_RESET);
            choice3 = scanner.nextLine().toLowerCase().charAt(0);
            if (choice3 == 'b') {
                score++;
            } else if (choice3 != 'a' && choice3 != 'b' && choice3 != 'c' && choice3 != 'd') {
                System.out.println(ANSI_RED+"Invalid Option🚫‼ Please enter A, B, C or D."+ANSI_RESET);
            }
        } while (choice3 != 'a' && choice3 != 'b' && choice3 != 'c' && choice3 != 'd');

        // Quiz summary
        System.out.println("\u001B[3m"+"\nQuiz completed🎉! Thank You❣!\n"+"\u001B[0m");
        System.out.print("Result Loading.");
        for(int i =0;i<=10;i++) {
        	System.out.print(".");
        	try {
        		Thread.sleep(1000);
        	}catch(Exception e) {}
        }
        System.out.println("\u001B[43m"+"\n*****************************************************"+"\u001B[0m");
        System.out.println("Name: " +ANSI_GREEN+ playerName+ANSI_RESET);
        System.out.println("Date: " +ANSI_GREEN+ quizDate+ANSI_RESET);
        System.out.println("Your score: "+ANSI_GREEN + score + "/3"+ANSI_RESET);
        
     // Determine pass or fail
        if (score >= 2) {
            System.out.println("Result: " + ANSI_GREEN + "✔Pass" + ANSI_RESET);
        } else {
            System.out.println("Result: " + ANSI_RED + "❌Fail" + ANSI_RESET);
        }
        System.out.println("\u001B[43m"+"*****************************************************"+"\u001B[0m");

        // Detailed Report
        System.out.println(ANSI_RED+"\nDetailed Report📋:\n"+ANSI_RESET);

        
        System.out.println("Question 1: Who invented Java Programming?");
        System.out.println("A) Guido van Rossum");
        System.out.println("B) James Gosling");
        System.out.println("C) Dennis Ritchie");
        System.out.println("D) Bjarne Stroustrup");
        System.out.println("Your Answer: " + choice1 + (choice1 == 'b' ? ANSI_GREEN + "(Correct)" + ANSI_RESET : ANSI_RED + "(Incorrect)" + ANSI_RESET) );
        System.out.println("Correct Answer: " + ANSI_GREEN + "B" + ANSI_RESET);
        
        
        System.out.println("\nQuestion 2: Which of these cannot be used for a variable name in Java?");
        System.out.println("A) identifier&keyword");
        System.out.println("B) identifier");
        System.out.println("C) keyword");
        System.out.println("D) none of the mentioned");
        System.out.println("Your Answer: " + choice2 + (choice2 == 'c' ? ANSI_GREEN + "(Correct)" + ANSI_RESET : ANSI_RED + "(Incorrect)" + ANSI_RESET));
        System.out.println("Correct Answer: " + ANSI_GREEN + "C" + ANSI_RESET);
        
        
        System.out.println("\nQuestion 3: Which one of the following is not a Java feature?");
        System.out.println("A) Object-oriented");
        System.out.println("B) Use of pointers");
        System.out.println("C) Portable");
        System.out.println("D) Dynamic and Extensible");
        System.out.println("Your Answer: " + choice3 + (choice3 == 'b' ? ANSI_GREEN + "(Correct)" + ANSI_RESET : ANSI_RED + "(Incorrect)" + ANSI_RESET));
        System.out.println("Correct Answer: " + ANSI_GREEN + "B" + ANSI_RESET);
        
        scanner.close();
    }
}
