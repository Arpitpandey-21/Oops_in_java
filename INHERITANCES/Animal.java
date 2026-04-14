public class Animal {
    private int age;
    private String name;
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    } 
    public void Eat()
    {
        System.out.println("eat the food ");
    }
    public void sayhello()
    {
        System.out.println("");
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("Buddy");
        dog.setAge(5);
         System.out.println("Name: " + dog.getName());
        System.out.println("Age: " + dog.getAge());
        dog.sayhello();
        dog.Eat();
    }
}
class Dog extends Animal {
    //INHERITANCES
   @Override
    public void sayhello()
    {
        System.out.println("wooh"); // method override
    }
    //dog properties inherit from parent class Animal
}
/*class Animal {
    private int age;
    private String name;

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Method
    public void Eat() {
        System.out.println("eat the food");
    }

    public void sayhello() {
        System.out.println("hello");
    }

    public static void main(String[] args) {
        Dog dog = new Dog();

        dog.setName("Buddy");
        dog.setAge(5);

        System.out.println("Name: " + dog.getName());
        System.out.println("Age: " + dog.getAge());

        dog.sayhello(); // overridden method
        dog.Eat();      // inherited method
    }
}

// Child Class
class Dog extends Animal {

    // Method Overriding
    @Override
    public void sayhello() {
        System.out.println("wooh");
    }
}*/
