package nz.irontree.zoo.entities;

public class Snake extends AbstractAnimal {

    @Override
    void voice() {
        System.out.println("Я змея и я умею шипеть");
    }

    @Override
    void walk() {
        System.out.println("Я змея и я не могу ходить, я только ползаю");
    }
}
