package test;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import JUinitACaso.MetodiVari;
import junit.framework.Assert;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestChePoiFaccioLaSuite {

	private static MetodiVari mv;
	
	@BeforeClass
	public static void init(){
		mv = new MetodiVari();
	}
	
	@Test
	public void testRiempiArray(){
		//mv.riempiArray();
		
		for(int i = 0; i<mv.getDim(); i++)
			Assert.assertEquals(i+1, mv.numeri[i]);
	}
	
	@Test
	public void testNumCentrale(){
		mv.riempiArray();
		
		Assert.assertEquals(379, mv.numCentrale());
	}
	
	@Test
	public void testVerificaPrimo(){
		
		Assert.assertEquals(true, mv.verificaPrimo(37));
	}
	
	@AfterClass
	public static void finish(){
		System.out.println("HO FINITO MERDEEEEEE");
	}
}
