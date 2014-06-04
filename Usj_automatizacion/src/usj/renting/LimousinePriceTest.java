package usj.renting;

import static org.junit.Assert.*;

import org.junit.Test;

public class LimousinePriceTest {

	@Test
	public void testGetCharge_negativo() {
		LimousinePrice lp = new LimousinePrice();
        assertEquals("Negativo: -5", -15.0, lp.getCharge(-5), (double)0.0);
	}
	@Test
	public void testGetCharge_cero() {
		LimousinePrice lp = new LimousinePrice();
        assertEquals("Cero: 0", 0.0, lp.getCharge(0), (double)0.0);
	}
	@Test
	public void testGetCharge_alto() {
		LimousinePrice lp = new LimousinePrice();
        assertEquals("Alto: 20", 60.0, lp.getCharge(20), (double)0.0);
	}

	@Test
	public void testGetLoyaltyPoints_negativo() {
		LimousinePrice lp = new LimousinePrice();
        assertEquals("Negativo: -5", 1, lp.getLoyaltyPoints(-5));
	}
	@Test
	public void testGetLoyaltyPoints_cero() {
		LimousinePrice lp = new LimousinePrice();
        assertEquals("Cero: 0", 1, lp.getLoyaltyPoints(0));
	}
	@Test
	public void testGetLoyaltyPoints_noif() {
		LimousinePrice lp = new LimousinePrice();
        assertEquals("NoIf: 1", 1, lp.getLoyaltyPoints(1));
	}
	@Test
	public void testGetLoyaltyPoints_if() {
		LimousinePrice lp = new LimousinePrice();
        assertEquals("Siif: 2", 2, lp.getLoyaltyPoints(2));
	}
	@Test
	public void testGetLoyaltyPoints_alto() {
		LimousinePrice lp = new LimousinePrice();
        assertEquals("Alto: 6", 2, lp.getLoyaltyPoints(6));
	}

}
