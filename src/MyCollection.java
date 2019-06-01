import java.util.*;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class MyCollection<E> implements Iterable<E> {

    private Set<E> hashSet = new HashSet<>();
    private List<E> linkedList = new LinkedList<>();
    private List<E> arrayList = new ArrayList<>();

    public void add(E value) {
        arrayList.add(value);
    }

    public void add(int index, E value) {
        arrayList.add(index, value);
    }

    public E get(int index) {
        return arrayList.get(index);
    }

    public void contains(E value) {
        linkedList.contains(value);
    }

    public void remove(int index) {
        arrayList.remove(index);
    }

    public void remove(E value) {
        hashSet.remove(value);
    }


    @Override
    public Iterator<E> iterator() {
        return linkedList.iterator();
    }

    @Override
    public String toString() {
        return (String) this.iterator().next();
    }


}
