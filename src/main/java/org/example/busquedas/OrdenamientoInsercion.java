package org.example.busquedas;

/**
 * Clase que implementa el algoritmo de ordenamiento por inserción
 */
public class OrdenamientoInsercion {

    /**
     * Ordena un arreglo utilizando el algoritmo de inserción
     * @param arr Arreglo a ordenar
     */
    public static void ordenar(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}
