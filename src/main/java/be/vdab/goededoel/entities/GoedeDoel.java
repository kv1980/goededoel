package be.vdab.goededoel.entities;

import java.math.BigDecimal;

/**
 * Een <strong>goed doel</strong> waarvoor men geld inzamelt
 * @author curist
 */

public class GoedeDoel {
	private final String naam;
	private BigDecimal opgebracht = BigDecimal.ZERO;;

	/**
	 * maakt een GoedeDoel object aan
	 * @param naam de naam van het goede doel
	 */
	public GoedeDoel(String naam) {
		this.naam = naam;
	}

	/**
	 * geeft de naam van dit doel terug
	 * @return de naam
	 */
	public String getNaam() {
		return naam;
	}

	/**
	 * geeft terug hoeveel &euro; dit doel heeft opgebracht
	 * @return het opgebrachte bedrag
	 */
	public BigDecimal getOpgebracht() {
		return opgebracht;
	}
	
	/**
	 * verhoogt het opgebrachte bedrag
	 * @param bedrag het bedrag, waarmee het opgebrachte bedrag wordt verhoogd
	 */
	public void verhoogOpgebracht(BigDecimal bedrag) {
		opgebracht = opgebracht.add(bedrag);
	}

	
	@Override
	public int hashCode() {
		return this.naam.toUpperCase().hashCode();
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof GoedeDoel)) {
			return false;
		}
		return ((GoedeDoel) object).naam.equalsIgnoreCase(this.naam);
	}
}
