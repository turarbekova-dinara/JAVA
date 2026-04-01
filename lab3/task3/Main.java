package task3;

public class Main {
    public static void main(String[] args) {
        MyCollection<String> list = new MyList<>();
        list.add("A");
        list.add("B");
        list.add("A");

        System.out.println(list.size()); // 3

        MyCollection<String> set = new MySet<>();
        set.add("A");
        set.add("B");
        set.add("A");

        System.out.println(set.size()); // 2
    }
}
