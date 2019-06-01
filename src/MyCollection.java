import java.util.*;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class MyCollection<E> implements Iterable<E> {

    Set<E> hashSet = new HashSet<>();
    List<E> linkedList = new LinkedList<>();
    List<E> arrayList = new ArrayList<>();


    public E get(int index) {
        return arrayList.get(index);
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    public void add(E value) {
        arrayList.add(value);
    }

    public void add(int index, E value) {
        arrayList.add(index, value);
    }

    public void contains() {

    }


}
