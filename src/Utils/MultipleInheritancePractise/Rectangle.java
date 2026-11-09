package Utils.MultipleInheritancePractise;

import Utils.MultipleInheritancePractise.Shape;
import Utils.MultipleInheritancePractise.Square;

public class Rectangle extends Square implements Shape {
    @Override
    public void func() {
        System.out.println("I am Rectangle class");
    }

    public void func2() {
        System.out.println("Not in Sqaure class");
    }
}
