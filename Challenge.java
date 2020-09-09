import java.util.Scanner;

public class Challenge {

    public static void main(String args[]) {
        String question = "Who is Supreme Personality of Godhead?";
        String choiceOne = "Lord Krsna";
        String choiceTwo = "Lord Siva";
        String choiceThree = "Lord Brahma";

        String correctAnswer = choiceOne;

        // Write a print statement asking the question
        System.out.println(question);
        System.out.println("Choose correct option from following");
        // Write a print statement giving the answer choices
        System.out.println(choiceOne+"\n"+choiceTwo+"\n"+choiceThree);

        // Have the user input an answer
        System.out.println("Enter your answer 1,2,3");
        // Retrieve the user's input
        Scanner input = new Scanner(System.in);
        int userInput = input.nextInt();

        // If the user's input matches the correctAnswer...
        // then the user is correct and we want to print out a congrats message to the user.
        
        if(userInput == 1){
          System.out.println("congrats!! You have Choosen the correct Answer");
        }

        // If the user's input does not match the correctAnswer...
        // then the user is incorrect and we want to print out a message saying that the user is incorrect as well as what the correct choice was.
        else {
          System.out.println("You have Choosen wrong answer");
        }
        System.out.println("Lord Krsna is Supreme Personality of Godhead");

    }

}
