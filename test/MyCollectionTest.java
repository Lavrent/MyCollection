
class MyCollectionTest<E> {

    public static void main(String[] args) {

        MyCollection<String> collection = new MyCollection<>();
        collection.add("aaa");
        collection.remove(2);
        collection.remove("bbb");
        collection.add(3, "ccc");
        collection.contains("eee");
        collection.get(5);
        collection.toString();
    }
}