package dsa_;

public class HashSet implements Set {

    private final ArrayList setArray = new ArrayList();

    @Override
    public boolean isEmpty() {
        return setArray.size() == 0;
    }

    @Override
    public void add(String item) {
        var result =  setArray.contains(item);
        if (!result) {
            setArray.add(item);
        }
    }

    @Override
    public int size() {
        return setArray.size();
    }

    @Override
    public String get(int item) {
        return setArray.get(item);
    }

    @Override
    public void remove(String item) {
        setArray.remove(item);
    }
}
