package nz.irontree.zoo.entities;

public abstract class AbstractAnimal {

    abstract void voice();

    void walk() {
        System.out.println("Я животное и я умею ходить");
    }
}
