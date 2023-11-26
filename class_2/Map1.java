package class_2;

import java.util.HashMap;
import java.util.Map;

public class Map1 {
    

    Map<String,Integer> fruits = new HashMap<>();

    public void addFruits(String fruitName, int quantity){
        fruits.put(fruitName, quantity);
        fruits.put("Orange", 6);
        fruits.put("Pineapple", 9);
    }

    @Override
    public String toString() {
        return "Map1 [fruits=" + fruits + "]";
    }

   
    
    
}