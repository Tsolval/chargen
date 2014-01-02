package net.tsolval.palladium.bean;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import net.tsolval.rpg.character.palladium.PalladiumCharacter;

@Named
@RequestScoped
public class PalladiumCharacterBean {

	private PalladiumCharacter character;

	/**
	 * @return the character
	 */
	public PalladiumCharacter getCharacter() {
		return character;
	}

	/**
	 * @param character
	 *            the character to set
	 */
	public void setCharacter(PalladiumCharacter character) {
		this.character = character;
	}
}
