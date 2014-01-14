package net.tsolval.rpg.character;

import java.io.Serializable;

/**
 * @author tsolval
 * 
 */
public class CharacterAttributeId implements Serializable {
	private static final long serialVersionUID = 1838663354830604380L;
	private Integer characterId;
	private Integer attributeId;

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

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((attributeId == null) ? 0 : attributeId.hashCode());
		result = prime * result
				+ ((characterId == null) ? 0 : characterId.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CharacterAttributeId other = (CharacterAttributeId) obj;
		if (attributeId == null) {
			if (other.attributeId != null)
				return false;
		} else if (!attributeId.equals(other.attributeId))
			return false;
		if (characterId == null) {
			if (other.characterId != null)
				return false;
		} else if (!characterId.equals(other.characterId))
			return false;
		return true;
	}
}
