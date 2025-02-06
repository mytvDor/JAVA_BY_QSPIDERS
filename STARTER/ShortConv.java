class ShortConv
{
   public static void main (String [] args)
   {
    
 

    short a=34;
    System.out.println("short :"+a);

   // char c=a;
   // System.out.println("char :"+c); // possible lossy conversion from byte to char

    int d=a;
    System.out.println("int :"+d);

   long e=a;
   System.out.println("Long :"+e);  


    float f=a;
    System.out.println("float :"+f);

    double g=a;
    System.out.println("double :"+g);


   // boolean h=a;
   // System.out.println(h); //incompatible types: byte cannot be converted to boolean




   }


}