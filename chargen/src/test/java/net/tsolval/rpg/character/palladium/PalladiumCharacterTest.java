/**
 * 
 */
package net.tsolval.rpg.character.palladium;

/**
 * @author walker.d.adams
 * 
 */
public class PalladiumCharacterTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PalladiumCharacter character = new PalladiumCharacter();
		character.setName("Scar");
		character.setPlayer("Phillip");
		character.setCampaign("Prenumbra");
		character.getIq().setValue(16);
		character.getMe().setValue(10);
		character.getMa().setValue(11);
		character.getPe().setValue(14);
		character.getPp().setValue(15);
		character.getPb().setValue(3);
		character.getPs().setValue(18);
		character.getSpd().setValue(14);
		System.out.println(character);
	}
}
