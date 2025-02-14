import java.util.Scanner;
class ArmStrong {
   public static void main (String [] args){
   Scanner sc = new Scanner(System.in);

System.out.println("ENTER THE NUM");
int num = sc.nextInt();

int dup = num;
int sum = 0 , lent = 0 ;
for(int i=num; i <0;i/=10){
lent++;
}

while(num>0){
int rem = num%10;
int pow=1;

for(int i=1; i<lent;i++)

pow+=rem;
sum+=pow;
num/=10;

}

System.out.println(dup==sum?dup+" is Armstrong number " : dup+ " is not an amstrong number ");


 }
}