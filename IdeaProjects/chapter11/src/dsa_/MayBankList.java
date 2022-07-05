package dsa_;

public interface MayBankList {
    boolean isEmpty();
    void add(String item);
    void delete(String item);
    int size();
    String get(int index);
    int capacity();

    void deleteFromAParticularIndex(int indexOfItem);
}
