Programming Project 1 involves constructing an algorithm for finding the closest pairs of points in P. Your algorithm inputs are P and m. And we are to return the distance between the m closest pairs of points, including x and y coordinates. JDT compiler was used and the IDE is Eclipse. 


package javaAssignments;

/*
 * class Coordinate gets and sets coordinate points, and gets the squared value of distance between points.
 * 
 * */

class Coordinate
{
    public int xCoordinate = 0; // assuming x coordinate is an int
    public int yCoordinate = 0; // assuming y coordinate is an int
    
    Coordinate(int x, int y)
    {
        this.xCoordinate = x; // coordinate of x
        this.yCoordinate = y; // coordinate of y
    }
    
    // getDistance returns distance value
    public static double getDistance(int v) 
    {
        return Math.sqrt(v);
    }
    
    // getSquaredDistance gets euclidean distance between points which is 
    // the change in x squared - change in y squared
    public static int getSquaredDistance(Coordinate a, Coordinate b)
    {
        int distanceX = (a.xCoordinate - b.xCoordinate); 
        int distanceY = (a.yCoordinate - b.yCoordinate); 
        return distanceX*distanceX + distanceY*distanceY;
    }
    
    // returns a String representation of x and y coordinates
    public String toString () 
    {
        return String.format("{%s, %s}", this.xCoordinate, this.yCoordinate);
    }
} // end class Coordinate
