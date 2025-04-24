class Animal{
    void sound(){
        System.out.println("all animals make sound");

    }
    void msg(){
        System.out.println("parent");
    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("all dogs bark");
    }
} 


public class Overriding {
    public static void main(String[] args) {
        Animal a =new Animal();
        a.sound();
        Animal d=new Dog();
        d.sound();
        d.msg();
    
    }

 }
 

