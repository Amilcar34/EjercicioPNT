package productos;


public final class Gaseosa extends Producto {

	private double litros;

	public Gaseosa(String nombre, int precio){
		super(nombre, precio);

		litros= 1.5;
	}

	public double getLitros(){
		return litros;
	}


		@Override
		public String toString()
		{ return "Nombre: "+getNombre()+" /// Litros: "+getLitros()+" /// Precio: $"+getPrecio();	}

}
