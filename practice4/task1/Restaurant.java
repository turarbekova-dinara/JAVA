class Restaurant {

    boolean servePizza(CanHavePizza eater) {
        System.out.println("Serving pizza...");

        eater.eatPizza();

        if (eater instanceof Student) {
            System.out.println("Processing student payment 💰");
        } else if (eater instanceof Teacher) {
            System.out.println("Teacher gets discount 🎓");
        } else {
            System.out.println("Free for animals 🐱");
        }

        System.out.println("         ");
        return true;
    }
}