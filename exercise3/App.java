import Cat.Bengsian;
import Dog.Goldador;
import Dog.Labrador;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("=======Dog==========");

        // dog
        Goldador myPetDog = new Goldador();

        myPetDog.bark();
        System.out.println(myPetDog.eyeColor);
        System.out.println(myPetDog.furColor);


        System.out.println("=======Cat==========");

        // cat
        Bengsian myPetCat = new Bengsian();

        myPetCat.meow();
        System.out.println(myPetCat.eyeColor);
        System.out.println(myPetCat.furColor);
    }
}