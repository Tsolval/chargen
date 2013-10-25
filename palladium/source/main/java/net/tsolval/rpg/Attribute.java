/**
 * 
 */
package net.tsolval.rpg;

/**
 * @author walker.d.adams
 * 
 */
public interface Attribute {
	public String getName();

	public String getShortName();

	public String getDescription();

	public Integer getValue();

	public void setValue(Integer value);
}
