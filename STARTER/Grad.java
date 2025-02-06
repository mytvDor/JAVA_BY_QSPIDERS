import java.util.Scanner;

class Grad 
{
public static void main(String [] args){

  Scanner sc = new Scanner(System.in);


System.out.println("Enter the subtotal");

float subtotal = sc.nextFloat();
System.out.println("Enter the tip");

float tip = sc.nextFloat();

double total = subtotal*(tip/100);

System.out.println(total+subtotal);




  }

}