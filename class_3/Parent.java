package class_3;

public abstract class Parent {

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

    public void printMessage(){
        System.out.println("Message from Parent class " );
    }


    @Override
    public String toString() {
        return "Parent [name=" + name + ", age=" + age + "]";
    }
 


   
    
}
