/** Represents an rectangle.
 * @author Vernon Jackson Smith
 * TODO: Is this an abstract or concrete method? Is it a parent or child class? 
 * Is it public or private?
 */
/*TODO*/ class Rectangle extends Shape/*TODO*/ {

    private double length, height;

    Rectangle(Point upperLeft, double length, double height) {
        this.position = upperLeft;
        this.length = length;
        this.height = height;
    }

    @Override
    public double computeArea() {
        return 0.0;
    }

    @Override
    public String getPerimeter(String string) {
        return null;
    }

    @Override
    public String getType(String string) {
        return null;
    }

    //TODO: What methods must be implemented? Implement them.


}