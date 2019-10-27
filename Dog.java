package b_strukturalne.decorator_demo;

public class Dog implements Animal {
    @Override
    public void becomeAlive() {
        System.out.println(" a Dog is born"); }

        @Override
    public void giveSound() { System.out.println("It barks"); }
    @Override
    public String discription() { return "A Dog"; }
}
