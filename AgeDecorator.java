package b_strukturalne.decorator_demo;

public class AgeDecorator extends AnimalDecorator {
    protected Age age;

    AgeDecorator(Animal decoratedAnimal,Age age) {
        super(decoratedAnimal);
        this.age=age;
    }

    @Override
    public void becomeAlive() {
     decoratedAnimal.becomeAlive();
        System.out.println("It's a " + age + " aged animal");
    }

    @Override
    public void giveSound() {
        decoratedAnimal.giveSound();
        switch (age) {
            case OLD: {

                System.out.println("you barley have heard that");
                break;
        }
            default:
        System.out.println("A typical sound, you would say");
        break;
    }

    }

    @Override
    public String discription() {
        return decoratedAnimal.discription()+ "of "+ age +" age";
    }
}
