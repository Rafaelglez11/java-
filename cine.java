

import java.util.Scanner;

public class CineAsientos {
    public static void main(String[] args) {
        // Crear la matriz del cine (4 filas x 5 columnas) inicializada en 0
        int[][] cine = new int[4][5];
        Scanner sc = new Scanner(System.in);

        // Función para imprimir el mapa de asientos
        System.out.println("Mapa de asientos (0 = libre, 1 = ocupado):");
        imprimirMapa(cine);

        // Pedir fila y asiento al usuario
        System.out.print("\nIngrese el número de fila (1-4): ");
        int fila = sc.nextInt() - 1;
        System.out.print("Ingrese el número de asiento (1-5): ");
        int asiento = sc.nextInt() - 1;

        // Marcar el asiento como ocupado
        cine[fila][asiento] = 1;

        // Mostrar mapa actualizado
        System.out.println("\nMapa actualizado:");
        imprimirMapa(cine);

        // Contar asientos libres
        int libres = 0;
        for (int i = 0; i < cine.length; i++) {
            for (int j = 0; j < cine[i].length; j++) {
                if (cine[i][j] == 0) libres++;
            }
        }
        System.out.println("\nNúmero total de asientos libres: " + libres);

        sc.close();
    }

    // Método para imprimir el mapa de asientos
    public static void imprimirMapa(int[][] cine) {
        for (int i = 0; i < cine.length; i++) {
            for (int j = 0; j < cine[i].length; j++) {
                System.out.print(cine[i][j] + " ");
            }
            System.out.println();
        }
    }
}
