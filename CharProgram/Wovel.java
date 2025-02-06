import java.util.Scanner;
class Wovel {
   public static void main (String [] args){
   Scanner sc = new Scanner(System.in);

     char ch= sc.next().charAt(0);

   String op = (ch=='a'|| ch=='e'|| ch=='i'|| ch=='o' || ch=='u')?("Wovel"):("Constants");

System.out.println(op);

   }



}