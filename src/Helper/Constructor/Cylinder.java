package Helper.Constructor;

public class Cylinder {
    int radius;
    int height;

    Cylinder(int r, int h){
        this.height = h;
        this.radius = r;
    }

    void setRadius(int r){
        this.radius = r;
    }

    void setHeight(int h){
        this.height = h;
    }

    int getRadius(){
        return radius;
    }

    int getHeight(){
        return  height;
    }
}
