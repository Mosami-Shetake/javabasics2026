package inheritance;

class animal{
    void breath(){
        System.out.println("Breathing");
    }
}

class Mammal extends animal{
    void walk(){
        System.out.println("Walking");
    }
}
class dog extends Mammal
{
    void bark(){
        System.out.println("Barking");
    }
}

public class multilevelinheritance {
    public static void main(String[] args){
        dog d=new dog();
        d.breath();
        d.walk();
        d.bark();
    }
}
