package test;

public class Casting {
    public static void main(String[] args) {
        // Converting one data type to another
        byte b = 126;
        short sFromB = (short) b;
        System.out.println(sFromB);

        // It's possible to lose data during casting, e.g when converting from a bigger
        // type to a smaller one
        short s = 32767;
        byte bFromS = (byte) s;
        System.out.println(bFromS);

        // ! TO BE SAFE FROM DATA LOSS
        // Only cast from smaller to bigger
        // boolean -> byte -> short -> int -> long -> float -> double -> char

    }
}
