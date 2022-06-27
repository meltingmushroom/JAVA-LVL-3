package LVL3;

import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio4 {

    public static void main(String[] args) {
        List<Integer> listInteger = List.of(1, 2, 4, 4, 4);
        List<Integer> listFactorial = listInteger.stream()
                .map(Ejercicio4::factorial)
                .collect(Collectors.toList());
        List<Integer> filteredList = listFactorial.stream().distinct()
                .collect(Collectors.toList());
        System.out.println(filteredList);

    }

    public static int factorial(int valor) {
        System.out.println(valor);
        if (valor == 1) {
            return 1;
        }
        return valor * factorial(valor - 1);
    }
}