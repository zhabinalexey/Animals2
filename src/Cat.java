public class Cat extends Animal {
    public Cat(String name, int weight, int age) {
        super(name, weight, age);
    }

    // provide implementation of abstract method
    public void makeSound() {
        System.out.println("Mur Mur - Is talking Cat");
    }

}
