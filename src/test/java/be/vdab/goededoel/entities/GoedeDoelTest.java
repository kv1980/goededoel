package be.vdab.goededoel.entities;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

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
	
	@Test
	public void GoedeDoelenDieGelijkZijnHebbenDezelfdeHashCode() {
		assertEquals(doel.hashCode(),new GoedeDoel(NAAM).hashCode());
	}
	
	@Test
	public void GoedeDoelenDieNietGelijkZijnHebbenNietDezelfdeHashCode() {
		assertNotEquals(doel.hashCode(),new GoedeDoel("Rode Kruis").hashCode());
	}
	
	@Test
	public void goedDoelVerschiltVanEenObjectMetEenAnderType() {
		assertNotEquals(doel,BigDecimal.ZERO);
	}
	
	@Test
	public void goedDoelVerschiltVanEenGoedDoelMetEenAndereNaam() {
		GoedeDoel doel2 = new GoedeDoel("Rode Kruis");
		assertNotEquals(doel,doel2);
	}
	
	@Test
	public void goedDoelIsGelijkAanEenGoedDoelMetDezelfdeNaam() {
		GoedeDoel doel2 = new GoedeDoel("CliniClowns");
		assertEquals(doel,doel2);
	}
}