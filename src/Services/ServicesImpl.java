package Services;

import DAL.StringPractise;

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
}
