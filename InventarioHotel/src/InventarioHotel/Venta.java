package InventarioHotel;

public class Venta {
    private Producto producto;
    private int cantidadVendida;

    public Venta(Producto producto, int cantidadVendida) {
        this.producto = producto;
        if (producto.getCantidad() >= cantidadVendida) {
            this.cantidadVendida = cantidadVendida;
            this.producto.setCantidad(this.producto.getCantidad() - cantidadVendida);
        } else {
            throw new IllegalArgumentException("Cantidad insuficiente en inventario para vender.");
        }
    }

    @Override
    public String toString() {
        return "Venta de " + cantidadVendida + " unidades de " + producto.getNombre();
    }
}