import java.util.Scanner;

class RectAreaParam
{
  public static void main (String [] args)
   {

     Scanner sc = new Scanner(System.in);

     System.out.print("\n\tEnter the length of rectangle (in cm): ");

     int length = sc.nextInt();
     
     System.out.print("\n\tEnter the width of rectangle (in cm): ");

     int width = sc.nextInt();


    double paramOfRect= 2*(length+width);

    double areaOfRect = length*width;

    System.out.println("\n\tArea of the rectangle is "+areaOfRect);
    System.out.println("\n\tPrameter of the rectangle is "+paramOfRect);



    sc.close();

  }

}