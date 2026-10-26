import Services.Services;
import Services.ServicesImpl;

import java.util.Scanner;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {
        final Services services = new ServicesImpl();
        Scanner sc = new Scanner(System.in);

        System.out.println("Write which topic you want to run from [\"String\", \"Condition\", \"Loop\", \"Array\", \"Method\"]");
        String topic = sc.nextLine();

        Exception exception = new IllegalArgumentException();
        switch (topic){
            case "String" -> services.runStringPractiseQuestion();
            case "Condition" -> services.runConditionalPractiseQuestion();
            case "Loop" -> services.runLoopConditionPractise();
            case "Array" -> services.runArrayPractiseQuestion();
            case "Method" -> services.runMethodPractiseQuestion();
            default -> throw exception;
        }
    }


}