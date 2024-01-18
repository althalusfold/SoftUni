
package week4;

public class Student
{
  String name;
  int age;
  char gender;
  String email;
  Boolean eligibility;
  String courceName;
  
  
  public Student(String name1, int age1, char gend,String email1,boolean elig)
  {
      name = name1;
      age = age1;
      gender = gend;          
      email = email1;      
      eligibility= elig;
  }  
  
  public void printStudentDetails()
  {                       
      System.out.println("Name is: " + name);
      System.out.println("Age is: " + age);
      System.out.println("Gender of the student, for Male - M / for Female - F: " + gender); 
      System.out.println("Student is eligible to study: " + eligibility);
      System.out.println("Student email is: " + email);       
  } 
  public void addCourceName(String cource)
  {
      courceName = cource;
      System.out.println("Student cource is: " + courceName); 
      System.out.println("");
  }
}