public class superKeyword {
    public static void main(String[] args) {
        horse h = new horse();
        System.out.println(h.color);
    }
}

class Animal{
    String color;
    Animal(){
        System.out.println("Animal Constructor is called");
    }
}

class horse extends Animal{
    horse(){
        super.color = "Brown";
        System.out.println("horse Constructor is called");
    }
}
