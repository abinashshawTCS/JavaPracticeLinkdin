import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    String studentFirstName = "Kyala";
		String studentLastName = "Hansson";
		Double studentGPA = 3.45;
		
		System.out.println(studentFirstName + " " + studentLastName + " has a GPA of "+ studentGPA);
		System.out.println("Enter the number you want to Upadated to ");
		Scanner input = new Scanner(System.in);
		studentGPA = input.nextDouble();
		System.out.println(studentFirstName + " " + studentLastName + " has now a GPA of "+ studentGPA);
  }
}