import java.util.Scanner;
class Discount {
   public static void main (String [] args){
   Scanner sc = new Scanner(System.in);

System.out.println("Enter total bill amount");
double amount= sc.nextDouble();

if(amount>2000){

amount-=amount/5;

System.out.println("pay only "+ amount + " Rs. (20% discount added)");

}
    
System.out.println("pay Rs."+ amount);



}
}