import java.util.Arrays;

public class Example {

    public static void main(String[] args) {

        try{
            int num = 10;
            int num2 = 0;

            int result = num / num2;
            System.out.println("Result: " + result);
        } catch(ArithmeticException e){
            System.out.println("An erithmetic exception occured: " + e.getMessage());
        }

        System.out.println("Go ahead");

        // int num = 1;

        // while (num == 4) {
        //     num = getNum();

        //     // System.out.println(num);
        //     break;
        // }
        // int count = 1;
        // while (count <= 5) {
        //  System.out.println("Count: " + count);
        //     count++;
        // }
        
    // Exam num1 = new Exam();
    // generalOverwiev(num1);
        
    // Exam2 num2 = new Exam2();
    // generalOverwiev(num2);
        
        

    // }

    // public static void generalOverwiev(Parant parent){
    //     System.out.println("Thank you for choosing " + parent.getClass().getSimpleName().toLowerCase() + " See you!");
    // }

    //    public static void getNumber(int number){
    //             System.out.println("You can write your number: " + number);
    //         }

    // public static int getNumber(int number){
    //     // System.out.println("Your last number: " + number);
    //     return number + 2;
    // }

    //     public static int a(int num) {
    //         return num + 2;
    // }

    //     public static String a(String num){
    //         return "Hello";
    //     }

    }

    public static int getNum(){
        return (int) (Math.random()*3) + 1;
    }
    
}
