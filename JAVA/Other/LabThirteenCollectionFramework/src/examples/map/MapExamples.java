package examples.map;

import java.util.HashMap;
import java.util.Map;
public class MapExamples {
    public static void main(String[] args) {
        // it holds data in key-value pair
        Map<Integer, String> products = new HashMap<>();
        products.put(0,"Desktokp PC");
        products.put(1,"Monitor");
        products.put(2,"Mouse");
        products.put(3,"Keyboard");
        products.put(4,"Mic");
        
        // accessing data using get() with index
        System.out.println(products.get(2)); // it will display mouse
        // displaying map object
        System.out.println("Products: " + products); // list was in [] and map is in {}
        
        // displayiing all data of map object using for loop
        for(Map.Entry<Integer, String> product : products.entrySet()){
            System.out.println("Products: Key - " + product.getKey() + " value - " + product.getValue());
        }
        
        // in this example we have map with key type Integer and value type String
        // so it will give us Integer value as keyand String value as value
        // We can also define type String key and value
        Map<String,String> students = new HashMap();
        
        students.put("full_name", "Bibek Maharjan");
        students.put("email", "bibekmh@gmail.com");
        students.put("address", "Lalitpur");
        // note key must follow the rule of identifier
        
        for(Map.Entry<String, String> student : students.entrySet()){
            System.out.println("Key: " + student.getKey() + " Value: " + student.getValue());
        }
        
    }
}