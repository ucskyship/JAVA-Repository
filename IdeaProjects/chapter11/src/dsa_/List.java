package dsa_;

public interface List {
    boolean isEmpty();

    void add(String item);

    void delete(String item);

    int size();

    String get(int index);

    int capacity();

//    void delete(String item);
}
