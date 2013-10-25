/**
 * 
 */
package net.tsolval.rpg.character.palladium;

import java.util.Arrays;

import net.tsolval.rpg.Attribute;
import net.tsolval.rpg.Character;

/**
 * @author walker.d.adams
 * 
 */
public class PalladiumCharacterTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Character character = new PalladiumCharacter();
		character.setName("Scar");
		character.setPlayer("Phillip");
		character.setCampaign("Prenumbra");
		Attribute iq = new PalladiumAttribute(PalladiumAttribute.IQ, 16);
		Attribute me = new PalladiumAttribute(PalladiumAttribute.ME, 10);
		Attribute ma = new PalladiumAttribute(PalladiumAttribute.MA, 11);
		Attribute pe = new PalladiumAttribute(PalladiumAttribute.PE, 14);
		Attribute pp = new PalladiumAttribute(PalladiumAttribute.PP, 15);
		Attribute pb = new PalladiumAttribute(PalladiumAttribute.PB, 3);
		Attribute ps = new PalladiumAttribute(PalladiumAttribute.PS, 18);
		Attribute spd = new PalladiumAttribute(PalladiumAttribute.SPD, 14);
		character.setAttributes(Arrays.asList(iq, me, ma, pe, pp, ps, pb, spd));
		System.out.println(character);
	}
}
