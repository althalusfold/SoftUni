public class Cylinder extends Circle {
    private double height;

    // Constructor with two parameters (radius and height)
    public Cylinder(double radius, double height) {
        // Call the constructor of the parent class (Circle) with the radius
        super(radius);

        // Initialize the height field, setting it to 0 if the provided height is less than 0
        this.height = (height < 0) ? 0 : height;
    }

    // Method to get the value of the height field
    public double getHeight() {
        return height;
    }

    // Method to calculate and return the volume of the cylinder
    public double getVolume() {
        // Use the getArea method from the parent class (Circle) and multiply it by the height
        return super.getArea() * height;
    }

    // Other methods and properties of the Cylinder class...
}


//2. Write a class with the name Cylinder that extends Circle class. The class needs one field (instance variable) with name height of type double.
//
//The class needs to have one constructor with two parameters radius and height both of type double. It needs to call parent constructor and initialize a height field.
//
//In case the height parameter is less than 0 it needs to set the height field value to 0.
//
//Write the following methods (instance methods):
//
//Method named getHeight without any parameters, it needs to return the value of height field.
//
//Method named getVolume without any parameters, it needs to return the calculated volume. To calculate volume multiply the area with height.