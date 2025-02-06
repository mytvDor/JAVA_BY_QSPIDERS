import java.util.Scanner;
class NumFind {
   public static void main (String [] args){
   Scanner sc = new Scanner(System.in);

     int num= sc.nextInt();

    String op=((num%2==0)&&(num%5==0))?("HiTwoHiFive"):((num%2==0)?("Hi Two"):((num%5==0)?("Hi Five"):("")));

    System.out.println(op);

   }



}