import java.util.Scanner;
class NumberExample2 {
   public static void main (String [] args){
   Scanner sc = new Scanner(System.in);

System.out.println("ENTER THE NUM");
int num = sc.nextInt();

int dup = num;
int sum = 0 ;

while(num>0){

int rem = num%10;
if(rem%2==0)
sum+=rem;
num/=10;


}

System.out.println(sum);
System.out.println(dup);


 }
}