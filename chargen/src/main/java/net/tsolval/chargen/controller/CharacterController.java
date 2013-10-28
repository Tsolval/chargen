package net.tsolval.chargen.controller;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Named;

import net.tsolval.rpg.character.palladium.PalladiumCharacter;

@Named
@RequestScoped
public class CharacterController {

	private PalladiumCharacter newCharacter;

	public void generateAttributes() {

	}

	@PostConstruct
	public void initNewCharacter() {
		newCharacter = new PalladiumCharacter();
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
}
