package task2;

class iPhone implements SellableAndPluggable {
    public void sell() {
        System.out.println("iPhone is sold");
    }

    public void plugIn() {
        System.out.println("iPhone is charging");
    }
}
