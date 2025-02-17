import java.util.Scanner;
class Pattern9 {
   public static void main (String [] args){
   Scanner sc = new Scanner(System.in);


int n = 5;
int a=1;
char b= 'a';
for(int i=1; i<=n ; i++){

for(int j=1; j<=i ; j++){

if(i%2!=0){
System.out.print(b++ + " ");

}else{
System.out.print(a++ + " ");

}

}
System.out.println("");


}


 }
}