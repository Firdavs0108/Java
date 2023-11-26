package class_1;

import java.util.Arrays;

public class Array {
public static void main(String[] args) {
    
    String[] names = {"Ali", "Firdavs", "Abu"};

    names[2] = "Abubek";

    System.out.println(Arrays.toString(names));
    System.out.println(names[2]);

    String[] newNames = new String[10];

    for (int i = 0; i < names.length; i++) {
        newNames[i] = names[i];
    }

    // newNames[2];
    System.out.println(names[1]);
    System.out.println(newNames[1]);
}
   
}
