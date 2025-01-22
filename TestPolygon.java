public class TestPolygon {

    //*Main method to test constructing polygons and obtaining their measurements */
    public static void main(String[] args){

        RegularPolygon polygonA = new RegularPolygon() ;

        RegularPolygon polygonB = new RegularPolygon(6,4);

        RegularPolygon polygonC = new RegularPolygon(10,4,5.6,7.8) ;

        System.out.println("The perimeter for the first polygon is: "  + polygonA.getPerimeter() + " and the area is : " + polygonA.getArea()); 

        System.out.println("The perimeter for the second polygon is: " + polygonB.getPerimeter() + " and the area is: " + polygonB.getArea());

        System.out.println("The perimeter for the third polygon is: " + polygonC.getPerimeter() + " and the area is: "+ polygonC.getArea());


    }
    
}

class RegularPolygon {

    private int sides = 3 ;

    private double sideLength = 1 ;

    private double x = 0 ;

    private double y = 0;

    //*Constructs a polygon with the default values */
    public RegularPolygon() {

    }
    //*Constructs a polygon with specified sides, length, x coordinate, and y-coordinate */
    public RegularPolygon(int newSides,double newsideLength, double newX, double newY ){
        sides = newSides ; 

        sideLength = newsideLength; 

        x = newX ;

        y = newY ;
    }

    //*Constructs a polygon with specified sides and length */
    public RegularPolygon(int newSides, double newSideLength) {
        sides = newSides ; 

        sideLength = newSideLength; 

        x = 0 ;

        y = 0; 
    }
    //*Returns the number of sides in a polygon */
    public int getSides() {
        return sides ;
    }

    //*Returns the lengths of the sides in a polygon */
    public double getSideLength() {
        return sideLength ;
    }

    //*Returns the starting x-coordinate of the polygon */
    public double getX() {
        return x;
    }

    //*Returns the starting y-coordinate of the polygon */
    public double getY() {
        return y;
    }

    //*Sets a new amount of sides with a minimum of 3 */
    public void setSides(int newSides) {
        sides = (newSides >=3) ? newSides : 3 ;
    }

    //*Sets a new length of sides with a minimum of 1*/
    public void setSideLength(double newLength) {
        sideLength = (newLength > 1) ? newLength : 1;
    }

    //*sets a new starting x-coordinate */
    public void setX(double newX) {
        x = newX ;
    }

    //*Sets a new starting y-coordinate */
    public void setY(double newY) {

        y = newY ;
    }

    //*Calculates and returns the perimeter of a polygon */
    public double getPerimeter() {

        double perimeter = sides * sideLength ;
        
        return perimeter ;
    }

    //*Calculates and returns the area of a polygon */
    public double getArea() {
        int s = sides * sides ;

        double pie = Math.PI ; 

        double n = pie / sides ; //converts to radians

        double numerator = sideLength * s ; 

        double denominator = 4 * Math.tan(n) ;

        double area = numerator / denominator ;

        return area ;
    }




}

