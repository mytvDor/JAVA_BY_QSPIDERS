import java.util.Scanner;
class CharAscii {
   public static void main (String [] args){
   Scanner sc = new Scanner(System.in);

     char ch= sc.next().charAt(0);

    System.out.println((ch>='A' && ch<='Z')|| (ch>='a' && ch<='b'))?((ch>='A' && ch<='Z')?(ch +" is an UpperCase char"):(ch+" is a LowerCase char")):((ch>='0'&& ch<='9')?(ch+" is digit"):(ch+" is special character")));



   }



}