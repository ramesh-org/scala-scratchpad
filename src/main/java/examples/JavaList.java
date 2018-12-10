package examples;

import java.util.ArrayList;
import java.util.List;

public class JavaList {
    public static List<Integer> getNumbers() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        return numbers;
    }

    public static void main(String args[]){
        System.out.println(getNumbers());
    }
}
