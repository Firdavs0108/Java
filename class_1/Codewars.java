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
           return IntStream.concat(Arrays.stream(a), Arrays.stream(b))
           .distinct()
           .toArray();
        }
    }

    
    

