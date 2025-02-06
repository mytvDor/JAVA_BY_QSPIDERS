import java.util.Scanner;
class Ramesh {
   public static void main (String [] args) throws InterruptedException{
   Scanner sc = new Scanner(System.in);
System.out.print("ENTER YOUR NAME : ");

String name = sc.next().toUpperCase();

for(int i=0;i<=name.length()-1;i++){

System.out.print(name.charAt(i));

Thread.sleep(2000);
}

}
}