class ByteConv
{
   public static void main (String [] args)
   {
    
    byte a=12;
    System.out.println("byte :"+a);

    short b=a;
    System.out.println("short :"+b);

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