package org.example.busquedas;

/**
 * Clase que implementa el algoritmo de búsqueda lineal
 */
public class BusquedaLineal {
    private int comparaciones;

    public BusquedaLineal() {
        this.comparaciones = 0;
    }

    /**
     * Realiza una búsqueda lineal en el arreglo
     * @param arr Arreglo donde buscar
     * @param elemento Elemento a buscar
     * @return índice del elemento si se encuentra, -1 si no
     */
    public int buscar(int[] arr, int elemento) {
        comparaciones = 0;
        for (int i = 0; i < arr.length; i++) {
            comparaciones++;
            if (arr[i] == elemento) {
                return i;
            }
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
