/** Represents an shape.
 * @author Vernon Jackson Smith
 * TODO: Is this an abstract or concrete method? Is it a parent or child class? Is it public or private?
 */
/*TODO*/ abstract class Shape /*TODO*/ {

    protected Point position;
    private static int numShapes = 0;
    private static int id;

    //TODO: Create a getter and setter for member fields

    /**
     * This method computes the area
     * @return double. Returns the area of the shape.
     */
    abstract public double computeArea();

    /**
     * TODO
     * getPerimeter Abstract method
     * @return String for the object called.
     */
    abstract public String getPerimeter(String string);

    /**
     * TODO
     * getType Abstract method
     * @return String for the object called.
     */
    abstract public String getType(String string);


}