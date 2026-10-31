package SANJU;

public class Practiseset9 {
    private int r;
    private int h;


//    public Practiseset9(int radius ,int height){
//   r=radius;
//   h=height;
//    }
    public int getraduis(){
        return r;
    }
   // public void setraduis(int rad){
     //    r=rad;
    // }

    public int getheight(){
        return h;
    }
//    public void setname(int ht){
//        h= ht;
//    }

    public void surfaceArea(){
        System.out.println(2*3.14*r*h);
    }
    public double volume(double r, double h){
        return 3.14*3.14*r*h;
    }

    // Q3
    int length;
    int breadth;
 public Practiseset9(){
        length=0;
         breadth=0;

 }
 public Practiseset9(int l, int b){
        length=  l;
        breadth= b;
 }
 public int calculateArea(){
     return length*breadth;
 }
 public int calculatePerimeter(){
     return 2*(length+breadth);
 }

}
