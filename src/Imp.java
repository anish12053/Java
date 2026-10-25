
import SANJU.Q1LowerCase;
import SANJU.Q2Space;
import SANJU.Q3dear;
import SANJU.Conditions;

import java.util.Scanner;

    public class Imp {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
//            Q1LowerCase q = new Q1LowerCase();
//
//            System.out.println("WRITE NAME ");
//            String str = sc.nextLine();
//            System.out.println(q.ToLowerCase(str));
//
//
//
//            Q2Space sp = new Q2Space();
//            System.out.println("write string here ");
//            String st = sc.nextLine();
//            System.out.println(sp.replaceSpace(st));
//
//          Q3dear d= new Q3dear();
//          System.out.println("write the string ");
//          String name = sc.nextLine();
//          String letter= "Dear <|name|> , Thanks a lot";
//          System.out.println(d.replacement(letter , name));


          Conditions c= new Conditions();
          c.Age();

          Conditions con= new Conditions();

          int sub1= sc.nextInt();
          int sub2= sc.nextInt();
          int sub3= sc.nextInt();

          con.number(sub1,sub2 ,sub3);

        }
    }

