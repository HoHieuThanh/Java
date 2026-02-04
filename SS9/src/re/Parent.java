package re;

import java.util.Scanner;

public class Parent {
    protected double c;

    public Parent(double c) {
        this.c = c;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public void say(){
        System.out.println("Hello");
    }
}
