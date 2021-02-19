package javaAssignments;

/*
 * class PairofCoordinates obtains smaller distance sorts earlier in sequence
 * 
 * */

class PairofCoordinates implements Comparable<PairofCoordinates>
{
   public int squaredDistance = 0;
   public double distance = 0;
   public Coordinate firstCoordinate = null;
   public Coordinate secondCoordinate = null;   
   
   PairofCoordinates(Coordinate a, Coordinate b) 
   {
       this.firstCoordinate = a;
       this.secondCoordinate = b;
       this.squaredDistance = Coordinate.getSquaredDistance(this.firstCoordinate, this.secondCoordinate);
       this.distance = Math.sqrt(squaredDistance);
   }
   
   public int compareTo(PairofCoordinates other) 
   {
      return this.squaredDistance - other.squaredDistance;
   }
} // end class PairofCoordinates
