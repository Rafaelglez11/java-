

public class RobotSensores {
    public static void main(String[] args) {
        // Lecturas de los sensores en cm
        int[] lecturas = {120, 85, 210, 150};

        // Umbral crítico
        int umbral = 100;

        // Recorremos cada lectura
        for (int i = 0; i < lecturas.length; i++) {
            int valor = lecturas[i];
            System.out.println("Sensor " + (i + 1) + ": " + valor + " cm");

            // Si la lectura es menor al umbral, mostramos advertencia
            if (valor < umbral) {
                System.out.println("  ⚠ ADVERTENCIA: Distancia crítica detectada.");
            }
        }
    }
}
