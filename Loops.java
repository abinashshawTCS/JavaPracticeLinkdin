import java.util.Scanner;
class Loops {

  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    boolean onRepeat = true;
    while(onRepeat){
      System.out.println("Playing current song");
      System.out.println("if you want to put the song off repeat input yes");
      String userInput = input.next();
      if(userInput.equals("yes")) {
        onRepeat = false;
      }
    }

    System.out.println("Playing next song");
  }
}
