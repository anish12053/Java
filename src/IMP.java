
import SANJU.Q1LowerCase;

import java.util.Scanner;

    public class IMP {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            Q1LowerCase q = new Q1LowerCase();

            System.out.println("WRITE NAME ");
            String str = sc.nextLine();
            System.out.println(q.ToLowerCase(str));


        }
    }

