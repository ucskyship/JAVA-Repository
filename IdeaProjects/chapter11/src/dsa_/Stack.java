package dsa_;

public interface Stack {

    boolean empty();

    void push(String item);

    int size();

    void pop();

    String peek();
    String getItem(int index);

    int search(String item);
}
