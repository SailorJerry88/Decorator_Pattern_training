package b_strukturalne.decorator_demo;

public class DekoMain {

    public static void main(String[] args) {

        Animal cat = new Cat();
        Animal dog = new Dog();
        cat.becomeAlive();
        dog.becomeAlive();

        Animal garfield = new FoodTypeDecorator(new Cat(),FoodType.FISH);
        garfield.becomeAlive();

        Animal animal = new Cat();
        Animal bt = new FoodTypeDecorator(animal,FoodType.EGGS);
        Animal idefix = new FoodTypeDecorator(bt,FoodType.MEAT);
        idefix.becomeAlive();
        System.out.println(idefix.discription());

    }
}
