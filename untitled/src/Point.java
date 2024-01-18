public class Point {
    private int x;
    private int y;

    // First constructor (no-args constructor)
    public Point() {
        // Default values for x and y
        this.x = 0;
        this.y = 0;
    }

    // Second constructor with parameters
    public Point(int x, int y) {
        // Initialize x and y
        this.x = x;
        this.y = y;
    }

    // Getter for x
    public int getX() {
        return x;
    }

    // Getter for y
    public int getY() {
        return y;
    }

    // Setter for x
    public void setX(int x) {
        this.x = x;
    }

    // Setter for y
    public void setY(int y) {
        this.y = y;
    }

    // Method to calculate distance between this Point and Point (0, 0)
    public double distance() {
        return Math.sqrt(x * x + y * y);
    }

    // Method to calculate distance between this Point and another Point
    public double distance(Point anotherPoint) {
        int xDifference = this.x - anotherPoint.getX();
        int yDifference = this.y - anotherPoint.getY();
        return Math.sqrt(xDifference * xDifference + yDifference * yDifference);
    }

    // Method to calculate distance between this Point and Point (x, y)
    public double distance(int x, int y) {
        int xDifference = this.x - x;
        int yDifference = this.y - y;
        return Math.sqrt(xDifference * xDifference + yDifference * yDifference);
    }
}