package be.vdab.goededoel.entities;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

public class GoedeDoelTest {
	private static final String NAAM = "CliniClowns";
	private GoedeDoel doel;

	@Before
	public void before() {
		doel = new GoedeDoel(NAAM);
	}

	@Test
	public void getNaam() {
		assertEquals(NAAM, doel.getNaam());
	}

	@Test
	public void eenNieuwDoelHeeftNogNietsOpgebracht() {
		assertEquals(0, doel.getOpgebracht().compareTo(BigDecimal.ZERO));
	}
	
	@Test
	public void eenDoelKanMetEenBedragWordenVerhoogd() {
		doel.verhoogOpgebracht(BigDecimal.TEN);
		doel.verhoogOpgebracht(BigDecimal.ONE);
		assertEquals(0, doel.getOpgebracht().compareTo(BigDecimal.valueOf(11)));
	}
}
