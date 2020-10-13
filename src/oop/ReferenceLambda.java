package oop;

import java.util.function.Predicate;

public class ReferenceLambda {
    private String instanceVariable;
    private static String staticVariable;

    public void instanceMethod(final String parameter) {
        final String localVariable = "local";
        instanceVariable = "allowed";
        staticVariable = "allowed";
        Predicate<String> p = s -> (instanceVariable + parameter + localVariable + staticVariable).length() == 10;

//        parameter = "not allowed";
//        localVariable = "not allowed";
    }
}