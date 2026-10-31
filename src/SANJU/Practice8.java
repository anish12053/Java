package SANJU;


public class Practice8 {

    //Q1
 private int salary;
private String name;
public int getSalary(){
return salary;
}
public String getName(){
    return name;
}
public void setName(String name){
    this.name=name;
}


//Q2

public void ringing(){
    System.out.println("My phone was ringing");
}
public void vibrating(){
    System.out.println("My phone is vibrarting");
}

public void calling(){
    System.out.println("calling..");
}

//Q3
    int side;
    public void initializesise(int k){
        side=k;
    }
    public int calculateArea() {
        return side*side;
    }
    public int  calculateperimeter() {

        return 4*side;
    }
    //Q4
    int l;
    int b;

    public void initializeside(int x,int y){
        l=x;
        b=y;
    }
    public int calArea(){

        return l*b;
    }
    public int calperimeter(){
        return 2*(l+b);
    }

//Q5
    int r;
    public void initializecircle(int r){
        this.r=r;

    }
    public double area(){
        return 3.14*r*r;
    }
    public double perimeter(){
        return 2*3.14*r;
    }


    //Q6

    public void hitting(){
        System.out.println("hitting.....");
    }
public void firing(){
        System.out.println("firing.......");
}

    }






