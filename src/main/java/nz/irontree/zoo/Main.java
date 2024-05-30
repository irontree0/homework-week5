package nz.irontree.zoo;

import nz.irontree.zoo.entities.Parrot;
import nz.irontree.zoo.entities.Snake;
import nz.irontree.zoo.entities.TasmanDevil;
import nz.irontree.zoo.entities.Zookeeper;

public class Main {
    public static void main(String[] args) {

        Zookeeper zookeeper = new Zookeeper();

        Parrot parrot = new Parrot();
        Snake snake = new Snake();
        TasmanDevil tasmanDevil = new TasmanDevil();

        System.out.println("Сейчас смотритель за животными попросит выполнить команду ГОЛОС");
        printDelimeter();
        zookeeper.makeVoice(parrot);
        printDelimeter();
        zookeeper.makeVoice(snake);
        printDelimeter();
        zookeeper.makeVoice(tasmanDevil);
        printDelimeter();

        System.out.println("Сейчас смотритель за животными попросит выполнить команду ГОЛОС");
        printDelimeter();
        zookeeper.makeWalk(parrot);
        printDelimeter();
        zookeeper.makeWalk(snake);
        printDelimeter();
        zookeeper.makeWalk(tasmanDevil);
    }

    private static void printDelimeter() {
        System.out.println("----------------------------");
    }
}