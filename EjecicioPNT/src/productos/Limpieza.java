package productos;

public class Limpieza extends Producto {

	private	int contenido;

	public Limpieza( String nombre, int contenido, int precio ){
		super(nombre, precio);
		this.contenido=contenido;
	}	

	public int getContenido() {
		return contenido;
	}

	public void setContenido(int contenido) {
		this.contenido = contenido;
	}

		@Override
		public String toString()
		{ return "Nombre: "+ getNombre() +" /// Contenido: "+ contenido +" /// Precio: "+ getPrecio();}

}
