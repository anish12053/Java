package SANJU;
class Hey{
    String name;
    void display(){
        System.out.println(name);
    }
}

public class Q3dear {
    public static void main(String[] args) {
        Hey h = new Hey();
        String letter = "Dear <|name|> , Thanks a lot";
        h.name = letter.replace("name", "Sanju");
        h.display();
    }
}
