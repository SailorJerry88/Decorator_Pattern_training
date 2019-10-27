package b_strukturalne.decorator_demo;

public abstract class AnimalDecorator implements Animal {

    protected Animal decoratedAnimal;
    AnimalDecorator(Animal decoratedAnimal){
        super();
        this.decoratedAnimal = decoratedAnimal;
    }

}
