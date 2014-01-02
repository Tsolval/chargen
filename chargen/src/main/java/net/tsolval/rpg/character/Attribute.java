package net.tsolval.rpg.character;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author tsolval
 * 
 */
@Entity
public class Attribute {
	// properties
	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	private String shortName;
	private String description;
	private Integer value;

	/** Default constructor builds an empty attribute */
	public Attribute() {
		// default constructor: do nothing!
	}

	/**
	 * This constructor builds an attribute based on one of the molds
	 * pre-populated with the static attribute definition data.
	 * 
	 * @param mold
	 *            - a pre-populated Attribute.
	 * @param value
	 *            - the value of the attribute
	 */
	public Attribute(Attribute mold, Integer value) {
		setName(mold.getName());
		setShortName(mold.getShortName());
		setDescription(mold.getDescription());
		setValue(value);
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
		return String.format("%s(%s)", shortName, value);
	}
}
