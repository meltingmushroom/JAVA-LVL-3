package LVL3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio1 {

    public static void main(String[] args) {
        List<String> listString = new ArrayList<>();
        listString.add("13");
        listString.add("Red");
        listString.add(null);
        listString.add("");
        listString.add("Java");

        List<String> filteredList = listString.stream()
                .filter(element -> !(element == null))
                .filter(element -> !element.isEmpty())
                .collect(Collectors.toList());
        System.out.println(filteredList);
    }
}