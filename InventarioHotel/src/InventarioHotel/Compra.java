package InventarioHotel;

public class Compra {
    private Producto producto;
    private int cantidadComprada;

    public Compra(Producto producto, int cantidadComprada) {
        this.producto = producto;
        this.cantidadComprada = cantidadComprada;
        this.producto.setCantidad(this.producto.getCantidad() + cantidadComprada);
    }

    @Override
    public String toString() {
        return "Compra de " + cantidadComprada + " unidades de " + producto.getNombre();
    }
}