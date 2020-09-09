import java.util.Scanner;

class Conditional {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.println("Enter the number in between 0-10");
    int inputtedNum = input.nextInt();

    if(inputtedNum<5){
      System.out.println("Your friend will make you happy");
    }
    else{
      System.out.println("Your shoe selecetion will make you happy today");
    }

  }
}