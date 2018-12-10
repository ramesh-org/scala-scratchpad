package examples;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JavaList {
    public static List<Integer> getNumbers() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        return numbers;
    }

    public static Map<String, String> getPeeps() {
        Map<String, String> peeps = new HashMap<>();
        peeps.put("captain", "Kirk");
        peeps.put("doctor", "McCoy");
        return peeps;
    }

    public static void main(String args[]){
        System.out.println(getNumbers());
        System.out.println(getPeeps());
    }
}
