 class Student {
  String firstName;
  String lastName;
  double GPA;
  int EOP;
  int roll;

  public Student(String firstName, String lastName, double GPA, int EOP, int roll){
    this.firstName = firstName;
    this.lastName = lastName;
    this.GPA = GPA;
    this.EOP = EOP;
    this.roll = roll;
  }

  public int incrementEOP(){
    return ++this.EOP;
  }
}