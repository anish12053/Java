
import SANJU.Q1LowerCase;
import SANJU.Q2Space;
import SANJU.Q3dear;
import SANJU.Conditions;
import SANJU.Arrays;

import java.util.Scanner;

    public class Imp {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            Q1LowerCase q = new Q1LowerCase();

            System.out.println("WRITE NAME ");
            String str = sc.nextLine();
            System.out.println(q.toLowerCase(str));



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

       float [] arr= new float [5];
       for(int i=0; i<5; i++){
           arr[i]= sc.nextFloat();

       }
       Arrays a= new Arrays();
       a.floatCalculateSum(arr);


       int [] nums= new int[5];
       for(int i=0; i<5; i++){
           nums[i]=sc.nextInt();
       }
       System.out.println("write the number here");
       int number= sc.nextInt();
       Arrays r= new Arrays();
      System.out.println( r.findIntegerPresent(nums,number));



           //  q3

            int [] marks= new int[4];
            for(int i=0; i<4; i++){
                marks[i]=sc.nextInt();

            }
            Arrays y= new Arrays();

            y.calculateAvgMarks(marks);

         //   q4

             int [] [] mat1= new int[2][3];
             for(int i=0; i<2; i++){
                 for(int j=0; j<3; j++){
                     mat1[i][j]= sc.nextInt();
                 }
             }
             int [] [] mat2= new int[2][3];
             for(int i=0;i<2; i++){
                 for(int j=0; j<3; j++){
                     mat2[i][j]= sc.nextInt();
                 }
             }
             Arrays s= new Arrays();
             s.sumOfMatrices(mat1,mat2);




          //   Q5
            int [] arr1= new int[6];
            for(int i=0; i<6; i++){
                arr1[i]= sc.nextInt();

            }
            Arrays rev= new Arrays();
            rev.reverseArray(arr1);


            //Q6
           int []  element= new int[5];
           for(int i=0; i<5; i++){
               element[i]=sc.nextInt();
           }
           Arrays q6= new Arrays();
           System.out.println(q6.maximumElement(element));


         //  Q7
            System.out.println("eneter the size of the array");
            int size= sc.nextInt();

            int [] value= new int[size];
            for(int i=0; i<value.length; i++){
                value[i]=sc.nextInt();

            }
            Arrays q7= new Arrays();
            q7.minmumElement(value);



            //Q8

            System.out.println("enter the size of the array");
            int s2= sc.nextInt();
            int [] sort= new int[s2];
            for(int i=0; i<sort.length; i++){
                sort[i]=sc.nextInt();
            }
            Arrays q8= new Arrays();
            System.out.println(q8.findSortArray(sort));
        }

    }

