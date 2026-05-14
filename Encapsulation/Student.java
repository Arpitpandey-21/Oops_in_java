// Encapsulation    
// data hiding

public class Student {
    private int age ;
    public int getAge() {
        return this.age = age ;
    }
    public void setAge(int age) {
        if(age < 0)
        {
            System.out.println("Invalid Age");      // private access modifier h
        }
        else{
             this.age = age;
        }
       
    }
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    private int rollnumber;
    public int getRollnumber() {
        return rollnumber;
    }
    public void setRollnumber(int rollnumber) {
        this.rollnumber = rollnumber;
    }
    public static void main(String[] args) {
        Student student = new Student();
        student.setAge(-15);//call kiya
        student.setName("Arpit");
        System.out.println(student.getName());
        student.setRollnumber(42);
        System.out.println(student.getAge());
    }
}
