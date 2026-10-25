package SANJU;
import java.util.*;
class Place{
    String name;
    void show(){
        System.out.println(name);
    }
}
public class Q2Space {
    public static void main(String[] args){
        Place p= new Place();
        Scanner sc= new Scanner(System.in);
        System.out.println("Write the Name");
        String n= sc.nextLine();
        p.name=n.replace("  " , " - ");
        p.show();
    }
}
