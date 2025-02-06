public class AdditionOprExample {
    public static void main(String[] args) {
        // byte + byte
        byte byte1 = 10;
		byte byte2 = 10;
        int byteSum = byte1 + byte2; 
        System.out.println("byte + byte: " + byteSum);

        // short + short
        short short1 = 280;
		short short2 = 1200;
        int shortSum = short1 + short2;
        System.out.println("short + short: " + shortSum); 

        // int + int
        int int1 = 50;
		int int2 = 30;
        int intSum = int1 + int2;
        System.out.println("int + int: " + intSum); 

        // long + long
        long long1 = 300L;
		long long2 = 790L;
        long longSum = long1 + long2;
        System.out.println("long + long: " + longSum); 
        // float + float
        float float1 = 1.5f;
		float float2 = 2.5f;
        float floatSum = float1 + float2;
        System.out.println("float + float: " + floatSum);

        // double + double
        double double1 = 12442.34;
		double double2 = 9293.9;
        double doubleSum = double1 + double2;
        System.out.println("double + double: " + doubleSum); 

        // char + char
        char char1 = 'A', char2 = 'B';
        int charSum = char1 + char2;
        System.out.println("char + char: " + charSum); 
    }
}
