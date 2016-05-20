import java.util.ArrayList;
import java.util.Collection;
public class TestClientIterator  {
    public static void main(String[] args) {
        Collection<Object> al = new ArrayList<Object>();
        al.add(new Integer(42));
        al.add("test");
        al.add(new Double("-12.34"));
        for (Iterator<Object> iter = al.iterator(); iter.hasNext(); ) {
            System.out.println(iter.next());
        }
        for (Object o : al) {
            System.out.println(o);
        }
    }
}
