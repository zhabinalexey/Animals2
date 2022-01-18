class Horse extends Animal {
   public Horse(String name, int weight, int age){
       super (name, weight, age);
   }

    // provide implementation of abstract method
    public void makeSound() {
        System.out.println("Igogo - Is talking Horse");
    }

}
