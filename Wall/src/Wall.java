public class Wall {
    private double width;
    private double height;

    // First constructor (no-args constructor)
    public Wall() {
        // Default values for width and height
        this.width = 0.0;
        this.height = 0.0;
    }

    // Second constructor with parameters
    public Wall(double width, double height) {
        // Initialize width, ensuring it's not less than 0
        this.width = (width < 0) ? 0 : width;
        // Initialize height, ensuring it's not less than 0
        this.height = (height < 0) ? 0 : height;
    }

    // Getter for width
    public double getWidth() {
        return width;
    }

    // Getter for height
    public double getHeight() {
        return height;
    }

    // Setter for width
    public void setWidth(double width) {
        // Set width, ensuring it's not less than 0
        this.width = (width < 0) ? 0 : width;
    }

    // Setter for height
    public void setHeight(double height) {
        // Set height, ensuring it's not less than 0
        this.height = (height < 0) ? 0 : height;
    }

    // Method to calculate and return the area of the wall
    public double getArea() {
        return width * height;
    }
}