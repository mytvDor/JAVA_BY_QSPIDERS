public class SubtractionOprExample {
    public static void main(String[] args) {
        byte byte1 = 20;
        byte byte2 = 10;
        int byteDiff = byte1 - byte2;
        System.out.println("byte - byte: " + byteDiff);

        short short1 = 1500;
        short short2 = 800;
        int shortDiff = short1 - short2;
        System.out.println("short - short: " + shortDiff);

        int int1 = 100;
        int int2 = 50;
        int intDiff = int1 - int2;
        System.out.println("int - int: " + intDiff);

        long long1 = 1000L;
        long long2 = 500L;
        long longDiff = long1 - long2;
        System.out.println("long - long: " + longDiff);

        float float1 = 10.5f;
        float float2 = 3.2f;
        float floatDiff = float1 - float2;
        System.out.println("float - float: " + floatDiff);

        double double1 = 12345.67;
        double double2 = 7890.12;
        double doubleDiff = double1 - double2;
        System.out.println("double - double: " + doubleDiff);

        char char1 = 'Z';
        char char2 = 'A';
        int charDiff = char1 - char2;
        System.out.println("char - char: " + charDiff);
    }
}
