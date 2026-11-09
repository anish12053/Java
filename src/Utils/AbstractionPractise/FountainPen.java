package Utils.AbstractionPractise;

public class FountainPen extends Pen{
    @Override
    public void write() {
        System.out.println("Writing");
    }

    @Override
    public void refill() {
        System.out.println("refilling...");
    }

    public void changeNib(){
        System.out.println("Changing Nib..");
    }
}
