import java.util.Scanner;

class OddEvenWithoutMod 
{
public static void main(String [] args){

  Scanner sc = new Scanner(System.in);


System.out.println("Enter the no.");

int num = sc.nextInt();


//without mod
 if ((num & 1) == 0) {
            System.out.println(num + " is even.");
        } else {
            System.out.println(num + " is odd.");
        }
System.out.println((num/2)*2==num);
System.out.println();
System.out.println(num/2==num/2.0);


//with mod

System.out.println(num%2==0);


  }

}