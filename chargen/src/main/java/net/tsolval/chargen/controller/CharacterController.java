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
		System.out.println("generating attributes...");
		newCharacter.setIq(rollAttribute(newCharacter.getIq()));
		newCharacter.setMa(rollAttribute(newCharacter.getMa()));
		newCharacter.setMe(rollAttribute(newCharacter.getMe()));
		newCharacter.setPb(rollAttribute(newCharacter.getPb()));
		newCharacter.setPe(rollAttribute(newCharacter.getPe()));
		newCharacter.setPp(rollAttribute(newCharacter.getPp()));
		newCharacter.setPs(rollAttribute(newCharacter.getPs()));
		newCharacter.setSpd(rollAttribute(newCharacter.getSpd()));
	}

	public PalladiumAttribute rollAttribute(PalladiumAttribute attribute) {
		return new PalladiumAttribute(attribute, dice.sum(dice.roll(3,
				Dice.SIX_SIDED)));
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
