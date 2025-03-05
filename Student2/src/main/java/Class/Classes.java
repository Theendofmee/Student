package Class;

public class Classes {


    public static void main(String[] args) {

        Animal cat = new Cat("Emma");

        cat.makeSound();


        Animal dog = new Dog("Baks");

        dog.makeSound();


    }
}

class Animal {

    public String name;

    public Animal(String name) {
        this.name = name;
    }

    public void makeSound() {
        System.out.println("Тварина говорить");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {

        System.out.println("Dog" + getName() + " Гав Гав");
    }
}


class Cat extends Animal {


    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Cat" + getName() + " МЯУ МЯУ");
    }
}