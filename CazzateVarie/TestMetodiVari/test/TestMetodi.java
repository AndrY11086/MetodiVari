package test;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import JUinitACaso.MetodiVari;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestMetodi {

	private static MetodiVari mv;

	@BeforeClass
	public static void init(){
		mv = new MetodiVari();
	}
	
	@Test
	public void testSommaValori(){
		//mv.riempiArray();
		Assert.assertEquals(38,mv.sommaValori());
	}
	
	@Test
	public void testMoltiplicazione(){
		mv.riempiArray();
		Assert.assertEquals(360, mv.moltiplicaValori());
	}
	
	@AfterClass
	public static void delete(){
		mv = null;
	}
}
