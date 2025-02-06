public class CharNarrow {

    public static void main(String[] args) {
        char a= 'v';

        System.out.println(a);

        short f = (short) a;

        System.out.println(f);

        byte g = (byte) a;

        System.out.println(g);

       // boolean h = (boolean) a; //cannot convert to boolean

       // System.out.println(h);
        
    }
}
