package class_1;

import java.util.Arrays;
import java.util.stream.IntStream;

// import java.util.Arrays;

public class Codewars {

        // public static int findAverage(int[] nums) {

        //     int sum = 0;
        //     for (int i = 0; i < nums.length; i++) {
        //         sum += nums[i];
        //     }
        //       return  sum / nums.length;
        // }


        public static int[] mergeArrays(int[] a, int[] b) {
            if (a == null || b == null) {
                throw new RuntimeException("Input arrays cannot be null");
            } else{
                System.out.println("Very nice");
            }
           return IntStream.concat(Arrays.stream(a), Arrays.stream(b))
           .distinct()
           .toArray();

           
        }

        @Override
        public String toString() {
            return "This is example of " + mergeArrays(null, null);
        }
       
    }
    

    
    

