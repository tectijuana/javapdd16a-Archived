import java.util.BitSet;
import java.util.Iterator;
public class BitSetIterator implements Iterator<Boolean> {
    private final BitSet bitset;
    private int index = 0;
    public BitSetIterator(BitSet bitset) {
        this.bitset = bitset;
    }
    public boolean hasNext() {  
        return index < bitset.length();
    }
    public Boolean next() {
        if (index >= bitset.length()) {
            throw new NoSuchElementException();
        }
        return bitset.get(index++);
    }
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
