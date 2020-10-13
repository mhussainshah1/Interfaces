package oop;

//@FunctionalInterface
interface Eat{
    void eat(int amountOfFood);
//    void test();
    String toString();
    boolean equals(Object object);
    int hashCode();
//    int toString();
}

public class Lion implements Eat{
    @Override
    public void eat(int amountOfFood) {
        System.out.println(amountOfFood);
    }
}
