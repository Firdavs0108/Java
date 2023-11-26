
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import class_1.Arraylist;
import class_1.Codewars;

public class Main {


    public static void main(String[] args) {
       Codewars example = null;
      try {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = null;

        System.out.println(Arrays.toString(example.mergeArrays(a, b)));

      } catch (Exception e) {
          System.out.println("Sorry file is not found. " + e.getMessage());
      }

      if (example != null) {
        System.out.println(example);
      } else{
        System.out.println("Make sure about your mistake.Try again");
      }

        

        //     int [] nums= {1,2,3,4,6};
        // System.out.println(example.findAverage(nums));

        int[] a = {1,3,4,6,7};
        int[] b = {1,2,4,5,7,8};

        // System.out.println(Arrays.toString(example.mergeArrays(a, b)));
        

        List<Integer> numbers = new ArrayList<>();

        numbers.add(3);
        numbers.add(43);

        numbers.set(1,56);

        numbers.remove(1);

        // System.out.println(numbers);
        
    }

    
}