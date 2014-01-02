package net.tsolval.rpg.character;

import static org.junit.Assert.*;

import org.junit.Test;

public class CharacterTest {

	@Test
	public void test() {
		Character character = new Character();
		character.setCampaign("Campaign");
		character.setName("Name");
		character.setPlayer("Player");
		assertEquals("Name", character.getName());
	}

}
