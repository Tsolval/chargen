package net.tsolval.chargen.controller;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Named;

import net.tsolval.chargen.model.Attribute;
import net.tsolval.chargen.model.Character;

@Named
@RequestScoped
public class CharacterController {

	private Character newCharacter;

	public void generateAttributes() {

	}

	@PostConstruct
	public void initNewCharacter() {
		newCharacter = new Character();
		Set<Attribute> attributes = new LinkedHashSet<Attribute>();
		newCharacter.setAttributes(attributes);
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
