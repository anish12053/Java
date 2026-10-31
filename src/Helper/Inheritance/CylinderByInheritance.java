package Helper.Inheritance;

import Helper.Figure.Circle;

public class CylinderByInheritance extends Circle {
    int height;
    public CylinderByInheritance(int r, int h) {
        super(r);
        this.height = h;
    }

    float surfaceArea(){
        return 2 * 3.14f * height * r;
    }

    int getRadius(){return r;}

    int getHeight(){return height;}
}
