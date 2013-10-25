/**
 * 
 */
package net.tsolval.rpg.character.palladium;

import java.util.List;

import net.tsolval.rpg.Attribute;
import net.tsolval.rpg.Character;

/**
 * @author walker.d.adams
 * 
 */
public class PalladiumCharacter implements Character {
	private String name;
	private String player;
	private String campaign;
	private List<Attribute> attributes;

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
}
