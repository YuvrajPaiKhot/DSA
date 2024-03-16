public class Abstraction {
    public static void main(String[] args) {
        // horse h = new horse();
        // h.eats();
        // h.walk();
        // System.out.println(h.color);

        // chicken c = new chicken();
        // c.eats();
        // c.walk();

        // Animal --> Horse --> Mustang
        mustang myHorse = new mustang();

    }
}

abstract class Animal{
    String color;
    Animal(){
        // color = "brown";
        System.out.println("Animal constructor called");
    }
    void eats(){
        System.out.println("Animal Eats");
    }

    abstract void walk();
}

class horse extends Animal{
    horse(){
        System.out.println("horse constructor called");
    }
    void changeColor(){
        color = "dark brown";
    }
    void walk(){
        System.out.println("Walks on 4 legs");
    }
}

class chicken extends Animal{
    void changeColor(){
        color = "Yellow";
    }
    void walk(){
        System.out.println("Walks on 2 legs");
    }
}
class mustang extends horse{
    mustang(){
        System.out.println("Mustang constructor called");
    }
}
