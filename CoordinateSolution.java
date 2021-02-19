package javaAssignments;

import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Random;

/*
 * class CoordinateSolution inputs P and m, and returns the distances between the m closest pairs of points.
 * 
 * */

class CoordinateSolution
{
        public static void main (String[] args) throws java.lang.Exception
        {   System.out.println("Enter number of coordinate points and input their coordinates:");   
            Scanner sc = new Scanner(System.in);
            Random random = new Random();
            int number = sc.nextInt();    
            Coordinate P[] = new Coordinate[number];
        
                for(int i = 0 ; i < number ; i ++)
                {
                    int xCoordinate = random.nextInt(1000);
                    int yCoordinate = random.nextInt(1000);
                    P[i] = new Coordinate(xCoordinate, yCoordinate);
                    //System.out.println(P[i].toString());
                }
                
                System.out.println("\nEnter value of m:");
                int m = sc.nextInt();
                ArrayList<PairofCoordinates> pairs = new ArrayList<PairofCoordinates>();
                //O(n^2) performance driver (500000^2)
                for (int i = 0; i < number; i ++)
                {
                    for(int j = i+1; j < number; j ++)
                    {
                       pairs.add(new PairofCoordinates(P[i], P[j])); 
                    }
                }
                //sort is O(nlogn)
                Collections.sort(pairs);     
                for(int i = 0; i < m ; i ++)
                {
                    System.out.println(String.format("%s , %s , %s", pairs.get(i).firstCoordinate.toString(), pairs.get(i).secondCoordinate.toString(), pairs.get(i).distance));
                }
                
        }
}
