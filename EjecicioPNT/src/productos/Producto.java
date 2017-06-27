package productos;

public abstract class Producto {

	private String nombre;
	private int precio;


	public Producto(String nombre, int precio){
		this.nombre= nombre;
		this.precio= precio;
	}

	public void setNombre(String nombre){
		this.nombre= nombre;
	}

	public String getNombre(){
		return nombre;
	}

	public void setPrecio(int precio){
		this.precio=precio;
	}

	public int getPrecio(){
		return precio;
	}
}
