package nz.irontree.zoo.entities;

public class Parrot extends AbstractAnimal {

    @Override
    void voice() {
        System.out.println("Я попугай и я умею говорить");
    }

    @Override
    void walk() {
        super.walk();
        System.out.println("Я попугай, я умею не только ходить, но летать");
    }
}
