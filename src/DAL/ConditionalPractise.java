package DAL;

import java.util.ArrayList;

public class ConditionalPractise {
    public boolean result(ArrayList<Integer> arr){
        int total = 0;
        for(Integer num : arr){
            if(num < 33) return false;
            total+=num;
        }
        return total / arr.size() >= 40;
    }

    public double calculateTax(Double income){
        double tax = 0.0;
        if(income < 250000) return tax;
        else if(income <500000){
            tax += (income-250000) * 0.05;
            return tax;
        }else if(income < 1000000){
            tax += 12500 + (income - 500000)*0.2;
            return tax;
        }else{
            tax += 112500 + (income - 1000000)*0.3;
            return tax;
        }
    }

    public String findDay(int num){
        return switch (num) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Sunday";
        };
    }

    public boolean checkLeapYear(int year){
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public String typeOfWebsite(String str) {
        if (str.endsWith(".com")) {
            return "Commercial Website";
        } else if (str.endsWith(".org")) {
            return "Organisation Website";
        } else {
            return "Indian Website";
        }
    }
}
