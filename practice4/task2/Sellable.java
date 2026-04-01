package task2;

interface Sellable {
    void sell();
}

interface Pluggable {
    void plugIn();
}

interface SellableAndPluggable extends Sellable, Pluggable {
}