package supermercado;

import java.util.LinkedList;
import java.util.List;

public class Stock {
	
	private Producto maxProd;
	private Producto minProd;
	private List<Producto> productos = new LinkedList<Producto>();
	
	public Stock() {
		// hardcoded data
		agregarProducto(new Bebida("Coca-Cola Zero", 20, 1.5f));
		agregarProducto(new Bebida("Coca-Cola", 18, 1.5f));
		agregarProducto(new Frasco("Shampoo Sedal", 30, 500));
		agregarProducto(new Comida("Frutillas", 64, "kilo"));
	}
	
	private void agregarProducto(Producto producto) {
		actualizarValores(producto);
		productos.add(producto);
	}
	
	private void actualizarValores(Producto prod) {
		if (productos.isEmpty()) {
			this.maxProd = prod;
			this.minProd = prod;
		}
		else if (prod.getPrecio() > this.maxProd.getPrecio()) this.maxProd = prod;
		else if (prod.getPrecio() < this.minProd.getPrecio()) this.minProd = prod;
	}
	
	@Override
	public String toString() {
		String ret = "";
		for (Producto producto : this.productos) {
			ret += producto + "\n";
		}
		ret += "=============================\n";
		ret += "Producto más caro: " + this.maxProd.getNombre() + "\n";
		ret += "Producto más barato: " + this.minProd.getNombre();
		return ret;
	}
}
