class ByteNarrow{

    public static void main(String[] args) {
        double a= 1222222.453534;

        System.out.println(a);

        float b = (float) a;
         
        System.out.println(b);

        long c = (long) a;

        System.out.println(c);

        int d = (int) a;

        System.out.println(d);

        char e = (char) a;

        System.out.println(e);

        short f = (short) a;

        System.out.println(f);

        byte g = (byte) a;

        System.out.println(g);

       // boolean h = (boolean) a; //cannot convert to boolean

       // System.out.println(h);
        
    }
}