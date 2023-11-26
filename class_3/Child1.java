package class_3;

public class Child1 extends Parent {

    private String model;

    public Child1( String name, int age, String model){
        super(name, age);
        this.model = model;
    }


    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    

    @Override
    public void printMessage() {
        System.out.println("Hello from " + getClass().getSimpleName().toLowerCase());

    }


    @Override
    public String toString() {
        return "Child1 model=" + model + " name = " + getName() + " age= " + getAge();
    }

    
}
