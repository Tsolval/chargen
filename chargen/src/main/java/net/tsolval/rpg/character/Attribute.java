package net.tsolval.rpg.character;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author tsolval
 * 
 */
@Entity
@Table(name = "ATTRIBUTE")
public class Attribute {
	@Id
	@GeneratedValue
	@Column(name = "ID")
	private Integer id;
	@Column(name = "NAME")
	private String name;
	@Column(name = "SHORTNAME")
	private String shortName;
	@Column(name = "DESCRIPTION")
	private String description;

	/** Default constructor builds an empty attribute */
	public Attribute() {
		// default constructor: do nothing!
	}

	/**
	 * @param name
	 *            - the name of the attribute
	 * @param shortName
	 *            - the short name of the attribute
	 * @param description
	 *            - the attribute description
	 */
	public Attribute(String name, String shortName, String description) {
		setName(name);
		setShortName(shortName);
		setDescription(description);
	}

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
	 * @return the shortName
	 */
	public String getShortName() {
		return shortName;
	}

	/**
	 * @param shortName
	 *            the shortName to set
	 */
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description
	 *            the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format("Attribute [%s (%s)]", name, shortName);
	}
}
