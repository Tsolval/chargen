/**
 * 
 */
package net.tsolval.rpg.character.palladium;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import net.tsolval.rpg.Attribute;
import net.tsolval.rpg.Character;

/**
 * @author walker.d.adams
 * 
 */
@Entity
@Table(name = "PALLADIUM_CHARACTER")
public class PalladiumCharacter implements Character {
	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	private String player;
	private String campaign;
	private List<Attribute> attributes;

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the player
	 */
	public String getPlayer() {
		return player;
	}

	/**
	 * @param player
	 *            the player to set
	 */
	public void setPlayer(String player) {
		this.player = player;
	}

	/**
	 * @return the campaign
	 */
	public String getCampaign() {
		return campaign;
	}

	/**
	 * @param campaign
	 *            the campaign to set
	 */
	public void setCampaign(String campaign) {
		this.campaign = campaign;
	}

	/**
	 * @return the attributes
	 */
	public List<Attribute> getAttributes() {
		return attributes;
	}

	/**
	 * @param attributes
	 *            the attributes to set
	 */
	public void setAttributes(List<Attribute> attributes) {
		this.attributes = attributes;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String
				.format("PalladiumCharacter [name=%s, player=%s, campaign=%s, attributes=%s]",
						name, player, campaign, attributes);
	}
}
