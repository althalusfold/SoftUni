
package week4;

public class Week4
{

    public static void main(String[] args)
    {
       Student student1 = new Student("Hristo Petrov ",28,'M'," petrov@roehampton.ac.uk ",true);
       Student student2 = new Student("Natasha Tasheva ",34,'F'," tashevan@roehampton.ac.uk ",true);
       Student student3 = new Student("Nasteho Isaak ",30,'F'," isaakn@roehampton.ac.uk ",true);
       student1.printStudentDetails();
       student1.addCourceName("ComputerSscience");
       student2.printStudentDetails();
       student2.addCourceName("Engineering");
       student3.printStudentDetails();
       student3.addCourceName("Tech Support");
    }    
}
