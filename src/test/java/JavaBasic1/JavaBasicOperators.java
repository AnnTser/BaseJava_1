package JavaBasic1;

public class JavaBasicOperators {

    public static void main(String[] args) {
        String srtToBePrinted = "Hello world";
        System.out.println(srtToBePrinted);

        byte aByte = 100;
        byte bByte = 27;
        short aShort = 10000;
        short bShort = 20000;
        int aInt = 100;
        int bInt = 300;
        long aLong = 1000000;
        long bLong = 9000000;
        float aFloat = 1.1f;
        float bFloat = 1.5f;
        double aDouble = 1.2;
        double bDouble = 1.7;
        char aChar = 'a';
        char bChar = 'b';
        boolean aBoolean = false;
        boolean bBoolean = true;


        System.out.println("aByte+bByte= "+(aByte+bByte));
        System.out.println("aShort - bShort = " + (aShort - bShort));
        System.out.println("aFloat * bFloat = " +(aFloat * bFloat));
        System.out.println("aDouble % bDouble = " + (aDouble % bDouble));


        System.out.println("aInt == bInt = " + (aInt == bInt) );
        System.out.println("aLong != bLong = " + (aLong != bLong) );
        System.out.println("aDouble > bDouble = " + (aDouble > bDouble) );
        System.out.println("aDouble >= bDouble = " + (aDouble >= bDouble) );

        boolean a = true;
        boolean b = false;
        System.out.println("a && b = " + (a&&b));
        System.out.println("a || b = " + (a||b) );

        System.out.println("aByte*bByte= "+(byte)(aByte*bByte));
        System.out.println("aByte*bByte= "+(aByte*bByte));
        System.out.println("aShort*bShort= "+(short)(aShort*bShort));
        System.out.println("aShort*bShort= "+(aShort*bShort));

        System.out.println("aShort + aDouble = " + aShort + aDouble);
        System.out.println("bLong % aByte = " + bLong % aByte);
        System.out.println("aChar * bShort = " + aChar * bShort);
        System.out.println("aInt / bChar = " + aInt * bChar);
    }


}
