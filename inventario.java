

public class InventarioAlmacen {
    public static void main(String[] args) {
        // Matriz del inventario: [ID, Cantidad, Precio]
        double[][] inventario = {
                {101, 50, 20.5},  // Producto 1
                {102, 30, 15.0},  // Producto 2
                {103, 80, 12.75}  // Producto 3
        };

        // Mostrar datos del inventario
        System.out.println("Datos del inventario:");
        for (int i = 0; i < inventario.length; i++) {
            System.out.println("ID: " + (int)inventario[i][0] +
                    ", Cantidad: " + (int)inventario[i][1] +
                    ", Precio: $" + inventario[i][2]);
        }

        // Elegimos el segundo producto (índice 1) como ejemplo
        int indiceProducto = 1;
        int cantidad = (int)inventario[indiceProducto][1];
        double precio = inventario[indiceProducto][2];

        // Calcular el valor total
        double valorTotal = cantidad * precio;
        System.out.println("\nValor total del producto " + (int)inventario[indiceProducto][0] +
                ": $" + valorTotal);

        // Actualizar el stock después de vender 10 unidades
        inventario[indiceProducto][1] = cantidad - 10;

        // Mostrar inventario actualizado
        System.out.println("\nInventario actualizado:");
        for (int i = 0; i < inventario.length; i++) {
            System.out.println("ID: " + (int)inventario[i][0] +
                    ", Cantidad: " + (int)inventario[i][1] +
                    ", Precio: $" + inventario[i][2]);
        }
    }
}
