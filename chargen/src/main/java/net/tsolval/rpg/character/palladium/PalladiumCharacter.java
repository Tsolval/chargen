/**
 * 
 */
package net.tsolval.rpg.character.palladium;

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
	private PalladiumAttribute iq = PalladiumAttribute.IQ;
	@Transient
	private PalladiumAttribute me = PalladiumAttribute.ME;
	@Transient
	private PalladiumAttribute ma = PalladiumAttribute.MA;
	@Transient
	private PalladiumAttribute pe = PalladiumAttribute.PE;
	@Transient
	private PalladiumAttribute pp = PalladiumAttribute.PP;
	@Transient
	private PalladiumAttribute ps = PalladiumAttribute.PS;
	@Transient
	private PalladiumAttribute pb = PalladiumAttribute.PB;
	@Transient
	private PalladiumAttribute spd = PalladiumAttribute.SPD;

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
	 * @return the iq
	 */
	public PalladiumAttribute getIq() {
		return iq;
	}

	/**
	 * @param iq
	 *            the iq to set
	 */
	public void setIq(PalladiumAttribute iq) {
		this.iq = iq;
	}

	/**
	 * @return the me
	 */
	public PalladiumAttribute getMe() {
		return me;
	}

	/**
	 * @param me
	 *            the me to set
	 */
	public void setMe(PalladiumAttribute me) {
		this.me = me;
	}

	/**
	 * @return the ma
	 */
	public PalladiumAttribute getMa() {
		return ma;
	}

	/**
	 * @param ma
	 *            the ma to set
	 */
	public void setMa(PalladiumAttribute ma) {
		this.ma = ma;
	}

	/**
	 * @return the pe
	 */
	public PalladiumAttribute getPe() {
		return pe;
	}

	/**
	 * @param pe
	 *            the pe to set
	 */
	public void setPe(PalladiumAttribute pe) {
		this.pe = pe;
	}

	/**
	 * @return the pp
	 */
	public PalladiumAttribute getPp() {
		return pp;
	}

	/**
	 * @param pp
	 *            the pp to set
	 */
	public void setPp(PalladiumAttribute pp) {
		this.pp = pp;
	}

	/**
	 * @return the ps
	 */
	public PalladiumAttribute getPs() {
		return ps;
	}

	/**
	 * @param ps
	 *            the ps to set
	 */
	public void setPs(PalladiumAttribute ps) {
		this.ps = ps;
	}

	/**
	 * @return the pb
	 */
	public PalladiumAttribute getPb() {
		return pb;
	}

	/**
	 * @param pb
	 *            the pb to set
	 */
	public void setPb(PalladiumAttribute pb) {
		this.pb = pb;
	}

	/**
	 * @return the spd
	 */
	public PalladiumAttribute getSpd() {
		return spd;
	}

	/**
	 * @param spd
	 *            the spd to set
	 */
	public void setSpd(PalladiumAttribute spd) {
		this.spd = spd;
	}
}
