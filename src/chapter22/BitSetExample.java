package chapter22;

import java.util.BitSet;
import java.util.stream.IntStream;

public class BitSetExample {
    boolean isPowerOfTwo(int x)
    {
        return (x != 0) && ((x & (x - 1)) == 0);
    }
    int pow2(int exp){
        return 1<<exp;
    }
    public static void main(String[] args) {
        final BitSet bitSet = new BitSet(8); // by default all bits are unset
        IntStream.range(0, 8).filter(i -> i % 2 == 0).forEach(bitSet::set); // {0, 2, 4, 6}
        bitSet.set(3); // {0, 2, 3, 4, 6}
        bitSet.set(3, false); // {0, 2, 4, 6}
        final boolean b = bitSet.get(3); // b = false
        bitSet.flip(6); // {0, 2, 4}
        bitSet.set(100); // {0, 2, 4, 100} - expands automatically

        bitSet.and(new BitSet(8));
        bitSet.or(new BitSet(8));
        bitSet.xor(new BitSet(8));
        bitSet.andNot(new BitSet(8));

        // Raw bytes as input
        byte[] b1 = {(byte)0x65, (byte)0xFF, (byte)0x31};
        // Packed in big endian: x == 0x65FF31
        int x = (b1[0] & 0xFF) << 16 // Red
                | (b1[1] & 0xFF) << 8 // Green
                | (b1[2] & 0xFF) << 0; // Blue
        // Packed in little endian: y == 0x31FF65
        int y = (b1[0] & 0xFF) << 0
                | (b1[1] & 0xFF) << 8
                | (b1[2] & 0xFF) << 16;

    }
}
