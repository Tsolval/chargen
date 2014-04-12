package net.tsolval.rpg.character;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

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

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String
				.format("CharacterAttribute [characterId=%s, attributeId=%s, value=%s]",
						characterId, attributeId, value);
	}
}
