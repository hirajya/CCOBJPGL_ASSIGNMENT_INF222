import Explorers.*;
import Planets.*;

public class App {

    public static void main(String[] args) {

        Planet mars = new Mars();
        Planet saturn = new Saturn();
        Planet mercury = new Mercury();
        Planet nnc = new NnC();
        Planet navori = new Navori();

        Explorer astronaut = new HumanExplorer();
        Explorer rover = new RobotExplorer();
        Explorer dog = new DogExplorer();

        mars.accept(astronaut);
        saturn.accept(astronaut);
        mercury.accept(astronaut);
        nnc.accept(astronaut);
        navori.accept(astronaut);

        mars.accept(rover);
        saturn.accept(rover);
        mercury.accept(rover);
        nnc.accept(rover);
        navori.accept(rover);

        mars.accept(dog);
        saturn.accept(dog);
        mercury.accept(dog);
        nnc.accept(dog);
        navori.accept(dog);


    }
}