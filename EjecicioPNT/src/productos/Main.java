package productos;

import java.util.*;

public class Main{

	public static void main(String[] supermercado){

		try{
			ArrayList<Producto> lista= new ArrayList<>();
			lista.add(new Gaseosa("Coca-Cola Zero", 20));
			lista.add(new Gaseosa("Coca-Cola", 18));
			lista.add(new Shampoo("Shampoo Sedal", 500, 30));
			lista.add(new Fruta("Frutillas", 64, "kilo"));

			for(Producto resultado : lista){
				System.out.println(resultado.toString());

			}
			System.out.println("========================================================");
			System.out.println("Producto más caro: "+ masCaro(lista));
			System.out.println("Producto más barato: "+ masBarato(lista));

		}
		catch(Exception e){
			System.out.println("No se pudo crear el ArrayList");
		}

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


}

