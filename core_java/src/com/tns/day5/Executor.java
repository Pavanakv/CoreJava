package com.tns.day5;

public class Executor {
    int varDefault = 10;
    private int varPrivate = 20;
    protected int varProtected = 30;
    public int varPublic = 40;

    public int getbVarPrivate() {
        return varPrivate;
    }

    public void setbVarPrivate(int varPrivate) {
        this.varPrivate = varPrivate;
    }

    void methodDefault() {
        System.out.println("Default method from Base");
        System.out.println("varDefault: " + varDefault);
        System.out.println("varPrivate: " + varPrivate);
        System.out.println("varProtected: " + varProtected);
        System.out.println("varPublic: " + varPublic);
    }

    private void methodPrivate() {
        System.out.println("Private method from Base");
        System.out.println("varDefault: " + varDefault);
        System.out.println("varPrivate: " + varPrivate);
        System.out.println("varProtected: " + varProtected);
        System.out.println("varPublic: " + varPublic);
    }

    protected void methodProtected() {
        System.out.println("Protected method from Base");
        System.out.println("varDefault: " + varDefault);
        System.out.println("varPrivate: " + varPrivate);
        System.out.println("varProtected: " + varProtected);
        System.out.println("varPublic: " + varPublic);
    }

    public void methodPublic() {
        System.out.println("Public method from Base");
        System.out.println("varDefault: " + varDefault);
        System.out.println("varPrivate: " + varPrivate);
        System.out.println("varProtected: " + varProtected);
        System.out.println("varPublic: " + varPublic);
    }
}