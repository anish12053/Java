package Helper.Constructor;

public class CylinderDynamic extends Cylinder{
    CylinderDynamic(int r, int h){
        super(r,h);
    }
    float surfaceArea(){
        return 2 * 3.14f * height * radius;
    }

    float volume(){
        return 3.14f * radius * radius * height;
    }
}
