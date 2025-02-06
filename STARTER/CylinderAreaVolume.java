import java.util.Scanner;

class CylinderAreaVolume
{
  public static void main (String [] args)
   {

     Scanner sc = new Scanner(System.in);

     System.out.print("\n\tEnter the radius of circle (in cm): ");

     int radius = sc.nextInt();

      System.out.print("\n\tEnter the height of circle (in cm): ");

     int height = sc.nextInt();

     //float pie = 22/7;

    double areaOfCylinder= 3.14*radius*radius;

    double volOfCylinder = areaOfCylinder*height;

    System.out.println("\n\tArea of the cylinder is "+areaOfCylinder);
    System.out.println("\n\tPrameter of the cylinder is "+volOfCylinder);



    sc.close();

  }

}