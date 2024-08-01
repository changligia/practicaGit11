import java.util.ArrayList;
import java.util.List;

public class Ejercicio6 {
    public static void main(String[] args) {
        final var array = crearArray();
        final var listaFiltrada = crearListaFiltrada(array);
        imprimirLista(listaFiltrada);

    }

    private static String[] crearArray() {
        return new String[]{"Adriana", "Rodrigo", "Jimena", "Ligia", "Nayelli", "Nayigia", "Liyelili",
                "Nora", "Norma", "Laura", "Camilo", "Mario", "Maleno", "Masco"};
    }

    private static List<String> crearListaFiltrada(String[] array) {
        final var lista = new ArrayList<String>();

        for (var elemento : array) {
            if (elemento.startsWith("N") && elemento.endsWith("a")) {
                lista.add(elemento);
            }
        }
        return lista;
    }

    private static void imprimirLista(List<String> lista) {
        System.out.printf("La lista filtrada es: %s%n", lista);
    }
}
