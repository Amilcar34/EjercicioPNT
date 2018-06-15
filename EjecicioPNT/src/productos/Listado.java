package productos;

import java.util.*;

public class Listado{

	public static void main(String[] args)
	{
		
		ArrayList<Producto> listaDeProductos= new ArrayList<>();
		listaDeProductos.add(new Gaseosa("Coca-Cola Zero", 20));
		listaDeProductos.add(new Gaseosa("Coca-Cola", 18));
		listaDeProductos.add(new Limpieza("Limpieza Sedal", 500, 30));
		listaDeProductos.add(new Verduleria("Frutillas", 64, "kilo"));

		for(Producto resultado : listaDeProductos)
		{
			System.out.println(resultado.toString());
		}
		System.out.println("========================================================");
		
		String productoCaro = FiltroDePrecios.masCaro(listaDeProductos);
		String productoBrato = FiltroDePrecios.masBarato(listaDeProductos);
		
		System.out.println("El producto más caro: "+ productoCaro);
		System.out.println("El producto más barato: "+ productoBrato);
	}
}

