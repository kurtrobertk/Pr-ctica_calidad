package usj.renting;

import static org.junit.Assert.*;
import junit.framework.TestCase;

import org.junit.Test;

public class CoupePriceTest extends TestCase {

	@Test
	public void testGetCharge_negativo() {
		CoupePrice cp = new CoupePrice();
		assertEquals("Negativo: -1", 2.0, cp.getCharge(-1), (double)0.0);
	}
	@Test
	public void testGetCharge_cero() {
		CoupePrice cp = new CoupePrice();
        assertEquals("Cero: 0", 2.0, cp.getCharge(0), (double)0.0);
	}
	@Test
	public void testGetCharge_noif() {
        CoupePrice cp = new CoupePrice();
        assertEquals("Noif: 2", 2.0, cp.getCharge(2), (double)0.0);
	}
	@Test
	public void testGetCharge_if() {
        CoupePrice cp = new CoupePrice();
        assertEquals("If: 3", 3.5, cp.getCharge(3), (double)0.0);
	}
	@Test
	public void testGetCharge_alto() {
        CoupePrice cp = new CoupePrice();
        assertEquals("Número alto: 6",8, cp.getCharge(6), (double)0.0);
	}
	@Test
	public void testGetLoyaltyPoints_negativo() {
		CoupePrice cp = new CoupePrice();
		assertEquals("negativo: -5", 1, cp.getLoyaltyPoints(-5));
	}
	@Test
	public void testGetLoyaltyPoints_cero() {
		CoupePrice cp = new CoupePrice();
		assertEquals("Cero: 0", 1, cp.getLoyaltyPoints(0));
	}
	@Test
	public void testGetLoyaltyPoints_alto() {
		CoupePrice cp = new CoupePrice();
		assertEquals("Alto: 178", 1, cp.getLoyaltyPoints(178));
	}

}
