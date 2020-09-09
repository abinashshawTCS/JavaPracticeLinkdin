import java.util.Scanner;

class SalaryUsingFunction {
  public static double salaryCalculation(double hoursPerWeek, double moneyPerHour, int totalVacationDays){
    if(hoursPerWeek < 0){
      return -1;
    }
    if(moneyPerHour < 0){
      return -1;
    }
    double weeklySalary = hoursPerWeek * moneyPerHour;
    double employeeSalary = weeklySalary * 52;
    return employeeSalary - totalVacationDays*9*moneyPerHour;
  }

  public static void main(String[] args){
    double employeeSalary = salaryCalculation(45 , 150, 8);
    System.out.println(employeeSalary);
  }
}