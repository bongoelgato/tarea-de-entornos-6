package es.foc;

/**
 * Clase Tarea6EDClase para aplicar descuentos a productos.
 */
public class Tarea6EDClase {
    private static final double descuento_mayor = 5.0;
    private static final double descuento_general = 0.8;
    private static final double descuento_sin_productos = 0.95;

    /**
     * Aplica un descuento al precio del producto basado en el número de productos.
     *
     * @param precioProducto El precio del producto.
     * @param numProductos El número de productos.
     */
    public void aplicarDescuento(double precioProducto, int numProductos) {
        double Total;

        if (numProductos > 3) {
            precioProducto -= descuento_mayor;
        }

        if (numProductos != 0) {
            Total = precioProducto * descuento_general;
        } else {
            Total = precioProducto * descuento_sin_productos;
        }

        extracted(Total);
    }

    /**
     * Imprime el total a pagar.
     *
     * @param Total El total a pagar.
     */
    private static void extracted(double Total) {
        System.out.println("El total a pagar es: " + Total);
        System.out.println("Enviado");
    }
}

