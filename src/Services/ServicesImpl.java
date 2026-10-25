package Services;

import DAL.ArrayPractise;
import DAL.ConditionalPractise;
import DAL.LoopPractise;
import DAL.StringPractise;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class ServicesImpl implements Services{
    @Override
    public void runStringPractiseQuestion(){
        StringPractise stringPractise = new StringPractise();

        String str;
        Scanner sc = new Scanner(System.in);

        System.out.println("Write String to convert into lower case");
        str = sc.next();
        System.out.println(stringPractise.convertToLowerCase(str));

        //Extra reading because sc.next() does not read new line hence the other sc.nextLine() will read the new line.
        sc.nextLine();

        System.out.println("write string to replace space with underscore");
        str = sc.nextLine();
        System.out.println(stringPractise.replaceCharacterInString(str,' ','_'));

        System.out.println("write a letter to fill name instead <|name|>");
        str = sc.next();
        String statement = "Dear <|name|>";
        System.out.println(stringPractise.replaceWordInString(statement,"<|name|>",str));

        sc.nextLine();

        System.out.println("Write a string to detect double or triple space in string");
        str = sc.nextLine();
        System.out.println((stringPractise.findSubString(str,"  ") != -1) || (stringPractise.findSubString(str,"   ") != -1));
    }

    @Override
    public void runConditionalPractiseQuestion() {
        ConditionalPractise conditionalPractise = new ConditionalPractise();
        Scanner sc = new Scanner(System.in);

        System.out.println("Write marks of your all three Subject");
        ArrayList<Integer> nums = new ArrayList<>();
        for(int i=0;i<3;i++){
            nums.add(sc.nextInt());
        }
        System.out.println(conditionalPractise.result(nums)? "Pass" : "Fail");

        System.out.println("Provide you income to find your tax");
        double income = sc.nextDouble();
        System.out.println(conditionalPractise.calculateTax(income));

        System.out.println("Write the number to find corresponding day");
        int day = sc.nextInt();
        System.out.println(conditionalPractise.findDay(day));

        System.out.println("Provide the year you want to check for leap year");
        int year = sc.nextInt();
        System.out.println(conditionalPractise.checkLeapYear(year));

        // To read the line break which sc.nextint() don't read
        sc.nextLine();

        System.out.println("Give the website link to check the domain");
        String website = sc.nextLine();
        System.out.println(conditionalPractise.typeOfWebsite(website));
    }

    @Override
    public void runLoopConditionPractise() {
        LoopPractise loopPractise = new LoopPractise();
        Scanner sc = new Scanner(System.in);

        System.out.println("write the number of lines you want to print pattern");
        int n = sc.nextInt();
        loopPractise.printPattern(n);

        System.out.println("Give n to find sum of first n even number");
        n = sc.nextInt();
        System.out.println(loopPractise.sumFirstNEvenNumberUsingWhileLoop(n));

        System.out.println("Give number to print his table");
        n = sc.nextInt();
        loopPractise.tableOfN(n);

        System.out.println("Give number to print his table in reverse order");
        n = sc.nextInt();
        loopPractise.reverseTableOfN(n);

        System.out.println("Give number to find his factorial");
        n = sc.nextInt();
        System.out.println(loopPractise.factorial(n));

        System.out.println("Give number to find his factorial using while loop");
        n = sc.nextInt();
        System.out.println(loopPractise.factorialUsingWhileLoop(n));

        System.out.println("write the number of lines you want to print pattern using while loop");
        n = sc.nextInt();
        loopPractise.printPatternUsingWhileLoop(n);

        System.out.println("write number to find the sum of his table");
        n = sc.nextInt();
        System.out.println(loopPractise.sumOfTableOfNumber(n));

        System.out.println("Give n to find sum of first n even number using while loop");
        n = sc.nextInt();
        System.out.println(loopPractise.sumFirstNEvenNumberUsingWhileLoop(n));
    }

    @Override
    public void runArrayPractiseQuestion() {

        ArrayPractise arrayPractise = new ArrayPractise();
        Scanner sc = new Scanner(System.in);

        float[] arr = new float[5];
        System.out.println("Give 5 marks to find sum");
        for(int i=0;i<5;i++){
            arr[i] = sc.nextFloat();
        }
        System.out.println("Total marks of subject: " + arrayPractise.sumOfArray(arr));

        System.out.println("Give the number you want to find in previous array");
        float n = sc.nextFloat();
        System.out.println(arrayPractise.findNumberInArray(arr,n));

        System.out.println("Average of number is: " + arrayPractise.findAverageOfArray(arr));

        System.out.println("Give two 2x3 matrix to find sum: ");

        int[][] mat1 = new int[2][3];
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                mat1[i][j] = sc.nextInt();
            }
        }
        int[][] mat2 = new int[2][3];
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                mat2[i][j] = sc.nextInt();
            }
        }
        System.out.println("sum of matrix is: ");
        arrayPractise.sumOfMatrix(mat1,mat2);

        arrayPractise.reverseArray(arr);
        System.out.print("reverse of the array is: ");
        for(float i : arr) System.out.print(i+" ");
        System.out.println();

        System.out.println("Maximum of the marks is: " + arrayPractise.maximum(arr));

        System.out.println("Minimum of the marks is: " + arrayPractise.minimum(arr));

        System.out.println("Arrays is sorted or not: " + (arrayPractise.checkSorted(arr) ? "Yes" : "No"));

    }
}
