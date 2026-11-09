package Utils.AbstractionPractise;


public class HumanBeing extends Monkey implements BasicAnimal {
    @Override
    public void eat() {
        System.out.println("Eating..");
    }

    @Override
    public void sleep() {
        System.out.println("Sleeping..");
    }

    @Override
    public void jump() {
        System.out.println("Jumping..");
    }

    @Override
    public void bite() {
        System.out.println("Biting...");
    }
}
