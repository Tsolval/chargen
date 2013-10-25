package net.tsolval.chargen.controller;

import java.util.Arrays;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Named;

import net.tsolval.rpg.Attribute;
import net.tsolval.rpg.Character;
import net.tsolval.rpg.character.palladium.PalladiumAttribute;
import net.tsolval.rpg.character.palladium.PalladiumCharacter;

@Named
@RequestScoped
public class CharacterController {

	private Character newCharacter;

	public void generateAttributes() {

	}

	@PostConstruct
	public void initNewCharacter() {
		newCharacter = new PalladiumCharacter();
		Attribute iq = PalladiumAttribute.IQ;
		Attribute me = PalladiumAttribute.ME;
		Attribute ma = PalladiumAttribute.MA;
		Attribute pe = PalladiumAttribute.PE;
		Attribute pp = PalladiumAttribute.PP;
		Attribute ps = PalladiumAttribute.PS;
		Attribute pb = PalladiumAttribute.PB;
		Attribute spd = PalladiumAttribute.SPD;
		newCharacter.setAttributes(Arrays.asList(iq, me, ma, pe, pp, ps, pb,
				spd));
	}

	/**
	 * @return the newCharacter
	 */
	@Produces
	@Named
	public Character getNewCharacter() {
		return newCharacter;
	}

	/**
	 * @param newCharacter
	 *            the newCharacter to set
	 */
	public void setNewCharacter(Character newCharacter) {
		this.newCharacter = newCharacter;
	}
}
