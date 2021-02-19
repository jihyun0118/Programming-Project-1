package javaAssignments;

/*
 * class Coordinate gets and sets coordinate points, and gets the squared value of distance between points.
 * 
 * */

public class Coordinate
{
    public int xCoordinate = 0; // assuming x coordinate is an int
    public int yCoordinate = 0; // assuming y coordinate is an int
    
    Coordinate(int x, int y)
    {
        this.xCoordinate = x; // coordinate of x
        this.yCoordinate = y; // coordinate of y
    }
    
    public static int getSquaredDistance(Coordinate a, Coordinate b)
    {
       int deltaX = (a.xCoordinate - b.xCoordinate); 
       int deltaY = (a.yCoordinate - b.yCoordinate);
       int distanceSquared = deltaX*deltaX + deltaY*deltaY;
       return distanceSquared;
    }

    public static double getDistance(Coordinate a, Coordinate b)
    {
        return Math.sqrt(getSquaredDistance(a, b));
    }
    
    // returns a String representation of x and y coordinates
    public String toString () 
    {
        return String.format("{%s, %s}", this.xCoordinate, this.yCoordinate);
    }
}
