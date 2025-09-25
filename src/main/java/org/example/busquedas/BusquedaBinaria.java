package org.example.busquedas;

/**
 * Clase que implementa el algoritmo de búsqueda binaria
 */
public class BusquedaBinaria {
    private int comparaciones;

    public BusquedaBinaria() {
        this.comparaciones = 0;
    }

    /**
     * Realiza una búsqueda binaria en el arreglo
     * @param arr Arreglo ordenado donde buscar
     * @param elemento Elemento a buscar
     * @return índice del elemento si se encuentra, -1 si no
     */
    public int buscar(int[] arr, int elemento) {
        comparaciones = 0;
        int izquierda = 0;
        int derecha = arr.length - 1;

        while (izquierda <= derecha) {
            int medio = izquierda + (derecha - izquierda) / 2;
            comparaciones++;

            if (arr[medio] == elemento)
                return medio;

            if (arr[medio] < elemento)
                izquierda = medio + 1;
            else
                derecha = medio - 1;
        }
        return -1;
    }

    /**
     * Obtiene el número de comparaciones realizadas en la última búsqueda
     * @return número de comparaciones
     */
    public int getComparaciones() {
        return comparaciones;
    }
}
