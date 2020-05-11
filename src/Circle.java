/** Represents an circle.
 * @author Vernon Jackson Smith
 * TODO: Is this an abstract or concrete method? Is it a parent or child class? Is it public or private?
 */
/*TODO*/ class Circle extends Shape /*TODO*/ {

    private double radius;

    public Circle(Point center, double radius) {
        this.radius = radius;
        this.position = center;
    }

    @Override
    public double computeArea() {
        return 0;
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