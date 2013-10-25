/**
 * 
 */
package net.tsolval.rpg.character.palladium;

import net.tsolval.rpg.Attribute;

/**
 * @author walker.d.adams
 * 
 */
public class PalladiumAttribute implements Attribute {
	public static final PalladiumAttribute IQ = new PalladiumAttribute(
			"Intelligence Quotient", "I.Q.", "");
	public static final PalladiumAttribute ME = new PalladiumAttribute(
			"Mental Endurance", "M.E.", "");
	public static final PalladiumAttribute MA = new PalladiumAttribute(
			"Mental Affinity", "M.A.", "");
	public static final PalladiumAttribute PE = new PalladiumAttribute(
			"Physical Endurance", "P.E.", "");
	public static final PalladiumAttribute PP = new PalladiumAttribute(
			"Physical Prowess", "P.P.", "");
	public static final PalladiumAttribute PB = new PalladiumAttribute(
			"Physical Beauty", "P.B.", "");
	public static final PalladiumAttribute PS = new PalladiumAttribute(
			"Physical Strength", "P.S.", "");
	public static final PalladiumAttribute SPD = new PalladiumAttribute(
			"Speed", "Spd.", "");

	// properties
	private String name;
	private String shortName;
	private String description;
	private Integer value;

	/** Default constructor builds an empty attribute */
	public PalladiumAttribute() {
		// default constructor: do nothing!
	}

	/**
	 * This constructor builds a Palladium attribute based on one of the molds
	 * pre-populated with the static attribute definition data.
	 * 
	 * @param mold
	 *            - a pre-populated PalladiumAttribute.
	 * @param value
	 *            - the value of the attribute
	 */
	public PalladiumAttribute(PalladiumAttribute mold, Integer value) {
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
	public PalladiumAttribute(String name, String shortName, String description) {
		setName(name);
		setShortName(shortName);
		setDescription(description);
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
}
