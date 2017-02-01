package supermercado;

public class Bebida extends Producto {
	
	private float litros;
	
	public Bebida(String nombre, double precio, float litros) {
		super(nombre, precio);
		this.litros = litros;
	}
	
	@Override
	public String toString() {
		return super.toString() + "Litros: " + this.litros;
	}

}
