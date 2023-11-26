package class_3;

public class Child1 extends Parent {

    private String model;

    public Child1(String model, String name, int age){
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
    public String toString() {
        return "Child1 model=" + model + " name = " + getName() + " age= " + getAge();
    }

    
}
