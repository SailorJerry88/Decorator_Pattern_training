package b_strukturalne.decorator_demo;

public class Cat implements Animal {


    @Override
    public void becomeAlive() {
        System.out.println("A cat is born");
    }

    @Override
    public void giveSound() {
        System.out.println("It meows");
    }

    @Override
    public String discription() {
        return "A cat";
    }
}

