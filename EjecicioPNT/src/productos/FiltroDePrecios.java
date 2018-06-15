package productos;

import java.util.ArrayList;

public class FiltroDePrecios {
	
	protected static String masCaro(ArrayList<Producto> lista){

		Producto caro=lista.get(0);

		for(Producto resultado : lista)
		{
			if(resultado.getPrecio() > lista.get(0).getPrecio())
			{
				caro= resultado;	
			}
		}
		return caro.getNombre();
	}
	
	protected static String masBarato(ArrayList<Producto> lista){

		Producto barato= lista.get(0);

		for(Producto resultado : lista)
		{ if(resultado.getPrecio() < lista.get(0).getPrecio())
			{
				barato= resultado;
			}
		}
		return barato.getNombre();
	
	}


}
