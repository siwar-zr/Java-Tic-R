package CollectionApi;

import java.util.HashMap;
import java.util.Map;

public class DemoMap {

    public static void main(String[] args){
        Map<String,Integer> students = new HashMap<>();

        students.put("Ali",18);
        students.put("hassen",16);
        students.put("Sonia",19);
        students.put("Med",12);
        students.put("Sonia",17);

        System.out.println(students.keySet());

        System.out.println(students);
        System.out.println(students.get("hassen"));

    }
}
