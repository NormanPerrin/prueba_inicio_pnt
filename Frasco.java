package supermercado;

public class Frasco extends Producto {
	
	private int contenido;
	
	public Frasco(String nombre, double precio, int contenido) {
		super(nombre, precio);
		this.contenido = contenido;
	}
	
	@Override
	public String toString() {
		return super.toString() + "Contenido: " +this.contenido + "mm";
	}

}
