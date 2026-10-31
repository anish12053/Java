package Helper.Figure;

public class Square implements  Shape{
    int a;
    public Square(int a){
      this.a = a;
    }
    @Override
    public int perimeter() {
        return 4*a;
    }

    @Override
    public int area() {
        return a*a;
    }
}
