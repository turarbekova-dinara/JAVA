package task3;

import java.util.HashSet;

class MySet<T> implements MyCollection<T> {
    private HashSet<T> set = new HashSet<>();

    public void add(T element) {
        set.add(element);
    }

    public void remove(T element) {
        set.remove(element);
    }

    public boolean contains(T element) {
        return set.contains(element);
    }

    public int size() {
        return set.size();
    }

    public boolean isEmpty() {
        return set.isEmpty();
    }

    public void clear() {
        set.clear();
    }
}