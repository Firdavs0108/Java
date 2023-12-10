package class_4;
import java.util.Objects;

public class Parent {

    private String name;
    private int age;
    private String gender;
    private String univName;
    private int degree;

    public Parent(String name, int age, String gender, String univName, int degree) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.univName = univName;
        this.degree = degree;
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

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getUnivName() {
        return this.univName;
    }

    public void setUnivName(String univName) {
        this.univName = univName;
    }

    public int getDegree() {
        return this.degree;
    }

    public void setDegree(int degree) {
        this.degree = degree;
    }

    public Parent name(String name) {
        setName(name);
        return this;
    }

    public Parent age(int age) {
        setAge(age);
        return this;
    }

    public Parent gender(String gender) {
        setGender(gender);
        return this;
    }

    public Parent univName(String univName) {
        setUnivName(univName);
        return this;
    }

    public Parent degree(int degree) {
        setDegree(degree);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Parent)) {
            return false;
        }
        Parent parent = (Parent) o;
        return Objects.equals(name, parent.name) && age == parent.age && Objects.equals(gender, parent.gender) && Objects.equals(univName, parent.univName) && degree == parent.degree;
    }

   
    

    @Override
    public String toString() {
        return "name=" + name + ", age=" + age + ", gender=" + gender + ", univName=" + univName + ", degree="
                + degree + "";
    }

    


    
}
