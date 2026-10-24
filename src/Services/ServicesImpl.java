package Services;

import DAL.ConditionalPractise;
import DAL.StringPractise;

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
}
