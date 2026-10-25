
import SANJU.*;

import java.util.Scanner;

    public class Imp {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            Q1LowerCase q = new Q1LowerCase();

            System.out.println("WRITE NAME ");
            String str = sc.nextLine();
            System.out.println(q.ToLowerCase(str));



            Q2Space sp = new Q2Space();
            System.out.println("write string here ");
            String st = sc.nextLine();
            System.out.println(sp.replaceSpace(st));

          Q3dear d= new Q3dear();
          System.out.println("write the string ");
          String name = sc.nextLine();
          String letter= "Dear <|name|> , Thanks a lot";
          System.out.println(d.replacement(letter , name));


          Conditions c= new Conditions();
          c.Age();

          Conditions con= new Conditions();

          int sub1= sc.nextInt();
          int sub2= sc.nextInt();
          int sub3= sc.nextInt();

          con.number(sub1,sub2 ,sub3);

          Conditions t= new Conditions();
          int day =sc.nextInt();

          t.week(day);

        Conditions o = new Conditions();
        String web= sc.nextLine();
       o.website(web);

      Loops l= new Loops();
       int n=sc.nextInt();
       l.Pattern(n);


       Loops p= new Loops();
       int num=sc.nextInt();
       p.Evennumber(num);


       Loops oo= new Loops();
       int val= sc.nextInt();
       oo.Table(val);


             Loops s= new Loops();
             int v= sc.nextInt();
             s.reverseTable(v);



             Loops ob= new Loops();
             int m= sc.nextInt();
            System.out.println(ob.factorial(m));


            Loops obj= new Loops();
            int value= sc.nextInt();
            obj. factorialwhileloop(value);


            Loops lo= new Loops();
            int ve= sc.nextInt();
            lo.summultiplication(ve);
        }
    }

