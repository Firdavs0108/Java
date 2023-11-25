import out.production.Java.class_1.Example;

public class Main {
    public static void main(String[] args) {
        
        Example exam = new Example("Firdavs", 23, "Nextree");

       exam.giveInformation("Firdavs");
       System.out.println("My age is " + exam.getAge()); 
       System.out.println("My working company is " + exam.getComName());

    }
}
