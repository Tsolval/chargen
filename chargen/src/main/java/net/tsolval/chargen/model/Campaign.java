/**
 * 
 */
package net.tsolval.chargen.model;

/**
 * Represents a single campaign set in a role playing game universe.
 * 
 * @author tsolval
 * 
 */
public class Campaign {
	private long id;
	private String slug;
	private String game;

	// private User gameMaster;
	// private List<User> players;
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the slug
	 */
	public String getSlug() {
		return slug;
	}

	/**
	 * @param slug
	 *            the slug to set
	 */
	public void setSlug(String slug) {
		this.slug = slug;
	}

	/**
	 * @return the game
	 */
	public String getGame() {
		return game;
	}

	/**
	 * @param game
	 *            the game to set
	 */
	public void setGame(String game) {
		this.game = game;
	}
}
