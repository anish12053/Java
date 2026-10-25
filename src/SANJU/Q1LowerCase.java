package SANJU;
import java.util.*;

class Ques {
   String name;

    void display() {
        System.out.println(name);
    }
}
public class Q1LowerCase {
    public static void main(String [] args){
        Ques q= new Ques();
        Scanner sc= new Scanner(System.in);
        System.out.println("write the name");
        String n= sc.nextLine();
      q.name= n.toLowerCase();
        q.display();
    }
}
