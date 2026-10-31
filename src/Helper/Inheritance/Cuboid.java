package Helper.Inheritance;

import Helper.Figure.Rectangle;

public class Cuboid extends Rectangle {
    int height;
    public Cuboid(int a, int b, int h) {
        super(a, b);
        this.height = h;
    }

    @Override
    public int area(){
        return 2 * (a*b + b*height + a*height);
    }

    public int volume(){
        return a*b*height;
    }

    public int getHeight() {return height;}

    public int getLength() {return a;}

    public int getBreadth() {return b;}
}
