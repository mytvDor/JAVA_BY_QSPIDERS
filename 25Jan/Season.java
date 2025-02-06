import java.util.Scanner;
class Season {
   public static void main (String [] args){
   Scanner sc = new Scanner(System.in);

System.out.println("Enter your month 3 letter");
     String rutu= sc.next().toUpperCase();





        String op = (rutu.equals("MAY") || rutu.equals("APR") || rutu.equals("MAR") || rutu.equals("FEB")) 
                    ? "Summer" 
                    : (rutu.equals("JUN") || rutu.equals("JUL") || rutu.equals("AUG") || rutu.equals("SEP")) 
                      ? "Rainy" 
                      : (rutu.equals("OCT") || rutu.equals("NOV") || rutu.equals("DEC") || rutu.equals("JAN")) 
                        ? "Winter" 
                        : "Wrong input";

System.out.println(op);




}
}