package org.example;

import org.example.busquedas.BusquedaBinaria;
import org.example.busquedas.BusquedaLineal;
import org.example.busquedas.OrdenamientoInsercion;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Generar arreglo aleatorio
        int[] numeros = generarArregloAleatorio(20, 1, 100);

        // Mostrar arreglo original
        System.out.println("Arreglo original:");
        System.out.println(Arrays.toString(numeros));

        // Crear copia para ordenar
        int[] numerosOrdenados = Arrays.copyOf(numeros, numeros.length);

        // Ordenar y mostrar
        OrdenamientoInsercion.ordenar(numerosOrdenados);
        System.out.println("\nArreglo ordenado:");
        System.out.println(Arrays.toString(numerosOrdenados));

        // Solicitar número a buscar
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nIngrese el número a buscar: ");
        int numeroBuscado = scanner.nextInt();

        // Búsqueda lineal
        BusquedaLineal busquedaLineal = new BusquedaLineal();
        int resultadoLineal = busquedaLineal.buscar(numerosOrdenados, numeroBuscado);
        System.out.println("\nResultados de búsqueda lineal:");
        System.out.println("Número " + (resultadoLineal != -1 ? "encontrado en posición " + resultadoLineal : "no encontrado"));
        System.out.println("Comparaciones realizadas: " + busquedaLineal.getComparaciones());

        // Búsqueda binaria
        BusquedaBinaria busquedaBinaria = new BusquedaBinaria();
        int resultadoBinario = busquedaBinaria.buscar(numerosOrdenados, numeroBuscado);
        System.out.println("\nResultados de búsqueda binaria:");
        System.out.println("Número " + (resultadoBinario != -1 ? "encontrado en posición " + resultadoBinario : "no encontrado"));
        System.out.println("Comparaciones realizadas: " + busquedaBinaria.getComparaciones());

        // Comparación de métodos
        System.out.println("\nComparación de métodos:");
        System.out.println("- Búsqueda lineal: " + busquedaLineal.getComparaciones() + " comparaciones");
        System.out.println("- Búsqueda binaria: " + busquedaBinaria.getComparaciones() + " comparaciones");
    }

    private static int[] generarArregloAleatorio(int tamaño, int min, int max) {
        Random random = new Random();
        int[] arreglo = new int[tamaño];
        for (int i = 0; i < tamaño; i++) {
            arreglo[i] = random.nextInt(max - min + 1) + min;
        }
        return arreglo;
    }
}
