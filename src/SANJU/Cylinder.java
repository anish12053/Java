package SANJU;

public class Cylinder extends Circle{
    int h;

    public Cylinder(int r, int height){
        super(r);// reference varible of super class. r from circle class, super use for call super class constructor
        h=height;

    }
    public double cylinderVolume(){

        return 3.14*r*r*h;
    }


}
