package dsa_;

import java.util.Objects;

public class HashStack implements Stack {
    private int size;


    public HashStack(int size){
        this.size = size;
    }
    public HashStack(){}
    private final ArrayList stackArray = new ArrayList(size);

    @Override
    public boolean empty() {
        return stackArray.size() == 0;
    }

    @Override
    public void push(String item) {
        stackArray.addItem(item);
//        if (stackArray.size() <size) {
//            stackArray.add(item);
//        }
    }


    @Override
    public int size() {
        return stackArray.size();
    }

    @Override
    public void pop() {
        stackArray.remove(stackArray.size() - 1);
    }

    @Override
    public String peek() {
        return stackArray.get(stackArray.size() - 1);
    }
    public String getItem(int index){
        return stackArray.get(index);
    }

    @Override
    public int search(String item) {
        for (int i = 0; i < size(); i++) {
            if (Objects.equals(stackArray.get(i), item)) {  //(stackArray.get(i) == item)
                System.out.println(item);
                return i;
            }
        }
        return -1;
    }
}
