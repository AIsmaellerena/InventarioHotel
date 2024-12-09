package InventarioHotel;

public class Main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();

        // Crear productos
        Producto p1 = new Producto("Agua", 50, 0.50);
        Producto p2 = new Producto("Coca Cola", 30, 1.00);

        // Agregar productos al inventario
        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);

        // Mostrar inventario
        inventario.mostrarInventario();

        // Registrar una compra
        Compra compra = new Compra(p1, 20);
        System.out.println(compra);

        // Registrar una venta
        try {
            Venta venta = new Venta(p2, 10);
            System.out.println(venta);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // Mostrar inventario actualizado
        inventario.mostrarInventario();
    }
}
