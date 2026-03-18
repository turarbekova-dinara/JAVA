class Cat extends Animal implements CanHavePizza {

    String color;

    public Cat(String color) {
        this.color = color;
    }

    @Override
    public void eatPizza() {
        System.out.println("Cat (" + color + ") is eating pizza 🍕");
    }
}
