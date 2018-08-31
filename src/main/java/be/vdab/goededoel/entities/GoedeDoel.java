package be.vdab.goededoel.entities;

import java.math.BigDecimal;

public class GoedeDoel {
	private final String naam;
	private BigDecimal opgebracht = BigDecimal.ZERO;;
	public GoedeDoel(String naam) {
		this.naam = naam;
	}
	public String getNaam() {
		return naam;
	}
	public BigDecimal getOpgebracht() {
		return opgebracht;
	}
	
	public void verhoogOpgebracht(BigDecimal bedrag) {
		opgebracht = bedrag;
	}
}
