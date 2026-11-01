package SANJU;

public class Rectangle {
    protected int length;
    protected int breadth;


    public Rectangle(int l, int b) {
        length=l;
        breadth=b;
    }

    public void setLength(int l) {
        length = l;

    }
    public void setBreadth(int b){
        breadth=b;
    }

    public int getLength() {
        return length;
    }
    public int getBreadth(){
        return breadth;
    }
    public void calculateArea(){
        System.out.println(length*breadth);
    }
}
