package net.tsolval.chargen.controller;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.inject.Named;

import net.tsolval.dice.Dice;
import net.tsolval.rpg.character.palladium.PalladiumAttribute;
import net.tsolval.rpg.character.palladium.PalladiumCharacter;

@Named
@RequestScoped
public class CharacterController {

	private PalladiumCharacter newCharacter;
	@Inject
	private Dice dice;

	public void generateAttributes() {
		for (PalladiumAttribute attribute : newCharacter.getAttributeList()) {
			rollAttribute(attribute);
		}
	}

	public void rollAttribute(PalladiumAttribute attribute) {
		int value = dice.sum(dice.roll(3, Dice.SIX_SIDED));
		PalladiumAttribute newAttribute = new PalladiumAttribute(attribute,
				value);
		newCharacter.setAttribute(newAttribute);
	}

	@PostConstruct
	public void initNewCharacter() {
		newCharacter = new PalladiumCharacter();
		generateAttributes();
		System.out.println("constructed new character...");
	}

	/**
	 * @return the newCharacter
	 */
	@Produces
	@Named
	public PalladiumCharacter getNewCharacter() {
		return newCharacter;
	}

	/**
	 * @param newCharacter
	 *            the newCharacter to set
	 */
	public void setNewCharacter(PalladiumCharacter newCharacter) {
		this.newCharacter = newCharacter;
	}

	/**
	 * @return the dice
	 */
	public Dice getDice() {
		return dice;
	}

	/**
	 * @param dice
	 *            the dice to set
	 */
	public void setDice(Dice dice) {
		this.dice = dice;
	}
}
