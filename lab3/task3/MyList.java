package task3;

import java.util.ArrayList;

class MyList<T> implements MyCollection<T> {
    private ArrayList<T> list = new ArrayList<>();

    public void add(T element) {
        list.add(element);
    }

    public void remove(T element) {
        list.remove(element);
    }

    public boolean contains(T element) {
        return list.contains(element);
    }

    public int size() {
        return list.size();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void clear() {
        list.clear();
    }
}
