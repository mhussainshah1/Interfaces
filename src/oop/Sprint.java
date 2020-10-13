package oop;

@FunctionalInterface
public interface Sprint {
    void sprint(int speed);
}

@FunctionalInterface
interface Dash extends Sprint {
}
//@FunctionalInterface
interface Skip extends Sprint {
    void skip();
}
//@FunctionalInterface
interface sleep {
    private void snore() {
    }

    public default int getZzz() {
        return 1;
    }
}

@FunctionalInterface
interface Climb {
    void reach();

    default void fall() {
    }

    static int getBackUp() {
        return 100;
    }

    private static boolean checkHeight() {
        return true;
    }
}

