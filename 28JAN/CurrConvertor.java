import java.util.Scanner;
class CurrConvertor {
   public static void main (String [] args){
   Scanner sc = new Scanner(System.in);

System.out.println("Enter teh amount in INR");

float inr = sc.nextFloat();

System.out.println("\n Choose the currency \n 1.USD \n 2.EUR \n 3.GBP \n 4.PKR \n 5.KWD \n\n");

String curr=sc.next().toUpperCase();

float conv=0.0f;

if(curr.equals("USD")){

conv = inr/86.56f;

System.out.println(inr + " INR is equals to " + conv +" USD");

}else if(curr.equals("EUR")){

conv = inr/90.29f;

System.out.println(inr + " INR is equals to " + conv +" EUR");

}else if(curr.equals("GBP")){

conv = inr/107.68f;

System.out.println(inr + " INR is equals to " + conv +" GBP");

}else if(curr.equals("PKR")){

conv = inr/0.31f;

System.out.println(inr + " INR is equals to " + conv+ " PKR");

}if(curr.equals("KWD")){

conv = inr/280.75f;

System.out.println(inr + " INR is equals to " + conv +" KWD");

}else{

System.out.println("wrong input");
}




}
}