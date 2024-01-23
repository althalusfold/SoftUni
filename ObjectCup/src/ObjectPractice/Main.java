
package ObjectPractice;

public class Main
{   
    public static void main(String[] args)
    {
       Cup cup1 = new Cup("Transparent",250,"Glass");
       Cup cup2 = new Cup("Red and Black",200,"Ceramic");
       Cup cup3 = new Cup("Transparent-Blue",90.5,"Plastic");
       cup1.addDrink("Orange juice", 33.89);
       cup2.addDrink("Coffee", 70);
       cup3.addDrink("Water", 90);
              
       cup1.printObjectDetails();
       cup1.drink();       
       cup2.printObjectDetails();
       cup2.drink();
       cup3.printObjectDetails();
       cup3.drink();              
    }         
}
