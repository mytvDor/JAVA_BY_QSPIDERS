import java.util.Scanner;

class CircleAreaParam
{
  public static void main (String [] args)
   {

     Scanner sc = new Scanner(System.in);

     System.out.print("\n\tEnter the radius of circle (in cm): ");

     int radius = sc.nextInt();

     float pie = 22/7;

    double paramOfCircle= 2*pie*radius;

    double areaOfCircle = pie*radius*radius;

    System.out.println("\n\tArea of the circle is "+areaOfCircle);
    System.out.println("\n\tPrameter of the circle is "+paramOfCircle);



    sc.close();

  }

}