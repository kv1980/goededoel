package be.vdab.goededoel.entities;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import be.vdab.goededoel.entities.GoedeDoel;

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
}
