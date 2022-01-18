
//class Cat extends Animal {
//    // provide implementation of abstract method
//    public void makeSound() {
//        System.out.println("Mur Mur - Is talking Cat");
//    }
//
//}
//class Horse extends Animal {
//    // provide implementation of abstract method
//    public void makeSound() {
//        System.out.println("Igogo - Is talking Horse");
//    }
//
//}

public abstract class Animal {
    private final String name;
    private final int weight;
    private int age;

    public Animal (String name, int weight) {
    this.name = name;
    this.weight = weight;
    }
    public Animal (String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }
    abstract void makeSound();
    public void eat(){
        System.out.println("I "+name+" eating..."+" ,my weight: " +weight + ", my age: "+age);
    }

}
//"class Main {
//public static void main(String[] args) {
//    Koala = new Koala (name: "Petya", weight: 4);
//        // create an object of Koala class
//        Koala d1 = new Koala();
//
//        d1.makeSound();
//        d1.eat();
//
//
//    Cat = new Cat (name: "Vasya", weight: 3);
//    // create an object of Cat class
//        Cat d2 = new Cat();
//
//        d2.makeSound();
//        d2.eat();
//
//    Horse = new Horse (name: "Kolya", weight: 7);
//    // create an object of Horse class
//    Horse d3 = new Horse();
//
//        d3.makeSound();
//        d3.eat();}
//
//}
