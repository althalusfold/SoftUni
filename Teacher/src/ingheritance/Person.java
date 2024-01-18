
package ingheritance;

public class Person 
{
    String name;
    int age;
    char gender;
    
    public Person (String na, int ag, char gen)
    {
        name = na;
        age = ag;
        gender = gen;
    }
    public void printDetails()
    {
        System.out.println();
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }
}