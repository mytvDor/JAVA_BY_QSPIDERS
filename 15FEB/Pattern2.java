import java.util.Scanner;
class Pattern2 {
   public static void main (String [] args){
   Scanner sc = new Scanner(System.in);


int n = 4;
for(int i=0; i<n ; i++){
for(int j=0; j<=(n*2) ; j++){

if(j<=i || (n-i)*2<j-1)
System.out.print("*");
else
System.out.print(" ");

}
System.out.println("");


}


 }
}