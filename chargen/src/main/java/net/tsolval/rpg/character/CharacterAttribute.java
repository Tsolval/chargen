package net.tsolval.rpg.character;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import net.tsolval.rpg.character.Character;
import net.tsolval.rpg.character.Attribute;

/**
 * This entity links a character to its various attributes.
 * 
 * @author tsolval
 * 
 */
@Entity
@Table(name = "CHARACTER_ATTRIBUTE")
@IdClass(CharacterAttributeId.class)
public class CharacterAttribute {
	@Id
	@Column(name = "CHARACTER_ID")
	private Integer characterId;
	@Id
	@Column(name = "ATTRIBUTE_ID")
	private Integer attributeId;
	@Column(name = "ATTRIBUTE_VALUE")
	private Integer value;
	@ManyToOne
	@PrimaryKeyJoinColumn(name = "CHARACTER_ID", referencedColumnName = "ID")
	private Character character;
	@ManyToOne
	@PrimaryKeyJoinColumn(name = "ATTRIBUTE_ID", referencedColumnName = "ID")
	private Attribute attribute;

	/**
	 * @return the characterId
	 */
	public Integer getCharacterId() {
		return characterId;
	}

	/**
	 * @param characterId
	 *            the characterId to set
	 */
	public void setCharacterId(Integer characterId) {
		this.characterId = characterId;
	}

	/**
	 * @return the attributeId
	 */
	public Integer getAttributeId() {
		return attributeId;
	}

	/**
	 * @param attributeId
	 *            the attributeId to set
	 */
	public void setAttributeId(Integer attributeId) {
		this.attributeId = attributeId;
	}

	/**
	 * @return the value
	 */
	public Integer getValue() {
		return value;
	}

	/**
	 * @param value
	 *            the value to set
	 */
	public void setValue(Integer value) {
		this.value = value;
	}

	/**
	 * @return the character
	 */
	public Character getCharacter() {
		return character;
	}

	/**
	 * @param character
	 *            the character to set
	 */
	public void setCharacter(Character character) {
		this.character = character;
	}

	/**
	 * @return the attribute
	 */
	public Attribute getAttribute() {
		return attribute;
	}

	/**
	 * @param attribute
	 *            the attribute to set
	 */
	public void setAttribute(Attribute attribute) {
		this.attribute = attribute;
	}

}
