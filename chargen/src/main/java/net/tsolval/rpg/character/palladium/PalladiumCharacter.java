/**
 * 
 */
package net.tsolval.rpg.character.palladium;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;

/**
 * @author walker.d.adams
 * 
 */
@Entity
public class PalladiumCharacter {
	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	private String player;
	private String campaign;
	@Transient
	private Map<String, PalladiumAttribute> attributes;

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

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format(
				"PalladiumCharacter [name=%s, player=%s, campaign=%s]", name,
				player, campaign);
	}

	/**
	 * @return the me
	 */
	public PalladiumAttribute getMe() {
		return getAttributes().get("ME");
	}

	/**
	 * @param me
	 *            the me to set
	 */
	public void setMe(PalladiumAttribute me) {
		getAttributes().put("ME", me);
	}

	/**
	 * @return the ma
	 */
	public PalladiumAttribute getMa() {
		return getAttributes().get("MA");
	}

	/**
	 * @param ma
	 *            the ma to set
	 */
	public void setMa(PalladiumAttribute ma) {
		getAttributes().put("MA", ma);
	}

	/**
	 * @return the pe
	 */
	public PalladiumAttribute getPe() {
		return getAttributes().get("PE");
	}

	/**
	 * @param pe
	 *            the pe to set
	 */
	public void setPe(PalladiumAttribute pe) {
		getAttributes().put("PE", pe);
	}

	/**
	 * @return the pp
	 */
	public PalladiumAttribute getPp() {
		return getAttributes().get("PP");
	}

	/**
	 * @param pp
	 *            the pp to set
	 */
	public void setPp(PalladiumAttribute pp) {
		getAttributes().put("PP", pp);
	}

	/**
	 * @return the ps
	 */
	public PalladiumAttribute getPs() {
		return getAttributes().get("PS");
	}

	/**
	 * @param ps
	 *            the ps to set
	 */
	public void setPs(PalladiumAttribute ps) {
		getAttributes().put("PS", ps);
	}

	/**
	 * @return the pb
	 */
	public PalladiumAttribute getPb() {
		return getAttributes().get("PB");
	}

	/**
	 * @param pb
	 *            the pb to set
	 */
	public void setPb(PalladiumAttribute pb) {
		getAttributes().put("PB", pb);
	}

	/**
	 * @return the spd
	 */
	public PalladiumAttribute getSpd() {
		return getAttributes().get("SPD");

	}

	/**
	 * @param spd
	 *            the spd to set
	 */
	public void setSpd(PalladiumAttribute spd) {
		getAttributes().put("SPD", spd);
	}

	/**
	 * @return the attributes
	 */
	public Map<String, PalladiumAttribute> getAttributes() {
		if (attributes == null) {
			attributes = new LinkedHashMap<String, PalladiumAttribute>();
			attributes.put("IQ", PalladiumAttribute.IQ);
			attributes.put("MA", PalladiumAttribute.MA);
			attributes.put("ME", PalladiumAttribute.ME);
			attributes.put("PB", PalladiumAttribute.PB);
			attributes.put("PE", PalladiumAttribute.PE);
			attributes.put("PP", PalladiumAttribute.PP);
			attributes.put("PS", PalladiumAttribute.PS);
			attributes.put("SPD", PalladiumAttribute.SPD);
		}
		return attributes;
	}

	/**
	 * @param attributes
	 *            the attributes to set
	 */
	public void setAttributes(Map<String, PalladiumAttribute> attributes) {
		this.attributes = attributes;
	}

	public List<PalladiumAttribute> getAttributeList() {
		List<PalladiumAttribute> attributes = new ArrayList<PalladiumAttribute>(
				getAttributes().values());
		return attributes;
	}

	public void setAttributeList(List<PalladiumAttribute> attributes) {
		for (PalladiumAttribute attribute : attributes) {
			getAttributes().put(attribute.getShortName(), attribute);
		}
	}

	/**
	 * @param shortName
	 * @return
	 */
	public PalladiumAttribute getAttribute(String shortName) {
		return getAttributes().get(shortName);
	}

	/**
	 * @param attribute
	 */
	public void setAttribute(PalladiumAttribute attribute) {
		getAttributes().put(attribute.getShortName(), attribute);
	}
}
