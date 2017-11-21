package JUinitACaso;

import java.util.ArrayList;

public class MetodiVari {

	private int number;
	private static int dim;
	private static int [] numeri;
	
	public MetodiVari(){
		number = 0;
		dim = 37;
		numeri = new int [dim];
	}
	
	public static void riempiArray(){
		
		for(int i = 0; i<dim; i++)
		{
			numeri[i] = i+1;
			System.out.print(numeri[i] +  " ");
		}
		System.out.println();
	}

	
	public static void prendiPrimi(){
		
		ArrayList <Integer> primi = new ArrayList<Integer>();
		
		for(int i = 0; i<dim; i++)
		{
			boolean primo = true;
			int daProcessare = numeri[i];

			if(daProcessare > 2)
			{
				for(int j = 2; j <= daProcessare/2; j++)
				{
					if(daProcessare%j == 0)
						primo=false;
				}
			}
			if(primo)
				primi.add(daProcessare);
		}
		
		System.out.println(primi);
	}
	
	public static boolean verificaPrimo(int num){
		
		for(int i=2; i<= num/2; i++)
		{
			if(num%i == 0)
				return false;
		}
		
		return true;
	}
	
	
	public static int sommaValori(){
		return numeri[0] + numeri[dim-1];
	}
	
	public static int moltiplicaValori(){
		return numeri[(dim/2)-1] * numeri[(dim/2)+1];
	}
	
	public static int numCentrale(){
		return moltiplicaValori() + numeri[dim/2];
	}
	
	
	public static void main(String[] args) {
		
		MetodiVari v = new MetodiVari();
		riempiArray();
		prendiPrimi();
		
		if(verificaPrimo(37))
			System.out.println("Ricca leggiti sto cazzo");
		
		System.out.println(sommaValori() + "   " + moltiplicaValori() + "    " + numCentrale());
	}
}
