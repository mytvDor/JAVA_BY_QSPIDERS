import java.util.Scanner;
class ISBNnumber {
   public static void main (String [] args){
   Scanner sc = new Scanner(System.in);

long num = 13590609772l;

int sum = 0;

for(long i = num, j=1; i>0 ; i/=10 , j++){

long rem = i%10;

sum += (rem * j);


}
if(sum%11==0) System.out.println(num + " is valid ISBN number");

else System.out.println(num + " is not valid ISBN number");






 }
}