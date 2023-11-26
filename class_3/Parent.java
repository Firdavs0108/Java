package class_3;

public class Parent {

    private String name;
    private int age;

    public Parent(String name, int age){
        this.name = name;
        this.age = age;
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "Parent [name=" + name + ", age=" + age + "]";
    }
 


   
    
}
