public class Inheritance {
    public static void main(String[] args) {
        // Fish shark = new Fish();
        // shark.eats();

        dog bhonki = new dog();
        bhonki.eats();
        bhonki.legs = 4;
        System.out.println(bhonki.legs);
    }
}

class Animal{
    String color;
    void eats(){
        System.out.println("Eats");
    }
    void breathe(){
        System.out.println("Breathes");
    }
}

class mammal extends Animal{
    int legs;
}

class dog extends mammal{
    String breed;
}
// class Fish extends Animal{
//     int fins;

//     void swim(){
//         System.out.println("Swims in Water");
//     }
// }
