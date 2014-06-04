package usj.renting;

import static org.junit.Assert.*;

import org.junit.Test;

public class SedanPriceTest {

	@Test
	public void testGetCharge_negativo() {
		SedanPrice sp = new SedanPrice();
        assertEquals("Negativo: -5", 1.5, sp.getCharge(-5),0.0);
	}
	@Test
	public void testGetCharge_cero() {
		SedanPrice sp = new SedanPrice();
        assertEquals("Cero: 0", 1.5, sp.getCharge(0),0.0);
	}
	@Test
	public void testGetCharge_Noif() {
		SedanPrice sp = new SedanPrice();
        assertEquals("NoIf: 3", 1.5, sp.getCharge(3),0.0);
	}
	@Test
	public void testGetCharge_SiIf() {
		SedanPrice sp = new SedanPrice();
        assertEquals("SiIf: 4", 3, sp.getCharge(4),0.0);
	}
	@Test
	public void testGetCharge_alto() {
		SedanPrice sp = new SedanPrice();
        assertEquals("Alto: 8", 9, sp.getCharge(8),0.0);
	}

	@Test
	public void testGetLoyaltyPoints_negativo() {
		SedanPrice sp = new SedanPrice();
        assertEquals("Negativo: -5", 1, sp.getLoyaltyPoints(-5));
	}
	@Test
	public void testGetLoyaltyPoints_cero() {
		SedanPrice sp = new SedanPrice();
        assertEquals("Cero: 0", 1, sp.getLoyaltyPoints(0));
	}
	@Test
	public void testGetLoyaltyPoints_alto() {
		SedanPrice sp = new SedanPrice();
        assertEquals("Alto: 178", 1, sp.getLoyaltyPoints(178));
	}

}
