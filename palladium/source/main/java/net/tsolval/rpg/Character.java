/**
 * 
 */
package net.tsolval.rpg;

import java.util.List;

/**
 * @author walker.d.adams
 * 
 */
public interface Character {

	/**
	 * @param string
	 */
	void setName(String string);

	/**
	 * @param string
	 */
	void setPlayer(String string);

	/**
	 * @param string
	 */
	void setCampaign(String string);

	/**
	 * @param asList
	 */
	void setAttributes(List<Attribute> asList);
}
