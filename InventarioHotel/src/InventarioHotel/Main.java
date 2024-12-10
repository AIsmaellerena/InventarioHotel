package InventarioHotel;

public class Main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();

        Producto p1 = new Producto("Agua", 50, 0.50);
        Producto p2 = new Producto("Coca Cola", 30, 1.00);

        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);

        inventario.mostrarInventario();

        Compra compra = new Compra(p1, 20);
        System.out.println(compra);

        try {
            Venta venta = new Venta(p2, 10);
            System.out.println(venta);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        inventario.mostrarInventario();
    }
}
