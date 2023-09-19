package guru.qa;


public class HW6 {
    public static void main(String[] args) {
        byte aMaxByte = Byte.MAX_VALUE;
        short aShort = Short.MIN_VALUE;
        int aInt = 89200;
        long aLong = -8912389176524598172L;
        float aFloat = 2.1f;
        double aDouble = 3400.0;
        boolean aTrue = true;
        boolean aFalse = false;
        char aChar = 'o';
        String testString = "lucky";

        System.out.println("Addition = " + (aMaxByte + aShort));
        System.out.println("Subtraction = " + (aShort - aMaxByte));
        System.out.println("Division = " + (aLong / aInt));
        System.out.println("Division, returning the remainder = " + (aInt % aShort));
        System.out.println("Addition, with transformation int into double = " + (aInt + aDouble));
        System.out.println("Multiplication, with transformation int into double = " + (aInt * aDouble));

        System.out.println("Check, that float less than double = " + (aFloat < aDouble));
        System.out.println("Comparison true and not false = " + (aTrue && !aFalse));
        System.out.println("Comparison true or false = " + (aTrue || aFalse));
        System.out.println("Which is bigger? aInt or aShort : " + ((aInt > aShort) ? "aInt" : "aShort"));

        System.out.println("Overflow of byte: " + (byte) (aMaxByte + 1));
        System.out.println("Overflow of short: " + (short) (aShort - 1));

        System.out.println("Index of symbol: " + testString.indexOf(aChar));

        byte aByte = 120;
        for (int i = 0; i <= 150; i++) {
            aByte++;
            if (aByte == aMaxByte) {
                System.out.println("aByte равен aMaxByte: " + aByte + " = " + aMaxByte + " , при i=" + i);
            }

        }
    }
}
