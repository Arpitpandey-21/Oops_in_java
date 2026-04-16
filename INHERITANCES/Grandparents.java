public class Grandparents {
    private int age;
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
    private String name;
    public void WAKECALL()
    {
        System.out.println("Goodmorning");
    }
    public static void main(String[] args) {
        Child child = new Child();
        child.setName("Satyam");
        child.setAge(18);
      
         System.out.println("Name: " + child.getName());
        System.out.println("Age: " + child.getAge());
        child.WAKECALL();

    }
    
}
class Parents extends Grandparents
{

}
class Child extends Grandparents
{
    
}
