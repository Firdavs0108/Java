package out.production.Java.class_1;

public class Example {

    private String name;
    private int age;
    private String comName;

    public Example(String name, int age, String comName){
        this.name = name;
        this.age = age;
        this.comName = comName;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getComName(){
        return this.comName;
    }

    public void setComName(String comName){
        this.comName = comName;
    }

    public void giveInformation(String name){
        System.out.println("Hello everyone nice to meet you. My name is " + name);
    }

    
}
