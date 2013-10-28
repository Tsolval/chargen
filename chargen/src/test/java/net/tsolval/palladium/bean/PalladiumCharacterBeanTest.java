package net.tsolval.palladium.bean;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import net.tsolval.rpg.character.palladium.PalladiumCharacter;

import org.junit.Test;

public class PalladiumCharacterBeanTest {

	private PalladiumCharacterBean bean;
	private PalladiumCharacter testCharacter = new PalladiumCharacter();

	@Test
	public void testRollAttributes() {
		bean = new PalladiumCharacterBean();
		assertNull("Error: Not starting with a clean bean!", bean
				.getCharacter().getIq());
		bean.rollAttributes();
		assertNotNull("Error: Bean not updated!", bean.getCharacter());
		assertTrue("Invalid Attribute resulted!",
				bean.getCharacter().getIq().getValue() >= 3);
	}

}
