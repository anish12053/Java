package SANJU;

public class Cuboid extends Rectangle{
    int height;
    public Cuboid(int l, int b,int h){
        super(l,b);
        height=h;

    }
    public int getHeight(){
        return height;
    }
public void setHeight(int h){
        height=h;
}
public void calculateVolume(){
        System.out.println(getLength()*getBreadth()*height);
;}
}
