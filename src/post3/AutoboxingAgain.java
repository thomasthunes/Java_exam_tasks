package post3;

public class AutoboxingAgain {

    public static void m1(Dog d){
        System.out.print("fetch");
    }

    public static void m1(Animal d){
        System.out.print("flip");
    }

    public static void main(String[] args) {
        Animal a = new Dog();
        Dog d = new Dog();
        m1(a);
        m1(d);
    }
}

class Animal {}
class Dog extends Animal {}
