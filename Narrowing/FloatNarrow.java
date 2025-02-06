class FloatNarrow{

    public static void main(String[] args) {
        float a= 1222222.45f;

        System.out.println(a);

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