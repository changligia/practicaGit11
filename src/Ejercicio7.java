import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Ejercicio7 {
    public static void main(String[] args) {
        final var array = RandomUtilities.generarRandomArrayInt(250, 2000, 1, new Random());
        final var set = obtenerValoresUnicos(array);
        imprimirSet(set);
    }

    private static Set<Integer> obtenerValoresUnicos(int[] array) {
        final var set = new HashSet<Integer>();
        for (var elemento : array) {
            if (elemento % 3 == 0 && elemento > 1050) {
                set.add(elemento);
            }
        }
        return set;
    }

    private static void imprimirSet(Set<Integer> set) {
        System.out.printf("Los valores del set son: %s%n", set);
    }
}
