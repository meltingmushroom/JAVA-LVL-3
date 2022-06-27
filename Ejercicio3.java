package LVL3;

import java.util.List;

public class Ejercicio3 {

    public static void main(String[] args) {
        List<String> words = List.of("Batman", "Aquaman", "Flash", "Batgirl", "Wonder Woman", "brainiac");
        long contarPalabrasConB = words.stream()
                .filter(inicial -> inicial.startsWith("B")||inicial.startsWith("b"))
                .count();
        System.out.println(contarPalabrasConB);
    }
}