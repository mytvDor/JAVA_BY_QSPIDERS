import java.util.Scanner;
class Pattern1 {
   public static void main (String [] args){
   Scanner sc = new Scanner(System.in);


int n = 4;

for(int i=1;i<=n;i++){
for(int j=1;j<=i;j++){
if(i==j){
System.out.print(i-1);

}else{
System.out.print(i+j);

}
}
System.out.println();

}



 }
}