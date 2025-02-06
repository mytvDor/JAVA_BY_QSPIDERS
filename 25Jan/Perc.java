import java.util.Scanner;
class Perc {
   public static void main (String [] args){
   Scanner sc = new Scanner(System.in);

System.out.println("Enter your marks out of 600");
     int num= sc.nextInt();


   float perc = num/6;



String op = (perc>35)?((perc>60)?((perc>75)?("A"):("B")):("c")):("fail");

    System.out.println( op);

   }



}