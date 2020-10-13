package oop;

public interface InterfaceSummary {
    /*public static final*/ int CONSTANT = 1;

    /*public abstract*/ int abstractMethod();

    /*public*/ default int defaultMethod(){abstractMethod(); privateMethod();staticMethod();  privateStaticMethod();return CONSTANT; }

    private int privateMethod(){abstractMethod();defaultMethod();staticMethod();privateStaticMethod();return CONSTANT;}

    /*public*/ static int staticMethod(){ privateStaticMethod(); return CONSTANT; }

    private static int privateStaticMethod(){ return CONSTANT;}

}
