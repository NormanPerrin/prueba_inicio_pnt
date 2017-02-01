package supermercado;

public class Comida extends Producto {
	
	private String unidadVenta;
	
	public Comida(String nombre, double precio, String unidadVenta) {
		super(nombre, precio);
		this.unidadVenta = unidadVenta;
	}
	
	@Override
	public String toString() {
		return super.toString() + "Unidad de venta: " + this.unidadVenta;
	}

}
