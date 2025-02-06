class MySwapNoTemp
{

public static void main(String [] main)
{

int a = 10;
int b= 20;

System.out.println("a: "+a);
System.out.println("b: "+b);

a=b+a;
b=a-b;
a=a-b;
System.out.println();

System.out.println("a: "+a);
System.out.println("b: "+b);



}
}