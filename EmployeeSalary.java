import java.util.Scanner;

class EmployeeSalary {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter how much hours employee works for week? ");
    Double workingHrs = input.nextDouble();
    while(workingHrs <= 0){
      System.out.println("Please enter a positive input");
      workingHrs = input.nextDouble();
    }
    System.out.println("Enter how much a Employee makes for per hour");
    Double earningPerHour = input.nextDouble();
    while(earningPerHour <= 0){
       System.out.println("Please enter a positive input");
      earningPerHour = input.nextDouble();
    }
    Double employeeSalaryYearly = earningPerHour * workingHrs * 30 * 12;
    System.out.println("Employee yearly salary : "+employeeSalaryYearly);
  }
}