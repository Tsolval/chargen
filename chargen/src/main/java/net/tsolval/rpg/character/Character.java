package net.tsolval.rpg.character;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * A role playing game character.
 * 
 * @author walker.d.adams
 */
@Entity
@Table(name = "CHARACTER")
public class Character {
	@Id
	@GeneratedValue
	@Column(name = "ID")
	private Integer id;
	@Column(name = "NAME")
	private String name;
	@Column(name = "PLAYER")
	private String player;
	@Column(name = "CAMPAIGN")
	private String campaign;

	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinTable(name = "Character_Attribute", joinColumns = { @JoinColumn(name = "CHARACTER_ID", referencedColumnName = "ID") }, inverseJoinColumns = { @JoinColumn(name = "ATTRIBUTE_ID", referencedColumnName = "ID") })
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

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format("Character [name=%s]", name);
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
