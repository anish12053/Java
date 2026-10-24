package DAL;

public class StringPractise {
    public String convertToLowerCase(String str){
        return str.toLowerCase();
    }

    public String replaceCharacterInString(String str, Character replaceFrom, Character replaceTo){
        return str.replace(replaceFrom,replaceTo);
    }

    public String replaceWordInString(String str, String replaceFrom, String replaceTo){
        return str.replace(replaceFrom,replaceTo);
    }

    public int findSubString(String str, String substr){
        return str.indexOf(substr);
    }
}
